package IPractice.CPractice_1;

import java.util.ArrayList;
import java.util.List;

import IPractice.IPractice;

public class CPractice_1 implements IPractice{
    //생성자
    //인스턴스가 생성되는 시점에 호출되는 메서드 
    public CPractice_1(){
        initialize();
    }

    //필드(or 멤버변수)
    public List<String> titles;
    public String m_str = "멤버변수 초기화";

    //override
    //메서스(or 멤버함수)
    //필드(=멤버변수) 초기화
    @Override
    public void initialize(){
        titles = new ArrayList<>();
        titles.add("1. 초기화란?");
        titles.add("2. 변수의 종류");
    }
    // 필드(=멤버변수) 값 변경 
    @Override
    public void update(){

    } 
    // 화면에 인스턴스 정보 출력
    @Override
    public void render(){
        for(int i = 0; i < titles.size(); ++i)
        {
            System.out.println(titles.get(i));
        }
        
        practice_1();
        practice_2("매개변수에 넣어주는 문자열");
    }
    // 필드의 인스턴스 해제
    @Override
    public void release(){
        
    } 


    private void practice_1(){
        /*
         인스턴스 설명
         인스턴스란 메모리에 만들어진 데이터다.
         
         //230610_ktk
         //차후 내용 수정 할 것.
         //지금은 이해를 위해 이정도로 설명 드립니다.
        */
        //초기화 예시) phones라는 상자에 ArrayList 데이터를 담는다.
        List<String> phones = new ArrayList<>();
    }

    private void practice_2(String _parameter){
        //매개변수: 함수의 괄호 안에 선언된 변수 
        //함수의 호출부에서 함수가 사용할 데이터를 넣어줄 때 사용함.
        //_parameter를 매개변수라고 한다.
        
        //지역변수: 메서드 내부에 선언 된 변수
        //num 을 지역변수라 한다.
        int num = 1;

        //필드(= 메서드): 클래스에 선언 된 변수
        //m_str, titles를 필드라 한다.
    }
}