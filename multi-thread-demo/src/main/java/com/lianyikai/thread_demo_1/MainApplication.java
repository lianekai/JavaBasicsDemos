package com.lianyikai.thread_demo_1;
/*
 * @author:lianyikai
 * @date:2020/06/21
 *
 *
 *
 * */
public class MainApplication {
    public static void main(String args[]){
        Thread1 thread1=new Thread1();  //创建线程
        Thread2 thread2=new Thread2();  //创建线程
        thread2.setPriority(Thread.MAX_PRIORITY);    //设置线程优先级
        thread1.setPriority(Thread.NORM_PRIORITY);
        thread1.start();                //启动线程
        thread2.start();                //启动线程


        for(int i=0;i<=100;i++) {
            System.err.println("我是main主线程,正在运行" + thread1.getPriority());
        }
    }
}



// 对整个程序进行分析：
  /* JVM检测到main(),程序从这里开始执行，开始执行---》
        Thread1 thread1=new Thread1();  //创建线程
        Thread2 thread2=new Thread2();  //创建线程
        thread1.start();                //启动线程
        thread2.start();

        当执行到for第一次循环，输出“我是main主线程,正在运行”，之前以及执行了thread1.start();                //启动线程
                                                                      thread2.start();

        JVM知道有三个线程：主线程，线程一，线程二，三个线程将轮流占用CPU资源
   */