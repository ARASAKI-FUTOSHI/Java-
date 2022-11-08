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
public class ViewSample extends JFrame{

	public ViewSample(int x,int y) {
		//サイズ指定
        setSize(800, 1500);
        setLocation(1125, 0);
        //タイトル指定
        setTitle("第"+x+"回 問"+y+"の問題");
        JLabel jLabel = new JLabel();
        //絶対パスで画像の場所を指定しています
        
        ImageIcon image = new ImageIcon("3_Q"+x+"_"+y+"tate.png");
        JScrollPane scrollPane = new JScrollPane(jLabel);
        //スクロールバーを常に表示
        //scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        //scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //スクロールバーが必要な際に表示（デフォルト）
        //scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jLabel.setIcon(image);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	
}}



















