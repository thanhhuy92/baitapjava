import java.io.*;
import java.util.Scanner;

public class SoNguyenTo {
	
	public static int ktra(int n) {
		int dem=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0) dem++;
		}
		if(dem==2)
		{
			return 1;
		}else
		{
			return 0;
		}
		
	}
	public static void main(String[] args) {
		Scanner nhap=new Scanner(System.in);
		System.out.println("Nhap so nguyen to:");
		int so=nhap.nextInt();
		if(so>0)
		{
			if(ktra(so)==1)
			{
				System.out.println(so+" la so nguyen to");
			}else{
				System.out.println(so+" khong la so nguyen to");
			}
		}
	}

}