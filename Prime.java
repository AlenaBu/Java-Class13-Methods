package com.syntax.class13.HW.Methods;

public class Prime {

	boolean hero (int num) {
		if (num>1) {
			for (int i=2; i<num; i++) {
				if(num%i==0) {
					return false;
				}
			}
		}else {
			return false;
		}
		return true;
		
	}
	
	
}
