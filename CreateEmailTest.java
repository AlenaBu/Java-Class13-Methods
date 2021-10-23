package com.syntax.class13.HW.Methods;

public class CreateEmailTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateEmail email=new CreateEmail();
		String emailAll=email.fullEmail("Alena", "Bubenshchykava", "gmail");
		
		System.out.println(emailAll);
	}

}
