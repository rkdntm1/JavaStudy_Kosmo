package AIOB;

import java.util.Random;

public class AIOBException {

	public static void main(String[] args) {
		int[] vals = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Random rnd = new Random();
		try {
			for (; true;) {
				int idx = rnd.nextInt(vals.length + 1);
				System.out.println(vals[idx]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("끝");
		}
	}
}
