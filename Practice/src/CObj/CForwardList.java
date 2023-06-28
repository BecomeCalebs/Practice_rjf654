package CObj;

import java.nio.channels.NetworkChannel;

//List <- ArrayList 아님!
public class CForwardList<T> extends CObj {
    private class CNode {
        public CNode(Object _element) {
            m_data = _element;
        }
        Object m_data;
        CNode m_nextNode;
    }

    private CNode m_rootNode;
    private int size = 0;
    public int Size() {
        return size;
    }
    public void push_front(T _element) {
        ++size;
        if(m_rootNode == null) {
            m_rootNode = new CNode(_element);
        } else { //m_rootNode != null
            CNode curNode = new CNode(_element);
            curNode.m_nextNode = m_rootNode;
            m_rootNode = curNode;
        }
    }
    public void push_back(T _element) {
        ++size;
        if(m_rootNode == null) {
            m_rootNode = new CNode(_element);
        } else { //m_rootNode != null
            CNode curNode = m_rootNode;
            while(curNode.m_nextNode != null) {
                curNode = curNode.m_nextNode;
            }
            curNode.m_nextNode = new CNode(_element);
        }
    }
    public <T> T pop_front() {
        --size;
        CNode curNode = m_rootNode;
        m_rootNode = m_rootNode.m_nextNode;
        return (T) curNode.m_data;
    }
}
