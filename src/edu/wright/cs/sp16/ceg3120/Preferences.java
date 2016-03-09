/*
 * Copyright (C) 2016
 * 
 * 
 * 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package edu.wright.cs.sp16.ceg3120;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;



/**
 * This class is created to display the preferences window which contains the
 * connections and the user preferences. The user will set the default database,
 * default view, default encoding, table view, and remember any few number of
 * last queries.
 */
public class Preferences extends JPanel {



	/**
	 * generic static final long serialVersionUID.
	 */
	private static final long serialVersionUID = 3936531799918625132L;



	// Components of window declaration - do not modify
	private JComboBox<String> choice1;
	private JComboBox<String> choice2;
	private JComboBox<String> choice3;
	private JLabel defaultEncoding;
	private JLabel defaultFavorite;
	private JLabel defaultView;
	private JCheckBox gridLines;
	private JComboBox<NumberOfQueries> pxQueries;
	private JLabel queries;
	private JLabel rememberLast;
	private JCheckBox startupConnect;
	private JCheckBox startupMotd;
	private JLabel tableViews;
	private JCheckBox useMonospaced;
	// End of variables declaration



	/**
	 * Constructor with zero-arguments to open the connection window.
	 */
	public Preferences() {


		// This method is created by GUI Builder to customize how the window
		// will look like ,,,
		initComponents();
	} // End of Constructor method ,,,



	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initComponents() {

		// Initializing components of the window ,,,

		defaultFavorite = new JLabel();   //default database
		defaultView = new JLabel();       //default view
		defaultEncoding = new JLabel();   //default encoding
		tableViews = new JLabel();        //table views
		rememberLast = new JLabel();     //remember last
		choice1 = new JComboBox<String>();          //default database
		choice2 = new JComboBox<String>();          //default view
		choice3 = new JComboBox<String>();          //default encoding
		startupConnect = new JCheckBox();   //connect on startup
		startupMotd = new JCheckBox();      //show message of the day
		useMonospaced = new JCheckBox();    //use monospaced fonts
		gridLines = new JCheckBox();        //show gridlines
		pxQueries = new JComboBox<NumberOfQueries>();    //show queries
		queries = new JLabel();


		defaultFavorite.setText("Default Database:");

		defaultView.setText("Default View:");

		defaultEncoding.setText("Default Encoding:");

		tableViews.setText("Table Views:");

		rememberLast.setText("Remember Last:");

		startupConnect.setFont(new Font("Lucida Grande", 0, 11)); // NOI18N
		startupConnect.setText("Connect to Default on Startup");

		startupMotd.setFont(new Font("Lucida Grande", 0, 11)); // NOI18N
		startupMotd.setText("\"Message of the Day\" on Startup");

		useMonospaced.setFont(new Font("Lucida Grande", 0, 11)); // NOI18N
		useMonospaced.setText("Use monospaced fonts");

		gridLines.setFont(new Font("Lucida Grande", 0, 11)); // NOI18N
		gridLines.setText("Display vertical grid lines");

		pxQueries.setModel(new DefaultComboBoxModel(new NumberOfQueries[] {
				NumberOfQueries.Zero, NumberOfQueries.Five,
				NumberOfQueries.Ten, NumberOfQueries.Twenty }));

		queries.setText("queries");
		
		JButton btnSave = new JButton("Save");
/* we have to work on the cancel button currently it will close the entire window 
  when it is hit. We have to reconfigure so it can just close the preference tab. **/		
		JButton btnCancel = new JButton("Cancel");
	btnCancel.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				System.exit(0);
		}
	});

		GroupLayout jpanel2Layout = new GroupLayout(this);
		jpanel2Layout.setHorizontalGroup(
				jpanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jpanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jpanel2Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(defaultFavorite)
						.addComponent(defaultEncoding)
						.addComponent(defaultView)
						.addComponent(tableViews)
						.addComponent(rememberLast))
					.addGap(59)
					.addGroup(jpanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jpanel2Layout.createSequentialGroup()
							.addComponent(
									pxQueries, 
									GroupLayout.PREFERRED_SIZE, 
									GroupLayout.DEFAULT_SIZE, 
									GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(queries)
							.addPreferredGap(ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
							.addComponent(btnSave)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancel))
						.addComponent(useMonospaced)
						.addComponent(choice3, 
								GroupLayout.PREFERRED_SIZE, 166, 
								GroupLayout.PREFERRED_SIZE)
						.addComponent(choice2, 
								GroupLayout.PREFERRED_SIZE, 166, 
								GroupLayout.PREFERRED_SIZE)
						.addComponent(choice1, 
								GroupLayout.PREFERRED_SIZE, 166, 
								GroupLayout.PREFERRED_SIZE)
						.addComponent(startupConnect)
						.addComponent(startupMotd)
						.addComponent(gridLines))
					.addContainerGap())
		);
		jpanel2Layout.setVerticalGroup(
				jpanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jpanel2Layout.createSequentialGroup()
					.addGap(20)
					.addGroup(jpanel2Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(defaultFavorite)
						.addComponent(choice1, 
								GroupLayout.PREFERRED_SIZE, 
								GroupLayout.DEFAULT_SIZE, 
								GroupLayout.PREFERRED_SIZE))
					.addGap(2)
					.addComponent(startupConnect)
					.addGap(3)
					.addComponent(startupMotd)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jpanel2Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(defaultView)
						.addComponent(choice3, 
								GroupLayout.PREFERRED_SIZE, 
								GroupLayout.DEFAULT_SIZE, 
								GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(jpanel2Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(defaultEncoding)
						.addComponent(choice2, 
								GroupLayout.PREFERRED_SIZE, 
								GroupLayout.DEFAULT_SIZE, 
								GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(jpanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jpanel2Layout.createSequentialGroup()
							.addComponent(useMonospaced)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(gridLines))
						.addComponent(tableViews))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jpanel2Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(rememberLast)
						.addGroup(jpanel2Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(pxQueries, 
									GroupLayout.PREFERRED_SIZE, 
									GroupLayout.DEFAULT_SIZE, 
									GroupLayout.PREFERRED_SIZE)
							.addComponent(queries)))
					.addContainerGap(33, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, jpanel2Layout.createSequentialGroup()
					.addContainerGap(236, Short.MAX_VALUE)
					.addGroup(jpanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSave)
						.addComponent(btnCancel))
					.addContainerGap())
		);
		this.setLayout(jpanel2Layout);

//		otherConnection.addTab("User Preferences", jpanel2);

//		GroupLayout layout = new GroupLayout(getContentPane());
//		getContentPane().setLayout(layout);
//		layout.setHorizontalGroup(layout.createParallelGroup(
//				leading).addComponent(otherConnection));
//		layout.setVerticalGroup(layout.createParallelGroup(
//				leading).addGroup(
//						GroupLayout.Alignment.TRAILING,
//						layout.createSequentialGroup().addComponent(otherConnection)
//						.addContainerGap()));

		// This is to close the window when the 'X' button is clicked ,,,
//		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// This is to view the window after it is constructed ,,,
		setVisible(true);

		// This is to control the size and boundaries of the window after it is
		// constructed ,,,
		// pack();
	} // End of initComponents method ,,,




	protected static void exit(int i) {
		// TODO Auto-generated method stub
		
	}



	/**
	 * The method to run the profile window.
	 * This now runs from MainApp by clicking the profile button
	 */
	public static void mainProfile() {
		/* Set the Nimbus look and feel */
		// <editor-fold default state="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (UIManager.LookAndFeelInfo info : UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Preferences.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Preferences.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Preferences.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Preferences.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Preferences().setVisible(true);
			}
		});
	}
} // End of Profile class ,,,
