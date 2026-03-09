package com.example.Online.Chat.App.Java.client;

import javax.swing.*;

public class App {
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ClientGUI clientGUI = new ClientGUI("Taptap");
                clientGUI.setVisible(true);
            }
        });
    }
}
