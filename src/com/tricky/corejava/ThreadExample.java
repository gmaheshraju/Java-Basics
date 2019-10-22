package com.tricky.corejava;
class MyThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("I am executed by "+currentThread().getName());
    }
}
public class ThreadExample
{
    public static void main(String[] args)
    {
        MyThread myThread = new MyThread();
        //Calling run() method directly
        
        myThread.run();
        //Calling start() method. It creates a new thread which executes run() method
        myThread.start();
    }
}