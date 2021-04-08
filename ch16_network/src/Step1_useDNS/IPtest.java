package Step1_useDNS;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPtest {

	public static void main(String[] args) throws Exception {
		// 부를 때 마다 가장 널널한 녀석이 서비스 해줍니다.
		// 부하분산. Load Balancing
		String naver = "www.naver.com";
		InetAddress naverIP = InetAddress.getByName(naver);
		System.out.println(naverIP.toString());
	}

}
