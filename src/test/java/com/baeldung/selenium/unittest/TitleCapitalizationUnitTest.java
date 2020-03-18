package com.baeldung.selenium.unittest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.baeldung.common.Utils;
import com.baeldung.site.strategy.ITitleAnalyzerStrategy;

public class TitleCapitalizationUnitTest {

    @Test
    void givenATitleHavingItalicAndUpperCaseJavaMethodName_WhenTitleAnalysed_thenItIsNotValid() {
        String title = "4.1. The Let() Method";
        List<String> tokens = Utils.titleTokenizer(title);
        List<String> emTokens = Arrays.asList(new String[] { "Let()" });

        assertFalse(ITitleAnalyzerStrategy.javaMethodNameAnalyserStrategy().isTitleValid(title, tokens, emTokens));

    }

    @Test
    void givenATitleHavingUpperCaseJavaMethodName_WhenTitleAnalysed_thenItIsNotValid() {
        String title = "4.1. The Let() Method";
        List<String> tokens = Utils.titleTokenizer(title);
        List<String> emTokens = new ArrayList<>();

        assertFalse(ITitleAnalyzerStrategy.javaMethodNameAnalyserStrategy().isTitleValid(title, tokens, emTokens));

    }

    @Test
    void givenATitleHavingJavaMethodName_WhenTitleAnalysed_thenItIsValid() {
        String title = "4.1. The let() Method";
        List<String> tokens = Utils.titleTokenizer(title);
        List<String> emTokens = new ArrayList<>();

        assertTrue(ITitleAnalyzerStrategy.javaMethodNameAnalyserStrategy().isTitleValid(title, tokens, emTokens));

    }

    @Test
    void givenATitleHavingLowerCaseShortPrepositionAtTheEnd_WhenTitleAnalysed_thenItIsNotValid() {
        String title = "@CrossOrigin on";
        List<String> tokens = Utils.titleTokenizer(title);
        List<String> emTokens = new ArrayList<>();

        assertFalse(ITitleAnalyzerStrategy.articlesConjunctionsShortPrepositionsAnalyserStrategy().isTitleValid(title, tokens, emTokens));

    }

}
