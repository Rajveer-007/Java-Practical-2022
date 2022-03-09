import java.util.*;

class prog1{
	public static void main(String[] args){	
		float x = Float.parseFloat(args[0]);
		float y = Float.parseFloat(args[1]);
		Scanner sc = new Scanner(System.in);
		char op;
		float output = 0;
		System.out.println("Enter the operator: ");
		op = sc.next().charAt(0);
		
		if(op=='+')
			output = x + y;
		else if(op=='-')
			output = x - y;
		else if(op=='*')
			output = x * y;
		else if(op=='/')
			output = x / y;
		else 
			System.out.println("Enter valid operator");
		

		System.out.println(x+ " " +op+ " " +y+ " = " +output);	
		
		sc.close();
	}	
}
