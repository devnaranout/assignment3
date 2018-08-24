import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
int n,rev=0,p=0;
System.out.println("Enter the number you want to check palindrome of:");
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
p=n;
while(n>0)
{
rev=rev*10+(n%10);
n=n/10;
}
if(p==rev)
System.out.println("It is palindrome");
else
System.out.println("Not palindrome");
}
}