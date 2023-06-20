package CObj;

import java.util.List;

public class CDinamicArray<T> extends CObj{
    public CDinamicArray() {
        
    }

    private final Integer DEFAULT_CAP = 16;
	
	private	int m_cur_capacity = DEFAULT_CAP;
	private	int m_cur_size = 0;
	private Object[] m_uniq_container = new Object[255]; // 강제 형변환을 이용하여 생성;

    public <T> void Add(T _element) {
        if (m_cur_capacity == m_cur_size) {
        //Add 하면 배열 컨테이너의 원소가 모자랄 시
        //기존의 배열 컨테이너의 두 배에 해당하는 배열 컨테이너를 만든 후
            m_cur_capacity *= 2;

        //기존의 배열의 원소를 새로운 배열에 복사한다.
            Object[] temp_arr = new Object[m_cur_capacity];
            for (int i = 0; i < m_cur_size; ++i)
                temp_arr[i] = m_uniq_container[i];

        //기존의 배열 인스턴스를 삭제한다.
        //m_uniq_container에 새로운 배열의 인스턴스를 담는다.
                m_uniq_container = temp_arr;
        }
        m_uniq_container[m_cur_size++] = _element;
    }
    public <T> T Get(int _index) {
        return  (T) m_uniq_container[_index];
    }
    public int Size() { return m_cur_size; }


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