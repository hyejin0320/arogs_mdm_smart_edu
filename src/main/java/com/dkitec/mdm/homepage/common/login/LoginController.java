package com.dkitec.mdm.homepage.common.login;

import com.dkitec.mdm.homepage.common.login.domain.TokenResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    /**
     *  중복 로그인 체크
     */
    @GetMapping("/duliction/{userId}")
    public TokenResponseVO duplicateLoginCheck(@PathVariable String userId){
        return loginService.isDuplicateLogin(userId);
    }

}
