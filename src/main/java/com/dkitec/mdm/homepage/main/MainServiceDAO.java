package com.dkitec.mdm.homepage.main;

import com.dkitec.mdm.homepage.common.annotation.Mapper;
import com.dkitec.mdm.homepage.common.domain.NoticeVO;
import com.dkitec.mdm.homepage.common.domain.QnaVO;

import java.util.List;

@Mapper
public interface MainServiceDAO {
    List<NoticeVO> getNotice();

    List<QnaVO> getQna();
}
