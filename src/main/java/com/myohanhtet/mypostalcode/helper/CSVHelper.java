package com.myohanhtet.mypostalcode.helper;

import com.myohanhtet.mypostalcode.model.PostalCode;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSVHelper {

    public static String TYPE = "text/csv";
    static String[] HEADERs = {"State_Region","State_Region_Mya","SR_Pcode","District","District_Mya","D_Pcode","Township","Township_Mya","TS_Pcode","Place","Postcode","Remark"};

    public static boolean hasCSVFormat(MultipartFile file){
        if (!TYPE.equals(file.getContentType())){
            return false;
        }
        return true;
    }

    public static List<PostalCode> csvToDatabase(InputStream is){
        try(BufferedReader filereader = new BufferedReader(new InputStreamReader(is,"UTF-8"));
            CSVParser csvParser = new CSVParser(filereader, CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withNullString("").withTrim());
        ) {

            List<PostalCode> postalCodeList = new ArrayList<PostalCode>();
            Iterable<CSVRecord> csvRecords = csvParser.getRecords();
            for (CSVRecord csvRecord : csvRecords){
                PostalCode postalCode = new PostalCode(
                        csvRecord.get("State_Region"),
                        csvRecord.get("State_Region_Mya"),
                        csvRecord.get("SR_Pcode"),
                        csvRecord.get("District"),
                        csvRecord.get("District_Mya"),
                        csvRecord.get("D_Pcode"),
                        csvRecord.get("Township"),
                        csvRecord.get("Township_Mya"),
                        csvRecord.get("TS_Pcode"),
                        csvRecord.get("Place"),
                        csvRecord.get("Postcode"),
                        csvRecord.get("Remark")
                );
                postalCodeList.add(postalCode);
            }

            return postalCodeList;

        } catch (IOException e){
            throw new RuntimeException("fail to parse CSV file"+ e.getMessage());
        }
    }

}
