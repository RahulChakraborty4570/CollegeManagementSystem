package com.example.springboottutorialdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springboottutorialdemo.entity.StudentEntity;
import com.example.springboottutorialdemo.repository.StudentRepository;

@SpringBootApplication
public class SpringBootTutorialDemoApplication implements CommandLineRunner{
	
	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTutorialDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		StudentEntity s1=new StudentEntity();
		s1.setId(1);
		s1.setName("amitava");
		s1.setAddress("kolkata");
		s1.setRollNo(123);
		studentRepository.save(s1);
		StudentEntity s2=new StudentEntity();
		s2.setId(2);
		s2.setName("rahul");
		s2.setAddress("delhi");
		s2.setRollNo(543);
		studentRepository.save(s2);
		System.out.println("-------------------saved------------");
		
		
	}

}
