import java.io.*;
class NhapXuat {
    public static void main(String[] args) throws java.io.IOException
	{
		
		Reader inputChar_Obj=new InputStreamReader(System.in);
		System.out.print("Input a Character: ");
		char c=(char)inputChar_Obj.read();
		System.out.println(" Character read: " +c);
		System.out.println("");
		BufferedReader input_Obj=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input an Integer: ");
		int n=Integer.valueOf(input_Obj.readLine()).intValue();
		System.out.println("Integer read: " +n);
	}
}