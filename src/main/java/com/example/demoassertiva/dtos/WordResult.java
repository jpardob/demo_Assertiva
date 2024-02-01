package com.example.demoassertiva.dtos;

import com.example.demoassertiva.rules.RuleNum;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class WordResult {
    private String result;
    private RuleNum rule;
}
