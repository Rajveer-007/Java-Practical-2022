import java.util.*;
class Cricket {
    String name;
    int age;
    void display();
    void setdata(String s, int a){
        name = s;
        age = a;
    }
}
class Match extends Cricket{
    int no_of_odi;
    int no_of_test;
    void display(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nNo. of ODI's: "+no_of_odi+"\nNo. of Tests: "+no_of_test);
    }
    void setdata(String s, int a, int b, int c){
        name = s;
        age = a;
        no_of_odi = c;
        no_of_test = d;
    }
}
public class Main
{
	public static void main(String[] args) {
		Match matches[] = new Match[5];
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<5; i++){
		    System.out.println("Enter the name, age, No. of odi's and No. of Test's played by cricketer: ");
		    String s = sc.next();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    matches[i] = new Match();
		    matches[i].setdata(s, a, b, c);
		    matches[i].display();
		} 
	}
}
