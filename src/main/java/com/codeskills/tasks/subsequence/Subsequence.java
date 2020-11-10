package com.codeskills.tasks.subsequence;

import java.util.Iterator;
import java.util.List;

public class Subsequence {
    /**
     * Checks if it is possible to get a sequence which is equal to the first
     * one by removing some elements from the second one.
     *
     * @param x first sequence
     * @param y second sequence
     * @return <code>true</code> if possible, otherwise <code>false</code>
     */
    @SuppressWarnings("rawtypes")
    public boolean find(List x, List y) {
        // TODO: Implement the logic here

        //int gefunden = 0;
        int i = 0;

        if (x == null || y == null) {
            throw new IllegalArgumentException("List cannot be null!");
        }


        if (x.isEmpty() == true)
                return true;

        if (x.size() > y.size())
            return false;

       for (Object oneY : y) {

           System.out.println("Aktuell Y ist : " + oneY);
           if (oneY.equals(x.get(i))){

                if (i < x.size() -1) {
                   System.out.println("gefunden " + x.get(i) + " at: " + i);
                   i++;
                }

               if (i == x.size()-1){
                   System.out.println("letzter gefunden " + x.get(i) + " at: " + i);
                   return true;
               }

           }
           System.out.println("=====================");
        }

        return false;
    }
}
