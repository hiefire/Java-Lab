import javax.swing.*;

public class p11 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("Click Me");
        JTextField tf = new JTextField();
        JLabel l = new JLabel();


        b.setBounds(50, 50, 100, 50);
        tf.setBounds(50, 120, 100, 30);
        l.setBounds(50, 140, 14, 100);

        f.add(b);
        f.add(tf);
        f.add(l);

        b.addActionListener(e -> {
            l.setText(tf.getText());            
        });

        f.setSize(400, 600);
        f.setVisible(true);
    }
}