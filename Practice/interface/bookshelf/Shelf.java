package practice.bookshelf;

// command + shift + o : import
import java.util.ArrayList;

// 선반 Class
public class Shelf {

	// 하위 클래스에서 사용할 수 있도록 protected 키워드
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();	// List 생성은 주로 constructor에서 많이 한다.
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	// 선반에 물건이 얼마나 있는가?
	public int getCount() {
		return shelf.size();
	}
}
