package com.springtraining.emailapp.repository;

import com.springtraining.emailapp.data.EmailInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface EmailInfoRepository extends MongoRepository<EmailInfo, String> {

    @Query("{firstName: '?0'}")
    List<EmailInfo> findByFirstName(String firstName);


}
