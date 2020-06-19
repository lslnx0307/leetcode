package com.lsl.code;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5]
 * 的一个旋转，该数组的最小值为1。  
 *
 * 示例 1：
 * 输入：[3,4,5,1,2]
 * 输出：1
 *
 * 示例 2：
 * 输入：[2,2,2,0,1] 输出：0
 *
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 解题思路
 * 1.冒泡排序法
 * 还可以采用1.二分查找法
 * @author shiliang.li
 * @version v1.0
 * @date 2020/6/19
 */
public class Demo11 {

    public int minArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int i1 = 0; i1 < numbers.length-1 -i; i1++) {
                if (numbers[i1] > numbers[i1+1]) {
                    int temp = numbers[i1];
                    numbers[i1] = numbers[i1+1];
                    numbers[i1+1] = temp;
                }
            }

        }
        return numbers[0];
    }

    public static void main(String[] args) {
        Demo11 demo11 = new Demo11();
        int[] arr = new int[]{2,3,1,4,0};
        System.out.println(demo11.minArray(arr));
    }
}
