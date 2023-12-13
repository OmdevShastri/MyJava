package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {

    }
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            List<Integer> curr = new ArrayList();
            backtrack(candidates, target, ans, curr, 0);
            return ans;
        }
        public void backtrack(int[] candidates, int target, List<List<Integer>> ans, List<Integer> curr, int ind){
            if (target==0){
                ans.add(new ArrayList<>(curr));
            } else if (target<0 || ind>= candidates.length) {
                return;
            }else {
                curr.add(candidates[ind]);
                backtrack(candidates, target-candidates[ind], ans, curr, ind);
                curr.remove(curr.get(curr.size()-1));
                backtrack(candidates, target, ans, curr, ind+1);
            }
        }
    }
}
