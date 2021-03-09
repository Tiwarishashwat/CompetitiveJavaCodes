 static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode p=head;
        while(p.next!=null)
        {
            if(p.data==p.next.data)
            {
                p.next=p.next.next;
            }
            else
            {
                p=p.next;   
            }
        }
        return head;
    }