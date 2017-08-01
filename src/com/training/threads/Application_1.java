package com.training.threads;

/**
 * Created by aditya on 7/31/2017.
 */
public class Application_1 extends Thread{


    public void run() {

        for (int i = 1; i<=10; i++){

            System.out.println("Hello - "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]){

        Application_1 obj1 = new Application_1();
        //Application_1 obj2 = new Application_1();

        obj1.start();
        //obj2.start();

    }

}
