package IPractice.CPractice_2;

import java.util.ArrayList;
import java.util.List;

import CObj.CDinamicArray;
import IPractice.IPractice;

public class CPractice_2 implements IPractice{
    //1. 생성자
    public CPractice_2(){
        initialize();
    }

    //2. 필드
    public List<String> titles; 

    //3. 메서드
    @Override
    public void initialize() {
        titles = new ArrayList<>();
        titles.add("연습 선택");
        titles.add("1. ");
        titles.add("2. ");
        titles.add("99. EXIT");
        titles.add("Choose: ");

    }

    @Override
    public int update() {
        return 1;
    }

    @Override
    public void render() {
            System.out.println("CPractice_2 입니다.");
    }

    @Override
    public void release() {

    }

    private void practice_2() {
        CDinamicArray<Integer> lists = new CDinamicArray<>();
        ArrayList<Integer> lii = new ArrayList<>(256); //256 크기의 컨테이너가 생성된다.
    }
    
    
}
