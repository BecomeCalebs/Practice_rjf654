package IPractice.CArray;

import IPractice.*;

public class CArray implements IPractice {

    public CArray(){

    }
    public CArray(int _number){
        m_number = _number;
    }

    //자식의 필드와 메서드
    public int m_number; //필드

    public void sendMassage(){ //자식의 메서드

    }
    //부모에세 상속 받은 메서드
    @Override
    public void initialize() { 

    }
    @Override
    public void update() {

    }
    @Override
    public void render() {

    }
    @Override
    public void release() {

    }
}
