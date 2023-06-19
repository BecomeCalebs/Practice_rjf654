package Headers;

import java.util.Scanner;

public class CIO {
	//숫자, 문자열 입력 이거 있으면 scanner만들 필요 없음.
	public static int inputNum()
	{
        int iNum = 0;
        Scanner scan = new Scanner(System.in); // Scanner 객체 생성
		String str = scan.nextLine();
        try{
    		iNum = Integer.parseInt(str);
        } catch(Exception _e) {
            System.out.println(_e.getMessage());
            System.out.println("숫자만 입력해 주세요.");
            return inputNum();
        }

		return iNum;
	}
	
    //이렇게 쓰면 정수형 입력 후에 바로 string을 입력할 수 있음.
	public static String inputString()
	{
        Scanner scan = new Scanner(System.in); // Scanner 객체 생성

		String str = scan.nextLine();
		return str;
	}
    
}
