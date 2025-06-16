class Tree{
    Node root;
    int index=-1;
    Tree(int[]nodes){
        this.root=buildTreeUsingArray(nodes);
        System.out.println(index);
    }
    public Node buildUsingArray(int[]nodes){
        index++;
        if(index>=nodes.length){
            return null;
            
        }
            if(nodes[index]==-1){
                return null;
            }
            Node newNode=new Node(nodes[index]);
            newNode.left=buildTreeUsingArray(nodes);
            newNode.right=buildTreeUsingArray(nodes);
            return newNode;
        }
}
    class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public class Main{
        public static void main(String[]args){
            Tree t=new Tree(new int[]{1,2,-1,-1,3,-1,-1});
            t.preOrder();
            System.out.println("");
            t.inOrder();
        }
    public void preOrder(){
        Node temp=this.root;
        preOrderHelper(temp);
    }
     private void preOrerHelper(){
        if(temp==null)return;
        System.out.println(temp.data+" ");
        preOrderHelper(temp.left);
        preOrderHelper(temp.right);
    }
    public void inOrder(){
        Node temp=root;
        inOrderHelper(temp);
    }
    public void inorderHelper(Node temp){
        if(temp==null)return;
         inOrederHelper(temp.left);
          System.out.println(temp.data+" ");
        inOrderHelper(temp.right);
    }
    }