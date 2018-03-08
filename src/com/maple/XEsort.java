package com.maple;

/**
 * 希尔排序（插入排序）
 * Created by Maple on 2018/2/28.
 */
public class XEsort {
    int[] in;

    public XEsort(int in[]) {
        this.in = in;
    }

    public void sort() {
        System.out.println("希尔排序结果：");
        int l = in.length / 2;
        int temp, j;
        while (l > 0) {
            for (int i = l; i < in.length; i++) {
                temp = in[i];
                for (j = i - l; j >= 0 && in[j] > temp; j -= l) {
                    in[j + l] = in[j];
                }
                in[j + l] = temp;
            }
            l /= 2;
        }
        print();
    }

    public void print() {
        for (int i = 0; i < in.length; i++) {
            System.out.print(in[i] + " ");
        }
        System.out.printf("");
    }
}
