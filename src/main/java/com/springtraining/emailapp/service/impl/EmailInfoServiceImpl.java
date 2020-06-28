package com.springtraining.emailapp.service.impl;

import com.springtraining.emailapp.data.EmailInfo;
import com.springtraining.emailapp.repository.EmailInfoRepository;
import com.springtraining.emailapp.service.EmailInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailInfoServiceImpl implements EmailInfoService {

    @Autowired
    EmailInfoRepository repository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<EmailInfo> findByFirstName(String firstName) {
        return repository.findByFirstName(firstName);
    }

    @Override
    public EmailInfo updateLastName(String name) {

        Query query = new Query();
        query.addCriteria(Criteria.where("firstName").is(name));
        Update update = new Update();
        update.set("lastName", "testLastName");
        return mongoTemplate.findAndModify(query, update, EmailInfo.class);
    }
}
