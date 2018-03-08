package com.maple;

/**
 * 快速排序（交换排序）
 * Created by Maple on 2018/3/2.
 */
public class KSsort {
    int[] in;

    public KSsort(int in[]) {
        this.in = in;
    }

    public void sort() {
        System.out.println("快速排序结果：");
        dg(0, in.length - 1);
        print();
    }

    //递归
    private void dg(int beg, int end) {
        //设置两个浮标i，j,一开始对应开始结束位置
        int i = beg, j = end;
        //当结束位置大于开始位置执行
        if (beg < end) {
            //设置临时变量存储基准数
            int temp = in[beg];
            //i，j不相等执行
            while (i != j) {
                //当后面未遇到比基准数小的数时浮标j前移
                while (i < j && in[j] >= temp) j--;
                //遇到时停止循环将该值附给i
                in[i] = in[j];
                //当前面未遇到比基准数大的数时浮标前移
                while (i < j && in[i] <= temp) i++;
                //遇到时停止循环将该值附给j
                in[j] = in[i];
            }
            //一趟排序操作结束，基准数归位
            in[i] = temp;
            //递归开始对基准数前后部分数组再进行如上操作
            dg(beg, i - 1);
            dg(i + 1, end);
        }
    }

    public void print() {
        for (int i = 0; i < in.length; i++) {
            System.out.print(in[i] + " ");
        }
        System.out.println();
    }
}
