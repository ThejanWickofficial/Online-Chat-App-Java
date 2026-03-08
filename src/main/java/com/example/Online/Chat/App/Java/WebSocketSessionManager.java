package com.example.Online.Chat.App.Java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class WebSocketSessionManager {
    private final ArrayList<String> activeUserNames =  new ArrayList<>();
    private final SimpMessagingTemplate messagingTemplate;

    @Autowired
    public WebSocketSessionManager(SimpMessagingTemplate messagingTemplate){
        this.messagingTemplate = messagingTemplate;
    }

    public void addUsername(String username){
        activeUserNames.add(username);
    }

    public void removeUsername(String username){
        activeUserNames.remove(username);
    }
}
