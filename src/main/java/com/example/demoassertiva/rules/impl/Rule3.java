package com.example.demoassertiva.rules.impl;

import com.example.demoassertiva.rules.Rule;
import com.example.demoassertiva.rules.RuleNum;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class Rule3 implements Rule {
    @Override
    public RuleNum getId() {
        return RuleNum.Rule3;
    }

    @Override
    public Pattern getRegex() {
        return Pattern.compile("\\w+z$",Pattern.CASE_INSENSITIVE);
    }

    @Override
    public String execute(String inputWord) {
        return inputWord.toLowerCase().replaceAll("z$","ces");
    }
}
