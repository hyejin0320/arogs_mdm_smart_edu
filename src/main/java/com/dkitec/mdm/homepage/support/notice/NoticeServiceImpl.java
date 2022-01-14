package com.dkitec.mdm.homepage.support.notice;

import com.dkitec.mdm.homepage.common.domain.NoticeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    NoticeServiceDAO noticeServiceDAO;

    @Override
    public NoticeVO getNoticeDetail(int noticeNo) {
        return noticeServiceDAO.getNoticeDetail(noticeNo);
    }
}
