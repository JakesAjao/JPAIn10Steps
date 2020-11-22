package com.in2828minutes.learning.jpa.jpain10steps.service;
//import org.junit.platform.commons.logging.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in2828minutes.learning.jpa.jpain10steps.entity.User;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner{
	private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	@Autowired
	private UserDAOService userDaoService;
	
	@Override
	public void run(String... arg0) throws Exception {
		User user = new User("Jack","Admin");
		long insert = userDaoService.insert(user);
		log.info("New User is created : "+user);
	}

}
