package com.company.day04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day04BootstrapAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Day04BootstrapAppApplication.class, args);
	}


	@Autowired
	private PersonDao personDao;

	@Autowired
	private Person person;

	@Override
	public void run(String... args) throws Exception {
//		personDao.insert(987, "Dhoni", 40);
		System.out.println(person);
		System.out.println("Done");
	}
}
