package pl.jarugalucas.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// a different, shorter way to use @RequestMapping :) . Remember to put empty "" in @RequestMapping below
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(){

        return "owners/index";
    }
}
