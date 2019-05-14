package com;

class Node {
    int value;
    Node leftNode;
    Node rightNode;
}

public class test {

    public boolean isBST(Node n){
        return isBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isBST(Node n, int min, int max){
        if(n == null)
            return true;
        if(n.value < min || n.value > max)
            return false;
        return isBST(n.leftNode,min,n.value) && isBST(n.rightNode,n.value+1,max);
    }

    public static void main(String[] args) {

    }

}
