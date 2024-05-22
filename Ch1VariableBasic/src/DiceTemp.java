
public class DiceTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int diceNum = 0; // 1~6
		// int i = 0;

		for (int i = 0; i <= 10; i++) {
			diceNum = (int) (Math.random() * 6) + 1;

			if (diceNum <= 5) {
				System.out.println("(" + diceNum + ")");
			} else if (diceNum == 6) {
				System.out.println("(" + diceNum + ")");
				System.out.println("총 주사위 굴린 횟수는 :" + (i + 1) + "회");
				break;
			}
		}

		// ctrl + shift + f: 포맷정렬
//		diceNum = 1;
//		System.out.println(diceNum);
//		
//		diceNum = 3;
//		System.out.println(diceNum);
//		
//		diceNum = 6;
//		System.out.println(diceNum);

		// 난수 => 무작위성 제공 6 나오면 끝
//		while vs for
//		어렵다     쉽다
//		횟수X     횟수O
	}
}
