package tree;

/**
 * Created by asus on 2018/12/3.
 */
public class Node {
    private  int data;
    private Node left;
    private  Node right;
    public Node(int data,Node leftNode,Node rightNode){
        this.data=data;
        this.left=leftNode;
        this.right=rightNode;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getRight() {
        return right;
    }
}
