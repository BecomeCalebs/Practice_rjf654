package CObj;

//Vector
public class CDinamicArray<T> extends CObj {
    // 인스턴스 생성 순서 2. 생성자 호출
    public CDinamicArray() {
        m_container = new Object[m_cur_capacity];
    }

    public CDinamicArray(int _size) {
        m_cur_capacity = _size;
        m_container = new Object[m_cur_capacity];
    }

    // 인스턴스 생성 순서 1. 필드 초기화
    // enum처럼 생각하시면 됩니다.
    private final Integer DEFAULT_CAP = 16; // Default Capacity

    // m == 멤버변수(필드)를 의미합니다.
    // 헝가리안 표기법
    private int m_cur_capacity = DEFAULT_CAP; // 컨테이너에 들어갈 수 있는 최대 원소의 개수
    private int m_cur_size = 0; // m_cur_size == 현재 m_container에 들어간 원소의 개수
    private Object[] m_container; // 컨테이너;

    public <T> void Add(T _element) {
        if (m_cur_capacity == m_cur_size) {
            // Add 하면 배열 컨테이너의 원소가 모자랄 시
            // 기존의 배열 컨테이너의 두 배에 해당하는 배열 컨테이너를 만든 후
            m_cur_capacity = m_cur_capacity * 2;

            // 기존 배열 인스턴스턴의 두 배 만큼의 새로운 배열 인스턴스를 생성한다.
            // 기존의 배열의 원소를 새로운 배열에 복사한다.
            Object[] temp_container = new Object[m_cur_capacity];
            for (int i = 0; i < m_cur_size; ++i) {
                // 기존의 배열 인스턴스에 담긴 원소들을 새로운 배열 인스턴스에 복사한다.
                temp_container[i] = m_container[i];
            }

            // 가비지컬렉터가 참조되지 않는 기존의 배열 인스턴스를 삭제한다.
            m_container = null;

            // m_container에 새로운 배열의 인스턴스를 담는다.
            m_container = temp_container;
        }
        m_container[m_cur_size++] = _element;
    }

    public <T> T Get(int _index) {
        try {
            if (m_cur_size < _index) { // 인덱스 범위 벗어난 경우 예외 던지기
                throw new IndexOutOfBoundsException("Invalid index: " + _index);
            }
            return (T) m_container[_index]; // m_container[_index] <-- object를 반환
        } catch (IndexOutOfBoundsException e) { // 던져진 예외를 어떻게 처리 어떻게 할 것인지 작성하기
            System.out.println("Invalid index: " + e.getMessage());
        }
        return null;
    }

    public int Size() {
        return m_cur_size;
    }

    /*
     * ArrayList의 장점
     * 1. 크기가 자동으로 늘어난다. //배열은 늘어나지 않는다.
     * 
     * ArrayList의 단점
     * 1. 배열이 두 배씩 증가하기 떄문에 계속해서 복사가 일어난다.
     * 
     * 이 단점은 개발자가 커버해야 한다.
     * 커버 방법: 최대한 사용할 만큼의 원소를 추측한 후 배열의 크기를 고정한다.
     * EX) 256개의 원소를 담을 ArrayList가 필요하다면
     * ArrayList의 크기를 256으로 설정한다.
     */
}