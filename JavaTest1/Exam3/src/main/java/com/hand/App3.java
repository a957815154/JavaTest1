package com.hand;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App3 {
    public static void main(String[] args) {
        System.out.println("Factory test");
        Intercla handlelist =  Factory.getClass("Handlelist");
        handlelist.getnum();
        Intercla randomnum =  Factory.getClass("Randomnum");
        randomnum.getnum();
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        Random random = new Random();
        List<Integer> integers = new ArrayList<>();
        int[] ints = random.ints(50, 1, 100).toArray();
        for (int a : ints) {
            integers.add(a);
            int c = a / 10;
            if (map.keySet().contains(c)) {
                map.get(c).add(a);

            } else {
                ArrayList<Integer> integers1 = new ArrayList<>();
                integers1.add(a);
                map.put(c, integers1);
            }
        }

        Iterator<Map.Entry<Integer, ArrayList<Integer>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, ArrayList<Integer>> next = iterator.next();
            Integer key = next.getKey();
            ArrayList<Integer> value = next.getValue();
            for (int a:value
                    ) {
                System.out.println(a+",");

            }
            bubbleSort(value,value.size());

            System.out.print(key+"=");
            for (int a:value
                 ) {
                System.out.print(a+",");

            }

        }


    }

    static void Swap(List<Integer> args, int i, int j)
    {
        int temp = args.get(i);
        args.set(i,args.get(j));
        args.set(j,temp);
    }

   static void bubbleSort(List<Integer> args, int n)
    {
        for (int j = 0; j < n - 1; j++)         // 每次最大元素就像气泡一样"浮"到数组的最后
        {
            for (int i = 0; i < n - 1 - j; i++) // 依次比较相邻的两个元素,使较大的那个向后移
            {
                if (args.get(i) > args.get(i+1))            // 如果条件改成A[i] >= A[i + 1],则变为不稳定的排序算法
                {
                    Swap(args, i, i + 1);
                }
            }
        }
    }
}