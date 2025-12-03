

import java.util.ArrayList;
import java.util.List;

public class LinkedListDeque61B<T> implements Deque61B<T>{
    private Node sentiNode;
    private int size;

    private class Node{
        public T item;
        public Node next;
        public Node pre;

        public Node(T item, Node pre, Node next){
            this.item = item;
            this.pre = pre;
            this.next = next;
        }
    }
    public LinkedListDeque61B(){
        sentiNode = new Node(null, null, null);
        size = 0;
        sentiNode.next = sentiNode;
        sentiNode.pre = sentiNode;
    }

    @Override
    public void addFirst(T x) {
        // TODO Auto-generated method stub
        Node new_node = new Node(x, sentiNode, sentiNode.next);
        sentiNode.next = new_node;
        new_node.next.pre = new_node;
        size += 1;
    }

    @Override
    public void addLast(T x) {
        // TODO Auto-generated method stub
        Node new_node = new Node(x,sentiNode.pre, sentiNode);
        sentiNode.pre.next = new_node;
        sentiNode.pre = new_node;
        size += 1;
    }

    @Override
    public List<T> toList() {
        // TODO Auto-generated method stub
        List<T> returnList = new ArrayList<>();
        
        Node p = sentiNode.next;
        while (p != sentiNode){
            returnList.add(p.item);
            p = p.next;
        }

        return returnList;
    }

    @Override
    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        return false;        
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return size;
    }

    @Override
    public T removeFirst() {
        // TODO Auto-generated method stub
        if (this.isEmpty() == true){
            return null;
        }
        Node p = sentiNode.next;
        p.next.pre = sentiNode;
        sentiNode.next = p.next;

        return p.item;
    }

    @Override
    public T removeLast() {
        // TODO Auto-generated method stub
        if (this.isEmpty() == true){
            return null;
        }
        Node p = sentiNode.pre;
        p.pre.next = sentiNode;
        sentiNode.pre = p.pre;

        return p.item;
    }

    @Override
    public T get(int index) {
        // TODO Auto-generated method stub
        Node p = sentiNode.next;
        int num = 0;
        while(p != sentiNode && num < index){
            p = p.next;
            num += 1;
        }
        if (index - num == 1 || p == sentiNode){
            return null;
        }
        return p.item;
    }

    @Override
    public T getRecursive(int index) {
        // TODO Auto-generated method stub
        return getRecursive(sentiNode.next, index);
    }

    private T getRecursive(Node current, int index){
        if (index == 0){
            return current.item;
        }
        Node p = current;
        p = p.next;
        if (p == sentiNode){
            return null;
        }
        return getRecursive(p, index -1);
    }


    public static void main(String[] args) {
        Deque61B<Integer> lld = new LinkedListDeque61B<>();
        lld.addLast(0); // [0]
        lld.addLast(1); // [0, 1]
        lld.addFirst(-1); // [-1, 0, 1]
        lld.addLast(9);
        // System.out.println(lld.toList());
        lld.get(0);
    }
}
