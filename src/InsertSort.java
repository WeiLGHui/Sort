/**
 * @Auther WeiLGHui
 * @Date 2020-04-03 18:27
 */

import java.util.Arrays;

/**
 * 插入排序
 * 原理：把数组分为两组  已排序和未排序
 *  找到未排序数组中的第一个元素，项已排序的数组进行插入
 *  倒叙遍历已排序数组,依次与待插入的元素相比较，知道找到第一个元素小于等于待插入元素，则把待插入元素插入到此位置
 *  时间复杂度：O(n^2)  (最坏情况)
 *
 */
public class InsertSort {
    public static int[] sort(int []array){
        for (int i = 1; i < array.length; i++) {//指向未排序数组的第一个元素
            for (int j = i; j >0 ; j--) {  //指向已排序数组的最后一个元素
                if(array[j] <= array[j-1]){   //判断array[j]和array[j-1]位的数值
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }else{   //如果array[j]>array[j-1]
                    break;
                }
            }
        }
        return array;
    }
}
