package com.thkoeln.hct.backend.hctbackend.controller;

import com.thkoeln.hct.backend.hctbackend.domain.repository.MenschRepository;
import com.thkoeln.hct.backend.hctbackend.entity.Mensch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MenschController {

    @Autowired
    MenschRepository menschRepository;

    @RequestMapping(method = RequestMethod.GET,
            path="mensch",
            produces = MediaType.APPLICATION_JSON_VALUE)
   // public Mensch getMensch(){
    //    return new Mensch();
   // }

  //  List<Mensch> menschList = new ArrayList<Mensch>();

    public List<Mensch> getMensch() {
        List<Mensch> menschList = menschRepository.findAll();
        return menschList;
    }
}