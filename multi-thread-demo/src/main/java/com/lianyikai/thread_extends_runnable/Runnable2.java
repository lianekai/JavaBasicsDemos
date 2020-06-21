package com.lianyikai.thread_extends_runnable;

public class Runnable2 implements Runnable {
    private String title;
    public Runnable2(String title){
        this.title=title;
    }
    public void run() {
        for(int i=0;i<=100;i++){

            System.err.println("我是通过Runnable实现的进程,其中我是"+title);
        }

    }
}