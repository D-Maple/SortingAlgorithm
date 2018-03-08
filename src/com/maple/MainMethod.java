package com.maple;

import com.sun.org.apache.xml.internal.utils.res.XResourceBundle;

import java.util.Scanner;

/**
 * Created by Maple on 2018/2/28.
 */
public class MainMethod {
    static int[] a = {5,3,6,7,8,9,1,2,0,4,5};
    //static int[] a = {0,1,2,3,4,5,6,7,9,8};
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String swich = scanner.nextLine();
        switch (swich){
            case "1":
                ZJCRsort zjcRsort = new ZJCRsort(a);
                zjcRsort.sort();
                break;
            case "2":
                XEsort xEsort = new XEsort(a);
                xEsort.sort();
                break;
            case "3":
                MPsort mPsort = new MPsort(a);
                mPsort.sort();
                break;
            case "4":
                KSsort kSsort = new KSsort(a);
                kSsort.sort();
                break;
            case "5":
                ZJXZsort zjxZsort = new ZJXZsort(a);
                zjxZsort.sort();
                break;
            case "6":
                Dsort dsort = new Dsort(a);
                dsort.sort();
                break;
            default:
                System.out.printf("输入有误！");
                break;
        }
    }
}
