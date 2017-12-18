package com.tahirietrit.api.model;

import org.json.JSONObject;

/**
 * Created by macb on 15/12/17.
 */

public class User {

    String userId;
    String emri;
    String username;

    public User(JSONObject jsonObject) {
        userId = jsonObject.optString("UserID");
        emri = jsonObject.optString("Emri");
        username = jsonObject.optString("Username");
    }

    public String getUserId() {
        return userId;
    }

    public String getEmri() {
        return emri;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", emri='" + emri + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
