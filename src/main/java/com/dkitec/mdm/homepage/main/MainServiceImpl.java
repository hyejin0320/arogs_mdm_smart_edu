package com.dkitec.mdm.homepage.main;

import com.dkitec.mdm.homepage.common.domain.NoticeVO;
import com.dkitec.mdm.homepage.common.domain.QnaVO;
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
        return mainServiceDAO.getNotice();
    }

    @Override
    public List<QnaVO> getQnaList() {
        return mainServiceDAO.getQna();
    }
}
