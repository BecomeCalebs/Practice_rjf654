package IPractice.CPractice_2;

import java.util.ArrayList;
import java.util.List;

import CObj.CDinamicArray;
import CObj.CList;
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
        titles.add("\n연습 선택");
        titles.add("\n1. DinamicArray ");
        titles.add("\n2. CForwardList ");
        titles.add("\n99. EXIT");
        titles.add("\nChoose: ");
    }

    @Override
    public int update() {
        switch(CIO.inputNum()) {
            case 1:
                practice_1();
                break;
            case 2:
                practice_2();
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
        for(String title : titles)
            System.out.print(title);
    }

    @Override
    public void release() {

    }

    //CDinamicArray 예제
    private void practice_1() {
        CDinamicArray<Integer> lists = new CDinamicArray<>(256);
        ArrayList<Integer> lii = new ArrayList<>(256); //256 크기의 컨테이너가 생성된다.
        
        lists.Add(1);
        lists.Add(2);
        lists.Add(3);

        for(int i = 0; i < lists.Size(); ++i) {
            System.out.println(lists.Get(i).toString());
        }
        //error 띄우기
        lists.Get(10);
    }
    //CForwardList 예제
    private void practice_2(){
        CList<Integer> lists = new CList<>();
        //1. push_front
        lists.push_front(1);
        lists.push_front(2);
        lists.push_front(3);
        lists.push_front(4);

        //2. pop_front
        for(int i = 0; i < 4; ++i){
            System.out.println( lists.pop_front().toString());
        }

    }


    
    
}
