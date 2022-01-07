package com.dkitec.mdm.portal.main;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainServiceDAO {
    List<NoticeVO> getNotice();
}
