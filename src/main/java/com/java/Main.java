package com.java;

public class Main {
    public static void main(String[] args) {

        User user =  User.builder()
                .id(1L)
                .name("muhammed")
                .email("mohamed@gmail.com")
                .build();


        User user1 = User.builder()
                        .id(2L)
                        .build();

        System.out.println(user.toString());
        System.out.println(user1.toString());

    }

}
