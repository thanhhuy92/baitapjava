import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Nhap vao so thu 1: ");
		int so1=input.nextInt();
		System.out.print("Nhap vao so thu 2: ");
		int so2=input.nextInt();
		int tong=so1+so2;
		System.out.println("So thu 1: "+so1);
		System.out.println("So thu 2: "+so2);
		System.out.println("Tong: "+tong);
	}
}