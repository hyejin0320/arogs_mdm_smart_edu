package com.dkitec.mdm.homepage.common.login;

import com.dkitec.mdm.homepage.common.annotation.Mapper;
import com.dkitec.mdm.homepage.common.login.domain.TokenResponseVO;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginDAO {
    String getUserToken(@Param("userId") String userId);
}
