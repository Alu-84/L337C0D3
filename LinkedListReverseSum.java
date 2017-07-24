public class LinkedListReverseSum {

    public static final ListNode LIST_EMPTY = new ListNode(0);

    public static void main(String[] args) {

        ListNode node11 = new ListNode(5);

//        node11.next = node12;
//        node12.next = node13;

        //seconda linked list
        ListNode node21 = new ListNode(5);

//        node21.next = node22;
//        node22.next = node23;

        ListNode results = addTwoNumbers(node11, node21);

        System.out.print(results.val + " " + results.next.val);
    }

    public static ListNode addTwoNumbers(ListNode firstCurrentNode, ListNode secondCurrentNode) {

        ListNode resultNode = null;
        ListNode tmpNode = null;
        int riporto = 0;
        boolean isFirstTime = true;

        while (firstCurrentNode != null || secondCurrentNode != null || riporto > 0) {

            firstCurrentNode = firstCurrentNode == null ? LIST_EMPTY : firstCurrentNode;
            secondCurrentNode = secondCurrentNode == null ? LIST_EMPTY : secondCurrentNode;

            int sum = firstCurrentNode.val + secondCurrentNode.val + riporto;

            riporto = sum / 10;
            sum = sum % 10;

            if (isFirstTime) {
                resultNode = new ListNode(sum);
                tmpNode = resultNode;
            } else {
                tmpNode.next = new ListNode(sum);
                tmpNode = tmpNode.next;
            }

            firstCurrentNode = firstCurrentNode.next;
            secondCurrentNode = secondCurrentNode.next;
            isFirstTime = false;
        }
        return resultNode;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}