package csd;

public class App {

	public static void main(String[] args) {
		java.util.Scanner kb= new java.util.Scanner(System.in);
		System.out.print("Bir sayi giriniz:");
		int n= Integer.parseInt(kb.nextLine());
		int i=-1;
		while(i<=2*n-3) {
			i+=2;
			int k=1;
		while(k<=(2*n-1-i)/2)
		{
			k++;
			System.out.print(" ");
		} 
		k=1;
		while(k<=i)
		{
			k++;
			System.out.print("*");
		} 
		System.out.println();
	}
		
		i=2*n-1; 
		while(i>=1) {
		i-=2; 	
		int k=1;
		while(k<=(2*n-1-i)/2) 
		{
			k++;
			System.out.print(" ");
		}
		k=1;
		while(k<=i)
		{
			k++;
			System.out.print("*");
		}
		System.out.println();
		}
	}
}
	