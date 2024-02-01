package com.example.demoassertiva.rules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

@Component
public class RulesFactory {
    private EnumMap<RuleNum, Rule> rules;
    @Autowired
    public RulesFactory(Set<Rule> rulesSet){
        createRules(rulesSet);
    }
    private void createRules(Set<Rule> rulesSet){
        rules = new EnumMap<>(RuleNum.class);
        rulesSet.forEach(
                rule -> rules.put(rule.getId(),rule)
        );
    }
    public Rule findRule(String word){
        List<Rule> matchingRules=new ArrayList<Rule>();
        rules.forEach((num,rule)-> {
            if(rules.get(num).getRegex().matcher(word).matches()){
            matchingRules.add(rule);
        }});
        if(!matchingRules.isEmpty()){
            return matchingRules.get(0);
        }
        return null;
    }
}

