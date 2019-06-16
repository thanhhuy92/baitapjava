import java.io.*;
import java.util.Scanner;

public class test{
	public static void main(String[] args){
		int n;
		
		Scanner scanner= new Scanner(System.in);
		
		do{
			System.out.print("Nhap vao so pt cua mang: ");
			n=scanner.nextInt();
		}while(n<0);
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Nhap pt thu "+i+": ");
			arr[i]=scanner.nextInt();
		}
		
		System.out.print("Mang ban dau: \n");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		
		int temp;
		for(int i=0;i<n-1;i++){
			for(int j=i;j<n;j++){
				if(arr[i]>arr[j]){
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("\nMang tang dan: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+"\t");
		}
		
		int sum =0;
		for(int i=0;i<n;i++)
		{
			sum = sum+arr[i];
		}
		System.out.print("\nTong mang: "+sum);
	}
}