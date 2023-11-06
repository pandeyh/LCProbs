package easy;

import java.util.HashMap;
import java.util.Stack;

//https://leetcode.com/problems/next-greater-element-i/description/
public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {


        HashMap<Integer, Integer> numMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int num: nums2){
            while (!stack.isEmpty() && stack.peek() < num) {
                numMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length; i++ ){
            result[i] = numMap.getOrDefault(nums1[i], -1);
        }

        return result;
    }
}
