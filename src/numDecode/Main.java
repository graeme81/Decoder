package numDecode;

public class Main {

	public static void main(String[] args) {
		String code = "4152";
		Decoder decoder = new Decoder();
		
		int result = decoder.Decode(code);
		
		System.out.println("Code decoded = "+ result);

	}

}
