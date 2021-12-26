package com.yhzdys.learning.designpattern.q_mediator;

public class RoomMediator {

    public static void sendMessage(User user, String message) {
        System.out.println(user.getName() + " say: " + message);
    }
}
