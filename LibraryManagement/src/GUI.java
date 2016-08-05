import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.sql.*
;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.ScrollPaneConstants;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.util.*;
import java.util.Date;
public class GUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTable table_1;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTable table_2;
	private JTextField textField_22;
	private JTextField textField_23;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 689, 451);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 671, 404);
		frame.getContentPane().add(tabbedPane);
		
		
		   
		
		JPanel Library = new JPanel();
		tabbedPane.addTab("Library", null, Library, null);
		Library.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HomePage");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(166, 23, 194, 39);
		Library.add(lblNewLabel);
		
		Connect con = new Connect();
		String query1 = "desc book_copies";
		ResultSet result = con.Connection(query1);
		int row = 0;
		try {
			while(result.next()){
				String s = result.getString("Field");
				row++;
			
			}
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		System.out.println(row);
		if(row==3)
		{
		String query = "Alter table book_copies add remaining_books int(10)";
	     con.Connection2(query);
	    query = "update book_copies set remaining_books = no_of_copies";
	    con.Connection2(query);
		}
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(41, 109, 112, 25);
		Library.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Check-In");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_1.setBounds(41, 147, 112, 25);
		Library.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Check-Out");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnNewButton_2.setBounds(41, 185, 112, 25);
		Library.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Fines");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(5);
			}
		});
		btnNewButton_3.setBounds(198, 147, 119, 25);
		Library.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Borrower");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnNewButton_4.setBounds(198, 109, 119, 25);
		Library.add(btnNewButton_4);
		
		JPanel Book_Search = new JPanel();
		tabbedPane.addTab("Book Search", null, Book_Search, null);
		Book_Search.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ISBN");
		lblNewLabel_1.setBounds(42, 25, 56, 16);
		Book_Search.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(168, 19, 116, 22);
		Book_Search.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Title");
		lblNewLabel_2.setBounds(42, 54, 56, 29);
		Book_Search.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(168, 54, 116, 22);
		Book_Search.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Author Name");
		lblNewLabel_3.setBounds(42, 96, 87, 31);
		Book_Search.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(168, 94, 116, 22);
		Book_Search.add(textField_2);
		textField_2.setColumns(10);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(12, 160, 642, 201);
		Book_Search.add(scrollPane1);
		
		
		JButton btnNewButton_5 = new JButton("Search");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table = new JTable();
				DefaultTableModel model3 = new DefaultTableModel(){
					public Class<?> getColumnClass(int column){
						switch(column){
						case 0:
							return String.class;
						case 1:
							return String.class;
						case 2:
							return String.class;
						case 3:
							return String.class;
						case 4:
							return String.class;
						case 5:
							return String.class;
						case 6:
							return String.class;
						default:
							return String.class;
						}
					}
				};
				model3.addColumn("ISBN");
				model3.addColumn("Book Title");
				model3.addColumn("Author name");
				//model3.addColumn("Author.Lname");
				model3.addColumn("Branch Name");
				model3.addColumn("Branch ID");
				model3.addColumn("Total Copies");
				model3.addColumn("Copies Available");
				
				table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
							"ISBN","Book Title","Author name", "Branch Name", "Branch ID","Total Copies","Copies Available"
					}
				));
				
				table.setModel(model3);
				
				scrollPane1.setViewportView(table);
			
				
				String id = textField.getText();
				String id1  = textField_1.getText();
				String id2 = textField_2.getText();
			String query = "select book.isbn,book.title,authors.fname,authors.fullname,authors.lname,library_branch.branch_id,library_branch.branch_name,book_copies.no_of_copies,book_copies.remaining_books "
					+ " from book,book_authors,authors,book_copies,library_branch where book.isbn = book_authors.isbn "
					+ "and book_authors.author_id = authors.author_id and book.isbn=book_copies.Isbn and book_copies.branch_id = library_branch.branch_id"
					+ " and book.isbn like '%"+id+"%' and book.title like '%"+id1+"%'"
					+ " and (authors.fname like '%"+id2+"%' or authors.lname like '%"+id2+"%')"; 
						
					Connect con = new Connect();
				    ResultSet r = con.Connection(query);
		            ResultSet r1 =con.Connection(query);
				    try{
				    	if(!r1.next()){
				    		textField_23.setText("No books available");
				    		
				    	}
				    	else{
					    while(r.next()){
					    	String s1 = r.getString("book.isbn");
					    	String s2 = r.getString("book.title");
					    	String s3= r.getString("authors.fname");
					    	String s4= r.getString("authors.lname");
					    	String s7 = r.getString("book_copies.no_of_copies");
					    	String s8 = r.getString("book_copies.remaining_books");
					    	String s5 = r.getString("library_branch.branch_name");
					    	String s6 = r.getString("library_branch.branch_id");
					    	String sm = r.getString("authors.fullname");
					    	
					    if((s3.isEmpty()||s3==null)){
					    	 Object[] ob={s1,s2,s4,s5,s6,s7,s8};
								model3.addRow(ob);
								scrollPane1.setVisible(true);  
					    }
					    else 
					    {
					    	Object[] ob={s1,s2,sm,s5,s6,s7,s8};
							model3.addRow(ob);
							scrollPane1.setVisible(true);  	
					    }
					    
					    }
				    	}
					   }
					   catch(Exception e1){
						   e1.printStackTrace();
					   }
				 
			}
		});
		btnNewButton_5.setBounds(384, 63, 97, 25);
		Book_Search.add(btnNewButton_5);
		
		textField_23 = new JTextField();
		textField_23.setBounds(467, 125, 162, 22);
		Book_Search.add(textField_23);
		textField_23.setColumns(10);
		
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Check - In", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("Book ID");
		lblNewLabel_13.setBounds(115, 13, 74, 16);
		panel_2.add(lblNewLabel_13);
		
		textField_12 = new JTextField();
		textField_12.setBounds(224, 10, 116, 22);
		panel_2.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Card no");
		lblNewLabel_14.setBounds(125, 48, 56, 16);
		panel_2.add(lblNewLabel_14);
		
		textField_13 = new JTextField();
		textField_13.setBounds(224, 45, 116, 22);
		panel_2.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Borrower name");
		lblNewLabel_15.setBounds(94, 91, 109, 16);
		panel_2.add(lblNewLabel_15);
		
		textField_14 = new JTextField();
		textField_14.setBounds(224, 88, 116, 22);
		panel_2.add(textField_14);
		textField_14.setColumns(10);
		
		JButton btnNewButton_7 = new JButton("Check In");
		btnNewButton_7.setBounds(24, 177, 97, 25);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int i =0;
				
			while(i<table_1.getRowCount()){
				Boolean checked = Boolean.valueOf(table_1.getValueAt(i,0).toString());
				if(checked){
					JOptionPane.showMessageDialog(null,"Please enter the submission date in 'Date_in' in the following format YYYY-MM-DD");
					break;
				}
				i++;
			}
				
			}
		});
		
		 JScrollPane scrollPane = new JScrollPane();
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
			scrollPane.setBounds(12, 204, 642, 157);
			panel_2.add(scrollPane);
