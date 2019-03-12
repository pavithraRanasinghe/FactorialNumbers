import java.util.*;
class Factorial{
		public static void main(String args[]){
			Scanner input=new Scanner(System.in);
			System.out.print("Input a number : ");
			int x=input.nextInt();
			int fact=1;
			System.out.print("Factorial of "+x+"! =");
			for(int i=x;i>0;i--){
				System.out.print(i+"*");
				fact*=i;
			}
			System.out.print("\b = ");
			System.out.println(fact);
		}
}
