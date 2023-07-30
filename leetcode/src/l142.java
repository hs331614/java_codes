public class l142 {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }


    public class Solution {
        public int lengthcycle(ListNode head){
            ListNode fast=head;
            ListNode slow=head;

            while (fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if (fast==slow){
                    int length=0;
                    do {
                        slow=slow.next;
                        length++;
                    }while (fast!=slow);
                    return length;
                }
            }
            return 0;
        }
        public ListNode detectCycle(ListNode head) {

            int l=0;
            ListNode fast=head;
            ListNode slow=head;

            while (fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if (fast==slow){
                   l=lengthcycle(slow);
                   break;

                }
            }



            ListNode f=head;
            ListNode s=head;
            while (l!=0){
                s=s.next;
            }

            while (f!=s){
                f=f.next;
                s=s.next;
            }
            return s;
        }
    }

}
