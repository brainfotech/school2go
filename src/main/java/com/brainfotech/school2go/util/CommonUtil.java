package com.brainfotech.school2go.util;


import org.springframework.security.crypto.codec.Base64;

/**
 * Created by thameema on 4/27/14.
 */
public class CommonUtil {

    public static String getUserFromAuthHeader(String authHeader) {
        String user = decodeBase64(authHeader.split("Basic ")[1]).split(":")[0];
        return user;

    }

    public static String decodeBase64(String base64String) {
        return new String(Base64.decode(base64String.getBytes()));
    }
}
