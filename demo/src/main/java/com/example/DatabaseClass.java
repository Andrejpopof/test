package com.example;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {

    private static Map<Long,Match> matches = new HashMap<>();


    public static Map<Long,Match> getMatches(){
        return matches;
    }
    
}
