package Spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * 2016-10-24 11:04
 */


@Controller
@RequestMapping({"/", "homepage"})
public class HomeController {
    @RequestMapping(method= GET)
    public String home() {
        return "home";
    }
}
