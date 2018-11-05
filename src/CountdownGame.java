/*
 * Created by Martine Oppegaard Jakobsen because I couldn't sleep and I watched the show on youtube!
 * 
 * Based on the tv-show Countdown.
 * I feel like they don't use all the letters/ have some letters who occur more frequently, because that shit is hard
 * 
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CountdownGame {
	static Random generate = new Random();
	static Scanner tastatur = new Scanner (System.in);
	
	//random number between 100-999
	public static void threeDigitNumber (){
		int threeDigit = generate.nextInt(900) + 100;
		System.out.println("\n"+threeDigit);
	}
	
	//Here you can choose between 1-3 big numbers and the rest will be small, total of 6 numbers
	//maybe create a list and make sure a number does not show up more than twice
	public static void countdownNumber(){  
		int big;
		int[] bigNum = {100,75,50,25};
		int[] smallNum = {10,9,8,7,6,5,4,3,2,1};
		
		System.out.print("How many big numbers do you want? (1-3): ");
	    big = tastatur.nextInt();
	    System.out.println("You got " + big +" big numbers and "+ (6-big) + " little ones.\n");
	    
	    //should be a better way with not as much code
	    if (big == 3){
	    	for(int i=1; i <= 3; i++){
	    		System.out.print(bigNum[generate.nextInt(4)]+ "-");
	    	}
	    	for(int i=1; i <= 3; i++){
	    		System.out.print(smallNum[generate.nextInt(10)]+"-");
	    	}
	    }
	    else if (big == 2){
	    	for(int i=1; i <= 2; i++){
	    		System.out.print(bigNum[generate.nextInt(4)]+ "-");
	    	}
	    	for(int i=1; i <= 4; i++){
	    		System.out.print(smallNum[generate.nextInt(10)]+"-");
	    	}
	    }
	    else if(big == 1){
	    	for(int i=1; i <= 1; i++){
	    		System.out.print(bigNum[generate.nextInt(4)]+ "-");
	    	}
	    	for(int i=1; i <= 5; i++){
	    		System.out.print(smallNum[generate.nextInt(10)]+"-");
	    	}
	    }else{
	    	System.out.println("You can only have 3 or less of the big numbers");
	    	main(null);
	    }
	}
	
	// here is an array of 9 letters either vowel or consonant
	// least three vowels and four consonants (not implemented)
	public static void nineLetters(){
		String[] vowel = {"a","e","i","o","u","y"};
		String[] consonant = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","z"};
		List<String> list = new ArrayList<>();
		char velg, v=0, c=0;
		for(int i=0; i<9;i++){
		System.out.print("Do you want a vowel or a consonant? (v/c):");
		velg = tastatur.next().charAt(0);
		if(velg == 'v'){
			String a = vowel[generate.nextInt(6)];
			list.add(a);System.out.println(list);
		}else if(velg =='c'){
			String a = consonant[generate.nextInt(20)];
			list.add(a);System.out.println(list);
		}else{
			System.out.println("Ugyldig data");
		}}
	}

	
public static void main (String[]args){
	System.out.print("Do you want to play with numbers or letters? (n/l): ");
	String svar = tastatur.nextLine();
	
	if(svar.equals("n")){
		countdownNumber();
		threeDigitNumber();
	}else if(svar.equals("l")){
		nineLetters();
	}
	else{
		System.out.println("buuuuuuuuuuuuuuuuuuuu");
	}
	}
	
}
//75,75,7,4,1,4---735
