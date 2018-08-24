import java.util.Scanner;
class greatest
{
public static void main(String args[])
{
double a,b,c;
System.out.println("Enter all the three numbers:");
Scanner sc=new Scanner(System.in);
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
if(a>b && a>c)
System.out.println("First number is greatest");
else if(b>a && b>c)
System.out.println("Second number is the greatest");
else if(c>a && c>b)
System.out.println("Third number is the greatest");
}
}

