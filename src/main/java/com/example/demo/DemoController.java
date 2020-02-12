package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/demo")
public class DemoController {

    private DemoService demoService;

    private String dataFolderPath;

    public DemoController(DemoService demoService,
                          @Value("demo.data.folder") String dataFolderPath) {

        this.demoService = demoService;
        this.dataFolderPath = dataFolderPath;
    }

    @GetMapping
    public String getDemo() {
        return demoService.getString();
    }
}
