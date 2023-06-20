package IPractice.CPractice_2;

import java.util.ArrayList;
import java.util.List;

import CObj.CDinamicArray;
import Headers.CIO;
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
        switch(CIO.inputNum())
        {
            case 1:
                practice_1();
                break;
            case 2:
                break;
            case 99: 
                return 99;
            default:
                return 0;
        }
        return 0;
    }

    @Override
    public void render() {
            System.out.println("CPractice_2 입니다.");
    }

    @Override
    public void release() {

    }

    private void practice_1() {
        CDinamicArray<Integer> lists = new CDinamicArray<>();
        //ArrayList<Integer> lii = new ArrayList<>(256); //256 크기의 컨테이너가 생성된다.
        lists.Add(1);
        lists.Add(2);
        lists.Add(3);

        for(int i = 0; i < lists.Size(); ++i){
            System.out.println(lists.Get(i).toString());
        }
    }
    
    
}
