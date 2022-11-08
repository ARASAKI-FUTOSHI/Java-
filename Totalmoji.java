//package java_test_bteam;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class Totalmoji{

    /**
     * �A�X�L�[�A�[�g����郁�\�b�h.
     * @param str �A�X�L�[�A�[�g�ɂ���������
     * @return StringBuilder �A�X�L�[�A�[�g�ɂȂ�������
     */

    public static StringBuilder createAscii(String str) {

        // ��������O���t�B�b�N�̃T�C�Y
        int height =100;
        int width = 300;
        // �`�ʊJ�n�ʒu
        int startX = 1;
        int stratY = 30;
        // �t�H���g��ݒ�
        Font font = new Font("Arial", Font.BOLD, 18);
        StringBuilder sysout = new StringBuilder("\n");

        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = bufferedImage.getGraphics();

        // �e�L�X�g��graphic�ɕϊ�
        Graphics2D g = (Graphics2D) graphics;
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g.setFont(font);
        g.drawString(str, startX, stratY);

        // graphic�����Ƃɂ��ăA�X�L�[�A�[�g�ɏ����N����
        for (int y = 0; y < height; y++) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int x = 0; x < width; x++) {
                stringBuilder.append(bufferedImage.getRGB(x, y) == -16777216 ? " " : "@");
            }
            if (stringBuilder.toString().trim().isEmpty()) {
                continue;
            }
            sysout.append("\n" + stringBuilder);
        }
        sysout.append("\n");
        return sysout;
    }

    public static void main(String args) {
        // ���s]
        System.out.println(createAscii(args));
    
    }


}


