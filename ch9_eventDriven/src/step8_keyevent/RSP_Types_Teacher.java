package step8_keyevent;

import java.util.Random;

public enum RSP_Types_Teacher {
	scissor, rock, paper;
	
	private static Random comChooser = new Random(); // 성능 (자꾸 만들고 버리고 안하고 객체 한개만 씀)
	
	public static String whoWin(String userChooseStr) {
		int comChooseInt = comChooser.nextInt(RSP_Types_Teacher.values().length);
		RSP_Types_Teacher comChoose = RSP_Types_Teacher.values()[comChooseInt];
		System.out.println(comChoose);
		RSP_Types_Teacher userChoose = RSP_Types_Teacher.valueOf(userChooseStr);
						
		int comp = comChoose.ordinal() - userChoose.ordinal();
		// scissor : 0, -1, -2
		// rock : 1, 0, -1
		// paper : 2, 1 ,0		
		if (comp == 0) {
			return "비겼습니다.";
		} else if (comp == -1 || comp == 2) {
			return "사용자가 승리했습니다.";
		} 
			return "컴퓨터가 승리했습니다.";
		} 
	}

