package LeetCode;

import java.util.Arrays;

/**
 * Created by liudong on 2019/3/15.
 * Koko loves to eat bananas.  There are N piles of bananas, the i-th pile has piles[i] bananas.  The guards have gone and will come back in H hours.

 Koko can decide her bananas-per-hour eating speed of K.  Each hour, she chooses some pile of bananas, and eats K bananas from that pile.  If the pile has less than K bananas, she eats all of them instead, and won't eat any more bananas during this hour.

 Koko likes to eat slowly, but still wants to finish eating all the bananas before the guards come back.

 Return the minimum integer K such that she can eat all the bananas within H hours.



 Example 1:

 Input: piles = [3,6,7,11], H = 8
 Output: 4
 Example 2:

 Input: piles = [30,11,23,4,20], H = 5
 Output: 30
 */
public class KokoEatingBananas_875 {
    public int minEatingSpeed(int[] piles, int H) {
        //sort array
        Arrays.sort(piles);
        // max of array
        int min =1, max= piles[piles.length-1];
        // binary search to find the value
        while(min <= max){
            int k = min + ((max-min)/2);
            if (eatAll(piles,k,H)) {
                max = k-1;
            }else{
                min = k+1;
            }
        }
        return min;
    }

    private boolean eatAll(int[] piles, int k, int h) {
        int countHours = 0;
        for (int pile:piles) {
            countHours += pile/k;
            if (pile%k != 0) {
                countHours++;
            }
        }
        return countHours <= h;
    }


}
