package com.cg.fundamentals;

public class LeftShift {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int i;
		    int num = 16;
		   
		    for(i=0; i<4; i++) {
		    num = num >> 1;  //16>>1--> 00010000 --->    00001000
		      System.out.println(num);
		    
		    }
	}

}