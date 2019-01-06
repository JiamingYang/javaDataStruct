package tree;

import java.util.LinkedList;

/**
 * Created by asus on 2018/12/3.
 */
public class binaryTree {
    public Node init() {//注意必须逆序建立，先建立子节点，再逆序往上建立，因为非叶子结点会使用到下面的节点，而初始化是按顺序初始化的，不逆序建立会报错
        Node J = new Node(8, null, null);
        Node H = new Node(4, null, null);
        Node G = new Node(2, null, null);
        Node F = new Node(7, null, J);
        Node E = new Node(5, H, null);
        Node D = new Node(1, null, G);
        Node C = new Node(9, F, null);
        Node B = new Node(3, D, E);
        Node A = new Node(6, B, C);
        return A;   //返回根节点
    }
    public  void printNode(Node node){
        System.out.print(node.getData());
    }

    public void theFirstTraver(Node root){//前序遍历
        printNode(root);
        if(root.getLeft()!=null){
            theFirstTraver(root.getLeft());
        }
        if(root.getRight()!=null){
            theFirstTraver(root.getRight());
        }
    }
    public void midFirstTraver(Node root){//中序遍历
        if(root.getLeft()!=null){
            midFirstTraver(root.getLeft());
        }
        printNode(root);
        if(root.getRight()!=null){
            midFirstTraver(root.getRight());
        }
    }
    public void postFirstTraver(Node root){//后序遍历
        if(root.getLeft()!=null){
            postFirstTraver(root.getLeft());
        }
        if(root.getRight()!=null){
            postFirstTraver(root.getRight());
        }
        printNode(root);
    }
    public void levelTraveral(Node root){
        if(root==null)
            return;
        LinkedList<Node> queue=new LinkedList<Node>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node node=queue.poll();
            System.out.print(node.getData()+" ");
            if(null!=node.getLeft())
                queue.offer(node.getLeft());
            if(null!=node.getRight())
                queue.offer(node.getRight());
        }
    }

//    public  void depTraveral(Node root){
//        if(null==root)
//            return;
//        LinkedList<Node> stack=new LinkedList<Node>();
//        stack.push(root);
//        while (!stack.isEmpty()){
//            Node node=stack.pop();
//            System.out.print(node.getData()+" ");
//            if(null!=node.getRight())
//                stack.push(node.getRight());
//            if(null!=node.getLeft())
//                stack.push(node.getLeft());
//        }
//    }

    public static void main(String[] args) {
        binaryTree testTree=new binaryTree();
        Node root= testTree.init();
//        System.out.print("前序遍历\n");
//        testTree.theFirstTraver(root);
//        System.out.print("\n");
//        System.out.print("中序遍历\n");
//        testTree.midFirstTraver(root);
//        System.out.print("\n");
//        System.out.print("后序遍历\n");
//        testTree.postFirstTraver(root);
//        System.out.print("\n");

        System.out.print("深度遍历\n");
     //  testTree.depTraveral(root);
       System.out.print("\n");

    }
}
