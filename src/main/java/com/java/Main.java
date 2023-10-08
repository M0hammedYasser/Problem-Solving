package com.java;

public class Main {
    public static void main(String[] args) {

        User user =  User.builder()
                .id(1L)
                .name("muhammed")
                .email("mohamed@gmail.com")
                .build();

        System.out.println(user.toString());

    }

}
