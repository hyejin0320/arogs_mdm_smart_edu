package com.dkitec.mdm.portal.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {
    /**
     * Logger
     */
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    /**
    * Service
     */
    @Autowired
    private MainService mainService;

    @PostMapping("/main")
    public void main(){
        mainService.getNoticeList();
    }
}
