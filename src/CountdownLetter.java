

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CountdownLetter {
	
	public static void nineLetters(){
		Random generate = new Random();
		Scanner tastatur = new Scanner (System.in);
		String[] vowel = {"a","e","i","o","u","y","w"};
		String[] consonant = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","x","z"};
		List<String> list = new ArrayList<>();
		char velg, v=0, c=0;
		for(int i=0; i<9;i++){
		System.out.print("Do you want a vowel or a consonant? (v/c):");
		velg = tastatur.next().charAt(0);
		if(velg == 'v'){
			String a = vowel[generate.nextInt(10)];
			list.add(a);System.out.println(list);
		}else if(velg =='c'){
			String a = consonant[generate.nextInt(10)];
			list.add(a);System.out.println(list);
		}else{
			System.out.println("Ugyldig data");
		}}
	}
	public static void main (String[]args){
		nineLetters();

}}
