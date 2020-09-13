package com.myohanhtet.mypostalcode.repository;

import com.myohanhtet.mypostalcode.model.PostalCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostalRepository extends JpaRepository<PostalCode,Long> {

        List<PostalCode> findByplaceContainingIgnoreCase(String postCode);
        List<PostalCode> findBytownshipContainingIgnoreCase(String township);

}
