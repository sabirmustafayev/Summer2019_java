package Repl_it;

import java.util.Scanner;

public class if_BlackJack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int house = scan.nextInt();
		int player = scan.nextInt();
		
		int cardTotal = house + player;
		
		if (cardTotal > 21) {
			System.out.println("bust");
		}
		else if (house > player) {
			System.out.println("player loss");
		}
		else if (player == house) {
			System.out.println("its a tie");
		}
		else
			System.out.println("player wins");
	}

}
