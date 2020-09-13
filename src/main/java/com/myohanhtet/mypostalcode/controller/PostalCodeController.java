package com.myohanhtet.mypostalcode.controller;

import com.myohanhtet.mypostalcode.model.PostalCode;
import com.myohanhtet.mypostalcode.repository.PostalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/v1")
@RestController
public class PostalCodeController {

    @Autowired
    private PostalRepository postalRepository;

    @GetMapping("postoffice/{postcode}")
    public List<PostalCode> postOffice(@PathVariable String postcode){
        return postalRepository.findByplaceContainingIgnoreCase(postcode);
    }

    @GetMapping("township/{township}")
    public List<PostalCode> township(@PathVariable String township){
        return postalRepository.findBytownshipContainingIgnoreCase(township);
    }

}
