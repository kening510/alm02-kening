package com.example.tellmyfuture.help;

import com.example.tellmyfuture.request.PersonInfoRequestModel;



public class FortuneCreator {
    public String getResult(PersonInfoRequestModel personInfoRequestModel) {

        if (personInfoRequestModel.getAge() >= 18) {
            return "You will have a hardworking day!";
        } else if (personInfoRequestModel.getAge() < 18 && personInfoRequestModel.getAge() >= 12) {
            return "You will have a playful day!";
        } else if (personInfoRequestModel.getAge() < 12 && personInfoRequestModel.getAge() >= 0) {
            return "You will have a colorful day!";
        } else {
            return "error";
        }
    }
}
