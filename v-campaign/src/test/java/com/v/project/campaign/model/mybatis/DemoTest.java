package com.v.project.campaign.model.mybatis;

import java.math.BigInteger;

/**
 * @author : DaiGD
 * @createtime :  2020年04月09日 9:54
 * @description :
 */
public class DemoTest
{
    public static void main(String[] args)
    {
        String i = new BigInteger("340282366920938463463374607431768211456", 10).toString(2);
        System.out.println(i + ",长度：" + i.length());
        System.out.println("7694812055149313636226253559354070038".length());
    }
}
