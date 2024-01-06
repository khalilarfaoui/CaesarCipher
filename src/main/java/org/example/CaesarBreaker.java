package org.example;

import java.util.Arrays;

public class CaesarBreaker {
    public int maxIndex(int[] vals) {
        int maxDex = 0;
        for (int k = 0; k < vals.length; k++) {
            if (vals[k] > vals[maxDex]) {
                maxDex = k;
            }
        }
        return maxDex;
    }

    public int[] countLetters(String message) {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        int[] counts = new int[26];
        for (int k = 0; k < message.length(); k++) {
            char ch = Character.toLowerCase(message.charAt(k));
            int dex = alph.indexOf(ch);
            if (dex != -1) {
                counts[dex] += 1;
            }
        }
        return counts;
    }

    public void decrypttwo(String encrypted) {
        CaesarCipher caesarCipher = new CaesarCipher();
        for (int i = 1 ; i<26 ; i ++){
            for (int j = 1 ; j<26 ; j ++) {
                System.out.println(caesarCipher.encryptTwoKeys(encrypted, 26 - i, 26 - j));
            }
        }


    }

    public String decrypt(String encrypted) {
        CaesarCipher caesarCipher = new CaesarCipher();
        /*int[] freqs = countLetters(encrypted);
        int maxDex = maxIndex(freqs);
        int dkey = maxDex - 4;
        if (maxDex < 4) {
            dkey = 26 - (4 - maxDex);
        }
        System.out.println(dkey);*/
        return caesarCipher.encrypt(encrypted, 26 - 23);
    }

    public static void main(String[] args) {
        CaesarBreaker caesarBreaker = new CaesarBreaker();

        caesarBreaker.decrypttwo("Aal uttx hm aal Qtct Fhljha pl Wbdl. Pvxvxlx!");


    }
}
