import java.io.*;

import java.util.Scanner;

public class HinhTamGiac {
	
	protected int a,b,c,chuvi;
	Scanner scanner = new Scanner(System.in);
	
	public void Nhap() {
		System.out.println("Nhap a: ");
		a=scanner.nextInt();
		System.out.println("Nhap b: ");
		b=scanner.nextInt();
		System.out.println("Nhap c: ");
		c=scanner.nextInt();
		if(a<0)
		{
			System.out.println("Canh a nhap am!!!");
			a=0;
		}
		if(b<0)
		{
			System.out.println("Canh b nhap am!!!");
			b=0;
		}
		if(c<0)
		{
			System.out.println("Canh a nhap am!!!");
			c=0;
		}
		if(a>=b+c||b>=a+c||c>=a+b)
		{
			System.out.println("Ba canh a,b,c khong phai la ba canh cua mot tam giac");
			a=0;b=0;c=0;
		}
	}
	
	public void HienThi(int canha, int canhb, int canhc) {
		System.out.println("Canh a: "+a+"\nCanh b: "+b+"\nCanh c:"+c);
	}
	
	public int tinhchuvi(int canha,int canhb,int canhc) {
		chuvi=a+b+c;
		return chuvi;
	}
	
	public void hienthichuvi(int cv) {
		System.out.println("Chu vi : "+cv);
	}
	public static void main(String[] args) {
		HinhTamGiac hinhtamgiac= new HinhTamGiac();
		
		hinhtamgiac.Nhap();
		
		hinhtamgiac.HienThi(hinhtamgiac.a,hinhtamgiac.b,hinhtamgiac.c);
		
		int ChuVi=hinhtamgiac.tinhchuvi(hinhtamgiac.a,hinhtamgiac.b,hinhtamgiac.c);
		
		hinhtamgiac.hienthichuvi(ChuVi);
	}

}
