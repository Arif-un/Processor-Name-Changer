package Pnc;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Sucessfull_msg_re extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Sucessfull_msg_re dialog = new Sucessfull_msg_re();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Sucessfull_msg_re() {
		setTitle("Success");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Edward\\Downloads\\1494606283_accepted_48.png"));
		setBounds(600, 300, 304, 144);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnRestart = new JButton("Restart");
			btnRestart.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Runtime r=Runtime.getRuntime();
					try {
						r.exec("shutdown -r");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnRestart.setFont(new Font("Arial", Font.PLAIN, 11));
			btnRestart.setBounds(30, 77, 97, 23);
			contentPanel.add(btnRestart);
		}
		{
			JButton btnRestartLater = new JButton("Restart Later");
			btnRestartLater.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Sucessfull_msg_re.this.dispose();
				}
			});
			btnRestartLater.setFont(new Font("Arial", Font.PLAIN, 11));
			btnRestartLater.setBounds(137, 77, 109, 23);
			contentPanel.add(btnRestartLater);
		}
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Sucessfull_msg_re.class.getResource("/img/1494606283_accepted_48.png")));
		label.setBounds(10, 11, 56, 53);
		contentPanel.add(label);
		
		JLabel lblSuccessfullyResetTo = new JLabel("Successfully Reset to Default !");
		lblSuccessfullyResetTo.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		lblSuccessfullyResetTo.setBounds(76, 11, 202, 14);
		contentPanel.add(lblSuccessfullyResetTo);
		
		JLabel lblNeedARestart = new JLabel("Need a Restart to save changes.");
		lblNeedARestart.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		lblNeedARestart.setBounds(76, 36, 202, 14);
		contentPanel.add(lblNeedARestart);
	}
}
