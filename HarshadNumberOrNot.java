package methods;

import java.util.Scanner;
class HarshadNum {
	public static boolean find(int num) {
		int sum = 0;
		int digit = 0;
		int temp = num;
		while(num!=0) {
			digit = num%10;
			sum = sum+digit;
			num = num/10;
		}
		if(temp%sum==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class HarshadNumberOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		boolean res = HarshadNum.find(num);
		if(res == true) {
			System.out.println("Enter number "+num+" is a harshad number");
		}
		else {
			System.out.println("Enter number "+num+" is not a harshad number");
		}
		sc.close();

	}

}
