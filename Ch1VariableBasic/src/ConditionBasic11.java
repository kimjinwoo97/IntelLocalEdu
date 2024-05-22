

public class ConditionBasic11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		삼향 연산자, 조건 연산자
		
//		조건식 ? 식1 : 식2;
//		true이면 식1 실행
//		false이면 식2 실행
		
		int rslt = 0;
		
		rslt = 5 > 0 ? 10 : -10;
		System.out.println(rslt);
		
		rslt = 5 < 0 ? 10 : -10;		
		System.out.println(rslt);

		rslt = 5 < 0 ? 10 : 5 > -10 ? -10 : 0;		
		System.out.println(rslt);
		
		//라인 복제 : cntl + alt + 화살표 아래
		//한줄 삭제 : ctrl + d
	}

}
