package com.sandy.bookstoreangular.domain.security;

import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;

public class Authority implements GrantedAuthority, Serializable {

    private static final long serialVerisonUId = 123123L;

    private final String authority;

    public Authority(String authority) {
        this.authority = authority;
    }


    @Override
    public String getAuthority() {
        return null;
    }
}
