package com.tim.financialplatform.controller;



import com.tim.financialplatform.dto.UserBindDTO;
import com.tim.financialplatform.service.UserBindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bind")
public class UserBindController {

    @Autowired
    UserBindService userBindService;

    @PostMapping("/user")
    public void bindUser(UserBindDTO userBindDTO) {
        //filter request..
        // access issue resolving stuf
        userBindService.commitUserBind(userBindDTO);
    }
}
