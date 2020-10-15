package com.wusd.security.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    private int id;
    @NotNull
    @Size(min = 2, max = 3, message = "{username.size}")
    private String username;
    @NotNull
    @Size(min = 4, max = 5, message = "{password.size}")
    private String password;

    public User() {
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
