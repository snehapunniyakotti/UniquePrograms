package ProtechSoft;

import java.util.Arrays;
import java.util.Scanner;

public class OddToEvenAndViseVersa {
       public static void main(String[] args) {
		Scanner sn =new Scanner(System.in);
		System.out.println("Enter the number");
		int[] num=new int[sn.nextInt()];
		System.out.println("Enter the elements ");
		for (int i = 0; i < num.length; i++) {
			num[i]=sn.nextInt();
			if (num[i]%2==0) {
				num[i]+=1;
			} else {
				num[i]-=1;
			}
		}
		System.out.println(Arrays.toString(num));
		
	}
	
}
