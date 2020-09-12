package com.myohanhtet.mypostalcode;

import com.myohanhtet.mypostalcode.helper.CSVHelper;
import com.myohanhtet.mypostalcode.model.PostalCode;
import com.myohanhtet.mypostalcode.repository.PostalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.mock.web.MockMultipartFile;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class MypostalcodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MypostalcodeApplication.class, args);
	}
	@Autowired
	private PostalRepository postalRepository;

	@PostConstruct
	public void init() {

		File file = new File("myanmar-postal-codes.csv");

		try {
			MultipartFile multipartFile = new MockMultipartFile("myanmar-postal-codes.csv",new FileInputStream(file));
			List<PostalCode> postalCodeList = CSVHelper.csvToDatabase(multipartFile.getInputStream());

			postalRepository.saveAll(postalCodeList);

		} catch (IOException e){
			throw new RuntimeException("fail to parse CSV file"+ e.getMessage());
		}

	}
}
