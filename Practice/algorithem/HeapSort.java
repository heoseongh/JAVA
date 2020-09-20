package practice.algorithem;

public class HeapSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("HeapSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("HeapSort descending");
	}
	
	// Sort 인터페이스의 디폴트 메서드 재정의
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort입니다.");
	}
}
