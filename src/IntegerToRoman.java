
public class IntegerToRoman {

	public static String intToRoman(int number) {
		
		int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
		String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<values.length; i++) {
			while(number >= values[i]) {
				number -= values[i];
				result.append(romanLetters[i]);
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		for(int i=1; i<=3500; i++) {
			System.out.println(i+"="+intToRoman(i));
		}

	}

}
