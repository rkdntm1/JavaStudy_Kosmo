package www;

public class A {
	public static void main(String[] args) { // main : behavior structor
		// 시스템의 아웃이 제공하는 기능인 print를 부르는데 인자"안녕하세요" 문자열을 줄거야
		System.out.println("안녕하세요"); // statement
		System.out.println("고맙습니다"); // 순차문
		System.out.println("수고하셨습니다");// ; = 문장의 끝을 나타내는 연산자
		System.out.println("감사합니다");

		// 데이터종류 : 수, 문자, 문자열, multimedia data,...

		// 정수, 실수
		// 1, 2, 4, 8
		// 8, 16, 32, 64-> byte(-128~127), short(-32000~31999), int(21억), long
		// 0000 0000. 0000 0001=>1, 0000 0010 -> 2
		// 1000 0001 => -1, -2 =>1000 0010
		// 5=> 0000 0101, -5 ->1000 0101
		// 0111 1111 ->127
		// 1
		// 2 1 > 3
		// 4 2 1 > 7
		// 8 4 2 1 > 15
		// 16 8 4 2 1 > 31
		// s = 2^5 + 2^4 + 2^3 + 2^2 + 2^1 + 2^0
		// 2s = 2^6 +2^5 + 2^4 + 2^3 + 2^2 + 2^1
		// 2s-s = 2^6 -2^0 = S
		// n개의 비트일때 그릇 : -2^(n-1) ~ 2^(n-1)-1
		System.out.println(55);

		int 홍길동의나이 = 2;
		System.out.println("홍길동의나이는 " + 홍길동의나이 + "입니다.");
		홍길동의나이 = 홍길동의나이 + 10;
		System.out.println("홍길동의나이는 " + 홍길동의나이 + "입니다.");
		홍길동의나이 = 홍길동의나이 + 10 * 10;
		System.out.println("홍길동의나이는 " + 홍길동의나이 + "입니다.");

		// 실수 -> 32bit - float / 64bit - double

		// 문자
		// ASCII(American Standard Code for information interchange) 256 8bit 1바이트
		// 48 - 0 / 65 - A / 97 -a
		// 유니코드(Universal Coded) 2바이트 이상
		// 48 + 1 > 49( 1 )
		char 내문자 = 'a'; // a = 97(ASCII)
		// 내문자 = 내문자 + 2 ; //char :16bit, int : 32bit 작은그릇에 큰그릇을 담지 못함
		내문자 = (char) (내문자 + 2); // 형전환
		System.out.println(내문자);
		내문자 = (char) (내문자 + 1); // 형전환
		System.out.println(내문자);
		// I love you - 문자열
		char 두번째변수 = 내문자++; // 항 뒤에 ++ 연산자를 쓰면.. 활용한 다음에 올려요.
		System.out.println(내문자);
		System.out.println(두번째변수);

		char 세번째변수 = ++내문자; // 항 앞에 ++ 연산자를 쓰면.. 올리고 난 다음에 활용
		System.out.println(내문자);
		System.out.println(세번째변수);

		// 이미지가 있다고 하자. 기본으로 내려가면 -> 화소 -> Red, Green, Blue + 불투명도
		// 한바이트를 사용하여 각 광도를 나타냄 -> 3byte + 1 => 4Byte

		int x = 5;
		int y = -x;
		System.out.println(x);
		System.out.println(y);

		// % : 나머지
		int z = y / 3; // divider
		y = y % 3; // modular
		System.out.println(y);
		System.out.println(z);

		int a = 11; // 0000 0000 0000 0000 0000 0000 0000 1011
		a = a << 2;// 0000 0000 0000 0000 0000 0000 0010 1100
		System.out.println(a); // 44
		a = a >> 1;
		System.out.println(a); // 22

		boolean 여부is = 3 > 2;
		System.out.println(여부is); // true

		// x는 남자이면서 안경을 끼고 있나요?
		// 그렇다면 "안녕"이라 할것이고 아니면 "Hello"
		boolean isMailOf홍길동 = true; // 변수 다같이 바꿀때 refactor-rename(alt shift r)
		boolean hasGlass = false;
		// !(A && B) = !A || !B
		if (!isMailOf홍길동 || !hasGlass) {
			System.out.println("안녕");
		} else {
			System.out.println("Hello");
		}

		boolean boolean1 = true;

		// 1.대머리여부, 2.isMale, 3.hasGlass, 4.isLive
		int 홍길동의조사내역 = 0b1010; // int: 32개의 참거짓 //0b:뒤에있는 수가 2진수 의미
		System.out.println(홍길동의조사내역);

		if ((홍길동의조사내역 & 0b1000) != 0) {
			System.out.println(홍길동의조사내역 & 0b1000); // 1000
			System.out.println(홍길동의조사내역);
		}

		int[] intValues = { 1, 4, 7, 3, 4, 7, 1 };
		// ^ : exclusiveOr(배타적이니? 같지않니?) -> T^T = F , 0^0 = 0, 0^1 1^0 = 1, 1^1 = 0
		int c = 0b000000001011;
		int d = 0b000000001110;
		// 0b000000000101
		System.out.println(c ^ d);
		int result = 0;
		for (int val : intValues) {
			result = result ^ val; // 0일경우는 서로 같을 경우니 중복된 값을 제외한 값을 가져옴
			// 0000000000
			// 0000000001

			// 0000000001
			// 0000000100

			// 0000000101
			// ... 이런식으로 같은 숫자는 같은 비트위치의 값은 0이 됨으로
			// 중복되지 않는 값만 result 값에 존재하게 된다.
		}
		System.out.println(result); //

		int s = 0;
		for (; s < 10; s++) {
			System.out.println(s + "의 반전 " + ~s);
		}
		// 11111111111111 0의반전
		// 11111111111110 1의반전
		// 11111111111101 2의반전
		// 11111111111100 3의반전
		// ... 음수일때는 0이 1이라고 생각하면 될듯합니다.(차이점은 111..111 값이 0이 아니라 -1이니깐 -1씩을 해줘서 생각)

		int num = 8;
		System.out.println(num >>= 2);

		num = 10;
		int num2 = 20;

		int result1 = (num >= 10) ? num2 + 10 : num2 - 10;

	}
}
