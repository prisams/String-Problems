package StringsnArrays;

public class OneStringPermutOfAnother {
	public static void main(String args[]){
		String word1= args[0];
		String word2= args[1];
		int word1_[]= new int[128];
		boolean flag =true;
		
		System.out.println("Word1: " + word1);
		System.out.println("Word2: " + word2);
		
		for (int i=0;i<word1.length();i++){
			word1_[word1.charAt(i)]++;
		}
		
		for (int i=0;i<word2.length();i++){
			word1_[word2.charAt(i)]--;
		}
		
		for (int i=0;i<word1_.length;i++){
			if (word1_[i]!=0){
				flag=false;
				break;
			}
		}
		
		if (flag){
			System.out.println("Yes Permutation");
		}
		else{
			System.out.println("Not permutation");
		}
	}
}
