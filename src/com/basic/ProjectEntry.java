package com.basic;


import com.MySocket.App;
import java.util.Scanner;

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
        for (String a:args) {
            System.out.println("args: "+a);
        }
        System.out.println(args.length);

        App sk = new App();
        if (args.length>0){
            Scanner s = new Scanner(System.in);
            String str;
            System.out.println("请输入您想输入的字符串：");
            str = s.next();
            System.out.println("您输入的是：");
            System.out.println(str);
            sk.StartClient(str);
        }
        else {
            sk.StartServer();
        }
    }
}
