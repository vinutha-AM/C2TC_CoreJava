package com.cg.Abstraction;

public abstract class Sweet extends Food {
	public Sweet()
	{
		System.out.println("IS SWEET");
	}
	
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sweet";
	}

}