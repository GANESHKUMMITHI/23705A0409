
public class BinaryTree{
Node root;
BinaryTree(){
    this.root=null;
}
public static int insertNode(Node root,int data){
    if(root==null){
        return newNode(data);
    }
if(data<root.data){
root.right=insertNode(root.right,data);
}else if(data>root.data){
    root.left=insertNode(root.left,data);
}
    return root;
}
class Node{
    int data;
    Node left;
    Node right;
    Node root;
    Node(int data){
    this.data=data;
    this.right=null;
    this.left=null;
  Node newNode=new Node(t[]);
    newNode.left=BinaryTree(t);
    newNode.right=BinaryTree(t);
}
}
public class Main{
    public static void main(String[]args){
        BinaryTree t=new BinaryTree(new int[]{1,2,3,4,5});
        t.BinaryTree();
        System.out.println();
    }
}
}