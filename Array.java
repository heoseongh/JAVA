import java.util.*;

public class Array {
	static Scanner sc = new Scanner(System.in);
	private static int[] arr;
	private static int array_Size;
	private static int sum;
	private static int avg;
	
	//배열 생성
	public static void makeArray(){
		System.out.print("Size >> ");
		array_Size = sc.nextInt();
		
		arr = new int[array_Size];	//입력받은 배열 사이즈의 배열 생성.
		if(arr != null) {
			System.out.println("sucessfully created! size(" + array_Size + ")");
		}
	}
	
	//배열에 정수값 입력받기
	public static void inputData(){		
		System.out.print("Enter Integer >> ");
			for(int i = 0; i < arr.length; i++){
				arr[i] = sc.nextInt();
		}
	}
	//배열 값 출력
	public static void printArray() {
		System.out.print("Data : ");
		for(int i=0; i < arr.length; i++){
			System.out.print(arr[i] + " ,");
		}
		System.out.println();			
	}
	
	//배열 합계 출력
	public static void addArray() {
		for(int i=0; i < arr.length; i++){
			sum += arr[i];
		}
		System.out.println("sum = " + sum);
	}
	
	//배열 평균 출력
	public static void avgArray() {
		avg = sum / arr.length;
		System.out.println("avg = " + avg);
	}
	
	public static void main(String[] args) {
		makeArray();
		inputData();
		printArray();
		addArray();
		avgArray();
	}
}
