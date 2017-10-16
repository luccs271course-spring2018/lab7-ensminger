package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // TODO
    add(obj);
    return obj;
  }

  @Override
  public E peek() {
    // TODO
    try{
      return size()-1:
    }
    catch(ArrayIndexOutOfBoundsException ex){
      throw new EmptyStackException();
      
    }
    }
  }

  @Override
  public E pop() {
    // TODO
    try{
      return remove(size()-1):
    }
    catch(ArrayIndexOutOfBoundsException ex){
      throw new EmptyStackException();
      
    }
    }
  }

  @Override
  public boolean isEmpty() {
    // TODO
    if(top == null)
    {
      return true;
    }
    if(top != null)
    {
      return false;
    }
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size
    // TODO add any instance variable(s) required to support this
    Node<E> top1 = top;
    List <E> list = new ArrayList();
    while(to != null){
      list.add(top.toString());
      top1=top1.next;
    }
    
    return list;
  }
}
