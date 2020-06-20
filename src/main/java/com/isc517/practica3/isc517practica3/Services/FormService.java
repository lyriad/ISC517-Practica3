package com.isc517.practica3.isc517practica3.Services;

import com.isc517.practica3.isc517practica3.Models.Form;
import com.isc517.practica3.isc517practica3.Repositories.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class FormService {

    @Autowired
    private FormRepository formRepository;


    @Transactional
    public Form crearForm(Form Form){
        formRepository.save(Form);
        return Form;
    }

    public List<Form> listaForm(){
        return  formRepository.findAll();
    }

    public Long SumQuestionOne (){ return formRepository.sumQuestionOne(); }
    public Long SumQuestionTwo (){ return formRepository.sumQuestionTwo(); }
    public Long SumQuestionThree (){ return formRepository.sumQuestionThree(); }

}
