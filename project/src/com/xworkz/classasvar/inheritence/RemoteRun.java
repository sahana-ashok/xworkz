package com.xworkz.prog.inheritence;

public class RemoteRun {
    public static void main(String[] args) {
        Remote remote=new Remote();
        remote.brand();
        remote.buttons();
        remote.connectivity();
        remote.device();
        remote.power();
        System.out.println("--------------");
        Remote remote1=new RemoteDetails();
        remote1.power();
        remote1.device();
        remote1.connectivity();
        remote1.buttons();
        remote1.brand();
    }
}
