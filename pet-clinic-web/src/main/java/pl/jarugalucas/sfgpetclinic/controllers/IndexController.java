package pl.jarugalucas.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {

        // it'll return index.html if I use Thymeleaf. it's just simple controller to get index page
        return "index";
    }
}