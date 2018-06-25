package io.microsamples.content.contentserver.api;

import io.microsamples.content.contentserver.service.UserService;
import io.microsamples.content.contentserver.view.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DefaultController {

    @Autowired
    private UserService userService;


    @GetMapping("/")
    public List<User> viewHome() {

        return userService.findAllUsers();
    }


}
