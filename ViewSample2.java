//package java_test_bteam;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
/*
 * �摜��JFrame�ŕ\������v���O����
 * �摜�̓X�N���[���o�[�ŕ\���ł��܂�
 */
public class ViewSample2 extends JFrame{
//	public static void main(String[] args) {
//		ViewSample test = new ViewSample();
//		test.setVisible(true);
//	}
//	ViewSample(){}
	//public ViewSample(int x,int y) {
	public ViewSample2(int x,int y) {
		//�T�C�Y�w��
        setSize(800, 1500);
        setLocation(340, 0);
        //�^�C�g���w��
        setTitle("��"+x+"�� ��"+y+"�̉��");
        JLabel jLabel = new JLabel();
        //��΃p�X�ŉ摜�̏ꏊ���w�肵�Ă��܂�
        
        ImageIcon image = new ImageIcon("3_Q"+x+"_"+y+"_kaisetsu.png");
        JScrollPane scrollPane = new JScrollPane(jLabel);
       
        jLabel.setIcon(image);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	
}}

