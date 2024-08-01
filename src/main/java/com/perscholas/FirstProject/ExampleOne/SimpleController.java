package com.perscholas.FirstProject.ExampleOne;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SimpleController {
        public String index() {

            return "index.html";

        }
}