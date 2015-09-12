package StringsnArrays;

import java.util.Scanner;

public class ReverseStringInPlace {
	public static void main(String args[]){
		Scanner scan = new Scanner (System.in);
		System.out.println("Ente a word: ");
		String word = scan.next();
		char[] character= word.toCharArray();
		for (int i=0,j=character.length-1;i<character.length/2;i++,j--){
			char temp=character[i];
			character[i]=character[j];
			character[j]=temp;
		}
		System.out.println("Printing:");
		for (int i=0; i < word.length();i++){
			System.out.print(character[i]);
		}	
		scan.close();
	}
}
