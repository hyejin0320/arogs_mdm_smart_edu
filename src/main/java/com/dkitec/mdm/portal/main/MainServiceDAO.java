package com.dkitec.mdm.portal.main;

import com.dkitec.mdm.portal.common.annotation.Mapper;
import com.dkitec.mdm.portal.domain.NoticeVO;
import com.dkitec.mdm.portal.domain.QnaVO;

import java.util.List;

@Mapper
public interface MainServiceDAO {
    List<NoticeVO> getNotice();

    List<QnaVO> getQna();
}
