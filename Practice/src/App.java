import IPractice.IPractice;
import IPractice.CPractice_1.CPractice_1;
import IPractice.CPractice_2.CPractice_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //확인
        //1. CPractice_1 인스턴스 생성 부분
        // * 인스턴스: 자료형의 데이터가 메모리의 생성된 것.
        //2. 형변환: CPractice 변수에 CPractice_1의 인스턴스를 담을 수 있다.
        //암묵적 형변환
        IPractice practice = new CPractice_1(); //자료형이 CPractice(=부모클래스)이기 때문에 CPractice가 갖고 있는 필드 or 메서드만 사용 가능하다.

        //CPractice_1 인스턴스는 메모리 상에서 사라지고 //가비지 컬렉션
        //, CPractice_2 인스턴스가 생성되어 practice 변수에 담긴다.
        practice = new CPractice_2();
        //부모 = new 자식();

        List<String>  titles = new ArrayList<>();
        titles.add("CPractice를 선택해 주세요.\n");
        titles.add("1. CPractice_1\n");
        titles.add("2. CPractice_2\n");
        titles.add("99. EXIT\n");
        titles.add("Choose: ");
        
        Scanner in = new Scanner(System.in); // Scanner 객체 생성

        do {
            for(String title : titles) {
                System.out.print(title);
            }

            int selectedPractice = in.nextInt();
            if(selectedPractice == 99) {
                break;
            }

            switch(selectedPractice) {
                case 1:
                    practice = new CPractice_1();
                    break;
                case 2:
                    practice = new CPractice_2();
                    break;
                default:
                    continue;
            }
            //override 되었으므로 자식클래스에서 정의한 메서드가 호출됨.
            practice.render();
        } while(practice.update() == 1);//결과가 참이면 loop

    }
}

