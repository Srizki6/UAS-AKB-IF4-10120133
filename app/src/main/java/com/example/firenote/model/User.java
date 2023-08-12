
package com.example.firenote.model;
// NIM   : 10120133
// Nama  : Muhammad Saeful Rizki
// Kelas : IF - 4

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {
    public String username;
    public String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
