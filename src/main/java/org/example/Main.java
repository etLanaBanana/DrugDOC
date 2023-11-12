package org.example;

import org.example.bootstrap.Application;
import org.apache.commons.codec.digest.HmacUtils;

import static org.apache.commons.codec.digest.HmacAlgorithms.HMAC_SHA_224;

public class Main {
    private static final String secret = "secret";
    public static void main(String[] args) {
        Application.runApplication();

    }
}