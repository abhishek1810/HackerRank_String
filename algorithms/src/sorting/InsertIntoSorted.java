package sorting;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertIntoSorted {

	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		s.nextLine();
		String input = s.nextLine();
		int arr[] = new int[t];
		
		String in[] = input.split(" ");
		
		for (int i = 0; i < in.length; i++) {
			if(in[i] != " "){
			arr[i] = Integer.parseInt(in[i]);
			}
		}
		
		//int[] a = {2,4,6,7,8,5};

		insertIntoSorted(arr);
		s.close();
	}

	public static void insertIntoSorted(int[] ar) {
		// Fill up this function

		int len = ar.length;
		int key = ar[len-1];
		int k = len-1;
		for (int i = len - 1; i >= 0; i--) {
			if(key < ar[i]){
				ar[k] = ar[i];
				k = k-1;
				 for (int j = 0; j < ar.length; j++) {
					System.out.print(ar[j]+ (j != ar.length ? " " : ""));
				}
				System.out.println(""); 
				if(i == 0 ) { ar[i] = key; }
			}
			else if(key > ar[i]){
				ar[i+1] = key;
				break;
			}

		}
		
		for (int j = 0; j < ar.length; j++) {
			System.out.print(ar[j]+ (j != ar.length ? " " : ""));
		}
		System.out.println("");


	}

} 