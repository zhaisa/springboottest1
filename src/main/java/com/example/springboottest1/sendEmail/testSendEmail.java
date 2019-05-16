package com.example.springboottest1.sendEmail;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/email")
public class testSendEmail {


    @RequestMapping(value = "/sendEmail")
    @ResponseBody
    public void sendEmail(){

        SendMailUtil.sendCommonMail("xxxxxxx.com","测试","希望");
    }
}
