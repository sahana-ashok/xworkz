package com.xworkz.prog.Assigment.internal;

public class ASTest3 extends ASTest{
    public ASTest3(){
        super();
        System.out.println("Checking for chaining in protected as");
        ASTest asTest=new ASTest();
        //we can use both chainig and new key word for constructor calling in the same package while the constructor is protected
    }
}
