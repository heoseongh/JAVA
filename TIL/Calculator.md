# 2020.06.01
> # Calculator.java
```java
package Calculator;
import java.util.Scanner;

public class Calculator {
	
	static double result = 0;	//결과 값 변수를 전역변수로 선언.
    
	//결과 출력 메소드
	public void Print_result() {
		System.out.println(">> result" + " = " + result);
	}
	//덧셈 메소드
	public double add(double val) {
		return result += val;
	}
	//뺄셈 메소드
	public double sub(double val) {
		return result -= val;
	}
	//곱셈 메소드
	public double mult(double val) {
		return result *= val;
	}
	//나눗셈 메소드
	public double div(double val) {
		if(val == 0) {
			System.out.println("0 이상의 수를 입력하시오.");
			return 0;
		}
		else {
			return result /= val;
		}
	}
	//나머지 메소드
	public double rest(double val){
		if(val == 0){
			System.out.println("0 이상의 수를 입력하시오.");
			return 0;
		}
		else{
			return result %= val;
		}
	}
	
	//main
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		String op;				//연산자를 저장할 문자열 변수 선언.
		
		System.out.println(">> a  +  b ; 피연산자, 연산자 띄어쓰기로 구분   /  종료 : exit");
		
		while(true){
			if(result == 0){	//만약 result = 0 이면, set(초기값)을 받는다.
				System.out.print(">> ");
				result = sc.nextDouble();
			}
			
			else{				//result = 0 이 아니라면, 연산자 기호를 받아 연산 결과를 누적시킨다.
				op = sc.next();	//연산자 기호 입력받기.
				
				switch(op){
				case "+":
					cal.add(sc.nextDouble());
					cal.Print_result();
					break;
					
				case "-":
					cal.sub(sc.nextDouble());
					cal.Print_result();
					break;
					
				case "*":
					cal.mult(sc.nextDouble());
					cal.Print_result();
					break;
					
				case "/":
						cal.div(sc.nextDouble());
						cal.Print_result();				
					break;
					
				case "%":
					cal.rest(sc.nextDouble());
					cal.Print_result();	
					break;
					
				case "reset":		//reset 을 입력하면 누적값(result) = 0 으로 초기화.
					result = 0;
					break;
					
				case "exit":
					return;
				}
			}	
		}
	}
}
```