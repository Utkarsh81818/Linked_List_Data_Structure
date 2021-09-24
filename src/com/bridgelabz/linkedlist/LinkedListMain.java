package com.bridgelabz.linkedlist;
/**
 * Purpose : We have to push data at starting.
 * @author Utkarsh Mishra
 * @since 2021/09/24
 */
import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to linkedList DataStructure Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start");
        switch (scanner.nextInt()) {
            case 1:
                Operations.addDataAtStart();
        }
    }
}
