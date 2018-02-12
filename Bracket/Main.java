package com.gmail.bezkrovnairyna;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bracket test = new Bracket("(()())()())");
		if (test.check()) {
		System.out.println("Cool.It is OK");
		}else {
			System.out.println("Opps.Not OK");
		}
	

	}

}
