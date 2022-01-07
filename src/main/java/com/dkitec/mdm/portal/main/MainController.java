package com.dkitec.mdm.portal.main;

import com.dkitec.mdm.portal.domain.NoticeVO;
import com.dkitec.mdm.portal.domain.QnaVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @PostMapping("/notice")
    public List<NoticeVO> getNoticeList(){
        return mainService.getNoticeList();
    }

    @PostMapping("/qna")
    public List<QnaVO> getQnaList(){
        return mainService.getQnaList();
    }
}
