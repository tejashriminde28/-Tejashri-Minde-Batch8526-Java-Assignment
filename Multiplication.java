import java.util.Scanner;
public class Multiplication{

public static void main(String[] args)
{ 
Scanner sc=new Scanner(System.in);
System.out.print("Enter No:");
int a=sc.nextInt();
for(int i=1;i<=10;i++)
	{ 
	System.out.println(a+"x"+i+"="+(a*i));
	}
}
}
