import java.util.ArrayDeque;
import java.util.Deque;

public class onethreetwoPattern {
    // leetCode Problem Link -
    String link = "https://leetcode.com/problems/132-pattern/";

    public boolean find132pattern(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int third = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < third)
                return true;
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                third = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
