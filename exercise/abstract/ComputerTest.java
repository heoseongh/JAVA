package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
		// Computer computer = new Computer();
		// Computer는 추상 클래스이기 때문에 인스턴스화 될 수 없다.
		
		// 상속에서 상위클래스 타입의 변수에 하위 클래스의 인스턴스가 대입될 수 있었다.
		// 똑같이 추상 클래스에서도 적용이 된다.
		Computer computer = new DeskTop();
		computer.display();
		computer.turnOff();
		
		NoteBook myNote = new MyNoteBook();
		
		myNote.display();
	}

}
