## 合并链表

```python
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public static void printList(ListNode l1) {
        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l2 == null) {
            return l1;
        }
        if (l1 == null) {
            return l2;
        }
        ListNode temp = l2.next;
        ListNode cur = l1;
        l2.next = cur;
        if (l2.val < cur.val) {
            l2.next = cur;
            return mergeTwoLists(l2, temp);
        }
        while (cur.next != null) {
            if (cur.val <= l2.val && cur.next.val > l2.val) {
                break;
            }
            cur = cur.next;
        }
        l2.next = cur.next;
        cur.next = l2;
        // printList(l1);
        return mergeTwoLists(l1, temp);
    }

    public static void main(String[] args) {
        ListNode l3 = new ListNode(4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        ListNode l_3 = new ListNode(4);
        ListNode l_2 = new ListNode(3, l_3);
        ListNode l_1 = new ListNode(1, l_2);
        ListNode cur = mergeTwoLists(l1, l_1);
        // ListNode l1 = new ListNode(2);
        // ListNode l_1 = new ListNode(1);
        // ListNode cur = mergeTwoLists(l1, l_1);
        printList(cur);
    }
}
```

# Pow(x,n)

``` python
p
```

