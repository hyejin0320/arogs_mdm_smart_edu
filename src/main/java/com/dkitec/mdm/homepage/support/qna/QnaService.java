package com.dkitec.mdm.homepage.support.qna;

import com.dkitec.mdm.homepage.common.domain.QnaVO;

import java.util.List;

public interface QnaService {
    List<QnaVO> getAllQnaList(QnaVO qnaVO);

    List<QnaVO> getQnaList(QnaVO qnaVO);

    QnaVO getQnaDetail(QnaVO qnaVO);

    int insertQna(QnaVO qnaVO);

    int updateQna(QnaVO qnaVO);

    int removeQna(int qeustNo);

    Boolean confirmPassword(QnaVO qnaVO);
}
