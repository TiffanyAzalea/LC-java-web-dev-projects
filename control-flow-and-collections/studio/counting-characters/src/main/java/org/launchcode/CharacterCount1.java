package org.launchcode;


import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CharacterCount1 {
    public CharacterCount1() {
    }

    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charArray = quote.toCharArray();
        HashMap<Character, Integer> counts = new HashMap();
        char[] var4 = charArray;
        int var5 = charArray.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            char letter = var4[var6];
            if (counts.containsKey(letter)) {
                counts.put(letter, (Integer)counts.get(letter) + 1);
            } else {
                counts.put(letter, 1);
            }
        }

        Iterator var8 = counts.entrySet().iterator();

        while(var8.hasNext()) {
            Map.Entry<Character, Integer> count = (Map.Entry)var8.next();
            PrintStream var10000 = System.out;
            Object var10001 = count.getKey();
            var10000.println("" + var10001 + ": " + count.getValue());
        }

    }
}