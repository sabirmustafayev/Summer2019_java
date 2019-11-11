package Repl_it;

import java.util.Scanner;

public class Contain_replaceFirst_CatDog {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int countOfCats = 0;
	    int countOfDogs = 0;
	    String word = scan.next();
	    
	    while (word.contains("cat")) {
			
			countOfCats+=1;
			 word = word.replaceFirst("cat","");
			
		}
	    
	    while (word.contains("dog")) {
			
			countOfDogs+=1;
			 word = word.replaceFirst("dog","");
			
		}
	    System.out.println(countOfCats+","+ countOfDogs);
	    
	    if (countOfCats == countOfDogs) {
			System.out.println("true");
		}
	    else {
			System.out.println("false");
		}
	}

}
