//链表插入一个数
public static void main(String[] args) {
        Node n1 = new Node();
        Node n3 = new Node();
        Node n2 = new Node();
        Node n6 = new Node();

        n1.val = 1;
        n3.val = 3;
        n2.val = 2;
        n6.val = 6;

        n1.next = n3;
        n3.next = n2;
        n2.next = n6;
        n6.next = null;

        Node prev = n3;
        Node n100 = new Node();
        n100.val = 100;
        n100.next = prev.next;
        prev.next = n100;

        Node cur = n1;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
