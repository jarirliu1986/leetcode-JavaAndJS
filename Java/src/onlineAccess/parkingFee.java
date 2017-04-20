package onlineAccess;

public class parkingFee {
	public static int solution(String E, String L){

		int hour = Integer.parseInt(L.substring(0, 2)) - Integer.parseInt(E.substring(0, 2));
		int minite = Integer.parseInt(L.substring(3, 5)) - Integer.parseInt(E.substring(3, 5));
		int parkHour = hour >= 0? hour : hour+24;
		if(minite > 0){
			parkHour += 1;
		}
		int fee = 2 + 3 + (parkHour - 1)*4;
		System.out.print(fee);
		return fee;
	}
	
	public static void main(String[] args){
		solution("23:42", "00:43");
	}
}
