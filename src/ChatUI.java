import javax.swing.*;

public class ChatUI {
    private JButton chattknapp;
    private JTextPane chattruta;
    private JTextArea textArea1;
    private JTextPane ipruta;
    private JTextPane portruta;
    private JButton connectknapp;
    private JTextPane portTextPane;
    private JButton startknapp;
    private JPanel mainPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("ChatUI");
        frame.setContentPane(new ChatUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
