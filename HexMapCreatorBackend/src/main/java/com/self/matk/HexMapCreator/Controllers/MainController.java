package com.self.matk.HexMapCreator.Controllers;

import com.self.matk.HexMapCreator.Services.*;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    AccountService accountService;
    HexNodesService hexNodesService;
    MapsService mapsService;
    TagListService tagListService;
    TagsService tagsService;

    @Autowired
    public MainController(  AccountService accountService,
                            HexNodesService hexNodesService,
                            MapsService mapsService,
                            TagListService tagListService,
                            TagsService tagsService
                         )
    {
        this.accountService = accountService;
        this.hexNodesService = hexNodesService;
        this.mapsService = mapsService;
        this.tagListService = tagListService;
        this.tagsService = tagsService;
    }

    @GetMapping(value = "/")
    public ResponseEntity mainPage(){
        return ResponseEntity.status(HttpStatus.OK).body("Hello World!");
    }

    @GetMapping(value = "/test")
    public ResponseEntity testPage(){
        return ResponseEntity.status(HttpStatus.OK).body("This is a test!");
    }

}
