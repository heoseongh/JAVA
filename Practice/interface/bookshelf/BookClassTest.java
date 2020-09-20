package practice.bookshelf;

public class BookClassTest {

	public static void main(String[] args) {

		// 타입은 Shelf 타입으로 해도 되지만
		// 기능적인 것을 우선한다라고 하면
		// 보통 인터페이스 타입으로 선언한다. 
		BookShelf bookQueue = new BookShelf();
		bookQueue.enQueue("A");
		bookQueue.enQueue("B");
		bookQueue.enQueue("C");
		bookQueue.enQueue("D");
	
		// 책 A 꺼내기	
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.showInfo());
		// 책 B 꺼내기
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.showInfo());
	}

}
