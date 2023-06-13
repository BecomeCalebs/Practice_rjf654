package IPractice;

public interface IPractice{
    //필드(=멤버변수) 초기화
    public void initialize();
    // 필드(=멤버변수) 값 변경 
    public int update();
    // 화면에 인스턴스 정보 출력
    public void render();
    // 필드 인스턴스 해제
    public void release();
}