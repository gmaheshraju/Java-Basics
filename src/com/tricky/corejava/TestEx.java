package com.tricky.corejava;

public class TestEx {
	
	public static void main(String[] args) {
		
		
		System.out.println(test());
		
		
	}
	
	@SuppressWarnings("finally")
	public static int test(){
		try{
			throw new NullPointerException();
		}catch(Exception e){
			return 1;
		}finally{
			return 2;
		}
	}

}
