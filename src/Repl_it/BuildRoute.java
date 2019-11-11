package Repl_it;

import java.util.Scanner;

public class BuildRoute {
	public static void main(String[] args) {
		
		/*
		 Write a program that will print out route instructions. 
		 Your program should take 2 parameters: start point and end point.
		 Use left, right, up and down for navigation. Insert ">" between commands.
		 If start point equals to end point - display: "start/end(start or end variable!) found".
		 Note: you may move only clock wise.
		 		 
		 */
		
		 Scanner scan = new Scanner(System.in);
		    String start = scan.next();
		    String end = scan.next();
		    
		    if (start.equals(end)) {
		    	System.out.println("start/end(start or end variable!) found");
				
			}
		    
		    if (start.equalsIgnoreCase("A")) {
				
		    	if (end.equalsIgnoreCase("B")) {
					System.out.println("right: B found");
				}
		    	else if (end.equalsIgnoreCase("C")) {
					System.out.println("right"+" > "+"down: C found");
				}
		    	else if (end.equalsIgnoreCase("D")) {
		    		System.out.println("right"+" > "+"down"+" > "+"left: D found");
				}
			}
		    if (start.equalsIgnoreCase("B")) {
				
		    	if (end.equalsIgnoreCase("A")) {
					System.out.println("down"+" > "+"left"+" > "+"up: A found");
				}
		    	else if (end.equalsIgnoreCase("C")) {
					System.out.println("down: C found");
				}
		    	else if (end.equalsIgnoreCase("D")) {
		    		System.out.println("down"+" > "+"left: D found");
				}
			}
		    if (start.equalsIgnoreCase("C")) {
				
		    	if (end.equalsIgnoreCase("A")) {
					System.out.println("left"+" > "+"up: A found");
				}
		    	else if (end.equalsIgnoreCase("B")) {
					System.out.println("left"+" > "+"up"+" > "+"right: B found");
				}
		    	else if (end.equalsIgnoreCase("D")) {
		    		System.out.println("left: D found");
				}
			}
		    if (start.equalsIgnoreCase("D")) {
				
		    	if (end.equalsIgnoreCase("A")) {
					System.out.println("up: A found");
				}
		    	else if (end.equalsIgnoreCase("B")) {
					System.out.println("up"+" > "+"right: B found");
				}
		    	else if (end.equalsIgnoreCase("C")) {
		    		System.out.println("up"+" > "+"right"+" > "+"down: C found");
				}
			}
		    
		    
	}

}
