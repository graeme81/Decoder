package numDecode;

public class Main {

	public static void main(String[] args) {
		String code = "111111";
		Decoder decoder = new Decoder();
		
		// find if first char is a 0; dispose
		
		int result = decoder.Decode(code);
		
		System.out.println("Code decoded = "+ result);

	}

}
