package com.example.demoassertiva.controller;

import com.example.demoassertiva.dtos.WordResult;
import com.example.demoassertiva.response.WordsResultResponse;
import com.example.demoassertiva.rules.Rule;
import com.example.demoassertiva.rules.RuleNum;
import com.example.demoassertiva.rules.RulesFactory;
import com.example.demoassertiva.service.GrammarService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;

@RestController
@RequestMapping("/grammar")
public class MainController {
    @Autowired
    private GrammarService grammarService;

    @RequestMapping(value = "/plural" , method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<WordsResultResponse>getPlural(@RequestBody ArrayList<String> words){
        return new ResponseEntity<WordsResultResponse>(grammarService.pluralizador(words),HttpStatus.OK);
    }
}
