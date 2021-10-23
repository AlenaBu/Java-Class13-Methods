package com.syntax.class13.HW.Methods;

public class Country {
	
	void printHello (String country) {
		switch (country) {
		case "Russia":
			System.out.println("Privet");
			break;
		case "Spain":
			System.out.println("Hola");
			break;
		case "USA":
			System.out.println("Hi");
			break;
			default: 
				System.out.println("Invalid entry");
			
		}
	}

}
