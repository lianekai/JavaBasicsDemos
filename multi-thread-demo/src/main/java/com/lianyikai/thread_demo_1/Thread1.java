package com.lianyikai.thread_demo_1;

public class Thread1 extends Thread {
    @Override
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("我是线程一，我正在运行");
        }
    }
}