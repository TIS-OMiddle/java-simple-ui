package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 主页
 */
public class HomeFrame extends JFrame {
    private JFileChooser fileChooser;//文件选择器
    private File defaultPath;//储存默认路径
    List<Skill> skills;//技能集合

    /**
     * 初始化
     */
    public HomeFrame() {
        defaultPath=new File(".");
        fileChooser=new JFileChooser(defaultPath);
        skills = new ArrayList<>();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setMultiSelectionEnabled(false);

        setTitle("吃柠檬");
        setSize(300, 300);
        getContentPane().setBackground(Color.CYAN);
        setLayout(new GridLayout(3, 1));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton bt1, bt2, bt3;
        bt1 = new JButton();
        bt2 = new JButton();
        bt3 = new JButton();
        initButtons(bt1, bt2, bt3);
        add(bt1);
        add(bt2);
        add(bt3);
    }

    /**
     * @param bt1 按钮1
     * @param bt2 按钮2
     * @param bt3 按钮3
     * 初始化按钮点击事件
     */
    private void initButtons(JButton bt1, JButton bt2, JButton bt3) {
        bt1.setText("预览");
        bt2.setText("更改配置");
        bt3.setText("保存配置");

        PreviewFrame previewFrame=new PreviewFrame();
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                previewFrame.setSkills(skills);//为预览界面设置技能集合
                previewFrame.setVisible(true);//显示预览界面
                skills=previewFrame.getSkills();//获取预览界面操作后的技能集合

                //待完成
            }
        });

        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser.showOpenDialog(HomeFrame.this);
                File file=fileChooser.getSelectedFile();//file是选中的文件
                defaultPath=file;

                //待完成
            }
        });

        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser.showSaveDialog(HomeFrame.this);
                File file=new File(fileChooser.getSelectedFile().getAbsolutePath()+".txt");//后缀名txt
                defaultPath=file;


                //待完成
            }
        });
    }
}
