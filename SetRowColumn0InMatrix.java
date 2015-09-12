package StringsnArrays;
import java.util.*;

public class SetRowColumn0InMatrix {
	static int matrix[][],row,col;
	static boolean bool_row[]; 
	static boolean bool_col[];
	
	public static void main(String args[]){
		row = Integer.parseInt(args[0]);
		col = Integer.parseInt(args[1]);
		bool_row= new boolean [row];
		bool_col= new boolean [col];
		
		matrix = new int[row][col];
		Scanner scan = new Scanner (System.in);
		for (int i =0;i < row;i++){
			for (int j=0;j<col;j++){
				matrix[i][j]=scan.nextInt();
			}
		}
		scan.close();
		
		//print matrix
		printMatrix();
		callFunction();
		modifyMatrix();
		printMatrix();
	}
	
	public static void modifyMatrix(){
		for (int i =0;i < row;i++){
			for (int j=0;j<col;j++){
			if (bool_row[i] || bool_col[j]){
				matrix[i][j]=0;
			}
			}
		}
	}
	public static void printMatrix(){
		System.out.println("Printing");
		for (int i =0;i < row;i++){
			for (int j=0;j<col;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void callFunction(){
		for (int i =0;i < row;i++){
			for (int j=0;j<col;j++){
				if (matrix[i][j]==0){
					System.out.println("i: " + i);
					System.out.println("j: " + j);
					bool_row[i]=true;
					bool_col[j]=true;
				}
				
			}
		}
	}
	
	
}