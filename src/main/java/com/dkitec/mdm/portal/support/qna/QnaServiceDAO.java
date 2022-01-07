package com.dkitec.mdm.portal.support.qna;

import com.dkitec.mdm.portal.common.annotation.Mapper;
import com.dkitec.mdm.portal.domain.QnaVO;
import com.dkitec.mdm.portal.domain.ResultVO;

import java.util.List;

@Mapper
public interface QnaServiceDAO {
    List<QnaVO> getQnaList();

    int insertQna(QnaVO qnaVO);
}
