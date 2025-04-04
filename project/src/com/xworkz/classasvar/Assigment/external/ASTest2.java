package com.xworkz.prog.Assigment.external;

public class ASTest2 {
    //ASTest asTest=new ASTest();
    //while the constructor is made as protected we cannot use the constructor with new keyword in another package
    public ASTest2(){
        super();
        //we can only use chainig while the constructor in another package is protected
    }
}
