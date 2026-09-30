package nusatrip.demorailway.controller;

import nusatrip.demorailway.entity.Content;
import nusatrip.demorailway.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final DataService dataService;

    @Autowired
    public MainController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/hello")
    public String getStatus(){
        return "Hello World";
    }

    @GetMapping("/contents")
    public List<Content> getAllContents() {
        return dataService.getAllContent();
    }
}
