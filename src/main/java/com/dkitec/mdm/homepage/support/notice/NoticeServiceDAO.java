package com.dkitec.mdm.homepage.support.notice;

import com.dkitec.mdm.homepage.common.annotation.Mapper;
import com.dkitec.mdm.homepage.common.domain.NoticeVO;

@Mapper
public interface NoticeServiceDAO {
    NoticeVO getNoticeDetail(int noticeNo);
}
