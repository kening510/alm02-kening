package com.example.tellmyfuture.controller;

import com.example.tellmyfuture.help.FortuneCreator;
import com.example.tellmyfuture.request.PersonInfoRequestModel;
import com.example.tellmyfuture.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class PersonController {
    private PersonService personService;

//    @Autowired
//    public PersonController() {
//    }

    @GetMapping("/index")
    public String showHomepage(Model theModel) {
        PersonInfoRequestModel personInfoRequestModel = new PersonInfoRequestModel();
        theModel.addAttribute("personInfo", personInfoRequestModel);

        return "homePage";
    }

    @PostMapping("/getyourfuture")
    public String showResult(@ModelAttribute("personInfo") PersonInfoRequestModel personInfoRequestModel, Model theModel) {
        FortuneCreator fortuneCreator = new FortuneCreator();
        if (personInfoRequestModel != null) {
            String message = fortuneCreator.getResult(personInfoRequestModel);
            if (message.equalsIgnoreCase("error")) {
                return "error";
            }
            theModel.addAttribute("future", message);
        }
        return "result";
    }
}
