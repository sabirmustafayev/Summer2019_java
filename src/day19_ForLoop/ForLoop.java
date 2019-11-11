package day19_ForLoop;

public class ForLoop {
	public static void main(String[] args) {
		
		//**************************************************************************
		System.out.println("List int numbers from 1 to 10 with their square");
		for (int i = 1; i <=10; i++) {
			System.out.println("the square of "+i+" is: "+(i*i));
		}
		//**************************************************************************
		System.out.println("list the whole EVEN number till 32");
		
		for (int i = 1; i <= 32; i++) {
				if ((i%2)==0) {
				System.out.println(i+" ");
				}
			}
		System.out.println("list the whole EVEN number till 32in other way");
		for (int i = 2; i <=32; i+=2) {
			System.out.println(i+" ");
		}
		//***************************************************************************
		System.out.println("list the whole ODD number till 32");
		for (int i = 1; i <= 32; i++) {
				if ((i%2)==1) {
					System.out.println(i+" ");
				}
			
			}
		
		}
	}


