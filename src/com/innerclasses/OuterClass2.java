package com.innerclasses;


public class OuterClass2 { 
	
	static int staticVari =10;
	int notstaticvar= 20;
 	static class StaticInner { 
 		static int i = 9; 
		int no = 6; 
		private void method() {
			System.out.println("static inner class private method"+i);
		} 
		public void method1() {} 
		static void method2() {
			
			System.out.println(" static inner class static method in");
		} 
		final void method3() {
			
			System.out.println(" static inner class final method in");
		} 
 	} 
 	
 	
	public class Inner {
		public void getname() {
			System.out.println("Inner class example in java");
			System.out.println("Inner class example in java"+staticVari);
			System.out.println("Inner class example in java"+notstaticvar);
		}
		
	}
 	public static void main(String[] args) {
 		//STATIC inner class access
 		OuterClass2.StaticInner staticObj= new OuterClass2.StaticInner ();
 		//inner class access
 		OuterClass2.Inner innerclassObj = new OuterClass2().new Inner();
 		staticObj.method();
 		staticObj.method3();
 		OuterClass2.StaticInner.method2();
 		System.out.println(staticObj.no);
		
 		innerclassObj.getname(); // calling method of inner class
 		
	}
 	
 
}