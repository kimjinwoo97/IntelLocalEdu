import java.util.Scanner;

public class SwitchTest1 {
	public static void main(String[] args) {
		
	System.out.println("1 또는 2를 입력하세요");
	Scanner scan = new Scanner(System.in);
	
	int dan = 1;
	int a = 1;
	int b = scan.nextInt();
	String square = "";
	
	switch (b = 1) {
	        case 1:
	        while(dan <= 9 && a <= 9) {
	    		System.out.printf("%d * %d = %d", dan, a, dan*a);
	    		//square = ("%d * %d = %d", dan, a, dan*a);
	    		break;
	    	}
	        case 2:
	    	while(2 <= dan && dan <= 9) {
	    		System.out.printf("%d * %d = %d", dan, a, dan*a);
	    	}
	   // default :
	    	//danStr = "특이한 계절";
	//}
	//break가 없어도 되는 상황 : ex) 계절 12,1,2 겨울 3,4,5봄
	System.out.printf("%d * %d = %d", dan, a, dan*a,"\n");
	a++;
		
	//봄 여름 겨울 가을 완성
	//스위치문과 반복문(for문)
	//ex) 사용자가 1 or 2를 입력 받는다
	

}
}
}
