
public class JumpGame {
	
    public static boolean canJump(int[] nums) {
    	int maxLocation = 0;
        for(int i=0; i<nums.length; i++) {
            if(maxLocation<i) return false; // if previous maxLocation smaller than i, meaning we cannot reach location i, thus return false.
            maxLocation = (i+nums[i]) > maxLocation ? i+nums[i] : maxLocation; // greedy:
        }
        return true;
    }

	public static void main(String[] args) {
		int[] a = {2,0};
		System.out.println(canJump(a));

	}

}
