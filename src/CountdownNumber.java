

import java.util.Random;
import java.util.Scanner;

public class CountdownNumber {
static Random generate = new Random();
static Scanner tastatur = new Scanner (System.in);


//random number between 100-999
public static void threeDigitNumber (){
	int threeDigit = generate.nextInt(900) + 100;
	System.out.println("\n"+threeDigit);
}

public static void countdownNumber(){  
	int big;
	int[] bigNum = {100,75,50,25};
	int[] smallNum = {10,9,8,7,6,5,4,3,2,1};
	
	System.out.print("How many big numbers dou you want? (1-3):");
    big = tastatur.nextInt();
    System.out.println("You got " + big +" big numbers and "+ (6-big) + " little ones.\n");
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


public static void main (String[]args){
	countdownNumber();
	threeDigitNumber();
}
	
}
