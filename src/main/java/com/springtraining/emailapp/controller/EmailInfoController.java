package com.springtraining.emailapp.controller;

import com.springtraining.emailapp.data.EmailInfo;
import com.springtraining.emailapp.service.EmailInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping(value = "/{firstName}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public EmailInfo updateLastName(@PathVariable String firstName){
        EmailInfo response = service.updateLastName(firstName);
        return response;
    }
}
