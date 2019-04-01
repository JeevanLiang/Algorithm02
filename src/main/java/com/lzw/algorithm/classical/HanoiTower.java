package com.lzw.algorithm.classical;


//汉诺塔

/*

    问题描述：不描述了

 */

public class HanoiTower {

    static long count=0;

    public static void hanoi(int n,char a,char b,char c){
        if (n==1){
            System.out.printf("第%d次移动：圆盘从%c棒移动到%c棒\n",++count,a,c);
        }
        else {
            hanoi(n-1,a,c,b);
            System.out.printf("第%d次移动：圆盘从%c棒移动到%c棒\n",++count,a,c);
            hanoi(n-1,b,a,c);
        }
    }

}
