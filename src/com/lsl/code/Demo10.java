package com.lsl.code;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 解题思路
 * 本地还是属于 斐波那契数列
 * 当n>= 3 的时候 规律就是
 * f(1) = 1
 * f(2) = 2
 * f(n-1) + f(n-2) = f(n)
 *
 * 看到大神的思路有两种 1.递归（耗时 抛弃了） 第二个采用数组进行计算效率高的一比
 * @author shiliang.li
 * @version v1.0
 * @date 2020/6/19
 */
public class Demo10 {

    public static void main(String[] args) {
        Demo10 demo10 = new Demo10();
        System.out.println(demo10.newWays(10));
    }

    public int newWays(int n) {
        if (n <= 1) {
            return 1;
        }
        int[] temp = new int[n+1];
        temp[1] = 1;
        temp[2] = 2;
        for (int i = 3; i <= n; i++) {
            temp[i] = temp[i-1] + temp[i-2];
            temp[i] %= 1000000007;
            
        }
        return temp[n];
    }
}
