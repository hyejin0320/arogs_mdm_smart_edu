package com.dkitec.mdm.portal.support.qna;

import com.dkitec.mdm.portal.domain.QnaVO;
import com.dkitec.mdm.portal.domain.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QnaServiceImpl implements QnaService{

    @Autowired
    QnaServiceDAO qnaServiceDAO;

    @Override
    public List<QnaVO> getQnaList() {
        return qnaServiceDAO.getQnaList();
    }

    @Override
    public int insertQna(QnaVO qnaVO) {
        return qnaServiceDAO.insertQna(qnaVO);
    }
}
