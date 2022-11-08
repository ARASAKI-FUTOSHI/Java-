//package java_test_bteam;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
/*
 * 画像をJFrameで表示するプログラム
 * 画像はスクロールバーで表示できます
 */
public class ViewSample3 extends JFrame{

public ViewSample3(int x) {
	//サイズ指定
    setSize(800, 1500);
    setLocation(1125, 0);
    //タイトル指定
    setTitle("第"+x+"回の解説");
    JLabel jLabel = new JLabel();
    //絶対パスで画像の場所を指定しています
    
    ImageIcon image = new ImageIcon("3_Q"+x+"_zenbu_kaisetsu.png");
    JScrollPane scrollPane = new JScrollPane(jLabel);
 
    jLabel.setIcon(image);
    getContentPane().add(scrollPane, BorderLayout.CENTER);

    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

}}