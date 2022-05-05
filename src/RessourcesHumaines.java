import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Toolkit;

public class RessourcesHumaines {

	private JFrame Accueil_RH;
	private JTable Liste_emp;
	private JTextField txtNom;
	private JTextField txtPrenom;
	private JTextField txtFonction;
	private JTextField txtAdresse;
	private JTextField txtTelephone;
	private JTextField txtEmail;
	private JTextField txtCivilite;
	private JTextField txtSituationConjugale;
	private JTextField txtNombreEnfant;
	private JTextField txtAntecedentMedical;
	private JTextField txtDateEmbauche;
	private JTextField txtJourCongeRestant;
	private JTextField txtDateFinContrat;
	private JTextField txtId;
	private JTextField IdEmp;
	private JTextField UpNom;
	private JTextField UpPrenom;
	private JTextField UpFonction;
	private JTextField UpAdresse;
	private JTextField UpTelephone;
	private JTextField UpEmail;
	private JTextField UpCivilite;
	private JTextField UpSituationConjugale;
	private JTextField UpNombreEnfant;
	private JTextField UpAntecedentMedical;
	private JTextField UpDateEmbauche;
	private JTextField UpJourCongeRestant;
	private JTextField UpDateFinContrat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RessourcesHumaines window = new RessourcesHumaines();
					window.Accueil_RH.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RessourcesHumaines() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Accueil_RH = new JFrame();
		Accueil_RH.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Lafatra\\BTS SIO\\Eclipse\\CyberCar\\src\\image\\pngtree-car-logo-vector-png-image_1811627.jpg"));
		Accueil_RH.setTitle("Accueil RH");
		Accueil_RH.getContentPane().setBackground(Color.black);
		Accueil_RH.setBounds(100, 100, 1122, 658);
		Accueil_RH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Accueil_RH.getContentPane().setLayout(null);
		
