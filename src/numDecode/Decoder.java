package numDecode;

public class Decoder {
	
	public int Decode(String code) {
		
		if(code.length() == 1) return code.length();
		 
		int[]digits = code.chars()
						  .map(c -> c-'0')
						  .toArray();
		
		int multiplyer = 1;
		int subtractor = 0;
		for(int i = 0; i < digits.length; i++) {
			if(digits[i] == 1 && i+1 < digits.length) {
				multiplyer *= 2;
				if(digits[i+1]<3) {
					subtractor++;
				}
			}else if(digits[i] == 2 && i+1 < digits.length && digits[i+1] < 7){
				multiplyer *= 2;
				if(digits[i+1]<3) {
					subtractor++;
				}
			}
		}
		
		return multiplyer - subtractor;

	}
}
