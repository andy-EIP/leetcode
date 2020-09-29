public class Main {
    public static void main(String[] args) {
        ListNode listNode = new Solution().mergeTwoLists(new ListNode(1, new ListNode(2 , new ListNode(4))), new ListNode(1 , new ListNode(3, new ListNode(4))));

        System.out.println(listNode);

    }
}


class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }else if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next , l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}


class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
