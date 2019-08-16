package LogicPrograming;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		int row, i, k, number = 1, j;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Number of Rows : ");
		row = scan.nextInt();

		for (i = 0; i < row; i++) 
		{
			System.out.println();
			for (k = row; k > i; k--) 
			{
				System.out.print(" ");
			}
			number = 1;
			for (j = 0; j <= i; j++) 
			{
				System.out.print(number + " ");
				number = number * (i - j) / (j + 1);
			}
			
			
		}

	}

}
