package com.scott.dev.mybatispractise.entity;

public class Account {

    private long accountId;
    private String name;
    private String password;

    public Account() {}

    public Account(long accountId, String name, String password) {
        this.accountId = accountId;
        this.name = name;
        this.password = password;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account [accountId=" + accountId + ", name=" + name + ", password=" + password + "]";
    }

}
