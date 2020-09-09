# 2020.06.03
> # MergeSort.java
```C++
import java.util.*;

public class Merge_Sort {
	int[] arr;
	int[] tmp;
	int array_Size;
	
	Scanner sc = new Scanner(System.in);
	
	//배열 생성
	public void makeArray(){
		System.out.print("Size >> ");
		array_Size = sc.nextInt();
		
		arr = new int[array_Size];	//입력받은 배열 사이즈의 배열 생성.
		if(arr != null) {
			System.out.println("sucessfully created! size(" + array_Size + ")");
		}
	}
	
	//배열에 정수값 입력받기
	public void inputData(){		
		System.out.print("Enter Integer >> ");
			for(int i = 0; i < arr.length; i++){
				arr[i] = sc.nextInt();
		}
	}
				
	public void mergeSort(int start, int end) {
		tmp = new int[arr.length];		//매개변수로 받은 배열 'arr'을  배열'tmp'로 복사. 
		
		// --- 기저조건 : start < end --- //
		if(start < end) {
			int mid = ( start + end ) / 2;
			//----왼쪽 쪼개기----//
			mergeSort(start, mid);
			//----오른쪽 쪼개기----//
			mergeSort(mid + 1, end);
			//----병합하기----//
			merge(start, mid, end);
		}
	}
	
	public void merge(int start, int mid, int end) {
		int p_Left = start;		// 나누어진 왼쪽 파트의 시작 주소(start)를 왼쪽 포인터(p_Left)에 대입. 
		int p_Right = mid + 1;	// 나누어진 오른쪽 파트의 시작 주소(mid + 1)를 오른쪽 포인터(p_Right)에 대입.
		int index = start;		// 정렬되고 난 후의 결과 값을 저장할 배열의 인덱스 변수를 지정. | 0으로 초기화 해도 무방.
		
		//비교 & 정렬할 원본 배열'arr'을 배열'tmp'로 복사.(이 후 비교는 배열'tmp'로만 수행, 배열'arr'은 정렬 결과 저장 용도)//
		for(int i = 0 ; i < arr.length ; i++) {
			tmp[i] = arr[i];
		}
		
		/*'왼쪽 파트의 시작(p_Left) <= 끝(mid)' && '오른쪽 파트의 시작(p_Right) <= 끝(end)'의 조건일때만 작동
		결국 아래 if문에서 비교하는 도중, 왼쪽 포인터와 오른쪽 포인터가 하나씩 증가하다가 각 파트의 끝을 넘어서면(비교가 끝나면) while문 종료*/		
		while(p_Left <= mid && p_Right <= end) {
			//----왼쪽 숫자가 오른쪽 숫자보다 작을 경우----//
			if(tmp[p_Left] <= tmp[p_Right]) {
				arr[index] = tmp[p_Left];	//결과 배열에 앞 숫자를 저장하고
				p_Left++;					//오른쪽 포인터를 한 칸 앞으로 이동. -> left의 다음 수와  right를 비교하기 위해.
			}
			
			//----오른쪽 숫자가 왼쪽 숫자보다 작을 경우----//
			else {
				arr[index] = tmp[p_Right];	//결과 배열에 오른쪽 숫자를 저장하고
				p_Right++;					//왼쪽 포인터를 한 칸 앞으로 이동. -> right의 다음 수와 left를 비교하기 위해.
			}
			index++;					//위의 조건문과 상관 없이 일단 원본 배열에 값이 저장되었으면 다음 칸으로 인덱스를 이동.
		}
		
		//----왼쪽 배열의 수가 남는 경우(오른쪽의 배열이 모두 결과 배열에 저장된 경우)----//
		for(int i = 0; i <= mid - p_Left; i++) {
			arr[index + i] = tmp[p_Left + i];
		}
	}
	
	public void printArray() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ,");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Merge_Sort ms = new Merge_Sort();
		
		ms.makeArray();						
		ms.inputData();						
		System.out.print("before :");		
		ms.printArray();					
		
		ms.mergeSort(0, ms.array_Size -1);
		System.out.print("after :");
		ms.printArray();
	}

}
```