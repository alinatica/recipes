package ro.digitalnation.recipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homepage {

    @GetMapping(path = {"/", "/home"})
    public String getHomepage() {
        return "";
    }
}
