package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        DoublyLL dl=new DoublyLL();
        dl.createNode(101,"Aryan");
        dl.insertNode(102,"Aishwary",1);
        dl.insertNode(104,"Ayush",3);
        dl.insertNode(105,"Keshav",4);
        dl.insertNode(104,"Prem",5);
        dl.insertNode(105,"varun",6);
        dl.reverse();
    }
}