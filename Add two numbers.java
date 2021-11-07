class ListNode{
    int val;
    ListNode next; 
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;} 
}

class solution{
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, current = dummyHead;
        int carry = 0; 
        while(p != null || q != null){
            int x = (p != null) ? p.val : 0; 
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;

            carry = sum / 10;
            current.next = new ListNode(sum%10);
            current = current.next; 
            
            if(p != null)
                p = p.next;
            if(q != null)
                q = q.next;
        }
        if(carry > 0){
            current.next = new ListNode(carry); 
        }
        return dummyHead.next; 
    }
    
    public static void print(ListNode dummyHead){
        while(dummyHead != null){
            System.out.println(dummyHead.val);
            dummyHead = dummyHead.next; 
        }
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode(2);
        ListNode x2 = new ListNode(4);
        ListNode x3 = new ListNode(3);
        l1.next = x2; 
        x2.next = x3; 
        
        ListNode l2 = new ListNode(5);
        ListNode y2 = new ListNode(6);
        ListNode y3 = new ListNode(4); 
        l2.next = y2; 
        y2.next = y3; 
        print(addTwoNumbers(l1,l2));
    }
}