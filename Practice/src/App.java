import IPractice.IPractice;
import IPractice.CPractice_1.CPractice_1;

public class App {
    public static void main(String[] args) throws Exception {

        //확인
        //1. CPractice_1 인스턴스 생성 부분
        // * 인스턴스: 자료형의 데이터가 메모리의 생성된 것.
        //2. 형변환: CPractice 변수에 CPractice_1의 인스턴스를 담을 수 있다.
        //암묵적 형변환
        IPractice practice = new CPractice_1(); //자료형이 CPractice(=부모클래스)이기 때문에 CPractice가 갖고 있는 필드 or 메서드만 사용 가능하다.
        //부모 = new 자식();

        //override 되었으므로 자식클래스에서 정의한 메서드가 호출됨.
        practice.render();
    }
}

