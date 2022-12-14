package org.example.bubble.test.ex02;

import javax.swing.*;

public class BubbleFrame extends JFrame{

    private JLabel backgroundMap;
    private Player player;
    public BubbleFrame() {
        initObject();
        initSetting();
        setVisible(true);
    }

    private void initObject() {
        backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));

        setContentPane(backgroundMap);

        player = new Player();
        add(player);
//        backgroundMap.setSize(100, 100);
//        backgroundMap.setLocation(300, 300);
//        backgroundMap.setSize(1000, 600);
//        add(backgroundMap);//JFrame에 JLabel이 그려진다.
    }
    private void initSetting(){
        setSize(1000, 640);
        setLayout(null);
        setLocationRelativeTo(null);// JFrame을 가운데로 배치
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼으로  창 끌때 JVM같이 종료


    }

    public static void main(String[] args) {
        new BubbleFrame();
    }
}
