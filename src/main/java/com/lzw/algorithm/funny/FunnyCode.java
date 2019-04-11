package com.lzw.algorithm.funny;



// 网上看到的一个面试题：用一段代码展示你的实力


public class FunnyCode {

    /*
        这段代码包含了：
        *   多线程
        *   排序
        *   jdk1.8最新的lambda语句
     */

    public static void main(String[] args){
        int[] arr={11,243,90,1,53,7,99,22};
        for (int score:arr){
            new Thread(()->{
                try {
                    Thread.sleep(score);
                    System.out.println(score);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }


}
