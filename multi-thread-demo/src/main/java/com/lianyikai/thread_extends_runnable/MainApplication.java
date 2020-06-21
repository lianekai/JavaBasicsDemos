package com.lianyikai.thread_extends_runnable;
/*
*
*
* */
public class MainApplication {
    public static void main(String args[]){
       Thread thread1 = new Thread(new Runnable1("线程1"));
       Thread thread2 = new Thread(new Runnable2("线程2"));
       thread1.start();

       thread2.start();

    }
}