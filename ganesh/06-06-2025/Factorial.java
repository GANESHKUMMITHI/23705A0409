class Factorial
{
public static void main(String args[])
{
int n=10;
int fact=1;
if ( n < 0 )
System.out.println("Number should be non-negative.");
else
{
for (int i = 1 ; i <= n ; i++ )  // Calculating Factorial
fact= fact*i;
System.out.println("Factorial of "+n+" is = "+fact);
}
}
}