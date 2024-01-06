package org.example;

public class WordPlay {
    public boolean isVowel(char ch) {
        int asciiValue = (int) ch;
        if (asciiValue == 97 || asciiValue == 101 || asciiValue == 117 || asciiValue == 105) {
            return true;
        }
        if (asciiValue == 65 || asciiValue == 69 || asciiValue == 85 || asciiValue == 73) {
            return true;
        }
        return false;
    }

    public String replaceVowels(String phrase, char ch) {
        for (int i = 0; i < phrase.length() - 1; i++) {
            if (isVowel(phrase.charAt(i))) {
                phrase = phrase.replace(phrase.charAt(i), ch);
            }
        }
        return phrase;
    }

    public String emphasize(String phrase, char ch) {
        char[] charArray = phrase.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == ch) {
                if (i % 2 == 0) {

                    charArray[i] = '*';
                } else {
                    charArray[i] = '+';
                }
            }
        }
        String manuallyReplacedString = new String(charArray);
        return manuallyReplacedString;
    }

    public static void main(String[] args) {
        WordPlay wordPlay = new WordPlay();
        System.out.println(wordPlay.emphasize("dna ctgaaactga", 'a'));


    }
}
