package StringsnArrays;
public class StringCompression {
	public static void main(String args[]){
		String string=args[0];
		String result;
		int i=0,sum=1;
		result=string.charAt(i)+ "";
		do{
			if (string.charAt(i)==string.charAt(i+1)){
				sum++;
			}
			else{
				result=result+sum;
				sum=1;
				result+=string.charAt(i+1);
			}
			i++;
		}while (i<string.length()-1);
		result+=sum;
		System.out.print(result);
	}
}
