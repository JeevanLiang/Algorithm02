package com.lzw.algorithm.classical;



// <<百钱买百鸡>>
/*

    问题描述：
    公鸡五文钱一只，母鸡三文钱一只，小鸡三只一文钱，如果用100文钱买100只鸡，那么公鸡母鸡小鸡各多少只?

 */

public class BuyChicken {

    //m文钱买n只鸡
    public static void buy(int m,int n){
        int x,y,z;
        for (x=0;x<=n;x++){
            for (y=0;y<=n;y++){
                z=n-x-y;
                if (z>0&&z%3==0&&x*5+y*3+z/3==m){
                    System.out.printf("公鸡：%d只，母鸡：%d只，小鸡：%d只",x,y,z);
                    System.out.print("\n");
                    break;
                }
            }
        }

    }

}
