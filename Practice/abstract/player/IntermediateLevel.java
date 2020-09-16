package exercise.player;

public class IntermediateLevel extends PlayerLevel {
	
	@Override
	public void showLevelMessage() {
		System.out.println("***** 중급자 레벨입니다. *****");
	}

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 점합니다.");
	}

	@Override
	public void turn() {
		System.out.println("!! 턴할 줄 모름 !!");
	}
	
}
