package com.hand;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App1 
{
    public static void main( String[] args )
    {
        //计数器
        int count=0;
        //结果集合
        ArrayList<Integer> integers=new ArrayList<>();
        for (int i = 101; i <201 ; i++) {
            boolean flag = numberIsPrime(i);
            if (flag ) {
                count++;
                integers.add(i);
            }
        }
        System.out.println( "101-200 have "+count+" Prime,they are:"+integers.toString());
    }
    private static boolean numberIsPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
