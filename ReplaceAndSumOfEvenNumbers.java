package ProtechSoft;

public class ReplaceAndSumOfEvenNumbers {
       public static void main(String[] args) {
		int num=562413,sum=0;
		String num2="";
		System.out.println("Before num value : "+num);
		int temp=num;
		while (temp>0) {
			int rem = temp%10;
			if (rem%2==0) {
				sum+=rem;
				num2="0"+num2;
			}else {
				num2=rem+num2;
			}
			temp/=10;
		}
		System.out.println("sum : "+sum);
		System.out.println("After num value : "+num2);
	}
      
       
	

}
