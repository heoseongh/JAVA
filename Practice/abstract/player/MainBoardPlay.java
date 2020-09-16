package exercise.player;

public class MainBoardPlay {

	public static void main(String[] args) {
		Player seonghyeon = new Player(">> 프로게이머 허성현");
		
		seonghyeon.play(1);
		IntermediateLevel intermediate = new IntermediateLevel();
		seonghyeon.upgradeLevel(intermediate);
		seonghyeon.play(1);
		
		System.out.println();
		
		Player goeasy = new Player(">> 프로게이머 고희지");
		
		goeasy.play(1);
		AdvancedLevel advanced = new AdvancedLevel();
		goeasy.upgradeLevel(advanced);
		goeasy.play(1);
	}

}
