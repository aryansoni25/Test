package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        DoublyLL dl=new DoublyLL();
        dl.createNode(101,"Aryan");
        dl.insertNode(102,"Aishwary",0);
        dl.reverse();
    }
}