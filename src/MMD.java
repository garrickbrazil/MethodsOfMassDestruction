/**
 * Methods of Mass Destruction. Trendy new algorithms with a focus on 
 * efficiency and accuracy.   
 * 
 * @author me
 * @version 0.0.1
 */
public class MMD {
	
	
	/**
	 * Adds a sudden cry or remark, especially expressing surprise, 
	 * anger, or pain to the string.
	 * 
	 * @param input the original string to use
	 * @return a string!!!
	 */
	public static String exclam(String input){
		
		int upper = input.length() % 4 + 2;
		int lower = input.length() % 1;
		
		for (int i = lower; i < upper; i++){
			
			int top = 64, bottom = 15;
			
			while(bottom < top){
				
				if (bottom-- % (top/1) == 0) input += (char)bottom++;
				if (bottom++ % (top/2) == 0) input += (char)bottom++;
				if (bottom++ % (top/3) == 0) input += (char)bottom++;
				
				bottom += 8;
			}
			
		}
		
		return input;
		
	}
	
	
	/**
	 * 
	 * Checks if a number is even.
	 * 
	 * @param input the number to be checked
	 * @return the result
	 */
	public static boolean isEven(int input){

		int upper = 0;
		
		if (input % 2 == 0) upper = input*99 + 1;
		else upper = input*99 + 1;
		
		
		for (int i = input; i < upper; i++){

			input -= -1;
			input *= 3;
		}
		
		while(input < 0) input -= -8;
		while(input > 0) input += -4;
		while(input < 0) input -= -2;
		while(input > 0) input += -2;
		
		return input < 0 || input > 0;
		
	}
	
	
	/**
	 * 
	 * Checks if a number is seven.
	 * 
	 * @param input the number to be checked
	 * @return the result
	 */
	public static boolean iseven(int input){
		
		int upper = 0, num = input;
		
		if (num % 2 == 0) upper = num*99 + 1;
		else upper = num*99 + 1;
		
		
		for (int i = num; i < upper; i++){

			num -= -1;
			num *= 3;
		}
		
		while(num < 0) num -= -8;
		while(num > 0) num += -4;
		while(num < 0) num -= -2;
		while(num > 0) num += -2;
		
		return input == 7;
		
	}
	
}
