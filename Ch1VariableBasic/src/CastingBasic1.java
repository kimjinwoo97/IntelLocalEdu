//김진우

public class CastingBasic1 {

	public static void main(String[] args) {
		
		//boolean을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다
		//기본형과 참조형은 서로 형변환 할 수 없다.
		//서로 다른 타입의 변수간의 연산은 형변환을 하는 것이 원친이지만,
		//값의 범위가 작은 타입에서 큰 타입으로 형변환은 생략할 수 있다
		
		int firstNum = 0;
		int secondNum = 0;
		
		int totalNum = 0;
		double avg = 0.0;
		
		firstNum = 10;
		secondNum = 7; // 반올림 올림처리
		
		//secondNum = 3; // 반올림 내림처리
		totalNum = firstNum + secondNum;
		
		/* avg = (double)totalNum / 2; */
		
		//System.out.println(totalNum);		
		//System.out.println(avg);
		
		// 총점과 평균을 구하시오
		// double 소수점 나타내기
		
		//소수점 2째자리 반올림?
		//소수점 1자리 올림?
		//C언어 -> printf("%0.2f", f) 0.2 => 소수점 2자리
		
		//소수점 3째자리 내림?
		avg = (double)totalNum / 3;
		
		System.out.println(avg);
//		                                   구하고 싶은 소수점 자리수 2자리라 "* 100"을 함
		avg = (int)((double)totalNum / 3 * 100) / 100.0;
//		433.33333333 이 나오는데
//		* 100 을 하면 433이 나오고
//		/ 100.0 을 하면 4.33이 나옴		
		
		System.out.println(avg);
		
//		반올림
//		기능 분리
		avg = (double)totalNum / 3;
		System.out.println("1번 :" + avg);
		
		avg = avg + 0.005;
		System.out.println("2번 :" + avg);
		
		avg = avg * 100; // 찍히고 싶은 자리까지 *로 올림
		System.out.println("3번 :" + avg);
		
		avg = (int)avg; 
		System.out.println("4번 :" + avg);
		
		avg = avg / 100;
		System.out.println(avg);
		
//		소수점 3번째 자리에서 
		//올림, 반올림
		
	}

}
