package com.dkitec.mdm.homepage.support.qna;

import com.dkitec.mdm.homepage.common.domain.QnaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QnaServiceImpl implements QnaService{

    @Autowired
    QnaServiceDAO qnaServiceDAO;


    @Override
    public List<QnaVO> getAllQnaList(QnaVO qnaVO) {
        return qnaServiceDAO.getAllQnaList(qnaVO);
    }
    @Override
    public List<QnaVO> getQnaList(QnaVO qnaVO) {
        return qnaServiceDAO.getQnaList(qnaVO);
    }

    @Override
    public QnaVO getQnaDetail(QnaVO qnaVO) {
        return qnaServiceDAO.getQnaDetail(qnaVO);
    }

    @Override
    public int insertQna(QnaVO qnaVO) {
        return qnaServiceDAO.insertQna(qnaVO);
    }

    @Override
    public int updateQna(QnaVO qnaVO) {
        return qnaServiceDAO.updateQna(qnaVO);
    }

    @Override
    public int removeQna(int questNo) {
        return qnaServiceDAO.removeQna(questNo);
    }

    @Override
    public Boolean confirmPassword(QnaVO qnaVO) {
        return qnaServiceDAO.confirmPassword(qnaVO);
    }
}
