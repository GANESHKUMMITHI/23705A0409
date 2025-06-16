import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<TreeNode> sortedArr = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        sortedArr.clear();  // Clear list in case of multiple calls
        inorderTraverse(root);
        return sortedArrayToBST(0, sortedArr.size() - 1);
    }

    private void inorderTraverse(TreeNode root) {
        if (root == null) return;
        inorderTraverse(root.left);
        sortedArr.add(root);
        inorderTraverse(root.right);
    }

    private TreeNode sortedArrayToBST(int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode root = sortedArr.get(mid);
        root.left = sortedArrayToBST(start, mid - 1);
        root.right = sortedArrayToBST(mid + 1, end);
        return root;
    }

    // TreeNode definition
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    // Simple test example
    public static void main(String[] args) {
        // Build an unbalanced BST
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        Solution sol = new Solution();
        TreeNode balancedRoot = sol.balanceBST(root);

        // Print inorder of balanced tree to verify it's sorted
        printInorder(balancedRoot);
    }

    private static void printInorder(TreeNode root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }
}