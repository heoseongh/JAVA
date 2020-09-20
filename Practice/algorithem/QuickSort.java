package practice.algorithem;

public class QuickSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort descending");
	}
	
	// Sort 인터페이스의 디폴트 메서드 재정의
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort입니다.");
	}
	
}
