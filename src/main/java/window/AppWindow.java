package window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 * filename:
 * project: ShfflShineRepeat
 * author: https://github.com/vvmk
 * date: 3/18/18
 */
public class AppWindow extends JFrame {
    private static final String fWINDOW_TITLE = "SHFFL->Shine->Repeat";
    private static final String fSTART_BUTTON_TOOLTIP = "start the timers";

    public AppWindow() {
        initUI();
    }

    private void initUI() {
        initMainWindow();
        initStartButton();
        initIcon();
    }

    private void initIcon() {
        ImageIcon icon = new ImageIcon("/Users/V/code/ShfflShineRepeat/src/main/resources/shine-stock-java-ico.png");
        setIconImage(icon.getImage());
    }

    private void initStartButton() {
        JButton startButton = new JButton("Start");
        startButton.addActionListener((ActionEvent event) -> System.out.println("start!"));

        startButton.setToolTipText(fSTART_BUTTON_TOOLTIP);
        startButton.setMnemonic(KeyEvent.VK_ENTER);

        createLayout(startButton);
    }

    private void initMainWindow() {
        setTitle(fWINDOW_TITLE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg) {
        Container pane = getContentPane();
        GroupLayout g1 = new GroupLayout(pane);
        pane.setLayout(g1);

        g1.setAutoCreateContainerGaps(true);

        g1.setHorizontalGroup(g1.createSequentialGroup()
                .addComponent(arg[0])
        );

        g1.setVerticalGroup(g1.createParallelGroup()
                .addComponent(arg[0])
        );

    }
}