		//------------ Menu pour les frames ------------//
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setBounds(416, 0, 690, 619);
		Accueil_RH.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Ajouter employé", null, panel, null);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Formulaire d'inscription : ");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(302, 11, 199, 33);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom :");
		lblNewLabel_1.setBounds(84, 118, 94, 14);
		panel.add(lblNewLabel_1);
		
		txtNom = new JTextField();
		txtNom.setBounds(220, 115, 86, 20);
		panel.add(txtNom);
		txtNom.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Pr\u00E9nom");
		lblNewLabel_2.setBounds(84, 158, 94, 14);
		panel.add(lblNewLabel_2);
		
		txtPrenom = new JTextField();
		txtPrenom.setBounds(220, 155, 86, 20);
		panel.add(txtPrenom);
		txtPrenom.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Fonction : ");
		lblNewLabel_3.setBounds(84, 205, 94, 14);
		panel.add(lblNewLabel_3);
		
		txtFonction = new JTextField();
		txtFonction.setBounds(220, 202, 86, 20);
		panel.add(txtFonction);
		txtFonction.setColumns(10);
		
		JRadioButton btnHomme = new JRadioButton("Homme");
		btnHomme.setBounds(223, 292, 83, 23);
		panel.add(btnHomme);
		
		JRadioButton btnFemme = new JRadioButton("Femme");
		btnFemme.setBounds(302, 292, 86, 23);
		panel.add(btnFemme);
		
		JLabel lblNewLabel_4 = new JLabel("Sexe :");
		lblNewLabel_4.setBounds(84, 296, 94, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Adresse :");
		lblNewLabel_5.setBounds(84, 249, 94, 14);
		panel.add(lblNewLabel_5);
		
		txtAdresse = new JTextField();
		txtAdresse.setBounds(220, 246, 86, 20);
		panel.add(txtAdresse);
		txtAdresse.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("T\u00E9l\u00E9phone :");
		lblNewLabel_6.setBounds(84, 347, 94, 14);
		panel.add(lblNewLabel_6);
		
		txtTelephone = new JTextField();
		txtTelephone.setBounds(220, 344, 86, 20);
		panel.add(txtTelephone);
		txtTelephone.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Email : ");
		lblNewLabel_7.setBounds(84, 392, 94, 14);
		panel.add(lblNewLabel_7);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(220, 389, 86, 20);
		panel.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Civilit\u00E9 :");
		lblNewLabel_8.setBounds(84, 441, 94, 14);
		panel.add(lblNewLabel_8);
		
		txtCivilite = new JTextField();
		txtCivilite.setBounds(220, 438, 86, 20);
		panel.add(txtCivilite);
		txtCivilite.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Situation conjugale : ");
		lblNewLabel_9.setBounds(407, 73, 126, 14);
		panel.add(lblNewLabel_9);
		
		txtSituationConjugale = new JTextField();
		txtSituationConjugale.setBounds(562, 70, 86, 20);
		panel.add(txtSituationConjugale);
		txtSituationConjugale.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Jour de cong\u00E9 restant :");
		lblNewLabel_10.setBounds(407, 249, 132, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Date de fin du contrat :");
		lblNewLabel_11.setBounds(407, 293, 132, 20);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Date d'embauche :");
		lblNewLabel_12.setBounds(407, 205, 132, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Ant\u00E9c\u00E9dent M\u00E9dical : ");
		lblNewLabel_13.setBounds(407, 158, 132, 14);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Nombre d'enfant : ");
		lblNewLabel_14.setBounds(407, 118, 132, 14);
		panel.add(lblNewLabel_14);
		
		txtNombreEnfant = new JTextField();
		txtNombreEnfant.setBounds(562, 115, 86, 20);
		panel.add(txtNombreEnfant);
		txtNombreEnfant.setColumns(10);
		
		txtAntecedentMedical = new JTextField();
		txtAntecedentMedical.setBounds(562, 155, 86, 20);
		panel.add(txtAntecedentMedical);
		txtAntecedentMedical.setColumns(10);
		
		txtDateEmbauche = new JTextField();
		txtDateEmbauche.setBounds(562, 202, 86, 20);
		panel.add(txtDateEmbauche);
		txtDateEmbauche.setColumns(10);
		
		txtJourCongeRestant = new JTextField();
		txtJourCongeRestant.setBounds(562, 246, 86, 20);
		panel.add(txtJourCongeRestant);
		txtJourCongeRestant.setColumns(10);
		
		txtDateFinContrat = new JTextField();
		txtDateFinContrat.setBounds(562, 293, 86, 20);
		panel.add(txtDateFinContrat);
		txtDateFinContrat.setColumns(10);
		
		
		
													// Insertion des données dans la base de donnée //
		
		JButton btnNewButton_1 = new JButton("Ajouter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
							// Stockage des dpnnées saisis par l'utilisateur dans des variables de type string ou integer //
				
				String Nom = txtNom.getText();
				String Prenom = txtPrenom.getText();
				String Fonction = txtFonction.getText();
				String Adresse = txtAdresse.getText();
				String Telephone = txtTelephone.getText();
				String Email = txtEmail.getText();
				String Civilite =txtCivilite.getText();
				String SituationConjugale = txtSituationConjugale.getText();
				String NombreEnfant = txtNombreEnfant.getText();
				String AntecedentMedical = txtAntecedentMedical.getText();
				String DateEmbauche = txtDateEmbauche.getText();
				String JourCongeRestant = txtJourCongeRestant.getText();
				String DateFinContrat = txtDateFinContrat.getText();
				String ID = txtId.getText();
				
				
								// Connection et insertion à la base de donnée //
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ap4cybercar", "root", "");
					Statement stmt = conn.createStatement();
					
												// Requette SQL de l'insertion //
					
					String sql = "INSERT INTO employées VALUES('"+ID+"','"+Nom+"','"+Prenom+"','"+Fonction+"','"+Adresse+"','"+Telephone+"','"+Email+"','"+Civilite+"','"+SituationConjugale+"','"+NombreEnfant+"','"+AntecedentMedical+"','"+DateEmbauche+"','"+JourCongeRestant+"','"+DateFinContrat+"')";
					//String sql = "INSERT INTO employées VALUES("+IdEmp+"','"+Nom+"','"+Prenom+"','"+Fonction+"','"+Adresse+"','"+Telephone+"','"+Email+"','"+Civilite+"','"+SituationConjugale+"','"+NombreEnfant+"','"+AntecedentMedical+"','"+DateEmbauche+"','"+Jour_Conge_Restant+"','"+DateFinContrat+"')";
					stmt.executeUpdate(sql);
					
					JOptionPane.showMessageDialog(null,"Les informations de l'employé saisis à été bien insérer à la base de donnée");
					
										// Efface les champs dans l'interface //
					txtNom.setText(null);
					txtPrenom.setText(null);
					txtFonction.setText(null);
					txtAdresse.setText(null);
					txtTelephone.setText(null);
					txtEmail.setText(null);
					txtCivilite.setText(null);
					txtSituationConjugale.setText(null);
					txtNombreEnfant.setText(null);
					txtAntecedentMedical.setText(null);
					txtDateEmbauche.setText(null);
					txtJourCongeRestant.setText(null);
					txtDateFinContrat.setText(null);
					
				} catch (Exception erreur) {
					
					System.out.println("Erreur lors de l'insertion des données à la base" + erreur);
					
				}
				
			}
		});
		btnNewButton_1.setForeground(new Color(0, 128, 0));
		btnNewButton_1.setBounds(559, 343, 89, 23);
		panel.add(btnNewButton_1);
		
		
													// Action 'effacer' du bouton annuler //
		
		JButton btnNewButton_2 = new JButton("Annuler");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtNom.setText(null);
				txtPrenom.setText(null);
				txtFonction.setText(null);
				txtAdresse.setText(null);
				txtTelephone.setText(null);
				txtEmail.setText(null);
				txtCivilite.setText(null);
				txtSituationConjugale.setText(null);
				txtNombreEnfant.setText(null);
				txtAntecedentMedical.setText(null);
				txtDateEmbauche.setText(null);
				txtJourCongeRestant.setText(null);
				txtDateFinContrat.setText(null);
				
			}
		});
		btnNewButton_2.setForeground(new Color(255, 0, 0));
		btnNewButton_2.setBounds(407, 343, 94, 23);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_15 = new JLabel("ID");
		lblNewLabel_15.setBounds(84, 73, 46, 14);
		panel.add(lblNewLabel_15);
		
		txtId = new JTextField();
		txtId.setBounds(220, 70, 86, 20);
		panel.add(txtId);
		txtId.setColumns(10);
		
		JPanel panel_employé = new JPanel();
		panel_employé.setBackground(Color.WHITE);
		tabbedPane.addTab("Liste des employés", null, panel_employé, null);
		panel_employé.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 45, 685, 537);
		panel_employé.add(scrollPane);
		
		Liste_emp = new JTable();
		Liste_emp.setForeground(Color.DARK_GRAY);
		scrollPane.setColumnHeaderView(Liste_emp);
		
		JButton btnNewButton = new JButton("Afficher la liste des employ\u00E9s");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(229, 11, 238, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					
					
					Class.forName("com.mysql.jdbc.Driver");
					
											//----- Connexion à la base de donnée -----//
					//----- nom de la base + nom d'utilisateur + mot de passe -----//
					
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ap4cybercar", "root", "");
					
											//----- Requêtte SQL à la base de donnée -----//
					
					String sql = "SELECT Nom, Prenom, Fonction, Adresse, Telephone FROM ap4cybercar.employées";
					//String sql = "SELECT * FROM ap4cybercar.employées";
					
					PreparedStatement stmt = conn.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery();
					
					Liste_emp.setModel(DbUtils.resultSetToTableModel(rs));
					
				} catch(Exception err) {
					System.out.println("Error! Not connected into database" + err);
				}
			}
		});
		panel_employé.add(btnNewButton);
		
		JPanel panel_modifierdonnée = new JPanel();
		panel_modifierdonnée.setBackground(Color.WHITE);
		tabbedPane.addTab("Modifier les données d'un employé", null, panel_modifierdonnée, null);
		panel_modifierdonnée.setLayout(null);
		
		JLabel lblNewLabel_16 = new JLabel("Inserer l'identifiant de l'employ\u00E9 :");
		lblNewLabel_16.setBounds(10, 48, 215, 30);
		panel_modifierdonnée.add(lblNewLabel_16);
		
		JLabel lblModificationDesDonnes = new JLabel("Modification des donn\u00E9es : ");
		lblModificationDesDonnes.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificationDesDonnes.setForeground(Color.RED);
		lblModificationDesDonnes.setFont(new Font("Verdana", Font.BOLD, 11));
		lblModificationDesDonnes.setBounds(272, 0, 199, 33);
		panel_modifierdonnée.add(lblModificationDesDonnes);
		
		IdEmp = new JTextField();
		IdEmp.setBounds(250, 53, 102, 20);
		panel_modifierdonnée.add(IdEmp);
		IdEmp.setColumns(10);
		
		JButton btnRechercher = new JButton("Rechercher");
		btnRechercher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 //Récupération de l'Id siasi par l'utilisateur
				
				String MAJEmp = IdEmp.getText();
				
				 // Transformer L'id en type entier
				
				//int MajEmp = Integer.parseInt(MAJEmp);
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ap4cybercar", "root", "");
					Statement stmt = conn.createStatement();
					
					String sql = "SELECT * FROM employées WHERE idEmp =("+MAJEmp+")";
					stmt.executeQuery(sql);
					//UpNom.setText(Nom);
					
					//JOptionPane.showMessageDialog(null,"Driver's information deleted to database");
					//txt_DriverID_Delete.setText(null);
					conn.close();
					
				} catch (Exception err){
						System.out.println("Error! Not connected into database" + err);
				}
			}
		});
		btnRechercher.setBounds(362, 52, 109, 23);
		panel_modifierdonnée.add(btnRechercher);
		
		UpNom = new JTextField();
		UpNom.setBounds(181, 109, 125, 20);
		panel_modifierdonnée.add(UpNom);
		UpNom.setColumns(10);
		
		JButton btnMaj = new JButton("Mettre \u00E0 jour");
		btnMaj.setForeground(Color.BLUE);
		btnMaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					
					// Connection à la base de donnée
					
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ap4cybercar", "root", "");
					
					/*									Premier methode
					 * Statement stmt = conn.createStatement();
					
					String sqlUpdate = "UPDATE employées SET Nom = ("+NomUp+") WHERE idEmp = ("+Id+")";
					stmt.executeUpdate(sqlUpdate);
					*/
					
													//Deuxième méthode
					
					PreparedStatement st = conn.prepareStatement("UPDATE employées Set Nom =?, Prenom=?, Fonction =?, Adresse =?, Telephone =?, Email =?, Civilité =?, SituationConjugale =?, NbrEnfant =?, AntécédentMédical =?, DateEmbauche =?, JourDeCongéRestant =?, DateFinDeContrat =?  WHERE idEmp =?");
					st.setString(1, UpNom.getText());
					st.setString(2, UpPrenom.getText());
					st.setString(3, UpFonction.getText());
					st.setString(4, UpAdresse.getText());
					st.setString(5, UpTelephone.getText());
					st.setString(6, UpEmail.getText());
					st.setString(7, UpCivilite.getText());
					st.setString(8, UpSituationConjugale.getText());
					st.setString(9, UpNombreEnfant.getText());
					st.setString(10, UpAntecedentMedical.getText());
					st.setString(11, UpDateEmbauche.getText());
					st.setString(12, UpJourCongeRestant.getText());
					st.setString(13, UpDateFinContrat.getText());
					st.setString(14, IdEmp.getText());
					st.executeUpdate();
					conn.close();
					
				} catch (Exception err){
						System.out.println("Erreur lors de la connection à la base de donnée" + err);
				}
				
			}
		});
		btnMaj.setBounds(376, 511, 126, 27);
		panel_modifierdonnée.add(btnMaj);
		
		JLabel lblNewLabel_17 = new JLabel("Nom :");
		lblNewLabel_17.setBounds(37, 112, 94, 14);
		panel_modifierdonnée.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Pr\u00E9nom : ");
		lblNewLabel_18.setBounds(37, 163, 94, 14);
		panel_modifierdonnée.add(lblNewLabel_18);
		
		UpPrenom = new JTextField();
		UpPrenom.setColumns(10);
		UpPrenom.setBounds(180, 160, 126, 20);
		panel_modifierdonnée.add(UpPrenom);
		
		JLabel lblNewLabel_3_1 = new JLabel("Fonction : ");
		lblNewLabel_3_1.setBounds(37, 217, 94, 14);
		panel_modifierdonnée.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Adresse :");
		lblNewLabel_5_1.setBounds(37, 273, 94, 14);
		panel_modifierdonnée.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("T\u00E9l\u00E9phone :");
		lblNewLabel_6_1.setBounds(37, 325, 94, 14);
		panel_modifierdonnée.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("Email : ");
		lblNewLabel_7_1.setBounds(37, 376, 94, 14);
		panel_modifierdonnée.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("Civilit\u00E9 :");
		lblNewLabel_8_1.setBounds(37, 432, 94, 14);
		panel_modifierdonnée.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("Situation conjugale : ");
		lblNewLabel_9_1.setBounds(376, 112, 126, 14);
		panel_modifierdonnée.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_14_1 = new JLabel("Nombre d'enfant : ");
		lblNewLabel_14_1.setBounds(376, 163, 132, 14);
		panel_modifierdonnée.add(lblNewLabel_14_1);
		
		JLabel lblNewLabel_13_1 = new JLabel("Ant\u00E9c\u00E9dent M\u00E9dical : ");
		lblNewLabel_13_1.setBounds(376, 217, 132, 14);
		panel_modifierdonnée.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_12_1 = new JLabel("Date d'embauche :");
		lblNewLabel_12_1.setBounds(376, 273, 132, 14);
		panel_modifierdonnée.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("Jour de cong\u00E9 restant :");
		lblNewLabel_10_1.setBounds(376, 325, 132, 14);
		panel_modifierdonnée.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_11_1 = new JLabel("Date de fin du contrat :");
		lblNewLabel_11_1.setBounds(376, 373, 132, 20);
		panel_modifierdonnée.add(lblNewLabel_11_1);
		
		UpFonction = new JTextField();
		UpFonction.setColumns(10);
		UpFonction.setBounds(180, 214, 126, 20);
		panel_modifierdonnée.add(UpFonction);
		
		UpAdresse = new JTextField();
		UpAdresse.setColumns(10);
		UpAdresse.setBounds(180, 270, 126, 20);
		panel_modifierdonnée.add(UpAdresse);
		
		UpTelephone = new JTextField();
		UpTelephone.setColumns(10);
		UpTelephone.setBounds(180, 322, 126, 20);
		panel_modifierdonnée.add(UpTelephone);
		
		UpEmail = new JTextField();
		UpEmail.setColumns(10);
		UpEmail.setBounds(181, 373, 126, 20);
		panel_modifierdonnée.add(UpEmail);
		
		UpCivilite = new JTextField();
		UpCivilite.setColumns(10);
		UpCivilite.setBounds(181, 429, 126, 20);
		panel_modifierdonnée.add(UpCivilite);
		
		UpSituationConjugale = new JTextField();
		UpSituationConjugale.setColumns(10);
		UpSituationConjugale.setBounds(528, 109, 126, 20);
		panel_modifierdonnée.add(UpSituationConjugale);
		
		UpNombreEnfant = new JTextField();
		UpNombreEnfant.setColumns(10);
		UpNombreEnfant.setBounds(528, 160, 126, 20);
		panel_modifierdonnée.add(UpNombreEnfant);
		
		UpAntecedentMedical = new JTextField();
		UpAntecedentMedical.setColumns(10);
		UpAntecedentMedical.setBounds(528, 214, 126, 20);
		panel_modifierdonnée.add(UpAntecedentMedical);
		
		UpDateEmbauche = new JTextField();
		UpDateEmbauche.setColumns(10);
		UpDateEmbauche.setBounds(528, 270, 126, 20);
		panel_modifierdonnée.add(UpDateEmbauche);
		
		UpJourCongeRestant = new JTextField();
		UpJourCongeRestant.setColumns(10);
		UpJourCongeRestant.setBounds(528, 322, 126, 20);
		panel_modifierdonnée.add(UpJourCongeRestant);
		
		UpDateFinContrat = new JTextField();
		UpDateFinContrat.setColumns(10);
		UpDateFinContrat.setBounds(528, 373, 126, 20);
		panel_modifierdonnée.add(UpDateFinContrat);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UpNom.setText(null);
				UpPrenom.setText(null);
				UpFonction.setText(null);
				UpAdresse.setText(null);
				UpTelephone.setText(null);
				UpEmail.setText(null);
				UpCivilite.setText(null);
				UpSituationConjugale.setText(null);
				UpNombreEnfant.setText(null);
				UpAntecedentMedical.setText(null);
				UpDateEmbauche.setText(null);
				UpJourCongeRestant.setText(null);
				UpDateFinContrat.setText(null);
				IdEmp.setText(null);
				
			}
		});
		btnAnnuler.setForeground(Color.RED);
		btnAnnuler.setBounds(206, 511, 126, 27);
		panel_modifierdonnée.add(btnAnnuler);
		
		JLabel lbl_Logo = new JLabel("");
		lbl_Logo.setBackground(Color.WHITE);
		lbl_Logo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Logo.setIcon(new ImageIcon("D:\\Lafatra\\BTS SIO\\Eclipse\\CyberCar\\src\\image\\BGT.png"));
		lbl_Logo.setBounds(0, 0, 415, 610);
		Accueil_RH.getContentPane().add(lbl_Logo);
	}
}
