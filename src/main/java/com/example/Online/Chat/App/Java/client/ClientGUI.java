package com.example.Online.Chat.App.Java.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ClientGUI extends JFrame {
    private JPanel connectedUsersPanel;

    public ClientGUI(String username){
        super("User: "+ username);

        setSize(550,344);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(ClientGUI.this, "Do You really wan to close", "Exit",JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION){
                    ClientGUI.this.dispose();
                }
            }
        });

        getContentPane().setBackground(Utilities.PRIMARY_COLOR);
        addGuiComponents();
    }

    private void addGuiComponents(){
        addConnectedUsersComponents();
    }

    private void addConnectedUsersComponents(){
        connectedUsersPanel = new JPanel();
        connectedUsersPanel.setLayout(new BoxLayout(connectedUsersPanel, BoxLayout.Y_AXIS));
        connectedUsersPanel.setBackground(Utilities.SECONDARY_COLOR);
        connectedUsersPanel.setPreferredSize(new Dimension(134,getHeight()));

        JLabel connectedUsersLabel = new JLabel("Connected Users: ");
        connectedUsersLabel.setFont(new Font("Inter", Font.BOLD,10));
        connectedUsersLabel.setForeground(Utilities.TEXT_COLOR);
        connectedUsersPanel.add(connectedUsersLabel);

        add(connectedUsersPanel,BorderLayout.WEST);
    }
}
