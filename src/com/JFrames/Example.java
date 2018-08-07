package com.JFrames;
import java.awt.*;
import javax.swing.*;
public class Example extends JFrame {

    //相关说明 https://www.cnblogs.com/melons/p/5791766.html

    public Example(){
        FrameInitialize();
    }
    private void FrameInitialize(){
        //region Set Frame & Main panel
        this.setTitle("EXAMPLE");
        this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 600, 500); //设置窗体位置和大小
        JPanel mainPanel  = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        this.add(mainPanel);

        //endregion

        //region Set sub-panel
        //上侧的工具选择面板

            JLabel label1 = new JLabel("IP：");
            JTextField textField1 = new JTextField();
            textField1.setColumns(10);
            JButton btnConnect = new JButton("Connect");

        JPanel toolSelectPanel = new JPanel();
        toolSelectPanel.add(label1);
        toolSelectPanel.add(textField1);
        toolSelectPanel.add(btnConnect);
        toolSelectPanel.setBackground(Color.green);
        mainPanel.add(toolSelectPanel, new GBC(0,0,2,1).
                setFill(GBC.BOTH).setIpad(200, 50).setWeight(100, 0));
        //左侧的具体工具面板
        JPanel toolConcretePanel = new JPanel();
        toolConcretePanel.setBackground(Color.YELLOW);
        mainPanel.add(toolConcretePanel,new GBC(0,1,1,1).
                setFill(GBC.BOTH).setIpad(70, 90).setWeight(0, 100));
        //右侧的绘图面板
        JPanel drawPanel = new JPanel();
        drawPanel.setBackground(Color.WHITE);
        mainPanel.add(drawPanel,new GBC(1,1,1,1).setFill(GBC.BOTH));
        //下侧的颜色选择面板
        JPanel colorPanel = new JPanel();
        colorPanel.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(colorPanel,new GBC(0,2,2,1).
                setFill(GBC.BOTH).setIpad(200,50).setWeight(100, 0));
        //下侧的状态面板
        JPanel statePanel = new JPanel();
        statePanel.setBackground(Color.CYAN);
        mainPanel.add(statePanel,new GBC(0,3,2,1).
                setFill(GBC.BOTH).setIpad(200, 20).setWeight(100, 0));
        //endregion


        this.setVisible(true); // show 该窗体
    }
}
