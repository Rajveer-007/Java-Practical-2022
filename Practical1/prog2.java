import java.util.*;

class prog2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter the number until which you want to find fibonacci series: ");
		c = sc.nextInt();
		a = 0;
		b = 1;
		System.out.print(a);
		int sum = 0;

		while(true){
			sum = a+b;
			b = a;
			a = sum;
			if(sum<c){
				System.out.print(" " +sum);
			}
			else
				break;
		}				

		sc.close();
	}
}
