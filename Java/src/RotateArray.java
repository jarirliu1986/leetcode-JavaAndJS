
public class RotateArray {
    public void rotate(int[] nums, int k) {
        if(k<=0) return;
        int len = nums.length;
        if(k >= len){
        	k = k%len;
        }
        int[] d = new int[len];
        for(int i=0; i < len; i++){
        	if(i <= k-1){
        		d[i] = nums[len-k+i];
        	}else{
        		d[i] = nums[i-k];
        	}
        }
        System.arraycopy(d, 0, nums, 0, len);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
