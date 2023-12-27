package org.bstanimation.bstanimation.controller;

public class TreeNode <E>{

    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e){
        element = e;
    }


    public TreeNode<E> getLeft(){
        return this.left;
    }

    public TreeNode<E> getRight(){
        return this.right;
    }


    public E getElement(){
        return this.element;
    }
}
