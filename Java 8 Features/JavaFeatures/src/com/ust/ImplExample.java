package com.ust;

public class ImplExample {
	
	interface MyInterface{
	    default void newDefaultMethod(){
	        System.out.println("New default method");
	    }
	    static void newStaticMethod(){
	        System.out.println("New static method");
	    }
	    void existingMethod(String str);
	}
	public static class Example implements MyInterface {
	    //existing method implementation
	    public void existingMethod(String str){
	        System.out.println("String : "+str);
	    }
	    //There is no need to implement the other methods
	    public static void main(String args[]) {
	        
	        Example obj = new Example();
	        
	        obj.newDefaultMethod();
	        MyInterface.newStaticMethod();
	        obj.existingMethod("This is the new java 8 feature");
	    }
	}


}
