package com.myohanhtet.mypostalcode.repository;

import com.myohanhtet.mypostalcode.model.PostalCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostalRepository extends CrudRepository<PostalCode,Long> {
}
