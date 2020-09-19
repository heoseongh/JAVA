package interfaceex;

public interface Calc {
	
	// 컴파일시 public static final이 자동으로 붙음
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// ** 디폴트 메서드
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	// ** 정적 메서드
	// 추상 메서드나 default로 제공하지 말고 static으로 제공하면 
	// 인스턴스를 생성하지 않아도 사용할 수 있는 기능을 제공할 수 있다.
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		
		return total;
	}
	//************************* java9 이후부터 지원 *************************
/*	// ** private 메서드
	private void myMethod() {
		System.out.println("private method");
	}
	
	private static void mystaticMethod() {
		System.out.println("private static method");
	}
*/
}
