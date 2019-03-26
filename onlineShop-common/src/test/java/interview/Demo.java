package interview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * desc
 *
 * @Author 袁朋
 * @Date 2019/3/13
 */
public class Demo {
    public static void main(String[] args) {
        int[] x = {10, 7, 8, 9, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(mergeSort(x)));

    }
    //归并排序
    private static int[] mergeSort(int[]x){
        if(x.length/2<1) return x;
        //分成两个数组,对两个数组排序,排序后再排序
        int[] left=Arrays.copyOfRange(x,0,x.length/2);
        int[] right=Arrays.copyOfRange(x,x.length/2,x.length);
        return merge(mergeSort(left),mergeSort(right));
    }
    //按大小顺序合并到一起
    private static int[] merge(int[] x,int[] y){
        int[] z=new int[x.length+y.length];
        int i=0,j=0,k=0;
        while(i<x.length&&j<y.length){
            z[k++]=x[i]<y[j]?x[i++]:y[j++];
        }
        while(i<x.length) z[k++]=x[i++];
        while(j<y.length) z[k++]=y[j++];
        return z;
    }



}
