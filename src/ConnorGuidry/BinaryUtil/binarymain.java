package ConnorGuidry.BinaryUtil;

public class binarymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Binary binary = new Binary("111111");
		
		//System.out.println(binary);
		
		Binary.leftShift(binary, 5);
		
		//System.out.println(binary);
		
		Binary.leftShift(binary, 6);
		
		//System.out.println(binary);
		
		//Binary.leftShift(binary, 7);
		
		Binary secondTest = new Binary("101011001");
		
		//System.out.println(Binary.binaryToInt(secondTest));
		
		//System.out.println(Binary.intToBinary(56));
		
		//System.out.println(Binary.binaryToInt(secondTest));
		
		Binary thirdTest = new Binary("11101001");
		
		//System.out.println(thirdTest);
		
		Binary.rightShift(thirdTest, 6);
		
		//System.out.println(thirdTest);
		
		Binary hex = Binary.intToBinary(0xc5f3466a);
		
		//System.out.println(hex);
		
		//System.out.println(hex.toHexString());
		
		Binary digest = new Binary("10111010011110000001011010111111100011110000000111001111111"
				+ "01010010000010100000101000000110111100101110110101110001000100010001110110000"
				+ "00000011011000011010001110010110000101110111101010011100101101000001000011111"
				+ "1110110000111110010000000000001010110101101");
		
		Binary testDigest = new Binary("10011000011101000011010010110010010011101111010111110101"
				+ "110101110101000111101101100010010011001110100111000000101110111101110001111010"
				+ "000100001111101010011001110000001100111110101011101100011101101000000111100111"
				+ "0111100101111100100101110001110111111010100");
		
		//System.out.println(digest.toHexString());
		
		System.out.println(Binary.complement(digest));
		
		System.out.println(Binary.AND(digest, testDigest));
		
	}

}
