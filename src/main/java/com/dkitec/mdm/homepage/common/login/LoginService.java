package com.dkitec.mdm.homepage.common.login;

import com.dkitec.mdm.homepage.common.login.domain.TokenResponseVO;

public interface LoginService {
    /**
     *  중복 로그인 체크
     */
    TokenResponseVO isDuplicateLogin(String userId);
}
