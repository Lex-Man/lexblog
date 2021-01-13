package com.lexusmanson.lexblog.restController;

import com.lexusmanson.lexblog.service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/publish")
public class PublishController {

    @Autowired
    ManagementService managementService;

    @PostMapping("")
    public String publish(@RequestHeader int id, @RequestHeader String date){
        managementService.publishArticle(id, date);
        return "blah";
    }


}
