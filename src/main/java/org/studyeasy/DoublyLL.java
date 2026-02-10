package org.studyeasy;

public class DoublyLL {

    public Node head;
    public Node tail;
    public int size;
    public Node createNode(int rollNo,String name){
        Node node=new Node();
        head=new Node();
        node.rollNo=rollNo;
        node.name=name;
        node.previous=null;
        node.next=null;
        head=node;
        tail=node;
        size=1;
        return node;
    }

    public Node insertNode(int rollNo,String name,int location){
        Node node=new Node();
        node.name=name;
        node.rollNo=rollNo;

        if(location==0){
            node.next=head;
            node.previous=null;
            head.previous=node;
            head=tail;
            size++;
        }
        return node;
    }
    public void reverse(){
        if(head!=null){
            Node temp=tail;
            int index=0;
            while (index<size){
                System.out.print(temp.rollNo+" "+temp.name+" ");
                temp=temp.previous;

                index++;
            }
        }else {
            System.out.println("DLL does not exist");
        }
        System.out.println("\n");
    }

}
