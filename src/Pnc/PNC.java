package Pnc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;



import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;


public class PNC extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField pn;
	private JTextField pm;
	private JTextField cs;
	private JTextField cus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			//UIManager.setLookAndFeel(new NapkinLookAndFeel());
			//UIManager.setLookAndFeel(new QuaquaLookAndFeel());
			//UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
			UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
			PNC dialog = new PNC();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public PNC() {
		
		setTitle("PNC-v1.0");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Edward\\Desktop\\icons\\home.png"));
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(470, 200, 626, 340);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblInterr = new JLabel("Inter(R)  Core(TM) ");
		lblInterr.setForeground(Color.GRAY);
		lblInterr.setBackground(Color.BLACK);
		lblInterr.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblInterr.setBounds(46, 95, 137, 14);
		contentPanel.add(lblInterr);
		
		pn = new JTextField();
		pn.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				cus.setText("");
			}
		});
		pn.setToolTipText("Processor Name   \r\nHint: i3,i7...etc");
		pn.setBounds(193, 92, 75, 20);
		contentPanel.add(pn);
		pn.setColumns(10);
		
		JLabel lblProcessorName = new JLabel("Processor Name");
		lblProcessorName.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 10));
		lblProcessorName.setForeground(Color.GRAY);
		lblProcessorName.setBounds(193, 66, 75, 14);
		contentPanel.add(lblProcessorName);
		
		JLabel label = new JLabel("-");
		label.setForeground(Color.GRAY);
		label.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		label.setBackground(Color.BLACK);
		label.setBounds(272, 95, 11, 14);
		contentPanel.add(label);
		
		pm = new JTextField();
		pm.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				cus.setText("");
			}
		});
		pm.setToolTipText("Model Number , Hint : 3630QM");
		pm.setBounds(282, 92, 86, 20);
		contentPanel.add(pm);
		pm.setColumns(10);
		
		JLabel lblProcessorModel = new JLabel("Processor Model");
		lblProcessorModel.setForeground(Color.GRAY);
		lblProcessorModel.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 10));
		lblProcessorModel.setBounds(286, 66, 75, 14);
		contentPanel.add(lblProcessorModel);
		
		JLabel lblCpu = new JLabel("CPU @");
		lblCpu.setForeground(Color.GRAY);
		lblCpu.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblCpu.setBackground(Color.BLACK);
		lblCpu.setBounds(375, 95, 50, 14);
		contentPanel.add(lblCpu);
		
		cs = new JTextField();
		cs.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				cus.setText("");
			}
		});
		cs.setToolTipText("ClockSpeed, Hint : 2.40 GHz");
		cs.setColumns(10);
		cs.setBounds(424, 92, 50, 20);
		contentPanel.add(cs);
		
		JLabel lblGhz = new JLabel("GHz");
		lblGhz.setForeground(Color.GRAY);
		lblGhz.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblGhz.setBackground(Color.BLACK);
		lblGhz.setBounds(478, 95, 50, 14);
		contentPanel.add(lblGhz);
		
		JLabel lblClockspeed = new JLabel("ClockSpeed");
		lblClockspeed.setForeground(Color.GRAY);
		lblClockspeed.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 10));
		lblClockspeed.setBounds(422, 66, 56, 14);
		contentPanel.add(lblClockspeed);
		
		JLabel lblOrCustom = new JLabel("or Custom :");
		lblOrCustom.setForeground(Color.GRAY);
		lblOrCustom.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		lblOrCustom.setBackground(Color.BLACK);
		lblOrCustom.setBounds(46, 149, 86, 14);
		contentPanel.add(lblOrCustom);
		
		cus = new JTextField();
		cus.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				pn.setText("");
				pm.setText("");
				cs.setText("");
			}
		});
		cus.setToolTipText("Hint : Intel(R) Core(TM) i7-3036QM CPU @ 2.40 GHz");
		cus.setColumns(10);
		cus.setBounds(128, 146, 415, 20);
		contentPanel.add(cus);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(-2, 254, 620, 36);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton btnNewButton = new JButton("About");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						About obj=new About();
						obj.setVisible(true);
					}
				});
				btnNewButton.setIcon(new ImageIcon(PNC.class.getResource("/img/1494608362_Help_symbol.png")));
				btnNewButton.setBounds(10, 5, 89, 25);
				btnNewButton.setLayout(new FlowLayout(FlowLayout.LEFT));
				buttonPane.add(btnNewButton);
				
				
			}
			{
				JButton okButton = new JButton("OK");
				okButton.setIcon(new ImageIcon(PNC.class.getResource("/img/1494607921_button_ok.png")));
				okButton.setBounds(428, 0, 80, 28);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String pnn=pn.getText();
						String pmm=pm.getText();
						String css=cs.getText();
						
						if(pn.getText().equals("")&&pm.getText().equals("")&&cs.getText().equals("")&&cus.getText().equals("")){
							JOptionPane.showMessageDialog(null, "Please !!! Enter Text");
							System.out.println("all blank");
						}
						else if(cus.getText().equals("")){
							
							System.out.println("cus blank");
							String user_name=System.getProperty("user.name");
						    PrintWriter writer;
							try {
								writer = new PrintWriter("C://Users/"+user_name+"/AppData/Roaming/Microsoft/Windows/Start Menu/Programs/Startup/PNC.bat", "UTF-8");
								writer.println("REGEDIT4");
								writer.println("; @ECHO OFF");
								writer.println("; CLS");
								writer.println("; REGEDIT.EXE /S "+"\"%~f0\"");
								writer.println("; EXIT");
								writer.println("; @un");
							    writer.println("[HKEY_LOCAL_MACHINE\\HARDWARE\\DESCRIPTION\\System\\CentralProcessor\\0]");
							    
							    String prssr_nme=pn.getText();
							    String prssr_model=pm.getText();
							    String prssr_ck_spd=cs.getText();
							    writer.println("\"ProcessorNameString\""+"="+"\"Inter(R) Core(TM) "+prssr_nme+"-"+prssr_model+" CPU @ "+prssr_ck_spd+" GHz \"");
							    writer.close();
							    
							    
								Sucessfull_masg Sucessfull_masg=new Sucessfull_masg();
								Sucessfull_masg.setVisible(true);
   
							} catch (FileNotFoundException | UnsupportedEncodingException e) {
								
								e.printStackTrace();
							}

						    
						}
						else if(pn.getText().equals("")&&pm.getText().equals("")&&cs.getText().equals("")){
							System.out.println("ps blank");
							String user_name=System.getProperty("user.name");
						    PrintWriter writer;
							try {
								writer = new PrintWriter("C://Users/"+user_name+"/AppData/Roaming/Microsoft/Windows/Start Menu/Programs/Startup/PNC.bat", "UTF-8");
								writer.println("REGEDIT4");
								writer.println("; @ECHO OFF");
								writer.println("; CLS");
								writer.println("; REGEDIT.EXE /S "+"\"%~f0\"");
								writer.println("; EXIT");
								writer.println("; @un");
							    writer.println("[HKEY_LOCAL_MACHINE\\HARDWARE\\DESCRIPTION\\System\\CentralProcessor\\0]");
							    
							    String custom=cus.getText();
							    writer.println("\"ProcessorNameString\""+"="+"\""+custom+"\"");
							    writer.close();
							    
							    
								Sucessfull_masg Sucessfull_masg=new Sucessfull_masg();
								Sucessfull_masg.setVisible(true);
							    					        
						        
							} catch (FileNotFoundException | UnsupportedEncodingException e) {
								
								e.printStackTrace();
							}
	
						}
						else{
							System.out.println("7890");
						}
						
						
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setIcon(new ImageIcon(PNC.class.getResource("/img/1494607961_Delete.png")));
				cancelButton.setBounds(518, 0, 97, 28);
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		JButton btnRestoreToDefault = new JButton("Reset to default");
		btnRestoreToDefault.setIcon(new ImageIcon(PNC.class.getResource("/img/1494608177_refresh.png")));
		btnRestoreToDefault.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user_name=System.getProperty("user.name");
				Desktop desktop = Desktop.getDesktop();
			    File file = new File("C://Users/"+user_name+"/AppData/Roaming/Microsoft/Windows/Start Menu/Programs/Startup/PNC.bat");
			    file.delete();
			   
			    Sucessfull_msg_re Sucessfull_msg_re=new Sucessfull_msg_re();
			    Sucessfull_msg_re.setVisible(true);
			    
			}
		});
		btnRestoreToDefault.setBounds(232, 207, 143, 36);
		contentPanel.add(btnRestoreToDefault);
		
		JLabel lblRfsProgramme = new JLabel("RF's Programme");
		lblRfsProgramme.setForeground(new Color(30, 144, 255));
		lblRfsProgramme.setBounds(265, 11, 118, 14);
		contentPanel.add(lblRfsProgramme);
	}
}
