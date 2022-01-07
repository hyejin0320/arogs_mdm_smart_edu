package com.dkitec.mdm.portal.support.qna;

import com.dkitec.mdm.portal.domain.QnaVO;
import com.dkitec.mdm.portal.domain.ResultVO;

import java.util.List;

public interface QnaService {
    List<QnaVO> getQnaList();

    int insertQna(QnaVO qnaVO);
}
