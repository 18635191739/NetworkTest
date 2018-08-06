package com.JFrames;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class JFrame2 extends JFrame {
    public  JFrame2(){
        //region set Frame and Panel
        this.setTitle("文本框使用");
        this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 500, 400); //设置窗体大小
        JPanel contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        this.setContentPane(contentPane);

        contentPane.setLayout(new GridBagLayout()); //设置主panel Layout

        GridBagConstraints c1 = new GridBagConstraints(); //设置上部Panel Layout
        c1.gridx = 0;
        c1.gridy = 0;
        c1.weightx = 1.0;
        c1.weighty = 0;
        c1.fill = GridBagConstraints.HORIZONTAL ;

        JPanel pane1=new JPanel();
        contentPane.add(pane1,c1);

        GridBagConstraints c2 = new GridBagConstraints(); //中部
        c2.gridx = 0;
        c2.gridy = 1;
        c2.weightx = 1.0;
        c2.weighty = 0;
        c2.fill = GridBagConstraints.HORIZONTAL ;
        JPanel pane2=new JPanel();
        contentPane.add(pane2,c2);

        GridBagConstraints c3 = new GridBagConstraints(); //下部
        c3.gridx = 0;
        c3.gridy = 2;
        c3.weightx = 1.0;
        c3.weighty = 1.0;
        c3.fill = GridBagConstraints.BOTH ;
        // 加入 bottomPanel
        JPanel pane3=new JPanel();
        contentPane.add(pane3,c3);
        //endregion

        //region set controls in panel

        JLabel label1=new JLabel("IP：");
        JTextField textField1=new JTextField();
        textField1.setColumns(10);
        Button btnConnect = new Button("Connect");

        pane1.add(label1);
        pane1.add(textField1);
        pane1.add(btnConnect);

        JLabel label2=new JLabel("Port：");
        JTextField textField2=new JTextField();
        textField2.setColumns(10);
        Button btnDisconnect=new Button("Disconnect");
        pane2.add(label2);
        pane2.add(textField2);
        pane2.add(btnDisconnect);

        JLabel label3=new JLabel("Log：");
        JTextArea txaLog = new JTextArea();
        txaLog.setColumns(10);
        pane3.add(label3);
        pane3.add(txaLog);
        //endregion
        this.setVisible(true);
    }
}
