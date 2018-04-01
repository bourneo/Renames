package renames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static renames.Constants.*;

public class Entity3 extends JFrame implements ActionListener {

    // 无参构造器
    public Entity3() {

        // 菜单界面
        btt1 = new JButton("文本替代");
        btt1.setFont(font2);
        btt1.setContentAreaFilled(false);
        btt1.addActionListener(this);
        btt2 = new JButton("数字替代");
        btt2.setFont(font2);
        btt2.setContentAreaFilled(false);
        btt2.addActionListener(this);
        btt3 = new JButton("列文件名");
        btt3.setFont(font2);
        btt3.setContentAreaFilled(false);
        btt3.addActionListener(this);

        p0 = new JPanel();
        p0.setLayout(new GridLayout(1, 3));
        p0.add(btt1);
        p0.add(btt2);
        p0.add(btt3);

        // 路径
        lb1 = new JLabel("Path");
        lb1.setText("Path");
        tf1 = new JTextField();
        tf1.setSize(35, 10);
        tf1.setColumns(35);

        // 文件名列表
        lb2 = new JLabel("List");
        lb2.setText("List");
        ta1 = new JTextArea();
        ta1.setWrapStyleWord(true);
        ta1.setLineWrap(true);
        ta1.setColumns(38);

        // 状态栏
        lb4 = new JLabel("Statu");
        lb4.setText("Statu");
        tf4 = new JTextField();
        tf4.setSize(35, 10);
        tf4.setColumns(35);

        // 按钮实例和属性
        bt1 = new JButton("Reset");
        bt1.setFont(font1);
        bt1.setContentAreaFilled(false);
        bt1.addActionListener(this);

        bt2 = new JButton("Action");
        bt2.setFont(font1);
        bt2.setContentAreaFilled(false);
        bt2.addActionListener(this);

        // 第一区块布局
        p1 = new JPanel(new GridLayout(2, 1));
        p1.add(lb1);
        p1.add(lb4);

        // 第二区块布局
        p2 = new JPanel(new GridLayout(2, 1));
        p2.add(tf1);
        p2.add(tf4);

        // 第二区块按钮
        p3 = new JPanel(new GridLayout(1, 2));
        p3.add(bt1);
        p3.add(bt2);

        // 整合三个区块
        p4 = new JPanel();
        p4.add(p1, BorderLayout.WEST);
        p4.add(p2, BorderLayout.CENTER);
        p4.add(ta1, BorderLayout.SOUTH);

        this.add(p0, BorderLayout.NORTH);
        this.add(p4, BorderLayout.CENTER);
        this.add(p3, BorderLayout.SOUTH);

        // 窗口居中
        int windowsWedth = 500;
        int windowsHeight = 350;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);

        this.setVisible(true);
        this.setTitle("rename1");

    }

    public void actionPerformed(ActionEvent e) {
        String comm = e.getActionCommand();
        if (comm == "Reset") {
            tf1.setText("");
            ta1.setText("");
            tf4.setText("");
        } else if (comm == "Action") {
            path = tf1.getText();
            String key = path.replace("\"", "").replace("\\", "/");
            Operations.RunOperator3(key);
        } else if (comm == "文本替代") {
            this.dispose();

            Entity1 entity1 = new Entity1();
            entity1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            entity1.setVisible(true);
        } else if (comm == "数字替代") {
            this.dispose();

            Entity2 entity2 = new Entity2();
            entity2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            entity2.setVisible(true);
        } else if (comm == "列文件名") {
            tf4.setText("");
        }
    }
}
