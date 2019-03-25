package numDecode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DecoderTest {
	
	Decoder decoder = new Decoder();

	@Test
	void test1() {
		String code =  "1";
		int result = decoder.Decode(code);
		assertEquals(1, result);
	}
	
	@Test
	void test2() {
		String code = "456";
		int result = decoder.Decode(code);
		assertEquals(1, result);
	}

	@Test
	void test3() {
		String code = "415";
		int result = decoder.Decode(code);
		assertEquals(2, result);
	}
	
	@Test
	void test4() {
		String code = "4152";
		int result = decoder.Decode(code);
		assertEquals(2, result);
	}
	
	@Test
	void test5() {
		String code = "41523";
		int result = decoder.Decode(code);
		assertEquals(4, result);
	}
	
	@Test
	void test6() {
		String code = "12345";
		int result = decoder.Decode(code);
		assertEquals(3, result);
	}
	
	@Test
	void test7() {
		String code = "1212";
		int result = decoder.Decode(code);
		System.out.println(result);
		assertEquals(5, result);
	}
	
	@Test
	void test8() {
		String code = "111";
		int result = decoder.Decode(code);
		System.out.println(result);
		assertEquals(3, result);
	}
	
	@Test
	void test9() {
		String code = "111111";
		int result = decoder.Decode(code);
		System.out.println(result);
		assertEquals(13, result);
	}

	@Test
	void test10() {
		String code = "411";
		int result = decoder.Decode(code);
		System.out.println(result);
		assertEquals(2, result);
	}

	@Test
	void test11() {
		String code = "1011";
		int result = decoder.Decode(code);
		System.out.println(result);
		assertEquals(2, result);
	}
	
	@Test
	void test12() {
		String code = "10101";
		int result = decoder.Decode(code);
		System.out.println(result);
		assertEquals(1, result);
	}
	
	
}
