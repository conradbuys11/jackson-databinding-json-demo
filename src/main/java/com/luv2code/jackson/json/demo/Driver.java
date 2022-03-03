package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {
			//create obj mapper, read json file, and convert to POJO
			
			ObjectMapper mapper = new ObjectMapper();
			Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);
			System.out.println("First name = " + student.getFirstName());
			System.out.println("Address = " + student.getAddress());
			System.out.println("Languages = " + student.getLanguages());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
