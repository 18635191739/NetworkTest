package com.JFrames;
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame(){
FrameInitialize();
    }
    private void FrameInitialize(){
        //region Set Frame & Main panel
        this.setTitle("窗体标题");
        this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 500, 400); //设置窗体位置和大小
        JPanel mainPanel  = new JPanel();
        GridBagLayout gridBag = new GridBagLayout();//布局管理器
        GridBagConstraints c = null; //约束
        mainPanel.setLayout(gridBag);
        //mainPanel.setBackground(Color.CYAN);
        this.add(mainPanel);


        //endregion

        //declare controls
        JLabel lblIP= new JLabel("IP");
        JLabel lblPort= new JLabel("Port");
        JLabel lblLog = new JLabel("Log");
        JTextField txfIP = new JTextField(20);
        JTextField txfPort=new JTextField(4);
        JTextArea txaLog = new JTextArea(10,10);
        JButton btnConnect = new JButton("Connect");
        JButton btnDisconnect = new JButton("Disconnect");
        JPanel pnlBlank = new JPanel(); //for blank
        //pnlBlank.setBackground(Color.blue);

        //布局
        c = new GridBagConstraints();
        gridBag.setConstraints(lblIP,c);

        c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.RELATIVE;
        c.fill = GridBagConstraints.BOTH;
        gridBag.setConstraints(txfIP,c);

        c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;
        gridBag.setConstraints(btnConnect,c);


        c = new GridBagConstraints();
        c.gridheight = 2;
        c.fill = GridBagConstraints.BOTH;
        gridBag.addLayoutComponent(pnlBlank, c);

        c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.RELATIVE;
        c.fill = GridBagConstraints.BOTH;
        gridBag.setConstraints(txfPort,c);

        c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;
        gridBag.setConstraints(btnDisconnect,c);

        c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;
        gridBag.setConstraints(lblLog,c);

        c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;
        gridBag.addLayoutComponent(txaLog, c);




        mainPanel.add(lblIP);
        mainPanel.add(txfIP);
        mainPanel.add(btnConnect);

        mainPanel.add(pnlBlank);
        mainPanel.add(lblPort);
        mainPanel.add(txfPort);
        mainPanel.add(btnDisconnect);

        mainPanel.add(lblLog);
        mainPanel.add(txaLog);


this.pack();
        this.setVisible(true);

    }
}
