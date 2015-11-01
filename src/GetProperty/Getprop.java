/**
 * Created by Monki(yamatomotomoto) on 2015/11/01.
 */
package GetProperty;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Getprop extends  JFrame {
    public static void main(String[] args) {
        //�t���[���ǉ����ݒ�
        JFrame frame = new JFrame("OS Information");
        frame.setVisible(true);
        frame.setSize(160, 140);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        //�p�l���ǉ����ݒ�
        JPanel panel = new JPanel();
        frame.add(panel);
        //�ϐ��ǉ�+��
        String OSname = System.getProperty("os.name");
        String OSver = System.getProperty("os.version");
        String OSarch = System.getProperty("sun.arch.data.model");
        //���x���ǉ����ݒ�
        JLabel label = new JLabel();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        label.setText("OS Name = " + OSname);
        label1.setText("OS Version = " + OSver);
        label2.setText("OS Arch = " + OSarch + "bit");
        panel.add(label);
        panel.add(label1);
        panel.add(label2);
        //�{�^���ǉ����ݒ�
        JButton button = new JButton("OK");
        panel.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
    }
}

