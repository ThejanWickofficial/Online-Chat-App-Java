package com.example.Online.Chat.App.Java;

import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class WebSocketSessionManager {
    private final ArrayList<String> activeUserName =  new ArrayList<>();
}
