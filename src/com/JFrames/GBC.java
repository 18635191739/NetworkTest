package com.JFrames;

import java.awt.*;
import javax.swing.*;

public class GBC extends GridBagConstraints
{

    //相关说明 https://www.cnblogs.com/melons/p/5791766.html

    //初始化左上角位置
//    @gridx,gridy:
//    组件左上角所在的位置，如Example中yellow面板在1行0列，则gridy=0,gridx=1。读者请注意这里的行对应的是gridy,列对应的是gridx
    public GBC(int gridx, int gridy)
    {
        this.gridx = gridx;
        this.gridy = gridy;
    }

    //初始化左上角位置和所占行数和列数
    public GBC(int gridx, int gridy, int gridwidth, int gridheight)
    {
        this.gridx = gridx;
        this.gridy = gridy;
        this.gridwidth = gridwidth;
        this.gridheight = gridheight;
    }

    //对齐方式
    public GBC setAnchor(int anchor)
    {
        this.anchor = anchor;
        return this;
    }

    //是否拉伸及拉伸方向
    public GBC setFill(int fill)
    {
        this.fill = fill;
        return this;
    }

    //x和y方向上的增量
    public GBC setWeight(double weightx, double weighty)
    {
        this.weightx = weightx;
        this.weighty = weighty;
        return this;
    }

    //外部填充
    public GBC setInsets(int distance)
    {
        this.insets = new Insets(distance, distance, distance, distance);
        return this;
    }

    //外填充
    public GBC setInsets(int top, int left, int bottom, int right)
    {
        this.insets = new Insets(top, left, bottom, right);
        return this;
    }

    //内填充
    public GBC setIpad(int ipadx, int ipady)
    {
        this.ipadx = ipadx;
        this.ipady = ipady;
        return this;
    }
}
