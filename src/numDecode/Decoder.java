package numDecode;

import java.util.*;

public class Decoder {
	
	public int Decode(String code) {
		
		if(code.length() == 1) {
			return code == "0" ? 0:1;
		}
		
		int[]digits = code.chars()					// changing the code to an integer array
						  .map(c -> c - '0')
						  .toArray();
		
		//for sorting purpose
		Deque<Integer> arr = new LinkedList<>();
		
		// sorting the digits to get rid of 0's, 0's have to make 10 or 20 or code is bad
		for(int x = digits.length-1 ; x > -1; x--) {
			if(digits[x] > 0) {
				arr.addFirst(digits[x]);
			}else {
				if(digits[x-1]> 2){return 0;}
				else {
					digits[x-1] = digits[x-1]*10;
				}
			}
		}
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		for(int x: arr) {
			nums.add(x);
		}
		 
		int multiplyer = 1;
		int subtractor = 0;
		
		for(int i = 0; i < nums.size(); i++) {
			if(nums.get(i) == 1 && i+1 < nums.size()) {
				multiplyer *= 2;
				if(nums.get(i+1)<3 && i+2 < nums.size()) {
					subtractor++;
					System.out.println(subtractor);
				}
			}else if(nums.get(i) == 2 && i+1 < nums.size() && nums.get(i+1) < 7){
				multiplyer *= 2;
				if(nums.get(i+1)<3 && i+2 < nums.size()) {
					subtractor++;
					System.out.println(subtractor);
				}
			}
		}

		
		return multiplyer - subtractor;

	}
}