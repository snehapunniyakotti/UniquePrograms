package numProg;

import java.util.Scanner;

public class HappyNumber {
      public static void main(String[] args) {
		Scanner sn =new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sn.nextInt();
		if (num==1) {
		   System.out.println("Happy Number");
		} else {
			check(num);
		}
	}
    public static void check(int num) {
    	int sum=0;
		int originalNum = num;
			while (originalNum>0) {
				int rem = originalNum % 10;
	            sum += rem * rem;  // Add the square to the sum
	            originalNum /= 10;
			}
		
		System.out.println(sum);
		if (sum>=10) {
			check(sum);
		}else {
			if (sum==1) {
				System.out.println("Happpy number");
			} else {
	            System.out.println("Not happy number");
			}
		}
    }
}
