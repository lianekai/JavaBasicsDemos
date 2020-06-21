package com.lianyikai.thread_extends_runnable;

public class Runnable1 implements Runnable {
    private String title;
    public Runnable1(String title){
        this.title=title;
    }
    public void run() {
        for(int i=0;i<=100;i++){
            System.out.println("我是通过Runnable实现的进程,其中我是"+title);
        }

    }
}