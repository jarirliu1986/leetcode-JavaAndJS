/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int s = 1, e = n;
        int mid = 0;
        while(s <= e){
            mid = s+(e-s)/2;
            int guess = guess(mid);
            if(guess == 1){
                s = mid+1;
            }else if(guess == -1){
                e = mid-1;
            }else{
                return mid;
            }
        }
        return s;
    }
}