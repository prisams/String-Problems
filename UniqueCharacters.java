package StringsnArrays;

import java.util.Scanner;

public class UniqueCharacters {
	public static void main(String args[]){
		Scanner scan = new Scanner (System.in);
		System.out.println("Ente a word: ");
		String word = scan.next();
		char character[]= new char[word.length()];
		for (int i=0; i < word.length();i++){
			character[i]=word.charAt(i);
		}
		character=sorting(character);
		if (checkIfDuplicate(character)){
			System.out.println("Dups present");
		}
		else{
			System.out.println("No Dups");
		}
		scan.close();
		
		//print character array
		/*System.out.println("Printing:");
		for (int i=0; i < word.length();i++){
			System.out.print(character[i]);
		}*/
	}
	
	public static char[] sorting(char[] character){
		for (int i=0; i < character.length;i++){
			for (int j=i+1;j<character.length;j++){
				if (character[i]>character[j]){
					char temp=character[i];
					character[i]=character[j];
					character[j]=temp;
				}
			}
		}
		
		return character;
	}
	
	public static boolean checkIfDuplicate(char[] character){
		for (int i=0;i<character.length-1;i++){
			if (character[i]==character[i+1]){
				return true;
			}
		}
			return false;
	}
}
