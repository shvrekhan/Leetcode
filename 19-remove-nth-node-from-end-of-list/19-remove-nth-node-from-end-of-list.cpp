class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) { ListNode *p = head, *q = head;
    while (q) {
        if (n < 0)  p = p->next;
        else  n--;
        q = q->next;
    }
    if (n == 0) head = head->next;
    else  p->next = p->next->next;
    return head;
        
        
    }
};