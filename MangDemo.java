import java.io.*;
import java.util.Scanner;

public class MangDemo {
	
	
	public static void main(String[] args) {
		int n,sum=0;
		Scanner scanner=new Scanner(System.in);
		
		do {
			System.out.println("Nhap vao so phan tu cua mang: ");
			n=scanner.nextInt();
		}while(n<0);
		
		int arr[]=new int[n];
		
		System.out.print("Nhap cac phan tu cho mang: \n");
		for(int i=0;i<n;i++)
		{
			System.out.print("Nhap phan tu thu "+i+" :");
			arr[i]=scanner.nextInt();
		}
		
		//Hien thi mang vua nhap
		System.out.print("Mang ban dau: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		//tinh tong
		for(int i=0;i<n;i++)
		{
			sum = sum+arr[i];
		}
		System.out.println("\nTong mang: "+sum);
		System.out.println("\nTrung binh: "+(float)sum/n);
		
		//sap xep giam dan
		int tem;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i;j<n-1;j++)
			{
				if(arr[i]<arr[j])
				{
					tem=arr[i];
					arr[i]=arr[j];
					arr[j]=tem;
				}
			}
		}
		System.out.println("\nMang giam dan: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		//sap xep tang dan
		int temtd;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temtd=arr[i];
					arr[i]=arr[j];
					arr[j]=temtd;
				}
			}
		}
		System.out.println("\nMang tang dan: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		//so lon nhat
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(max<arr[i]) max=arr[i];
		}
		System.out.println("\nSo lon nhat: "+max);
		
		//so nho nhat
		int min=arr[0];
		for(int i=0;i<n;i++)
		{
			if(min>arr[i]) min=arr[i];
		}
		System.out.print("\nSo nho nhat: "+min);
		
		
	}

}
