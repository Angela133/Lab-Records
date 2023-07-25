import java.util.Scanner;
class NegException extends Exception
{
public NegException(String s)
{
super(s);
}
}

public class Q4 {
public static void main(String[] args)
{
   System.out.println("\nName : ANGELA MATHEW");
	System.out.println("Reg.No : SJC22MCA-2005");
	System.out.println("Course Code : 20MCA132");
	System.out.println("Course Name : OOPS LAB");
	System.out.println("Date : 22 JUNE 2023");
	System.out.println("\n-------------------------------------------------------------\n");
int i;
double sum=0,avg=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n numbers:");
int n=sc.nextInt();

for(i=1;i<=n;i++)
{
try
{
System.out.println("Enter number"+i);
int a=sc.nextInt();
if(a<0)
{
i--;
throw new NegException("Negative numbers not allowed,Try again");
}
else
{
sum=sum+a;
}
}
catch(NegException e)
{
System.out.println("NEGETIVE EXCEPTION OCCURED:"+e);
}
}
avg=sum/n;
System.out.println("Average is "+avg);
sc.close();
}

}
