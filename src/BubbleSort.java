/**
 * @Auther WeiLGHui
 * @Date 2020-04-03 18:23
 */

import java.util.Arrays;

/**
 * 冒泡排序
 * 原理：比较相邻的元素，如果前一个元素比后一个元素打，就交换这两个元素的位置
 * 时间复杂度：O(n^2)
 *
 */
public class BubbleSort {
    public static int[] Sort(int []array){
        for (int i = array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j+1] < array[j]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int a[]={4,5,6,3,2,1};
        int[] sort = Sort(a);
        System.out.println(Arrays.toString(sort));
    }
}
