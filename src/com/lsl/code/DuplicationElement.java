package com.lsl.code;

import java.util.HashSet;

/**
 * 查找数组中相同的元素
 * 
 * @author shiliang.li
 * @date 2020/6/3
 */
public class DuplicationElement {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 2, 4, 5, 3};
        System.out.println(findRepeatNumber2(arr));
    }

    /**
     * [2, 3, 1, 0, 2, 5, 3] 通过hashset来操作,当存放失败的时候表示已经存在重复的， 时间复杂度O(n) 空间复杂度最大也是O(n)
     * 
     * @param nums
     * @return
     */
    public static int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int result = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                result = num;
                break;
            }
        }
        return result;
    }

    /**
     * [2, 3, 1, 0, 2, 5, 3]
     * [1, 3, 2, 0, 2, 5, 3]
     * [1, 0, 2, 3, 4, 5, 3]
     * 使用原地置换
     * 
     * @param nums
     * @return
     */
    public static int findRepeatNumber1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                System.out.println("i" + i);
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }

    public static int findRepeatNumber2(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (arr[nums[i]] == 1) {
                return nums[i];
            }
            arr[nums[i]] = 1;
        }
        return -1;
    }
}
