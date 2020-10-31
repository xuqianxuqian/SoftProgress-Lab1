package com.xiets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
*界面显示
 */
public class MyGUI {

    public static void main(String[] args) throws AWTException {

        Person1 p = new Person1();
        JFrame jf = new JFrame("**Future Star**");
        //jf.setSize(20,20);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        // 创建内容面板
        JPanel panel = new JPanel();

        panel.setOpaque(false);

        ImageIcon img = new ImageIcon("F:\\软件过程\\src\\com\\xiets\\background.jpg");
        JLabel background = new JLabel(img);
         background.setBounds(0, 0, img.getIconWidth(),img.getIconHeight());

        jf.getLayeredPane().add(background,new Integer(Integer.MIN_VALUE));

        // 创建分组布局，并关联容器
        GroupLayout layout = new GroupLayout(panel);
        // 设置容器的布局
        panel.setLayout(layout);


        //姓名标签
        JLabel personname = new JLabel();
        personname.setSize(4,2);
        // 创建文本框，指定可见列数为8列,输入问题
        JTextField nameField = new JTextField();
        //nameField.setBackground(Color.pink);
        nameField.setFont(new Font(null, Font.PLAIN,20));

        // 创建一个按钮，点击后获取文本框中的文本
        JButton namebtn = new JButton("确认姓名");
        namebtn.setBackground(Color.pink);
        namebtn.setSize(4,2);
        namebtn.setFont(new Font(null, Font.PLAIN,20));


        //作答情况
        JLabel label_answercondition = new JLabel("answercondition ");
        label_answercondition.setText("答对题数: "+ 0+" 答错题数:"+0+"  总题数："+0);
        //题目
        JLabel label_question = new JLabel("question ");
        label_question.setBackground(Color.lightGray);
        label_question.setFont(new Font(null, Font.PLAIN,25));
        //正确答案
        JLabel label_rightanswer= new JLabel("答案显示");

        // 创建文本框，指定可见列数为8列,输入问题
        JTextField textField = new JTextField();
        //textField.setBackground(Color.ORANGE);
        textField.setSize(4,2);
        textField.setFont(new Font(null, Font.PLAIN,15));
        // 创建一个按钮，点击后获取文本框中的文本
        JButton btn = new JButton("提交");
        btn.setBackground(Color.ORANGE);
        btn.setFont(new Font(null, Font.PLAIN,15));

        JButton btn1 = new JButton("下一题");
        btn1.setBackground(Color.PINK);
        btn.setFont(new Font(null, Font.PLAIN,15));


        // 自动创建组件之间的间隙
        layout.setAutoCreateGaps(true);
        // 自动创建容器与触到容器边框的组件之间的间隙
        layout.setAutoCreateContainerGaps(true);
        /*
         * 水平组（仅确定 X 轴方向的坐标/排列方式）
         *
         * 水平串行: 水平排列（左右排列）
         * 水平并行: 垂直排列（上下排列）
         */
        // 水平串行（左右）hParalGroup01 和 hParalGroup02
        GroupLayout.SequentialGroup hSeqGroup1 = layout.createSequentialGroup().addComponent(personname).addComponent(nameField).addComponent(namebtn);
        GroupLayout.SequentialGroup hSeqGroup2 = layout.createSequentialGroup().addComponent(textField).addComponent(btn).addComponent(btn1);

        // 水平并行（上下）
        GroupLayout.ParallelGroup hParalGroup01 = layout.createParallelGroup().addGroup(hSeqGroup1).addComponent(label_answercondition,GroupLayout.Alignment.CENTER);
        GroupLayout.ParallelGroup hParalGroup02 = layout.createParallelGroup().addComponent(label_question,GroupLayout.Alignment.CENTER).addGroup(hSeqGroup2);
        // 水平并行（上下）hSeqGroup 和 btn05
        GroupLayout.ParallelGroup hParalGroup = layout.createParallelGroup().addGroup(hParalGroup01).addGroup(hParalGroup02).addComponent(label_rightanswer, GroupLayout.Alignment.CENTER);

        layout.setHorizontalGroup(hParalGroup);  // 指定布局的 水平组（水平坐标）

        /*
         * 垂直组（仅确定 Y 轴方向的坐标/排列方式）
         *
         * 垂直串行: 垂直排列（上下排列）
         * 垂直并行: 水平排列（左右排列）
         */
        // 垂直并行（左右）
        GroupLayout.ParallelGroup vParalGroup01 = layout.createParallelGroup().addComponent(personname).addComponent(nameField).addComponent(namebtn);

        // 垂直并行（左右）
        GroupLayout.ParallelGroup vParalGroup02 = layout.createParallelGroup().addComponent(textField).addComponent(btn).addComponent(btn1);

        // 垂直串行（上下）
        GroupLayout.SequentialGroup vSeqGroup1 = layout.createSequentialGroup().addGroup(vParalGroup01).addComponent(label_answercondition);
        GroupLayout.SequentialGroup vSeqGroup2 = layout.createSequentialGroup().addComponent(label_question).addGroup(vParalGroup02);
        GroupLayout.SequentialGroup vSeqGroup = layout.createSequentialGroup().addGroup(vSeqGroup1).addGroup(vSeqGroup2).addComponent(label_rightanswer);
        layout.setVerticalGroup(vSeqGroup);    // 指定布局的 垂直组（垂直坐标）


        jf.setLocationRelativeTo(null);
        jf.setContentPane(panel);
        jf.pack();
        jf.setVisible(true);


        namebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                personname.setText("你好！"+nameField.getText());
                p.setName(nameField.getText());
                panel.remove(namebtn);
                panel.remove(nameField);
                System.out.println(personname.getText());
            }
        });



            Question q = new Question();
            label_question.setText("题目：   "+q.getquestion());
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int b = 0;
                    try {
                        b = Integer.valueOf(textField.getText()).intValue();
                        System.out.println(textField.getText());

                    } catch (NumberFormatException ex) {
                        ex.printStackTrace();
                    }

                    int sum = q.checkAnswer(b);
                    if(sum == 1){
                        label_rightanswer.setText("你真棒！答对了！");
                        p.addrightnumber();
                    }
                    else if(sum ==0){
                        label_rightanswer.setText("答错了，正确答案为 "+q.getResult()+"， 继续加油哦！");
                        p.addwrongnumber();
                    }
                    label_answercondition.setText("答对题数: "+p.getRightnumber()+" 答错题数:"+p.getWrongnumber()+"  总题数："+p.getTotalnumber());
                }
            });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                q.refresh();
                label_question.setText("题目：   "+q.getquestion());
                label_rightanswer.setText(" ");
            }
        });



    }

}
