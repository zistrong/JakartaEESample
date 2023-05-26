package com.zistrong.jakartaee.websocket;


import jakarta.websocket.*;
import jakarta.websocket.server.PathParam;
import jakarta.websocket.server.ServerEndpoint;

import java.io.IOException;
import java.util.Date;

@ServerEndpoint("/chatroom/{roomId}/{nickName}")
public class ChatRoom {

    @OnOpen
    public void onOpen(Session session, @PathParam("roomId") long roomId,
                       @PathParam("nickName") String unDecName) {
        System.out.println(roomId);
    }

    @OnMessage
    public void onMessage(Session session, String message, @PathParam("roomId") long roomId,
                          @PathParam("nickName") String unDecName) {

        System.out.println(message);
        try {
            session.getBasicRemote().sendText(session.getId() + ":" + message + new Date());
        } catch (IOException e) {
        }
    }

    @OnClose
    public void onClose(Session session, @PathParam("roomId") long roomId,
                        @PathParam("nickName") String unDecName) {

        System.out.println(roomId + "/" + unDecName);
    }

    @OnError
    public void onError(@PathParam("uname") String uname, Session session, Throwable error) {
        error.printStackTrace();
    }


}

