/**
 * @Auther WeiLGHui
 * @Date 2020-04-03 19:55
 */

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * 选择排序
 *  原理：每一次遍历  都假定第一个元素为最小值，和其他索引处的值进行比较，如果当前索引处的值大于其他某个索引处的值，
 *  则假定其他某个索引处的值为最小值，然后交换第一个索引处的值和最小值所在的索引处的值
 *
 *  时间复杂度：O(n*2)
 */
public class SelectSort {
    public static int[] sort1(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
