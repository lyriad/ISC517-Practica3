package com.isc517.practica3.isc517practica3.Models;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;

@Entity
@EnableAutoConfiguration
public class Form {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Integer questionOne;
    private Integer questionTwo;
    private Integer questionThree;
    private String  questionFour;


    public Form(){

    }

    public Form(Integer questionOne, Integer questionTwo, Integer questionThree, String questionFour) {
        this.questionOne = questionOne;
        this.questionTwo = questionTwo;
        this.questionThree = questionThree;
        this.questionFour = questionFour;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuestionOne() {
        return questionOne;
    }

    public void setQuestionOne(Integer questionOne) {
        this.questionOne = questionOne;
    }

    public Integer getQuestionTwo() {
        return questionTwo;
    }

    public void setQuestionTwo(Integer questionTwo) {
        this.questionTwo = questionTwo;
    }

    public Integer getQuestionThree() {
        return questionThree;
    }

    public void setQuestionThree(Integer questionThree) { 
        this.questionThree = questionThree; 
    }

    public String getQuestionFour() {
        return questionFour;
    }

    public void setQuestionFour(String questionFour) {
        this.questionFour = questionFour;
    }
}
