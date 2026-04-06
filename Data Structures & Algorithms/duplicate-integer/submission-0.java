class Solution {
    public boolean hasDuplicate(int[] nums) {
          HashSet<Integer> sb=new HashSet<>();
    for(int n:nums){
        if(sb.contains(n)){
            return true;
        }
        else {
            sb.add(n);
        }
    }
    return false;
  }
    }
