package CObj;


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




}
