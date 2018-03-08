package com.maple;

/**
 * 堆排序(选择排序)
 * Created by Maple on 2018/3/2.
 */
public class Dsort {
    int[] in;

    public Dsort(int in[]) {
        this.in = new int[in.length + 1];
        //将原始数组依次后移，方便构造堆
        for (int i = 0, j = 1; i < in.length; i++, j++) {
            this.in[j] = in[i];
        }
    }

    public void sort() {
        System.out.println("堆排序结果：");
        //从最后一个非叶子节点起构造大顶堆，使大数上浮，小数下沉
        for (int i = (in.length - 1) / 2; i > 0; i--) {
            sift(i, in.length - 1);
        }
        //循环将堆顶与数组末尾对调，再次构造堆
        for (int j = in.length - 1; j > 1; j--) {
            int temp = in[1];
            in[1] = in[j];
            in[j] = temp;
            sift(1, j - 1);
        }
        print();
    }

    //初始堆构造算法
    private void sift(int low, int hig) {
        int i = low, j = 2 * i;
        int temp = in[i];
        //循环寻找子节点值大于父节点值的节点
        while (j <= hig) {
            //兄弟节点比较，选出大者
            if (j < hig && in[j] < in[j + 1]) j++;
            //兄弟中大者比父节点大，则上浮；若不大，则说明该部分已成堆，跳出循环
            if (in[j] > temp) {
                in[i] = in[j];
                i = j;
                j = 2 * i;
            } else break;
        }
        in[i] = temp;
        print();
    }

    public void print() {
        for (int i = 1; i < in.length; i++) {
            System.out.print(in[i] + " ");
        }
        System.out.println();
    }
}
