package org.example.app.view;

import java.util.Scanner;

public class UserDeleteView {

    public String[] getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user's ID: ");
        String id = scanner.nextLine();
        return new String[] {id};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}