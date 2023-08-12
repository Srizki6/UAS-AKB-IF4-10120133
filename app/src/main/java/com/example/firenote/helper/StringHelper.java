
package com.example.firenote.helper;
// NIM   : 10120133
// Nama  : Muhammad Saeful Rizki
// Kelas : IF - 4

public class StringHelper {
    // Generate Username From Email
    public static String usernameFromEmail(String email) {
        if (!email.contains("@")) return email;

        return email.split("@")[0];
    }
}
