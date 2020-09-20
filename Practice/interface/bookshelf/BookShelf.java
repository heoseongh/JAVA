package practice.bookshelf;

public class BookShelf extends Shelf implements Queue {

	@Override
	// 책 한 권을 추가한다.
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	// List에서 책 한 권을 뺀다.
	public String deQueue() {
		return "책 " + shelf.remove(0) + "를 꺼냈습니다.";
	}

	@Override
	// 책이 몇 권 있는지 가져온다.
	public int getSize() {
		return super.getCount();
	}

	public String showInfo() {
		return "책꽃이에 책이 " + getSize() + "권 남았습니다.";
	}
}
