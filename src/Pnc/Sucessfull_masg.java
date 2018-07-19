package Pnc;

import java.awt.BorderLayout;
import java.awt.Desktop;
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
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Sucessfull_masg extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Sucessfull_masg dialog = new Sucessfull_masg();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Sucessfull_masg() {
		setTitle("Success");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Edward\\Downloads\\1494606283_accepted_48.png"));
		setBounds(600, 300, 304, 144);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnRestartLater = new JButton("OK");
			btnRestartLater.setIcon(new ImageIcon(Sucessfull_masg.class.getResource("/img/1494607921_button_ok.png")));
			btnRestartLater.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String user_name=System.getProperty("user.name");
					Desktop desktop = Desktop.getDesktop();
				    File file = new File("C://Users/"+user_name+"/AppData/Roaming/Microsoft/Windows/Start Menu/Programs/Startup/PNC.bat");
				    try {
						Desktop.getDesktop().open(file);
					} catch (IOException e) {

						e.printStackTrace();
					}
				    Sucessfull_masg.this.dispose();
				}
			});
			btnRestartLater.setFont(new Font("Arial", Font.PLAIN, 11));
			btnRestartLater.setBounds(105, 71, 81, 23);
			contentPanel.add(btnRestartLater);
		}
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Sucessfull_masg.class.getResource("/img/1494606283_accepted_48.png")));
		label.setBounds(10, 11, 56, 53);
		contentPanel.add(label);
		
		JLabel lblSuccessfullyResetTo = new JLabel("Successfully Done !!! ");
		lblSuccessfullyResetTo.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		lblSuccessfullyResetTo.setBounds(76, 11, 147, 14);
		contentPanel.add(lblSuccessfullyResetTo);
		
		JLabel lblCheckYourSystem = new JLabel("Check Your System Properties.");
		lblCheckYourSystem.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		lblCheckYourSystem.setBounds(76, 46, 202, 14);
		contentPanel.add(lblCheckYourSystem);
		
		JLabel lblPressYesIn = new JLabel("Press YES in Registry Dialogue Box.");
		lblPressYesIn.setBounds(76, 31, 202, 14);
		contentPanel.add(lblPressYesIn);
	}
}
