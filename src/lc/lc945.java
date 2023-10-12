package lc;

import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Node;
import java.io.*;

// Ariana
// Time Complexity: O(Nlog⁡N)
// Space Complexity: O(N)
class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int moves = 0, taken = 0;

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i - 1] == nums[i]) {
                taken++;
                moves -= nums[i];
            } else {
                int give = Math.min(taken, nums[i] - nums[i - 1] - 1);
                moves += give * (give + 1) / 2 + give * nums[i - 1];
                taken -= give;
            }
        }

        if (nums.length > 0)
            moves += taken * (taken + 1) / 2 + taken * nums[nums.length - 1];

        return moves;
    }
}

public class lc945 {
  public static void main(String arg[]) {
    Solution test = new Solution();

    int[] nums = {1,1 ,2,2};

    int a = test.minIncrementForUnique(nums);

    System.out.println("Hello World");

  }
}
