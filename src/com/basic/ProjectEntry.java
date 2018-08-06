package com.basic;


import com.JFrames.Example;
import com.JFrames.MyFrame;
import com.MySocket.App;

public class ProjectEntry {
    public static void main(String[] args){
//        for(int i = 1; i < args.length; i++) {
//
//            System.out.print(args[i]);
//
//        }
//        System.out.println("Hello World");
//        //Frame1.Myfuc();
//        Frame2 f = new Frame2();
        //com.JFrames.Frame1 f =new Frame1();
        //JFrame2 f = new JFrame2();

        //MyFrame f = new MyFrame();
        //Example f1 = new Example();
        App sk = new App();
        if (args[0]=="C"){
            sk.StartClient();
        }
        else {
            sk.StartServer();
        }
    }
}
