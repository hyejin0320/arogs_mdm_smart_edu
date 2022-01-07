package com.dkitec.mdm.portal.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl implements MainService{
    /**
     * Logger
     */
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    /**
     * Service
     */
    @Autowired
    private MainServiceDAO mainServiceDAO;


    @Override
    public List<NoticeVO> getNoticeList() {
        List<NoticeVO> test = mainServiceDAO.getNotice();
        return mainServiceDAO.getNotice();
    }
}
