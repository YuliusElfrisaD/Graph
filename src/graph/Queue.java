/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.LinkedList;

/**
 *
 * @author basisb03sa
 */
public class Queue<E> {

    private LinkedList<E> linkedList;
    
    public Queue(){
        linkedList = new LinkedList<E>();
    }

    public void add(E e) {
        if (linkedList.isEmpty()){
            linkedList.addFirst(e);
        } else {
            linkedList.addLast(e);
        }
        
    }

    public E remove() {
        return linkedList.removeFirst();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
}
