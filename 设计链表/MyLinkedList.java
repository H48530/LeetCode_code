package 设计链表;

import java.util.List;

/**
 * 设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：val 和 next。val 是当前节点的值，next 是指向下一个节点的指针/引用。
 * 如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。
 * 在链表类中实现这些功能：
 * get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
 * addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
 * addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
 * addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。
 * 如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
 * deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/design-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int x) {
        val = x;
    }
}

class MyLinkedList {
    ListNode head;
    ListNode last;
    int size;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        this.head = null;
        this.last = null;
        size = 0;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index >= 0 && index < size) {
            ListNode cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            return cur.val;
        } else {
            return -1;
        }
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        if (head == null) {
            head = last = node;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
        }
        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        if (last == null) {
            head = last = node;
        } else {
            node.prev = last;
            last.next = node;
            last = node;
        }
        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index <= 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else if (index < size) {
            ListNode node = new ListNode(val);
            ListNode cur = head;
            for (int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
            ListNode next = cur.next;

            node.prev = cur;
            node.next = next;
            cur.next = node;
            next.prev = node;
            size++;
        }

    }


    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index >= 0 && index < size) {
            if (size == 1) {
                head = null;
                last = null;
            } else if (index == 0) {
                head = head.next;
                head.prev = null;
            } else if (index == size - 1) {
                last = last.prev;
                last.next = null;
            } else {
                ListNode cur = head;
                for (int i = 0; i < index; i++) {
                    cur = cur.next;
                }
                ListNode prev = cur.prev;
                ListNode next = cur.next;
                prev.next = next;
                next.prev = prev;
            }
            size--;
        }
    }
}
