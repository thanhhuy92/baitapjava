import java.io.*;
import java.util.Scanner;

public class PTB2 {
	
	double a,b,c,x1,x2;
	
	Scanner scanner = new Scanner(System.in);
	
	public void Nhap() {
		System.out.println("Nhap a: ");
		a=scanner.nextDouble();
		System.out.println("Nhap b: ");
		b=scanner.nextDouble();
		System.out.println("Nhap c: ");
		c=scanner.nextDouble();
		
	}
	
	public void GiaiPT2() {
		double delta=(b*b)-(4*a*c);
		
		if(a==0)
		{
			if(b==0)
			{
				if(c==0)
				{
					System.out.println("Phuong trinh vo so nghiem!!!");
				}else {
					System.out.println("Phuong trinh vo nghiem!!!");
				}
			}else {
				System.out.println("Phuong trinh co mot nghiem: "+"x="+(-b/c));
			}
		}else {
			if(delta>0)
			{
				x1=(double)((-b+Math.sqrt(delta))/(2*a));
				x2=(double)((-b-Math.sqrt(delta))/(2*a));
				
				System.out.println("Phuong trinh co 2 nghiem: "+"\nx1 = "+x1+" \nx2 = "+x2);
			}else {
				if(delta==0)
				{
					x1=(-b/(2*a));
					
					System.out.println("Phuong trinh co nghiem kep: "+"\nx1 = x2 = "+x1);
				}else {
					System.out.println("Phuong trinh vo nghiem!!!");
				}
			}	
		}
		
	}
	public static void main(String[] args) {
		PTB2 ptb2=new PTB2();
		
		ptb2.Nhap();
		
		ptb2.GiaiPT2();

	}

}