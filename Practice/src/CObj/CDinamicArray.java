package CObj;

import java.util.List;

public class CDinamicArray<T> extends CObj{
    public CDinamicArray() {
        
    }

    private T[] lists = (T[]) new Object[255]; // 강제 형변환을 이용하여 생성;

    public <T> void Add(T _t) {
        //Add 하면 배열 컨테이너의 원소가 모자랄 시

        //기존의 배열 컨테이너의 두 배에 해당하는 배열 컨테이너를 만든 후

        //기존의 배열의 원소를 새로운 배열에 복사한다.

        //기존의 배열을 삭제한다.

        //lists에 새로운 배열의 인스턴스를 담는다.
    }
    public <T> T Get(int _index) {
        return  (T) lists[_index];
    }


    /*
     * ArrayList의 장점
     * 1. 크기가 자동으로 늘어난다. //배열은 늘어나지 않는다.
     * 
     * ArrayList의 단점
     * 1. 배열이 두 배씩 증가하기 떄문에 
     * 
     * 이 단점은 개발자가 커버해야 한다. 
     * 커버 방법: 최대한 사용할 만큼의 원소를 추측한 후 배열의 크기를 고정한다.
     * EX) 256개의 원소를 담을 ArrayList가 필요하다면
     * ArrayList의 크기를 256으로 설정한다.
     */


}