public class PrintOddnumbersandsum{
public static void main (string[]args)
{
	int start =7;
	int end=21;
	int sum=0;
	System.out.println("Odd numbers between" + start + "and"+ end +"s");
	for(int i=start; i<=end; i++)
	{ 
if(i%2 !=0)
{
	System.out.print(i+"");
sum+=i;
}
	}
	System.out.println("\n sum of Odd numbers:" +sum);
}
}
