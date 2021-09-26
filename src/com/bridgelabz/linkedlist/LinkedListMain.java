package com.bridgelabz.linkedlist;
/**
 * Purpose : We have to append 30 and 70 to 56.
 * @author Utkarsh Mishra
 * @since 2021/09/26
 */
import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to linkedList DataStructure Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start");
        System.out.println("Enter 2 to add the data at the end");
        switch (scanner.nextInt()) {
            case 1:
                Operations.addDataAtStart();
                break;
            case 2:
                Operations.addDataAtEnd();
                break;
        }
    }
}
