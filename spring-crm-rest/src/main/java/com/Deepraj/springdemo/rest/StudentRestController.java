package com.Deepraj.springdemo.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Deepraj.springdemo.entity.Student;

@RestController
@RequestMapping("/api")

public class StudentRestController
{
     List<Student>list;
	@GetMapping("/students")
	public List<Student> getstudents()
  {		
		list=new ArrayList<>();
		Student s1=new Student("Deepraj","Dhama");
		Student s2=new Student("Rohan","Singh");
		list.add(s1);
		list.add(s2);
	    return list;	
  }
	@GetMapping("/students/{studentId}")
	public 	Student getting_student(@PathVariable int studentId)
	{
		return list.get(studentId);
	}
	
	
	
 }
