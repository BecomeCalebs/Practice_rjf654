import java.util.HashMap;
import java.util.Map;

import IPractice.CArray.CArray;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
         Map<Long, Map<String, CArray>> members = new HashMap<>();

         Map<String, CArray> member1 = new HashMap<>();
         CArray arr1 = new CArray();
         arr1.m_number = 123;
         member1.put("memberId1", arr1);
         //member1.put("phone", "010-1111-1111");
         //member1.put("phone", "010-1111-2222");
         member1.put("memberId2", new CArray(11));
         for(int i = 0; i < 100; ++i) {
            //1번 방법
            // 1) 필드(m_number)를 두 번 초기화 함. 
            // : 필드가 초기화되는 시점: 인스턴스 생성될 때 1번, for문 안에서 1번
            // 2) CArray 지역변수를 생성하고, CArray인스턴스를 넣음.
            CArray arr2 = new CArray();
            arr2.m_number = i; //i로 m_number 초기화
            member1.put("memberId3-" + String.valueOf(i), arr2);

            //2번 방법
            // 1) 필드(m_number)가 for문 안에서 1번만 초기화 됨.
            // 2) CArray 인스턴스를 생성함.
            member1.put("memberId4-" + String.valueOf(i), new CArray(i));
         }
         
        



         long memberId = 1L;
         members.put(memberId, member1);
 
         System.out.println(members.get(memberId).get("memberId1")); 
    }

}
