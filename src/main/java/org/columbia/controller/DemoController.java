package org.columbia.controller;

import org.columbia.dto.PokemonDto;
import org.columbia.dto.TextDto;
import org.columbia.entity.TextEntity;
import org.columbia.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.awt.Desktop;
import java.util.UUID;
import java.net.URI;

@Controller
@RequestMapping("api")
public class DemoController {

    /**
     * Spring controllers! opening development branch ...
     */

    @Autowired
    DemoService demoService;
    @RequestMapping(value = "/bulbasaur", method = RequestMethod.GET)
    @ResponseBody

   public ResponseEntity<?>getGreeting(){return new ResponseEntity<>("",HttpStatus.OK);}



  }



