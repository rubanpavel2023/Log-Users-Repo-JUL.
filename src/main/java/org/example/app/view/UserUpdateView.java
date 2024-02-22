package org.example.app.view;

import java.util.Scanner;

public class UserUpdateView {

    public String[] getData() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user's ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter new phone in format xxx xxxxxxx: ");
        String phone = scanner.nextLine();

        System.out.print("Enter new email: ");
        String email = scanner.nextLine();

        return new String[] {id, phone, email};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}