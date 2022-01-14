package com.dkitec.mdm.homepage.main;

import com.dkitec.mdm.homepage.common.domain.NoticeVO;
import com.dkitec.mdm.homepage.common.domain.QnaVO;

import java.util.List;

public interface MainService {
    List<NoticeVO> getNoticeList();

    List<QnaVO> getQnaList();
}
