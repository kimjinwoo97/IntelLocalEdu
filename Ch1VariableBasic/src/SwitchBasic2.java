import java.util.Scanner;

public class SwitchBasic2 {
	public static void main(String[] args) {

	
	int month = 11;
	String monthStr = "";
	
	switch (month) {
	    case 3:  case 4: case 5:
	    	monthStr = "봄";
	    	break;
	    case 6:  case 7: case 8:
	    	monthStr = "여름";
	    	break;
	    case 9: case 10: case 11:
	        monthStr = "가을";
	        break;
	    case 12: case 1: case 2:
	        monthStr = "겨울";	
	        break;
	    default :
	    	monthStr = "특이한 계절";
	}
	//break가 없어도 되는 상황 : ex) 계절 12,1,2 겨울 3,4,5봄
	System.out.println("계절 : "+monthStr);
		
	//봄 여름 겨울 가을 완성
	//스위치문과 반복문(for문)
	//ex) 사용자가 1 or 2를 입력 받는다
	
	}

}
