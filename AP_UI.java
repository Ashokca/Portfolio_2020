package AP_Exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class AP_UI extends MenuControl {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextArea testQuestion = new JTextArea();
    private JTextArea testChoices = new JTextArea();
    private JTextArea testQuestionAnswer = new JTextArea();

    /**
     * Create the frame.
     */
    public AP_UI() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setBounds(100, 100, 445, 493);


        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblExamSections = new JLabel("Exam Sections");
        lblExamSections.setBounds(10, 6, 91, 16);
        contentPane.add(lblExamSections);

        JButton btnForLoopQuestion = new JButton("For Loops");
        btnForLoopQuestion.setBounds(100, 60, 100, 16);
        btnForLoopQuestion.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                ForLoopQuestion q = new ForLoopQuestion();
                testQuestion.setText(q.getQuestion());
                testChoices.setText(q.getChoices());
                testQuestionAnswer.setText(q.getAnswer());
            }
        });
        contentPane.add(btnForLoopQuestion);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(16, 128, 411, 105);
        contentPane.add(scrollPane);
        scrollPane.setColumnHeaderView(testQuestion);
        testQuestion.setEditable(false);
        testQuestion.setLineWrap(true);

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(16, 244, 411, 135);
        contentPane.add(scrollPane_1);
        scrollPane_1.setColumnHeaderView(testChoices);
        testChoices.setEditable(false);
        testChoices.setLineWrap(true);
        
        JLabel lblAnswer = new JLabel("Answer");
        lblAnswer.setBounds(10, 391, 61, 16);
        contentPane.add(lblAnswer);
        testQuestionAnswer.setBounds(70, 391, 357, 39);
        testQuestionAnswer.setEditable(false);
        testQuestionAnswer.setLineWrap(true);
        contentPane.add(testQuestionAnswer);
    }
}
