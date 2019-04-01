package com.lzw.algorithm.funny;

public class ComputationSpeed {



    //位运算的速度比操作符的速度快了至少十倍！

    //操作符运算速度
    public static void   test1(){
        long t1=System.nanoTime();
        int a=2;
        for (int i=0;i<10000000;i++){
            a*=2;
            a/=2;
        }
        long t2=System.nanoTime();
        System.out.println("操作符运算花费时间："+(t2-t1)+"ns");
    }


    //位运算速度
    public static void   test2(){
        long t1=System.nanoTime();
        int a=2;
        for (int i=0;i<10000000;i++){
            a=a<<1;
            a=a>>1;
        }
        long t2=System.nanoTime();
        System.out.println("操作符运算花费时间："+(t2-t1)+"ns");
    }


}
