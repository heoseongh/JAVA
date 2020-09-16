package exercise.player;

public class Player {
	private String playerName;
	private PlayerLevel level;

	// 생성자
	public Player(String playerName) {
		this.playerName = playerName;
		showPlayerInfo();
		level = new BeginnerLevel();	// 처음 시작하면 초급자로 설정(생성)
		level.showLevelMessage();		// 플레이어 레벨 출력
	}
	
	// 플레이어 입장 시 이름 출력
	public void showPlayerInfo() {
		System.out.println(playerName + "님이 입장하셨습니다.");
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	// 레벨 업그레이드 (setLevel)
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	// 게임 플레이
	public void play(int count) {
		level.go(count);
	}
}
