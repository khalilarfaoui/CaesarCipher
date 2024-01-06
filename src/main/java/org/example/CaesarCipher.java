package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CaesarCipher {
    public String encrypt(String input, int key) {
        StringBuilder encrypt = new StringBuilder(input.toUpperCase());
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String crypt = alphabet.substring(key) + alphabet.substring(0, key);
        for (int i = 0; i < encrypt.length(); i++) {
            char currChar = encrypt.charAt(i);
            int idx = alphabet.indexOf(currChar);
            if (idx != -1) {
                char newChar = crypt.charAt(idx);
                encrypt.setCharAt(i, newChar);
            }
        }
        return encrypt.toString().toLowerCase();
    }

    public String encryptTwoKeys(String input, int key1, int key2) {
        StringBuilder encrypt = new StringBuilder(input.toUpperCase());
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cryptFirstKey = alphabet.substring(key1) + alphabet.substring(0, key1);
        String cryptSecondeKey = alphabet.substring(key2) + alphabet.substring(0, key2);
        for (int i = 0; i < encrypt.length(); i++) {
            char currChar = encrypt.charAt(i);
            int idx = alphabet.indexOf(currChar);
            if (idx != -1) {
                if (i % 2 == 0) {
                    char newChar = cryptFirstKey.charAt(idx);
                    encrypt.setCharAt(i, newChar);
                } else {
                    char newChar = cryptSecondeKey.charAt(idx);
                    encrypt.setCharAt(i, newChar);
                }

            }
        }
        return encrypt.toString().toLowerCase();
    }

    public String readFileAndEncrypt(int key, String fileName) {
        String filePath = "C:\\Users\\khalil\\Desktop\\formation-java\\3-coursera\\2-Array-List-datastructure\\" + fileName + ".txt";

        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            System.out.println(content.toString());
            System.out.println();
            System.out.println(encrypt(content.toString(), key));
            return encrypt(content.toString(), key);
        } catch (IOException e) {
            e.printStackTrace();
            return "Something does wrong";
        }
    }

    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        System.out.println(caesarCipher.encryptTwoKeys("Can you imagine life WITHOUT the internet AND computers in your pocket?", 21 , 8 ));


    }
}
