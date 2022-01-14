package com.dkitec.mdm.homepage.common.login;

import com.dkitec.mdm.homepage.common.Constants;
import com.dkitec.mdm.homepage.common.login.domain.TokenResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginDAO loginDAO;

    @Autowired
    private TokenService tokenService;

    @Override
    public TokenResponseVO isDuplicateLogin(String userId) {
        TokenResponseVO response = new TokenResponseVO();

        response.setValid(!isDuplicate(userId));


        return null;
    }


    /**
     * 중복 여부 확인
     */
    private boolean isDuplicate(String userId) {
        String sessionToken = loginDAO.getUserToken(userId);

        if (sessionToken == null) {return false;}

        if (Constants.Token.REMOVED_TOKEN_VALUE.equalsIgnoreCase(sessionToken)) {
            return false;
        }

        if(tokenService.isExpired(sessionToken)){
            return false;
        }
        return true;
    }
}
