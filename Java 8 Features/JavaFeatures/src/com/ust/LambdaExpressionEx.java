package com.ust;

@FunctionalInterface //optional
interface MyInterface{
    public void myMethod();
}
public class LambdaExpressionEx{
    public static void main(String args[])
    {
        int variable = 10;
        //implemenmtation with lambda expression
        MyInterface myInterface = ()->{
            System.out.println("variable = "+variable);
        };
        myInterface.myMethod();
    }
}
