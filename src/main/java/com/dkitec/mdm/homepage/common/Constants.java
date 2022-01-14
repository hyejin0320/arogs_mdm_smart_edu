package com.dkitec.mdm.homepage.common;

public class Constants {
    public static final String SUCCESS = "success";
    public static final String UTF8 = "UTF-8";

    /**
     * 로그인 토큰 관련
     */
    public static class Token {
        public static final String ISSUER = "argos_mdm_mas_api"; // 토큰 발급자
        public static final String SUBJECT = "subject"; // 토큰에 담길 내용
        public static final String SECRET_KEY = "secretKey"; // 암호화를 위한 비밀키
        public static final String REMOVED_TOKEN_VALUE = "removed"; // 로그아웃 등으로 삭제된 토큰값
    }
}

