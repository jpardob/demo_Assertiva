package com.example.demoassertiva.rules;

public enum RuleNum {
    Rule1(0),
    Rule2(1),
    Rule3(2),
    Rule4(3);

    private final Integer value;
    RuleNum(Integer index){
        this.value=index;
    }
    public Integer getValue(){
        return value;
    }
}
