package com.tricky.corejava;

public class TestBlocks {
   {
		
		System.out.println(3);
		
	}

	
	static{
	
		System.out.println(2);
	}
	
	
	public static void main(String[] args) {
		
		TestBlocks t = new TestBlocks();
		System.out.println(1);
	}

}
