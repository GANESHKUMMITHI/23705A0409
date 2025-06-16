class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return new TreeNode(head.val);
        return findNodes(head);
    }
    TreeNode findNodes(ListNode head){
        if(head==null) return null;
        if(head.next==null) return new TreeNode(head.val);
      
        ListNode slow=head.next;
        ListNode prev=head;
        ListNode fast=head.next.next;
        while(fast!=null && fast.next!=null){
            prev=prev.next;
            slow=slow.next;
            fast=fast.next.next;
        }
        TreeNode curr=new TreeNode(slow.val);
        curr.right=findNodes(slow.next);
        prev.next=null;
        curr.left=findNodes(head);
        return curr;
    }
}