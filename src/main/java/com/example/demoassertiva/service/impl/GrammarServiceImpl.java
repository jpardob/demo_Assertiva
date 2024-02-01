package com.example.demoassertiva.service.impl;

import com.example.demoassertiva.dtos.WordResult;
import com.example.demoassertiva.response.WordsResultResponse;
import com.example.demoassertiva.rules.Rule;
import com.example.demoassertiva.rules.RulesFactory;
import com.example.demoassertiva.service.GrammarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class GrammarServiceImpl implements GrammarService {

    @Autowired
    private RulesFactory rulesFactory;

    @Override
    public WordResult getPlural(String word) {
        Rule rule = rulesFactory.findRule(word);
        return WordResult.builder()
                .result(rule.execute(word))
                .rule(rule.getId())
                .build();
    }

    @Override
    public WordsResultResponse pluralizador(ArrayList<String> words) {
        ArrayList<WordResult> results = new ArrayList<>();
        words.forEach(word-> {
            results.add(getPlural(word));
        });
        ArrayList<String> resultWords = new ArrayList<String>();
        ArrayList<Integer> ruleExecuted = new ArrayList<>(Collections.nCopies(4, 0));
        results.forEach(result->{
            Integer rn = result.getRule().getValue();
            resultWords.add(result.getResult());
            ruleExecuted.set(rn,ruleExecuted.get(rn)+1);
        });
        return WordsResultResponse.builder().wordsResult(resultWords).rulesExecuted(ruleExecuted).build();
    }
}
