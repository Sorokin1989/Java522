package homeWork_27;


class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}

class MyLinkedList {
    Node head;

    public void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(value);
        }
    }

    public void addStart(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public boolean isEmpty() {       //    public boolean isEmpty()   [] => true
        return head == null;
    }

    public int size() {       // public int size()
        int count = 0;
        Node node = head;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;

    }

    public boolean contains(int value) {//public boolean contains(int value)  10,20,10,20,30 => 10 => true
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public int removeByFirstValue(int value) {
        if (head == null || head.value != value) return -1;
        head = head.next;
        return value;
    }

    public int removeByAllValue(int value) { // public int removeByAllValue(int value)   10,20,10,20,30 => 10 => 20,20,30
        if (head == null) return -1;
        while (head != null && head.value == value) {
            head = head.next;
        }
        Node node = head;
        while (node != null && node.next != null) {
            if (node.next.value == value) {
                node.next = node.next.next;
            } else node = node.next;
        }
        return value;
    }

    public void addByIndex(int index, int value) {//public void addByIndex(int index, int value)     10,20,10,20,30 =>1, 5 => 10,5,20,10,20,30

        if (index < 0) {
            throw new IndexOutOfBoundsException("Индекс не корректен!");
        }
        int count = 0;
        Node node=head;
        while (node!=null) {
            count++;
            node=node.next;
        }
        if (index>count) {
            throw new IndexOutOfBoundsException("Индекс некорректен!");
        }

        Node node1=new Node(value);
        if (index==0) {
            node1.next=head;
           head=node1;
           return;
        }
        node=head;
        for (int i = 0; i < index-1; i++) {
            node=node.next;
        }
        node1.next=node.next;
        node.next=node1;

    }

    public void print() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }
}


public class HomeWork_27 {
    public static void main(String[] args) {
        //    public boolean isEmpty()                         [] => true
//    public int size()
//    public boolean contains(int value)               10,20,10,20,30 => 10 => true
//    public int removeByFirstValue(int value)         10,20,10,20,30 => 10 => 20,10,20,30
//    public int removeByAllValue(int value)           10,20,10,20,30 => 10 => 20,20,30
//    public void addByIndex(int index, int value)     10,20,10,20,30 =>1, 5 => 10,5,20,10,20,30


        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.add(40);
        myLinkedList.add(50);
        myLinkedList.add(60);
        myLinkedList.add(70);
//        myLinkedList.add(80);
//        myLinkedList.addStart(100);
//        myLinkedList.addStart(101);
        System.out.println(myLinkedList.isEmpty());
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.contains(20));
        // System.out.println(myLinkedList.removeByFirstValue(10));
        System.out.println(myLinkedList.removeByAllValue(10));
        myLinkedList.addByIndex(3,100);
        myLinkedList.print();


    }
}
