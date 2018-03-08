package com.maple;

/**
 * 直接插入排序（插入排序）
 * Created by Maple on 2018/2/28.
 */
public class ZJCRsort {
    int[] in;

    public ZJCRsort(int in[]) {
        this.in = in;
    }

    public void sort() {
        int temp;
        System.out.println("直接插入排序结果：");
        for (int i = 0; i < in.length; i++) {
            temp = in[i];
            for (int j = i - 1; j >= 0; j--) {
                if (in[j] > temp) {
                    in[j + 1] = in[j];
                    in[j] = temp;
                } else {
                    in[j+1] = temp;
                    break;
                }
            }
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
