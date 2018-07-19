package Pnc;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.Spring;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class About extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel link;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			About dialog = new About();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public About() {
		setBounds(530, 200, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(About.class.getResource("/img/cpu.png")));
		label.setBounds(20, 11, 69, 72);
		contentPanel.add(label);
		
		JLabel lblPnc = new JLabel("PNC");
		lblPnc.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
		lblPnc.setBounds(99, 22, 69, 24);
		contentPanel.add(lblPnc);
		
		JLabel lblProcessorNameChager = new JLabel("Processor Name Changer");
		lblProcessorNameChager.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblProcessorNameChager.setBounds(99, 46, 218, 28);
		contentPanel.add(lblProcessorNameChager);
		
		JLabel lblCreatedByMd = new JLabel("Created by Md Arif U.");
		lblCreatedByMd.setBounds(99, 85, 145, 14);
		contentPanel.add(lblCreatedByMd);
		
		JLabel lblContactMe = new JLabel("Find Me on");
		lblContactMe.setBounds(60, 187, 69, 14);
		contentPanel.add(lblContactMe);
		
		JButton button = new JButton("");
		button.setFocusable(false);
		button.setFocusTraversalKeysEnabled(false);
		button.setFocusPainted(false);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setBorderPainted(false);
		button.setBackground(Color.BLACK);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {

				     String url ="https://github.com/Arif-un";

				     Desktop dt = Desktop.getDesktop();
				     URI uri = new URI(url);
				     dt.browse(uri.resolve(uri));


				 } catch (URISyntaxException ex) {
				     Logger.getLogger(Spring.class.getName()).log(Level.SEVERE, null, ex);
				 } catch (IOException ex) {
				     Logger.getLogger(Spring.class.getName()).log(Level.SEVERE, null, ex);
				 }
			}
		});
		button.setIcon(new ImageIcon(About.class.getResource("/img/github (1).png")));
		button.setBounds(60, 212, 33, 33);
		contentPanel.add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

				     String url ="https://www.behance.net/arif_un";

				     Desktop dt = Desktop.getDesktop();
				     URI uri = new URI(url);
				     dt.browse(uri.resolve(uri));


				 } catch (URISyntaxException ex) {
				     Logger.getLogger(Spring.class.getName()).log(Level.SEVERE, null, ex);
				 } catch (IOException ex) {
				     Logger.getLogger(Spring.class.getName()).log(Level.SEVERE, null, ex);
				 }
			}
		});
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.setIcon(new ImageIcon(About.class.getResource("/img/behance.png")));
		button_1.setFocusable(false);
		button_1.setFocusTraversalKeysEnabled(false);
		button_1.setFocusPainted(false);
		button_1.setBorderPainted(false);
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(153, 212, 33, 33);
		contentPanel.add(button_1);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

				     String url ="https://web.facebook.com/ArifOverclocker";

				     Desktop dt = Desktop.getDesktop();
				     URI uri = new URI(url);
				     dt.browse(uri.resolve(uri));


				 } catch (URISyntaxException ex) {
				     Logger.getLogger(Spring.class.getName()).log(Level.SEVERE, null, ex);
				 } catch (IOException ex) {
				     Logger.getLogger(Spring.class.getName()).log(Level.SEVERE, null, ex);
				 }
			}
		});
		button_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_3.setIcon(new ImageIcon(About.class.getResource("/img/facebook.png")));
		button_3.setFocusable(false);
		button_3.setFocusTraversalKeysEnabled(false);
		button_3.setFocusPainted(false);
		button_3.setBorderPainted(false);
		button_3.setBackground(Color.BLACK);
		button_3.setBounds(249, 212, 33, 33);
		contentPanel.add(button_3);
		
   

		
		
	}
}
