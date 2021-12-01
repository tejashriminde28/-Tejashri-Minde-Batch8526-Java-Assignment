import java.util.Scanner;
public class Samd 
{
public static void main(String[] args)
{ 
  Scanner in =new Scanner(System.in);
  System.out.print("Input first no:"); 
  int no1 =in.nextInt();
    System.out.print("Input first no:"); 
  int no2 =in.nextInt();
 System.out.print(no1 + "+" + no2 +"=" + (no1+no2) +"\n");
 System.out.print(no1 + "-" + no2 +"=" + (no1-no2) +"\n");
 System.out.print(no1 + "*" + no2 +"=" + (no1*no2) +"\n");
 System.out.print(no1 + "/" + no2 +"=" + (no1/no2) +"\n");
 System.out.print(no1 + "%" + no2 +"=" + (no1%no2) +"\n");

}
}