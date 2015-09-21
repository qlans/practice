package com.zhaofukai.leetcode;

/**
 * @author: by zhaofukai
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class AddTwoNumbers {

    public static void main(String[] args) {
        Solution solution = new AddTwoNumbers().new Solution();
        ListNode l1 = createNode(new int[]{1,8});
        ListNode l2 = createNode(new int[]{0});
        solution.print("l1: ", l1);
        solution.print("l2: ", l2);
        ListNode ret = solution.addTwoNumbers(l1, l2);
        solution.print("ret: ", ret);
    }

    private static ListNode createNode(int[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        ListNode head = new ListNode(lists[0]);
        ListNode p = head;
        for (int i = 1; i < lists.length; i++) {
            p.next = new ListNode(lists[i]);
            p = p.next;
        }
        return head;
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            //l1 = reverseList(l1);
            //l2 = reverseList(l2);
            if (len(l1) < len(l2)) {
                ListNode tmp = l1;
                l1 = l2;
                l2 = tmp;
            }
            int carry = 0;
            ListNode pL1 = l1, pL2 = l2;
            while (pL1 != null) {
                int val = carry + pL1.val;
                if (pL2 != null) {
                    val += pL2.val;
                    pL2 = pL2.next;
                }
                pL1.val = val % 10;
                carry = val / 10;
                if (pL1.next == null && carry > 0) {
                    pL1.next = new ListNode(carry);
                    break;
                }
                pL1 = pL1.next;
            }
            return l1;
        }

        private int len(ListNode listNode) {
            ListNode pListNode = listNode;
            int ret = 0;
            while (pListNode != null) {
                pListNode = pListNode.next;
                ret++;
            }
            return ret;
        }

        private ListNode reverseList(ListNode listNode) {
            if (listNode == null) {
                return null;
            }
            ListNode preNode = null, curNode = listNode, nextNode = listNode.next;
            while (nextNode != null) {
                curNode.next = preNode;
                preNode = curNode;
                curNode = nextNode;
                nextNode = nextNode.next;
            }
            curNode.next = preNode;
            return curNode;
        }

        public void print(ListNode listNode) {
            print("", listNode);
        }

        private void print(String str, ListNode listNode) {
            ListNode pListNode = listNode;
            System.out.print(str);
            while (pListNode != null) {
                System.out.print(pListNode.val + ", ");
                pListNode = pListNode.next;
            }
            System.out.println();
        }
    }
}
