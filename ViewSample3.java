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
public class ViewSample3 extends JFrame{

public ViewSample3(int x) {
	//�T�C�Y�w��
    setSize(800, 1500);
    setLocation(1125, 0);
    //�^�C�g���w��
    setTitle("��"+x+"��̉��");
    JLabel jLabel = new JLabel();
    //��΃p�X�ŉ摜�̏ꏊ���w�肵�Ă��܂�
    
    ImageIcon image = new ImageIcon("3_Q"+x+"_zenbu_kaisetsu.png");
    JScrollPane scrollPane = new JScrollPane(jLabel);
 
    jLabel.setIcon(image);
    getContentPane().add(scrollPane, BorderLayout.CENTER);

    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

}}