package StringsnArrays;

import java.util.Scanner;

public class UniqueCharwithAsci {
	public static void main(String args[]){
		int[] character = new int[128];
		Scanner scan = new Scanner (System.in);
		System.out.println("Ente a word: ");
		String word = scan.next();
		boolean flag=true;
		for(int i=0;i<word.length();i++){
			if (character[word.charAt(i)]!=0){
				flag=false;
				break;
			}
			else{
				character[word.charAt(i)]++;
			}
		}
		if (flag){
			System.out.println("No dups");
		}
		else{
			System.out.println("Dups");
		}
		scan.close();
		
	}
}
