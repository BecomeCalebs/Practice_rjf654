package CObj;


public class CList<T> extends CObj {
    private class CNode {
        public CNode(){

        }
        public CNode(Object _element){
            m_data = _element;
        }
        Object m_data;
        CNode m_nextNode;
    }

    private CNode m_rootNode;

    public void push_front(T _element){
        if(m_rootNode == null){
            m_rootNode = new CNode(_element);
        }else {
            CNode curNode = new CNode(_element);
            curNode.m_nextNode = m_rootNode;
            m_rootNode = curNode;
        }
    }
    public <T> T pop_front() {
        CNode curNode = m_rootNode;
        m_rootNode = m_rootNode.m_nextNode;
        return (T) curNode.m_data;
    }
}
