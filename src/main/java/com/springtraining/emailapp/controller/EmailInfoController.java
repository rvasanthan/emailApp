package com.springtraining.emailapp.controller;

import com.springtraining.emailapp.data.EmailInfo;
import com.springtraining.emailapp.service.EmailInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/email-info")
public class EmailInfoController {

    @Autowired
    EmailInfoService service;

    @ResponseBody
    @GetMapping("/{firstName}")
    public List<EmailInfo> findByFirstName(@PathVariable String firstName) {
       List<EmailInfo> response = service.findByFirstName(firstName);
       return response;
    }
}
