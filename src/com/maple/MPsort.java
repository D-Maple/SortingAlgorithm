package com.maple;

/**
 * 冒泡排序（含改进）（交换排序）
 * Created by Maple on 2018/2/28.
 */
public class MPsort {
    int[] in;
    boolean flag = true;//标记是否有交换操作

    public MPsort(int in[]) {
        this.in = in;
    }

    public void sort() {
        System.out.println("冒泡排序结果：");
        for (int i = in.length - 1; i > 0; i--) {
            if (flag) {
                flag = false;
                for (int j = 0; j < i; j++) {
                    if (in[j + 1] < in[j]) {
                        int temp = in[j];
                        in[j] = in[j + 1];
                        in[j + 1] = temp;
                        flag = true;
                    }
                }
                print();
            };
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
