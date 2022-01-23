package Calculator;
import java.util.Scanner;

public class arithematicCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1,num2,operator,result;
		
		System.out.println("Enter the first number= ");
		num1 = sc.nextDouble();
		
		System.out.println("Enter the second number= ");
		num2 = sc.nextDouble();
		
		System.out.println("Press 1 for addition ");
		System.out.println("press 2 for subtraction ");
		System.out.println("Press 3 for Multiplication ");
		System.out.println("Press 4 for Division ");
		operator=sc.nextDouble();
		
		if(operator==1) {
			result= num1+num2;
			System.out.println("The sum= "+result);
		}
		else if(operator==2) {
			result= num1-num2;
			System.out.println("The difference= "+result);
		}
		else if(operator==3) {
			result= num1*num2;
			System.out.println("The multiplication is= "+result);
		}
		else if(operator==4) {
			result= num1/num2;
			System.out.println("The division= "+result);
		}
			
	}

}
