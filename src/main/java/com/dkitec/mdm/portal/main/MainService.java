package com.dkitec.mdm.portal.main;

import com.dkitec.mdm.portal.domain.NoticeVO;
import com.dkitec.mdm.portal.domain.QnaVO;

import java.util.List;

public interface MainService {
    List<NoticeVO> getNoticeList();

    List<QnaVO> getQnaList();
}
