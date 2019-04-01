package com.lzw.algorithm.funny;

    //用位运算表达权限

/*
    假设有四种权限，增删改查，对应二进制的四个位
    0 0 0 1  增权限
    0 0 1 0  删权限
    0 1 0 0  改权限
    1 0 0 0  查权限

    例：
    0 1 1 0  代表拥有删除与修改权限，没有增加和查找权限
    1 0 0 0  代表只有查找权限，没有其他权限

 */


public class NewPermission {

    // 是否允许新增，二进制第1位，0表示否，1表示是
    public static final int ALLOW_INSERT = 1 << 0; // 0001

    // 是否允许删除，二进制第2位，0表示否，1表示是
    public static final int ALLOW_DELETE = 1 << 1; // 0010

    // 是否允许修改，二进制第3位，0表示否，1表示是
    public static final int ALLOW_UPDATE = 1 << 2; // 0100

    // 是否允许查询，二进制第4位，0表示否，1表示是
    public static final int  ALLOW_SELECT= 1 << 3; // 1000





    // 存储目前的权限状态
    public int flag;

    /**
     *  重新设置权限
     */
    public void setPermission(int permission) {
        flag = permission;
    }

    /**
     *  添加一项或多项权限
     */
    public void enable(int permission) {
        flag |= permission;
    }

    /**
     *  删除一项或多项权限
     */
    public void disable(int permission) {
        flag &= ~permission;
    }

    /**
     *  是否拥某些权限
     */
    public boolean isAllow(int permission) {
        return (flag & permission) == permission;
    }

    /**
     *  是否禁用了某些权限
     */
    public boolean isNotAllow(int permission) {
        return (flag & permission) == 0;
    }

    /**
     *  是否仅仅拥有某些权限
     */
    public boolean isOnlyAllow(int permission) {
        return flag == permission;
    }




    public static void main( String[] args ) {

        NewPermission newPermission=new NewPermission();
        //初始值，没有任何权限
        int permission=0;
        newPermission.setPermission(permission);
        //增权限
        int add=0+(1<<0);
        //删权限
        int del=0+(1<<1);
        //改权限
        int change=0+(1<<2);
        //查权限
        int query=0+(1<<3);

        //增加增权限以及删权限
        newPermission.enable(add);
        newPermission.enable(del);

        System.out.println("此时权限:"+newPermission.flag);

        //查询是否有增权限
        System.out.println("是否有增权限："+ newPermission.isAllow(add));
        //查询是否有删权限
        System.out.println("是否有删权限："+ newPermission.isAllow(del));
        //查询是否有改权限
        System.out.println("是否有改权限："+ newPermission.isAllow(change));
        //查询是否有查权限
        System.out.println("是否有查权限："+ newPermission.isAllow(query));

        System.out.println("此时权限:"+newPermission.flag);

        int changAndQuery=0+(1<<2)+(1<<3);
        //是否同时拥有查与改权限
        System.out.println("是否同时拥有查与改权限："+ newPermission.isAllow(changAndQuery));
        //查询是否不拥有增权限
        System.out.println("是否不拥有增权限："+ newPermission.isNotAllow(add));
        //查询是否不拥有删权限
        System.out.println("是否不拥有删权限："+ newPermission.isNotAllow(del));
        //查询是否不拥有改权限
        System.out.println("是否不拥有改权限："+ newPermission.isNotAllow(change));
        //查询是否不拥有查权限
        System.out.println("是否不拥有查权限："+ newPermission.isNotAllow(query));

        System.out.println("此时权限:"+newPermission.flag);

        //查询是否只拥有增权限
        System.out.println("是否仅仅有增权限："+ newPermission.isOnlyAllow(add));

        //删除删权限
        newPermission.disable(del);
        System.out.println("禁止删权限");

        System.out.println("此时权限:"+newPermission.flag);

        //查询是否只拥有增权限
        System.out.println("是否仅仅有增权限："+ newPermission.isOnlyAllow(add));

    }





}
