package com.example.demoassertiva.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;

@SuperBuilder
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WordsResultResponse {
    @JsonProperty("palabras")
    private ArrayList<String> wordsResult;
    @JsonProperty("palabrasPorRegla")
    private ArrayList<Integer> rulesExecuted;
}
