package com.example.Online.Chat.App.Java.client;

import com.example.Online.Chat.App.Java.Message;

import javax.swing.*;
import java.util.concurrent.ExecutionException;

public class ClientGUI extends JFrame {
    public ClientGUI(String username){
        super("User: "+ username);

        setSize(1218,685);
        setLocationRelativeTo(null);

    }
}
