import java.util.Scanner;
import java.util.Random;
public class Oantuxi{
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		
		System.out.print("Nhap 1-Bao, 2-Bua, 3-Keo, 4-Thoat: ");
		int answer= input.nextInt();
		
		String chooice;
		switch(answer)
		{
			case 1: chooice = "Bao";
				break;
			case 2: chooice = "Bua";
				break;
			case 3: chooice = "Keo";
				break;
			default: chooice = "Thoat";
				break;
		}
		
		
		
		//Random rd = new Random();
		//int answerpc= rd.nextInt();
		
		String chooicepc="Bua";
		
		/*switch(answerpc)
		{
			case 1: chooicepc = "Bao";
				break;
			case 2: chooicepc = "Bua";
				break;
			case 3: chooicepc = "Keo";
				break;
		}*/
		System.out.println("May chon: " +chooicepc);
		
		if(chooice == "Bao" && chooicepc == "Bao")
		{
			System.out.println("Ban da hoa!!!");
		}else if(chooice == "Bao" && chooicepc == "Bua")
		{
			System.out.println("Ban da thang!!!");
		}else if(chooice=="Bao"&&chooicepc=="Keo")
		{
			System.out.println("Ban da thua!!!");
		}else if(chooice=="Bua"&&chooicepc=="Bao")
		{
			System.out.println("Ban da thua!!!");
		}else if(chooice=="Bua"&& chooicepc=="Bua")
		{
			System.out.println("Ban da hoa!!!");
		}else if(chooice=="Bua"&&chooicepc=="Keo")
		{
			System.out.println("Ban da thang!!!");
		}else if(chooice=="Keo"&&chooicepc=="Bao")
		{
			System.out.println("Ban da thang!!!");
		}else if(chooice=="Keo"&& chooicepc=="Bua")
		{
			System.out.println("Ban da thua!!!");
		}else if(chooice=="Keo"&&chooicepc=="Keo")
		{
			System.out.println("Ban da hoa!!!");
		}
	}
}