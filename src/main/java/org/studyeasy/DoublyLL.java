package org.studyeasy;

public class DoublyLL {

    public Node head;
    public Node tail;
    public int size;

    public Node createNode(int rollNo, String name) {
        Node node = new Node();
        node.rollNo = rollNo;
        node.name = name;
        node.previous = null;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return node;
    }

    public Node insertNode(int rollNo, String name, int location) {
        Node node = new Node();
        node.rollNo = rollNo;
        node.name = name;

        if (head == null) {
            return createNode(rollNo, name);
        } else if (location == 0) {
            node.next = head;
            node.previous = null;
            head.previous = node;
            head = node;
        } else if (location >= size) {
            node.next = null;
            node.previous = tail;
            tail.next = node;
            tail = node;
        } else {
            Node temp = head;
            int index = 0;
            while (index < location - 1) {
                temp = temp.next;
                index++;
            }
            node.next = temp.next;
            node.previous = temp;
            temp.next.previous = node;
            temp.next = node;
        }
        size++;
        return node;
    }

    public void reverse() {
        if (head != null) {
            Node temp = tail;
            while (temp != null) {
                System.out.print(temp.rollNo + " " + temp.name + " ");
                temp = temp.previous;
            }
        } else {
            System.out.println("DLL does not exist");
        }
        System.out.println("\n");
    }
}
