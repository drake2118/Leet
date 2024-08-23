/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int res=0;
        ListNode temp=head;
        Stack<Integer> st = new Stack<>();
        while(temp != null){
        st.add(temp.val);
        temp=temp.next;
        }
        int power=0;
        while(!st.isEmpty()){
            res=res+(int)(st.pop()*Math.pow(2,power));
            power++;
        }
        return res;
    }
}