import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class WartezimmerGUI {

	private JFrame frmWartezimmer;
	private JTextField tfName;
	private JTextField tfKasse;
	private List liste = new List();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WartezimmerGUI window = new WartezimmerGUI();
					window.frmWartezimmer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WartezimmerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWartezimmer = new JFrame();
		frmWartezimmer.setTitle("Wartezimmer");
		frmWartezimmer.setBounds(100, 100, 247, 424);
		frmWartezimmer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWartezimmer.getContentPane().setLayout(null);
		
		tfName = new JTextField();
		tfName.setBounds(65, 60, 150, 20);
		frmWartezimmer.getContentPane().add(tfName);
		tfName.setColumns(10);
		
		tfKasse = new JTextField();
		tfKasse.setColumns(10);
		tfKasse.setBounds(65, 115, 150, 20);
		frmWartezimmer.getContentPane().add(tfKasse);
		
		JButton bAnmelden = new JButton("Anmelden");
		bAnmelden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				uebergebeNameUndKasse();
			}
		});
		bAnmelden.setBounds(65, 160, 95, 23);
		frmWartezimmer.getContentPane().add(bAnmelden);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 60, 58, 20);
		frmWartezimmer.getContentPane().add(lblName);
		
		JLabel lblKasse = new JLabel("Kasse:");
		lblKasse.setBounds(10, 118, 46, 14);
		frmWartezimmer.getContentPane().add(lblKasse);
		
		JLabel lblNewLabel = new JLabel("N\u00E4chster Patient bitte...");
		lblNewLabel.setBounds(10, 200, 205, 14);
		frmWartezimmer.getContentPane().add(lblNewLabel);
		
		JButton btnAbmelden = new JButton("Abmelden");
		btnAbmelden.setBounds(65, 351, 95, 23);
		frmWartezimmer.getContentPane().add(btnAbmelden);
		
		JLabel lblNewLabel_1 = new JLabel("Doktor [Redacted]");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(31, 11, 184, 38);
		frmWartezimmer.getContentPane().add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 214, 211, 126);
		frmWartezimmer.getContentPane().add(textArea);
		
	}
	
	
	public void uebergebeNameUndKasse() {
		
		String name = gibAnzeigeAlsText(tfName);
		String kasse = gibAnzeigeAlsText(tfKasse);
        liste.addList(name,kasse);
        
	}
	
	public String gibAnzeigeAlsText(JTextField tfAnzeige) {

		return tfAnzeige.getText();

	}
}
