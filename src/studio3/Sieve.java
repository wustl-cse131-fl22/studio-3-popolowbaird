package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.println("What's largest integer you want?: ");
int n = in.nextInt();
boolean[] sieve;
sieve = new boolean[n+1];

for(int i=0;i<sieve.length;i++)
	{
	sieve[i]=true;
	}
for(int i=2;i<(Math.sqrt(n));i++)
	{
	if(sieve[i])
		{
		double k=0;
		for(double j=(Math.pow(i,2));j<sieve.length;j+=i)
			{
			int q = (int) j;
			sieve[q]=false;
			k++;
			}
		}
	
	}
for(int i=1;i<sieve.length;i++)
	{
	if(sieve[i])
		{
		System.out.println(i);
		}
	}

	}

}
