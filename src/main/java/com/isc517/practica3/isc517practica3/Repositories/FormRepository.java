package com.isc517.practica3.isc517practica3.Repositories;

import com.isc517.practica3.isc517practica3.Models.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FormRepository extends JpaRepository<Form,Long> {
    Form findAllById(Long Id);

    @Query(value = "SELECT sum(questionOne) FROM Form")
    public Long sumQuestionOne();
    @Query(value = "SELECT sum(questionTwo) FROM Form")
    public Long sumQuestionTwo();
    @Query(value = "SELECT sum(questionThree) FROM Form")
    public Long sumQuestionThree();
}
