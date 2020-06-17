package com.lianyikai.thread_demo_1;

public class Thread2 extends Thread {
    @Override
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("我是线程二，我正在运行");
        }
    }
}