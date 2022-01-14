package com.dkitec.mdm.homepage.support.qna;

import com.dkitec.mdm.homepage.common.annotation.Mapper;
import com.dkitec.mdm.homepage.common.domain.QnaVO;

import java.util.List;

@Mapper
public interface QnaServiceDAO {
    List<QnaVO> getAllQnaList(QnaVO qnaVO);

    List<QnaVO> getQnaList(QnaVO qnaVO);

    QnaVO getQnaDetail(QnaVO qnaVO);

    int insertQna(QnaVO qnaVO);

    int updateQna(QnaVO qnaVO);

    int removeQna(int questNo);

    Boolean confirmPassword(QnaVO qnaVO);
}
