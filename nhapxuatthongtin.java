import java.util.Scanner;
public class nhapxuatthongtin
{
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		String name=input.nextLine();
		
		System.out.print("Nhap nam sinh: ");
		int age=input.nextInt();
		int tinhage = 2019 - age;
		
		System.out.println("Chao ban "+name+", nam nay ban "+tinhage+" tuoi");	
	}
}