/*			DefaultTableModel model4 = new DefaultTableModel(){
				public Class<?> getColumnClass(int column){
					switch(column){
					case 0:
						return Boolean.class;
					case 1:
						return String.class;
					case 2:
						return String.class;
					case 3:
						return String.class;
					case 4:
						return String.class;
					case 5:
						return String.class;
					case 6:
						return String.class;
					default:
						return String.class;
					}
				}
			};
			model4.addColumn("Selection");
			model4.addColumn("Book_ID");
			model4.addColumn("Loan_ID");
			model4.addColumn("Branch_ID");
			model4.addColumn("Card__no");
			model4.addColumn("Date_out");
			model4.addColumn("Due_Date");
			
			table_1 = new JTable();
			table_1.setModel(model4);
			table_1.getColumnModel().getColumn(6).setPreferredWidth(92);
			scrollPane.setViewportView(table_1);*/
			
			
			
		panel_2.add(btnNewButton_7);
		
	
		
		JButton btnNewButton_8 = new JButton("Get Books");
		btnNewButton_8.setBounds(224, 177, 97, 25);
		btnNewButton_8.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				
			DefaultTableModel model4 = new DefaultTableModel(){
				public Class<?> getColumnClass(int column){
					switch(column){
					case 0:
						return Boolean.class;
					case 1:
						return String.class;
					case 2:
						return String.class;
					case 3:
						return String.class;
					case 4:
						return String.class;
					case 5:
						return String.class;
					case 6:
						return String.class;
					default:
						return String.class;
					}
				}
			};
			model4.addColumn("Selection");
			model4.addColumn("Book_ID");
			model4.addColumn("Loan_ID");
			model4.addColumn("Branch_ID");
			model4.addColumn("Card__no");
			model4.addColumn("Date_out");
			model4.addColumn("Due_Date");
			
			table_1 = new JTable();
			table_1.setModel(model4);
			table_1.getColumnModel().getColumn(6).setPreferredWidth(92);
			scrollPane.setViewportView(table_1);
					
			    String s1 = textField_12.getText();
				String s2 = textField_13.getText();
				String s3 = textField_14.getText();
				
				System.out.println(s1 + s2 + s3);
				System.out.println(s2);
				
				/*String query = "select * from book_loans,borrower where borrower.card_no = book_loans.card_no and (book_loans.Isbn='"+s1+"' or"
						+ " book_loans.card_no = '"+s2+"' or borrower.fname like '%"+s3+"%' or borrower.lname like '%"+s3+"%') and "
						+ " book_loans.date_in='1885-01-01'";*/
				
			/*	String query = "select * from book_loans,borrower where book_loans.card_no = borrower.card_no and ((book_loans.date_in='1885-01-01' and book_loans.Isbn='"+s1+"') or"
						+ " (book_loans.date_in='1885-01-01' and book_loans.card_no = '"+s2+"') or (book_loans.date_in='1885-01-01' and (borrower.fname like '%"+s3+"%' or borrower.lname like '%"+s3+"%')))";*/
				
		String 	query  = "select l.isbn,l.card_no,l.date_out,l.due_date,bw.fname,bw.lname,l.loan_id,l.branch_id from book_loans l join borrower bw on l.card_no=bw.card_no"
				+" where l.date_in='1885-01-01' and (l.isbn='"+s1+"' or l.card_no='"+s2+"' or bw.fname='"+s3+"' or bw.lname='"+s3+"')";
				
				
				ResultSet r = con.Connection(query);
			
				try {
					while(r.next()){
						//System.out.println(r.getString("count(*)"));
						String r1 = r.getString("l.date_out");
						String r3 = r.getString("l.due_date");
						String r2 = r.getString("l.card_no") ;
						String r4 = r.getString("l.loan_id");
					    String r5 = r.getString("l.isbn");
					    String r6 = r.getString("l.branch_id");
					    
					    
					    System.out.println(r1 + r2 + r3 + r4 +r5+ r6 );
					   Object[] ob1={false,r5,r4,r6,r2,r1,r3};
						model4.addRow(ob1);
						scrollPane.setVisible(true);  
				
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			
				
			}
		});
		panel_2.add(btnNewButton_8);
		
		textField_19 = new JTextField();
		textField_19.setBounds(224, 131, 161, 22);
		panel_2.add(textField_19);
		textField_19.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(115, 134, 56, 16);
		panel_2.add(label);
		
		JLabel lblNewLabel_19 = new JLabel("Date_in");
		lblNewLabel_19.setBounds(115, 134, 56, 16);
		panel_2.add(lblNewLabel_19);
		
		JButton btnNewButton_10 = new JButton("Submit");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i =0;i<table_1.getRowCount();i++){
					Boolean checked = Boolean.valueOf(table_1.getValueAt(i,0).toString());
					if(checked){
					String s = textField_19.getText();
					String s1 = table_1.getValueAt(i,2).toString();
					String s2 = "update book_loans set date_in = '"+s+"' where Loan_id = '"+s1+"'";
					String s3 = table_1.getValueAt(i,3).toString();
					String s4 = table_1.getValueAt(i,1).toString();
					String s5 = "select remaining_books from book_copies where  isbn = '"+s4+"' and branch_id='"+s3+"'";
					Connect con = new Connect();
					con.Connection2(s2);
					ResultSet r = con.Connection(s5);
					int count =0;
					
					try {
						r.next();
						 count =Integer.parseInt( r.getString("remaining_books"));
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				count++;	
				
				String query4 ="update book_copies set remaining_books ='"+count+"' where Isbn = '"+s4+"' and branch_id ='"+s3+"'";
		        con.Connection2(query4);
				
					
					
					}
				
			}
			}
		});
		btnNewButton_10.setBounds(415, 177, 97, 25);
		panel_2.add(btnNewButton_10);
		
	
		
		
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Borrower", null, panel, null);
		panel.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setBounds(85, 68, 116, 22);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(335, 68, 116, 22);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(85, 123, 116, 22);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(335, 123, 116, 22);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(85, 179, 121, 22);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(335, 179, 116, 22);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(85, 235, 116, 22);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(335, 235, 116, 22);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("SSN*");
		lblNewLabel_5.setBounds(12, 126, 56, 16);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Lname*");
		lblNewLabel_6.setBounds(267, 71, 56, 16);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("Fname*");
		lblNewLabel_4.setBounds(12, 71, 61, 16);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("email id");
		lblNewLabel_7.setBounds(267, 126, 56, 16);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("address*");
		lblNewLabel_8.setBounds(17, 182, 56, 16);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("city");
		lblNewLabel_9.setBounds(280, 182, 56, 16);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Phone no");
		lblNewLabel_10.setBounds(267, 238, 56, 16);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("state");
		lblNewLabel_11.setBounds(17, 238, 56, 16);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("*All fields are required");
		lblNewLabel_12.setBounds(458, 31, 184, 22);
		panel.add(lblNewLabel_12);
		
		textField_11 = new JTextField();
		textField_11.setBounds(368, 322, 265, 22);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField_3.getText();
				String s2 = textField_4.getText();
				String s3 = textField_5.getText();
				String s4 = textField_6.getText();
				String s5 = textField_7.getText();
				String s6 = textField_8.getText();
				String s7 = textField_9.getText();
				String s8 = textField_10.getText();
				
				
				if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s5.isEmpty()){
					textField_11.setVisible(true);
				    textField_11.setText("Please enter all the fields");
				    
				}
				
				else 
				{
					textField_11.setVisible(true);
					textField_11.setText("");
					
					String query="select ssn from borrower";
					Connect con = new Connect();
					ResultSet r = con.Connection(query);
					int duplicates =0;
					try {
						while(r.next()){
						if(s3.equals(r.getString("ssn"))){
							textField_11.setText("Please enter a different ssn");
							duplicates++;
						}
						}
						
						if(duplicates==0){
			     	String	query1 = "insert into borrower(ssn,fname,lname,email,address,city,state,phone) values('"+s3
								+ "','"
								+ s1
								+ "','"
								+ s2
								+ "','"
								+ s4
								+ "','"
								+ s5
								+ "','"
								+ s6
								+ "','"
								+ s7
								+ "','"
								+ s8
								+ "')";
						
						con.Connection2(query1);
						
						textField_11.setVisible(true);
						textField_11.setText("User account created successfully");
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
				
			}
		});
		btnInsert.setBounds(204, 304, 97, 25);
		panel.add(btnInsert);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Check-Out", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_16 = new JLabel("ISBN");
		lblNewLabel_16.setBounds(86, 56, 56, 16);
		panel_1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Branch_Id");
		lblNewLabel_17.setBounds(86, 123, 71, 16);
		panel_1.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Card_No");
		lblNewLabel_18.setBounds(86, 201, 56, 16);
		panel_1.add(lblNewLabel_18);
		
		textField_15 = new JTextField();
		textField_15.setBounds(210, 53, 162, 22);
		panel_1.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(210, 120, 162, 22);
		panel_1.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(210, 198, 162, 22);
		panel_1.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(384, 235, 270, 22);
		panel_1.add(textField_18);
		textField_18.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("Check-Out");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField_15.getText();
				String s2 = textField_16.getText();
				String s3 = textField_17.getText();
				
				
				String query1 = "select remaining_books from BOOK_COPIES where Isbn ="+s1+" and branch_id ="+s2;
				System.out.println(query1);
				Connect con = new Connect();
			    ResultSet r = con.Connection(query1);
			    
			    int check =0;
			    int count=0;
			    try {
			    	r.next();
					count = Integer.parseInt(r.getString("remaining_books"));
					if(count == 0){
						System.out.println("Book is not available.Please try later");
					textField_18.setVisible(true);
				    textField_18.setText("Book is not available.Please try later");
				    
					}
					
					else{
						String query2 = "select count(card_no) from book_loans where card_no ="+s3+" and date_in = '1885-01-01'"; //+" date_out < due_date";
						r = con.Connection(query2);
					    
						r.next();
						check = Integer.parseInt(r.getString("count(card_no)"));
						
						System.out.println(check);
						
						if(check>=3){
							textField_18.setVisible(true);
					        textField_18.setText("You can't borrow more than three books");	
						}
						else{
							String query3 = "insert into book_loans(isbn,branch_id,card_no,date_out,due_date) values "
									+ "((select isbn from  book_copies where isbn = '"+s1+"' and branch_id = '"+s2+"'),"
									+ "(select branch_id from book_copies where isbn ='"+s1+"' and branch_id ='"+s2+"'),"
									+ "(select card_no from borrower where card_no = '"+s3+"'),"
									+ "curdate(), DATE_ADD(date_out,INTERVAL 14 DAY))";
						
							con.Connection2(query3);
							
							
							textField_18.setVisible(true);
					        textField_18.setText("You have successfully borrowed a book");
					        
					        count--; /* decrement the book count in that particular branch id*/
					      
					        String query4 ="update book_copies set remaining_books ='"+count+"' where Isbn = '"+s1+"' and branch_id ='"+s2+"'";
					        con.Connection2(query4);
							
						
						}
								
					}
					
					
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
			    
			    
			    
			}
		});
		btnNewButton_6.setBounds(224, 306, 97, 25);
		panel_1.add(btnNewButton_6);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Fines", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_20 = new JLabel("Loan ID");
		lblNewLabel_20.setBounds(12, 13, 56, 16);
		panel_3.add(lblNewLabel_20);
		
		textField_20 = new JTextField();
		textField_20.setBounds(69, 13, 116, 22);
		panel_3.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(422, 27, 232, 22);
		panel_3.add(textField_21);
		textField_21.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 196, 642, 165);
		panel_3.add(scrollPane_1);
		
		JButton btnNewButton_9 = new JButton("Update Fines");
		btnNewButton_9.addActionListener(new ActionListener() {
			private Object textField21;

			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model5 = new DefaultTableModel(){
					public Class<?> getColumnClass(int column){
						switch(column){
						case 0:
							return String.class;
						case 1:
							return String.class;
						case 2:
							return String.class;
						default:
							return String.class;
						}
					}
				};
				model5.addColumn("Card_no");
				model5.addColumn("Sum_of_Fines($)");
				model5.addColumn("Paid");
				
				
				table_2 = new JTable();
				table_2.setModel(model5);		
				table_2.getColumnModel().getColumn(1).setPreferredWidth(104);
				scrollPane_1.setViewportView(table_2);
				
				
				
				
				
				
				
				
				
				
				
				
				
				String s = textField_20.getText();
				
				String query = "select * from book_loans where loan_id ="+s;
				Connect con = new Connect();
				ResultSet rs = con.Connection(query);
		
				
				try {
					while(rs.next()){
						String fine_id= rs.getString("Loan_id");
						String card_no = rs.getString("Card_no");
						String check = rs.getString("date_in");
						String query1;
						if(check.equals("1885-01-01")){
						query1 = "SELECT  (CURDATE()-due_date)*0.25 as result from book_loans where loan_id = "+fine_id;
						}
						else{
							query1 = "SELECT  (date_in-due_date)*0.25 as result from book_loans where loan_id = "+fine_id;
						}
						ResultSet rs1 = con.Connection(query1);
						if(rs1.next()){
							float fine_amt = Float.parseFloat(rs1.getString(1));
						
							
							
							if(fine_amt>0){
								textField_21.setText(" ");
								String query3 = "Select * from fines where loan_id = "+fine_id;
								ResultSet rs2 = con.Connection(query3);
								

								if(rs2.next()){
									String query4 = "UPDATE FINES SET FINE_AMT="+fine_amt+" where loan_id = "+fine_id;
									
									con.Connection2(query4);
									Object[] ob1={card_no,rs1.getString(1), rs2.getString("paid")
									};
									model5.addRow(ob1);
									scrollPane.setVisible(true);
																		
								}
								else
								{
									String query6 = "INSERT INTO FINES VALUES("+fine_id+","+fine_amt+",0)";
									con.Connection2(query6);
									Object[] ob1={card_no,rs1.getString(1), "0"
									};
									model5.addRow(ob1);
									scrollPane.setVisible(true);
									System.out.println("Done");
								}
							}
							
							else
							{
								textField_21.setText("No Fines on this loan id");
							}
					}
					}
				}
				 catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_9.setBounds(46, 52, 139, 25);
		panel_3.add(btnNewButton_9);
		
		JButton btnNewButton_12 = new JButton("Update Paid");
		btnNewButton_12.setBounds(480, 83, 139, 25);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                String s = textField_20.getText();
				
				String query = "select * from book_loans where loan_id ="+s;
				Connect con = new Connect();
				ResultSet rs = con.Connection(query);
		
				
				try {
					while(rs.next()){
						String fine_id= rs.getString("Loan_id");
						String card_no = rs.getString("Card_no");
						String check = rs.getString("date_in");
						
						if(check.equals("1885-01-01")){
							textField_21.setText("You cannot pay till you return the book");
						}
						else{
							textField_21.setText("Thanks for the payment");
							
							String query1 = "UPDATE FINES SET PAID='1' where loan_id = "+fine_id;
							con.Connection2(query1);
							
						}
		             	}
				}
				catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		
			}
		});
		panel_3.add(btnNewButton_12);
		
		
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Paid", "Total Amount", "Card_no"
			}
		));
		table_2.getColumnModel().getColumn(1).setPreferredWidth(104);
		scrollPane_1.setViewportView(table_2);
		
		JLabel lblNewLabel_22 = new JLabel("0-Not Paid; 1 - Paid");
		lblNewLabel_22.setBounds(515, 126, 139, 57);
		panel_3.add(lblNewLabel_22);
		
		JLabel lblNewLabel_21 = new JLabel("Card_no");
		lblNewLabel_21.setBounds(12, 104, 56, 16);
		panel_3.add(lblNewLabel_21);
		
		textField_22 = new JTextField();
		textField_22.setBounds(69, 101, 116, 22);
		panel_3.add(textField_22);
		textField_22.setColumns(10);
		
		JButton btnNewButton_11 = new JButton("Get Details");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String s = textField_22.getText();
			String query = "select sum(fine_amt) from fines,book_loans where book_loans.loan_id = fines.loan_id and book_loans.card_no ="+s+" and paid = 0";
			Connect con = new Connect();
			ResultSet rs = con.Connection(query);
			ResultSet rs1 = con.Connection(query);
			
			boolean empty = false;
			
		
			
				try {
				rs1.next();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			try {
				
				
		   
		         
		    	 if(rs1.getString("sum(fine_amt)").equalsIgnoreCase(null))
			   empty = true;
		     
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
				try {
					if(empty)
					{
						textField_21.setVisible(true);
						textField_21.setText("You don't have any dues");
						
					}
					else{
						
						textField_21.setVisible(true);
						textField_21.setText(" ");
						//System.out.println(("ammmmmmm"));
					rs.next();
					String amt = rs.getString("sum(fine_amt)");
					float fine_amt = Float.parseFloat(rs.getString(1));
					
					DefaultTableModel model5 = new DefaultTableModel(){
						public Class<?> getColumnClass(int column){
							switch(column){
							case 0:
								return String.class;
							case 1:
								return String.class;
							case 2:
								return String.class;
							default:
								return String.class;
							}
						}
					};
					model5.addColumn("Card_no");
					model5.addColumn("Total unpaid fines($)");
					model5.addColumn("Paid");
					
					
					table_2 = new JTable();
					table_2.setModel(model5);		
					table_2.getColumnModel().getColumn(1).setPreferredWidth(104);
					scrollPane_1.setViewportView(table_2);
					
					Object[] ob1={s,amt, "0"
					};
					model5.addRow(ob1);
					scrollPane.setVisible(true);
					}	
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
			
		});
		btnNewButton_11.setBounds(37, 142, 139, 25);
		panel_3.add(btnNewButton_11);
		
	/*	textField_18 = new JTextField();
		textField_18.setBounds(437, 246, 190, 22);
		panel_1.add(textField_18);
		textField_18.setColumns(10);*/
	}
}
