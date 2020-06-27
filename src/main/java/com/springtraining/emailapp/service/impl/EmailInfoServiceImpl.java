package com.springtraining.emailapp.service.impl;

import com.springtraining.emailapp.data.EmailInfo;
import com.springtraining.emailapp.repository.EmailInfoRepository;
import com.springtraining.emailapp.service.EmailInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailInfoServiceImpl implements EmailInfoService {

    @Autowired
    EmailInfoRepository repository;

    @Override
    public List<EmailInfo> findByFirstName(String firstName) {
        return repository.findByFirstName(firstName);
    }

    @Override
    public int deleteByFirstName(String firstName) {

        List<EmailInfo> emailInfoList= repository.findByFirstName(firstName);
        int cnt = emailInfoList.size();
        emailInfoList.forEach(emailInfo -> repository.delete(emailInfo));
        return cnt;
        }
    @Override
    public List<EmailInfo> getAllEmailInfo()
    {
        return repository.findAll();

    }
}
