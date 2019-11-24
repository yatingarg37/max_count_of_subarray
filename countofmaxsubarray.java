package assignments;

import java.util.Scanner;

public class maxcountofsubarray {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int count=0;
		System.out.println("Enter the array Elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the value of k");
		int k = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n ;j++) {
				int max=0;
				for(int m=i;m<=j;m++) {
					if(max<arr[m]) {
						max=arr[m];
					}
				}
				if(max>k) {
					count++;
				}
			}
			System.out.println("Count of Sub array:" + count);
		}
	}
}
