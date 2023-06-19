package DesignPattern;

import IPractice.IPractice;
import IPractice.CPractice_1.CPractice_1;
import IPractice.CPractice_2.CPractice_2;

//디자인 패턴!
//Singleton Pattern
public class CPracticeMgr {
    private CPracticeMgr(){

    }

    //1. 클래스의 내부에 인스턴스 생성하기
    //생성자가 private이기에 클래스 외부에서 인스턴스를 생성할 수 없다.
    //그러므로 클래스의 내부에서 CPracticeMgr 인스턴스를 생성한다.
    
    //static: 메서드 영역에 변수가 생성된다. 
    // 메서드 영역에 생성되기 때문에 

    //final 


    //PracticeMgr(0x0000001); --> 실제 담고 있는 것은 메모리에 선언된 인스턴스의 시작 주소값입니다.
    private final static CPracticeMgr PracticeMgr = new CPracticeMgr();//사실 인스턴스의 시작 주소값을 담고 있어요.
    
    public static CPracticeMgr GetPracticeMgr(){
        return PracticeMgr;
    }

    
    //외부에서 인스턴스를 함부로 바꾸지 못 하도록 private 처리한 후 Getter, Setter 함수를 사용하는 겁니다.
    private IPractice Practice = new CPractice_1(); 


    public void SetPractice(int _selectedPractice){
        switch(_selectedPractice)
        {
            case 1:
                Practice = new CPractice_1();
                break;
            case 2:
                Practice = new CPractice_2();
                break;
            default:
                Practice = new CPractice_1();
                break;
        }
    }
    public IPractice GetPractice(){
        return Practice;
    }



    


}
