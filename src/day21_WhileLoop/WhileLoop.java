package day21_WhileLoop;

public class WhileLoop {
	public static void main(String[] args) {
		/*
		 write the code that count how many "book" in the string
		 */
		
		String sentence = "I like book, I read book";
		String sentence2 = sentence;
		
		int count = 0;
		
		while (sentence.contains("book")) {
			count++;
			
			sentence = sentence.replaceFirst("book","");
			
		}
		System.out.println(count);
		System.out.println(sentence);
		System.out.println(sentence2);
		
		//********************************************************
		
		while(true) {
			
			count++;
			System.out.println("Hello");
			break;
		}
		
		int i =0;
		while(true) {
			i++;
			System.out.println("Hello: "+i);
			if (i==5) {
				break;
			}
		}
		
		
	}

}
