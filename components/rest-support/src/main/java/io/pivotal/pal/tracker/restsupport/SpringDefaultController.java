package io.pivotal.pal.tracker.restsupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDefaultController {

    @Autowired
    private String configServerProvidedValue;

    @GetMapping("/")
    public String defaultRoute() {
        return "Noop!";
    }

    @GetMapping("/configDemo")
    public String configDemo(){
        return configServerProvidedValue;
    }
}
