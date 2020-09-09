# 2020년 06월 06일(토)
> # Dice.java
```java
import java.util.*;

//주사위 클래스
class Dice_{
	Scanner sc = new Scanner(System.in);
	int Time;		//주사위 굴릴 횟수
	int Value;		//주사위 값
	
	//주사위 굴리는 메소드
	public void roll(){
		//주사위 굴릴 횟수 입력 받기 (범위 : 1~20)
		System.out.printf("Number of time to roll (1~20) >> ");
		this.Time = sc.nextInt();

		//1~20 사이의 수가 아닐 경우 예외처리
		if(this.Time >= 20 || this.Time == 0){
			System.out.println("1~20 사이의 수를 입력하시오.");
			return;
		}
		System.out.printf("%d 번 돌리셨습니다.\n", this.Time);
		
		//1~20 이내의 주사위 값 생성 , 출력
		for(int i = 0; i < this.Time; i++){
			this.Value = (int)(Math .random()*6)+1;
			System.out.println(this.Value);
			}		
		}
	}

public class Dice {

	public static void main(String[] args) {
		Dice_ di = new Dice_();
		
		while(true){
		di.roll();
		}
	}
}
```