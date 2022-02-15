package com.capgemini;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int n = 6;
	    Map<Integer, String> ladder = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            switch (i){
                case 1 -> ladder.put(i,"     *");
                case 2 -> ladder.put(i,"    **");
                case 3 -> ladder.put(i,"   ***");
                case 4 -> ladder.put(i,"  ****");
                case 5 -> ladder.put(i," *****");
                case 6 -> ladder.put(i,"******");
            }
            System.out.println(ladder.get(i));
        }
    }
}
