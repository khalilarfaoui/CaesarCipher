package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class WordLengths {

    public StringBuilder cleanWord(String word) {
        StringBuilder newWord = new StringBuilder();
        if(!Character.isAlphabetic(word.charAt(0))){
            newWord.append(word.substring(1));
        }
         if(!Character.isAlphabetic(word.charAt(word.length()-1))){
            newWord.append(word.substring(0 , word.length()-1));
        }
         if(Character.isAlphabetic(word.charAt(0)) && Character.isAlphabetic(word.charAt(word.length()-1))){
             newWord.append(word);
         }

        return newWord;
    }

    public void countWordLengths(String filename) {
        int[] counts = new int[31] ;
        String filePath = "C:\\Users\\khalil\\Desktop\\formation-java\\3-coursera\\2-Array-List-datastructure\\" + filename + ".txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if(line.length()>0){

                    String[] words = line.split("\\s+");
                    System.out.println(words[0]);

                    for (String word : words) {
                        System.out.println(cleanWord(word));
                        counts[cleanWord(word).length()]++;


                    }
                    for (int k = 1; k < counts.length; k++) {
                        System.out.println(counts[k] + "  mots de longueur  " + k);
                    }
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        WordLengths wordLengths = new WordLengths();
        wordLengths.countWordLengths("data");


    }
}
