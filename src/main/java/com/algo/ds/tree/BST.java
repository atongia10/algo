package com.algo.ds.tree;

class Node {
    int value;
    Node leftNode;
    Node rightNode;
}

public class BST {

    public boolean isBST(Node node){
        return isBST(node,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public boolean isBST(Node node, int min, int max){
        if(node == null)
            return true;
        if(node.value < min || node.value > max)
            return false;
        return isBST(node.leftNode,min, node.value) &&
                isBST(node.rightNode,node.value+1,max);

    }



}
