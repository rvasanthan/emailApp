package com.springtraining.emailapp;

import com.springtraining.emailapp.data.EmailInfo;
import com.springtraining.emailapp.repository.EmailInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class EmailappApplication { //implements CommandLineRunner {

	/*@Autowired
	EmailInfoRepository repository;*/

	public static void main(String[] args) {
		SpringApplication.run(EmailappApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		List<EmailInfo> lists = repository.findByFirstName("Vasanthan");
		for(EmailInfo emailInfo : lists) {
			System.out.println(emailInfo.getFirstName());
			System.out.println(emailInfo.getLastName());
			System.out.println(emailInfo.getEmail());

		}
	}*/

}
