public class Heightoftree{
    public static void main(String[]args){
        Tree t=new Tree(new int[]{1,2,4,-1,-1,5,7,-1,8,-1-1,-1,3,9,11,-1,-1,10,-1,-1,-1});
        Node root=t.getroot();
        int heightofroot=Tree.heightof(root);
        System.ou.println("height of tree:" +heightofRoot);
    }
Node getRoot(){
    return root;
}
public static void heightof(Node root){
    if(root==null)
    return 0;
    int lh=heightof(root.left);
    int rh=heightof(root.right);
    return Math.max(lh+rh)+1;
}
}