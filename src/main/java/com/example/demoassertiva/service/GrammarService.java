package com.example.demoassertiva.service;

import com.example.demoassertiva.dtos.WordResult;
import com.example.demoassertiva.response.WordsResultResponse;

import java.util.ArrayList;

public interface GrammarService {

    public WordResult getPlural(String word);
    public WordsResultResponse pluralizador(ArrayList<String> words);
}
