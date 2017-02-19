import java.util.Arrays;

public class Heaters {
	
    public static int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int rad = 0, i=0, j=0;
        
        while(i<houses.length){
        	while(j<heaters.length-1 && Math.abs(heaters[j+1]-houses[i])<= Math.abs(heaters[j]-houses[i])){
        		j++;
        	}
      	
        	rad = Math.max(Math.abs(heaters[j]-houses[i]), rad);
        	i++;
        }
        
        return rad;
    }

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {2};
		System.out.println(findRadius(a,b));
	}

}
