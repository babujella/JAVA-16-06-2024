package com.tech.basic;

public class BirthdayMessage {
    public static void main(String[] args) {
        String recipient = "RAMESH"; // Change this to the recipient's name
        String message = generateBirthdayMessage(recipient);
        System.out.println(message);
    }

    public static String generateBirthdayMessage(String recipient) {
        return "Happy Birthday, " + recipient + "! 🎉🎂";
    }
}
