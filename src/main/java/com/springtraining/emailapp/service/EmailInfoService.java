package com.springtraining.emailapp.service;


import com.springtraining.emailapp.data.EmailInfo;

import java.util.List;

public interface EmailInfoService {

    List<EmailInfo> findByFirstName(String firstName);

    EmailInfo insertEmailInfo(EmailInfo eInfo);
}
