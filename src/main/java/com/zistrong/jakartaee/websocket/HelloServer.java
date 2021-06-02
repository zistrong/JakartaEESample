package com.zistrong.jakartaee.websocket;

import jakarta.websocket.ClientEndpoint;
import jakarta.websocket.OnMessage;
import jakarta.websocket.Session;

@ClientEndpoint(subprotocols="chat")
public class HelloServer {
    @OnMessage
    public void processMessageFromServer(String message, Session session) {
        System.out.println("Message came from the server ! " + message);
    }
}
