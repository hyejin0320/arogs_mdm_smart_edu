package com.dkitec.mdm.homepage.common.login;

public interface TokenService {
    boolean isExpired(String token);
}
