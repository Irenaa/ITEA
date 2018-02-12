package com.gmail.bezkrovnairyna;

import java.util.Stack;

public class Bracket {
	private String brackets;

	public Bracket(String brackets) {
		super();
		this.brackets = brackets;
	}
    
	public boolean check() {
		Stack<Character> br = new Stack<>();
		char [] sb = brackets.toCharArray();
		for (Character ch : sb) {
			if (ch =='(') {
				br.push(ch);
			}else {
				if(br.empty()) {
					return false;
				}else {
					br.pop();
				}
			}
		}
		if(br.empty()) {
		return true;
		} else {
			return false;
		}
		
	}
	

}
