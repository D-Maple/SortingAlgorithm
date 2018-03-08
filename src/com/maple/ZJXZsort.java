package com.maple;

/**
 * 直接选择排序（选择排序）
 * 与冒泡排序很相似，不同在于冒泡排序一趟可能需要多次交换位置，而直接选择排序每次都挑出当前无序区最小值与有序区末尾进行交换，理论上大大减少了交换次数，算法效率       更为稳定。
 * Created by Maple on 2018/3/2.
 */
public class ZJXZsort {
    int[] in;

    public ZJXZsort(int in[]) {
        this.in = in;
    }

    public void sort() {
        System.out.println("直接选择排序结果：");
        for (int i = 0; i < in.length -1; i++) {
            int min = in[i];
            int min_flag = i;
            for (int j = i + 1; j < in.length; j++) {
                if (in[j] < min) {
                    min = in[j];
                    min_flag = j;
                }
            }
            in[min_flag] = in[i];
            in[i] = min;
            print();
        }
        print();
    }

    public void print() {
        for (int i = 0; i < in.length; i++) {
            System.out.print(in[i] + " ");
        }
        System.out.println();
    }
}
