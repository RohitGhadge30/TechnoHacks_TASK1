package javacourse;
import java.util.*;

public class Calculatorr {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int ans=0;
		
		while (true)
		{
			System.out.print("enter the operator");
			char op=a.next().trim().charAt(0);
			if (op== '+'||op== '-'||op== '*'||op== '/'||op== '%') {
				System.out.print("enter two number");
				int num1=a.nextInt();
				int num2=a.nextInt();
				
				if(op== '+') {
					ans=num1+num2;
				}
				if(op== '-') {
					ans=num1-num2;
				}
				if(op== '*') {
					ans=num1*num2;
				}
				if(op== '/') {
					ans=num1/num2;
				}
				if(op== '%') {
					ans=num1%num2;
				}
			}else if(op=='x'){
				break;
			}
			else {
				System.out.print("invalid operator");
			}
			System.out.print(ans);
		}
		
	}

}

