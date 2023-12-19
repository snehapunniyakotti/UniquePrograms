package Prgms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NthFiboReverse {
          public static void main(String[] args) { 
            Scanner sn =new Scanner(System.in);
            System.out.println("Enter the range");
            int range=sn.nextInt();
        	int []arr=new int[range];
			int n1=0,n2=1,n3;
			arr[0]=n1;
			arr[1]=n2;
			for (int i = 2; i <range; i++) {
				n3=n1+n2;
				arr[i]=n3;
				n1=n2;
				n2=n3;
			}
			for (int i = arr.length-1; i>=0; i--) {
				System.out.println(arr[i]);
			}
			}


}
