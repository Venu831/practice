package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.daoimpl.DoaImpl;
import com.example.demo.daoimpl.Employee;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Demo1Application.class, args);
		DoaImpl dao=context.getBean(DoaImpl.class);
		List<String> emp=dao.get1();
		emp.stream().forEach(System.out::println);
		int emp1=dao.insert();
		System.out.println(emp1);
	}	

}
