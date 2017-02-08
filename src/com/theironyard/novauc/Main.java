package com.theironyard.novauc;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Message m = new Message("A", false, false, 0, 'a');
    Message m2 = new Message("B", false, false, 0, 'b');

    m.setText("New message");
    System.out.println("1) " + m.getText());
    System.out.println("2) " + m2.getText());

    m.setText("");
    System.out.println("3) " + m.getText());
    }
}
