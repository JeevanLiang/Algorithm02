package com.lzw.algorithm.funny;

//测试一下对于引用对象的形参以及实参操作



public class Test001 {
    private static  StringBuilder stringBuilder=new StringBuilder("old one");


    public static void method(StringBuilder stringBuilder1, StringBuilder stringBuilder2){
        stringBuilder1.append("-first");
        stringBuilder2.append("-second");


         stringBuilder1=new StringBuilder("new one");
         stringBuilder1.append("-third");
    }

    public static void main(String[] args){

        System.out.println(stringBuilder);

        method(stringBuilder,stringBuilder);

        System.out.println(stringBuilder);
    }

}
