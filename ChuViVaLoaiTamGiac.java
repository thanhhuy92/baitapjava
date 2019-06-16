import java.util.Scanner;
public class ChuViVaLoaiTamGiac {
    public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Nhap canh thu 1: ");
		int C1=input.nextInt();
		System.out.print("Nhap canh thu 2: ");
		int C2=input.nextInt();
		System.out.print("Nhap canh thu 3: ");
		int C3=input.nextInt();
		int p=C1+C2+C3;
		System.out.println("So thu 1: "+C1);
		System.out.println("So thu 2: "+C2);
		System.out.println("So thu 3: "+C3);
		if(C1<C2+C3&&C2<C1+C3&&C3<C1+C2)
		{
			if(C1*C1 == C2*C2+C3*C3 || C2*C2 == C1*C1+C3*C3 || C3*C3 == C1*C1+C2*C2)
			{
				System.out.println("Day la tam giac vuong!!!");
				System.out.println("Chu vi tam giac vuong: "+p);
			}
			else	if(C1 == C2 && C2 == C3)
			{
				System.out.println("Day la tam giac deu!!!");
				System.out.println("Chu vi tam giac deu: "+p);
			}
			else	if(C1==C2||C1==C3||C2==C3)
			{
				System.out.println("Day la tam giac can!!!");
				System.out.println("Chu vi tam giac can: "+p);
			}
			else{
				System.out.println("Day la tam giac thuong!!!");				
				System.out.println("Chu vi tam giac thuong: "+p);
			}
		}
		else{
			System.out.println("Ba canh C1, C2, C3 khong phai la ba canh cua mot tam giac!!!");
		}
	}
}