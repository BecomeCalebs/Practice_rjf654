import IPractice.IPractice;
import IPractice.CPractice_1.CPractice_1;
import IPractice.CPractice_2.CPractice_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DesignPattern.CPracticeMgr;

public class App {
    //생성시점 및 위치: 프로그램 시작 직후 메모리의 메서드 영역에 생성
    public static void main(String[] args) throws Exception {
        //CPracticeMgr practiceMgr = new CPracticeMgr(); //생성자의 한정자가 private 이기에 외부에서 인스턴스를 만들 수 없음.
        CPracticeMgr practiceMgr = CPracticeMgr.GetPracticeMgr();

        //생성되는 시점이 다르기 때문에 호출이 안 되는 겁니다.
        //GetTest();

        Titles.add("CPractice를 선택해 주세요.\n");
        Titles.add("1. CPractice_1\n");
        Titles.add("2. CPractice_2\n");
        Titles.add("99. EXIT\n");
        Titles.add("Choose: ");
        
        Scanner in = new Scanner(System.in); // Scanner 객체 생성

        do {
            for(String title : Titles) {
                System.out.print(title);
            }

            int selectedPractice = in.nextInt();
            if(selectedPractice == 99) {
                break;
            }

            practiceMgr.SetPractice(selectedPractice);

            //override 되었으므로 자식클래스에서 정의한 메서드가 호출됨.
            practiceMgr.GetPractice().render();
        } while(practiceMgr.GetPractice().update() == 1);//결과가 참이면 loop

    }

    private static List<String>  Titles = new ArrayList<>();

    //생성시점 및 위치:  메모리의 스택 영역에 생성
    //메서드 영역보다 나중에 생성되는 건 확실함.
    public void GetTest(){

    }

}

