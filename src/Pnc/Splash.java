package Pnc;

import java.awt.Color;
import java.net.MalformedURLException;
import java.net.URL;

import com.thehowtotutorial.splashscreen.JSplash;



public class Splash {

	public static void main(String[] args) throws InterruptedException {
		

			JSplash j=new JSplash(Splash.class.getResource("/img/aa.jpg"), true, true, true, "", null, Color.RED, Color.blue);
			j.getProgressBar().setForeground(new Color(0, 0, 0));
			j.getProgressBar().setBounds(1, 278, 419, 29);
			j.getProgressBar().setBorder(null);
			j.getProgressBar().setBorderPainted(false);
			j.getContentPane().setLayout(null);
			
			j.splashOn();
			for(int i=0;i<100;i++){
				j.setProgress(i, "as");
				Thread.sleep(30);
			}
			
			
			j.splashOff();
			
			
			PNC p=new PNC();
			p.main(null);
			//p.setVisible(true);

	}

}
