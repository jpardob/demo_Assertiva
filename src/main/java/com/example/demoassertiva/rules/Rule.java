package com.example.demoassertiva.rules;

import java.util.function.Function;
import java.util.regex.Pattern;

public interface Rule {
    public RuleNum getId();
    public Pattern getRegex();
    public String execute(String inputWord);
}
