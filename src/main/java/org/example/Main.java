package org.example;


public class Main {

    public static String clean(String ch) {
        String result = "";
        for (int k = 0; k < ch.length(); k++) {
            if (Character.isAlphabetic(ch.charAt(k))) {
                result = result + ch.charAt(k);
            } else {
                int i = 0;
                int n = ch.charAt(k) - '0';
                char p = ch.charAt(k - 1);
                while (i < n - 1) {
                    System.out.println(i + " " + n);
                    result = result + p;
                    i++;
                }

            }
        }

        return result;
    }

    public static String decryptMessage(String encryptedMessage) {
        String[] array = encryptedMessage.split(" ");
        String result = "";
        for (String i : array) {
            result = clean(i) + " " + result;
        }
        return result;
    }

    public static void main(String[] args) {
    }
}