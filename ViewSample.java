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
public class ViewSample extends JFrame{

	public ViewSample(int x,int y) {
		//�T�C�Y�w��
        setSize(800, 1500);
        setLocation(1125, 0);
        //�^�C�g���w��
        setTitle("��"+x+"�� ��"+y+"�̖��");
        JLabel jLabel = new JLabel();
        //��΃p�X�ŉ摜�̏ꏊ���w�肵�Ă��܂�
        
        ImageIcon image = new ImageIcon("3_Q"+x+"_"+y+"tate.png");
        JScrollPane scrollPane = new JScrollPane(jLabel);
        //�X�N���[���o�[����ɕ\��
        //scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        //scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //�X�N���[���o�[���K�v�ȍۂɕ\���i�f�t�H���g�j
        //scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jLabel.setIcon(image);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	
}}



















