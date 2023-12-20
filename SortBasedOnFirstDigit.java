package ProtechSoft;

import java.util.Arrays;

public class SortBasedOnFirstDigit {
        public static void main(String[] args) {
        	int[] arr={3,10,50,25,6,9,123}; 
        	for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					int first=getleftmostDigit(arr[i]);
					int second=getleftmostDigit(arr[j]);
					
					if (first<second) {
						int temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				
			}
        	System.out.println(Arrays.toString(arr));
        	
        }
        public static int getleftmostDigit(int num) {
        	while (num>=10) {
				num/=10;
			}
        	return num;
        }
         
}
