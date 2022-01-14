package com.dkitec.mdm.homepage.common.login;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.dkitec.mdm.homepage.common.Constants;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService{

    @Override
    public boolean isExpired(String token) {
        try{
            Algorithm algorithm = Algorithm.HMAC256(Constants.Token.SECRET_KEY);
            JWTVerifier verifier = JWT.require(algorithm).withIssuer(Constants.Token.ISSUER).build();
            DecodedJWT jwt = verifier.verify(token);

            if (jwt != null) {
                String issuer = jwt.getIssuer();
                String audience = jwt.getAudience().get(0);
                String userName = jwt.getClaim("userName").asString();

                return false;
            } else {
                return true;
            }
        }catch(JWTDecodeException e){
            return true;
        }catch(TokenExpiredException e){
            return true;
        }

    }
}
