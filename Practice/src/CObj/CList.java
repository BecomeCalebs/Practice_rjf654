package CObj;

<<<<<<< HEAD

public class CList<T> extends CObj {
    public class CNode<T> {
        public CNode(T _item){
            m_curItem = _item;
        }
        private T m_curItem;
        private CNode<T> m_nextNode;
        private CNode<T> m_prevNode;
    }
    public CList(){

    }

    CNode<T> m_rootNode;

    public <T> void Add(T _element) {

    }
    public <T> T Get() {
        Object node = m_rootNode;
        //m_rootNode.m_nextNode;
        return node.m_curItem;
    }




=======
public class CList<T> {
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
>>>>>>> e130936ef30986071e8e86dcb3489a9330612804
}
