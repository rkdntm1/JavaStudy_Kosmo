package urlEncoder;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class TestURLEncoder {

	public static void main(String[] args) throws Exception {
		System.out.println(URLEncoder.encode("ajdsad", "utf-8"));
		System.out.println(URLEncoder.encode("홍길동", "utf-8"));
		System.out.println(URLEncoder.encode("紅吉東", "utf-8"));
		
		//인코딩한것을 리다이렉트해서 줘야지 문제가 없다.
		//암호화된 결과물을 바탕으로 해석해 낸다.
		System.out.println(URLDecoder.decode(URLEncoder.encode("홍길동", "utf-8"), "utf-8"));
		
	}

}
