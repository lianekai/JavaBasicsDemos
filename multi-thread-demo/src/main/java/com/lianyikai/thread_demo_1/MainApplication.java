package com.lianyikai.thread_demo_1;

public class MainApplication {
    public static void main(String args[]){
        Thread1 thread1=new Thread1();
        Thread2 thread2=new Thread2();
        thread1.start();
        thread2.start();
    }
}