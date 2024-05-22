import java.util.Scanner;
// 소곱
public class VarStringBasic2 {

	public static void main(String[] args) {
		
		//문자열 - 여러글자가 들어가도 된다
		String str = "abvc";
		
		//문자 - 한 글자만 들어갈 수 있다
		char ch = 'a';
		
		byte b = 1;
		
		int num = 100;
		
		//concat(+) => 합성, 더하다
		//System.out.println("원하는 글" + 변수명); => 변수명에 해당하는 문자가 들어가진다
		System.out.println("asdfsadsdfsf" + num); //ln => \n과 같은 뜻으로 사용된다
		System.out.println("아\t" + "한글이 된다");
		System.out.println(str + "헐 뭐야??");
		
		System.out.println(" " + " " + 7 + 7); // "" 가 문자열이 되서 7도 문자열로 처리 => 7
		System.out.println(7 + 7 +  "");
		System.out.println("" + 7 + 7); // "" 가 문자열이 되서 7도 문자열로 처리 => 77
		
		System.out.printf("오 C언어 생각나네%d\n", num);
		System.out.printf("오 C언어 생각나네%d\n", num);
		
		System.out.print("아");
		System.out.print("하");
		System.out.print(" 이제 라인 넘기는것 없이 출력이네\n");
		
		System.out.print("하");
		
		//문자열 + any type -> 문자열 + 문자열 -> 문자열
		//any type + 문자열 -> 문자열 + 문자열 -> 문자열
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("놀랐지? 아무글이나 작성해봐");
		String input = scan.nextLine();
		//num = scan.nextInt();
//		ctrl + shoft + c => 주석
		System.out.println("니가 작성한 글이야^^-> " + input + 10);
//		System.out.println("니가 작성한 글이야^^->" + (num + 10));
	}

}
