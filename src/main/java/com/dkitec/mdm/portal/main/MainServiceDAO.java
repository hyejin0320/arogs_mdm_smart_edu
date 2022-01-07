package com.dkitec.mdm.portal.main;

import com.dkitec.mdm.portal.common.annotation.Mapper;

import java.util.List;

@Mapper
public interface MainServiceDAO {
    List<NoticeVO> getNotice();
}
