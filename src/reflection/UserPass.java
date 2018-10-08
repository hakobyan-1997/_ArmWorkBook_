package com.company;

public enum UserPass {
    USER_PASS("admin");

    UserPass(String password) {
        this.password = password;
    }
    private final String password;

    public String getPassword() {
        return password;
    }
}
