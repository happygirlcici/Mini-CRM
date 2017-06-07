
package minicrm;

import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import minicrm.entity.Representative;
import minicrm.entity.Customer;
import minicrm.entity.Interaction;


public class MainWindow extends javax.swing.JFrame {

    Database db;

    DefaultListModel<Representative> modelRepList = new DefaultListModel<>();
    DefaultListModel<Customer> listModelCustomer = new DefaultListModel<>();
    DefaultListModel<Interaction> listModelInteraction = new DefaultListModel<>();
    
    public MainWindow() {
        try {
            db = new Database();
            initComponents();
            dlgAddRep.pack();
            dlgManage.pack();
            dlgAddCus.pack();
            refreshRepList();
            refreshCustList();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed to open database connection",
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    private void refreshRepList() {
        try {
            ArrayList<Representative> repList = db.getAllReps();
            modelRepList.clear();
            for (Representative r : repList) {
                modelRepList.addElement(r);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed execute database query",
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

  private void refreshCustList() {
        try {
            ArrayList<Customer> custList = db.getAllCustomers();
            listModelCustomer.clear();
            for (Customer c : custList) {
                listModelCustomer.addElement(c);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed execute database query",
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
  
  private void refreshInteractionListById(int id) {
        try {
            ArrayList<Interaction> intList = db.getInteractionByRepID(id);
            //System.out.println("intList is "+intList.toString());
            listModelInteraction.clear();
            for (Interaction i : intList) {
                listModelInteraction.addElement(i);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed execute database query",
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgAddRep = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        dlgAddRep_tfNameFirst = new javax.swing.JTextField();
        dlgAddRep_tfNameLast = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dlgAddRep_btCancel = new javax.swing.JButton();
        dlgAddRep_btAddRep = new javax.swing.JButton();
        dlgManage = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dlglblRepName = new javax.swing.JLabel();
        dlglblCustName = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dlgInteraction_jList = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dlglblRepNameDetail = new javax.swing.JLabel();
        dlglblInteraDate = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        dlglblInteraNotes = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        dlglblInteraNotesNew = new javax.swing.JTextArea();
        dlgbtAddNewNotes = new javax.swing.JButton();
        dlgAddCus = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        dlgAddCust_tfNameFirst = new javax.swing.JTextField();
        dlgAddCust_tfNameLast = new javax.swing.JTextField();
        dlgAddCust_btCancel = new javax.swing.JButton();
        dlgAddCust_btAdd = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        dlgtfCustAddress = new javax.swing.JTextField();
        dlgtfPostCode = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        dlgAddCust_tfPhone = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        dlgAddCust_tfSIN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstReps = new javax.swing.JList<>();
        btAddRep = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCust = new javax.swing.JList<>();
        btAddCus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btManage = new javax.swing.JButton();

        dlgAddRep.setModal(true);

        jLabel3.setText("First name:");

        jLabel4.setText("Last name:");

        dlgAddRep_btCancel.setText("Cancel");

        dlgAddRep_btAddRep.setText("Add representative");
        dlgAddRep_btAddRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgAddRep_btAddRepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgAddRepLayout = new javax.swing.GroupLayout(dlgAddRep.getContentPane());
        dlgAddRep.getContentPane().setLayout(dlgAddRepLayout);
        dlgAddRepLayout.setHorizontalGroup(
            dlgAddRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddRepLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgAddRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgAddRepLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dlgAddRep_tfNameFirst))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgAddRepLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dlgAddRep_tfNameLast, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(dlgAddRepLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(dlgAddRep_btCancel)
                .addGap(53, 53, 53)
                .addComponent(dlgAddRep_btAddRep)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dlgAddRepLayout.setVerticalGroup(
            dlgAddRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddRepLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgAddRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dlgAddRep_tfNameFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dlgAddRep_tfNameLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgAddRep_btCancel)
                    .addComponent(dlgAddRep_btAddRep))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dlgManage.setTitle("Add Interaction Notes Dialog");
        dlgManage.setModal(true);

        jLabel5.setText("Current representative:");

        jLabel6.setText("Current Customer:");

        dlglblRepName.setText("..........");

        dlglblCustName.setText("..........");

        dlgInteraction_jList.setModel(listModelInteraction);
        dlgInteraction_jList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dlgInteraction_jListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(dlgInteraction_jList);

        jLabel9.setText("List of interactions, sorted by date:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selected interaction details"));
        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N

        jLabel11.setText("Representative name:");

        jLabel13.setText("Interaction date:");

        jLabel15.setText("Notes:");

        dlglblRepNameDetail.setText("..........");

        dlglblInteraDate.setText("..........");

        dlglblInteraNotes.setEditable(false);
        dlglblInteraNotes.setColumns(20);
        dlglblInteraNotes.setRows(5);
        dlglblInteraNotes.setText("Non-editable text area,\nmultiline");
        jScrollPane4.setViewportView(dlglblInteraNotes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dlglblInteraDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(dlglblRepNameDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(dlglblRepNameDetail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(dlglblInteraDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Add new interaction note"));

        dlglblInteraNotesNew.setColumns(20);
        dlglblInteraNotesNew.setRows(5);
        jScrollPane5.setViewportView(dlglblInteraNotesNew);

        dlgbtAddNewNotes.setText("Add new interaction note");
        dlgbtAddNewNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgbtAddNewNotesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(dlgbtAddNewNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dlgbtAddNewNotes)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dlgManageLayout = new javax.swing.GroupLayout(dlgManage.getContentPane());
        dlgManage.getContentPane().setLayout(dlgManageLayout);
        dlgManageLayout.setHorizontalGroup(
            dlgManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgManageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgManageLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dlgManageLayout.createSequentialGroup()
                        .addGroup(dlgManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3)
                            .addGroup(dlgManageLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(dlglblRepName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(dlgManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dlgManageLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dlglblCustName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        dlgManageLayout.setVerticalGroup(
            dlgManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgManageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(dlglblRepName)
                    .addComponent(dlglblCustName))
                .addGroup(dlgManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgManageLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(dlgManageLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        dlgAddCus.setTitle("Add Customer");

        jLabel10.setText("First name:");

        jLabel16.setText("Last name:");

        dlgAddCust_btCancel.setText("Cancel");
        dlgAddCust_btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgAddCust_btCancelActionPerformed(evt);
            }
        });

        dlgAddCust_btAdd.setText("Add Customer");
        dlgAddCust_btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgAddCust_btAddActionPerformed(evt);
            }
        });

        jLabel17.setText("Address");

        jLabel18.setText("Post Code");

        jLabel19.setText("Tel Phone");

        jLabel20.setText("SIN");

        javax.swing.GroupLayout dlgAddCusLayout = new javax.swing.GroupLayout(dlgAddCus.getContentPane());
        dlgAddCus.getContentPane().setLayout(dlgAddCusLayout);
        dlgAddCusLayout.setHorizontalGroup(
            dlgAddCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddCusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgAddCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgAddCusLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(dlgAddCust_tfNameFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dlgAddCusLayout.createSequentialGroup()
                        .addGroup(dlgAddCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(23, 23, 23)
                        .addGroup(dlgAddCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dlgtfPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dlgtfCustAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel20)
                    .addGroup(dlgAddCusLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(dlgAddCust_tfSIN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dlgAddCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgAddCusLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(23, 23, 23)
                        .addComponent(dlgAddCust_tfPhone)
                        .addGap(61, 61, 61))
                    .addGroup(dlgAddCusLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dlgAddCust_tfNameLast, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))))
            .addGroup(dlgAddCusLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(dlgAddCust_btCancel)
                .addGap(70, 70, 70)
                .addComponent(dlgAddCust_btAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dlgAddCusLayout.setVerticalGroup(
            dlgAddCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddCusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgAddCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(dlgAddCust_tfNameFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dlgAddCust_tfNameLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(dlgAddCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(dlgtfCustAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dlgAddCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgtfPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(dlgAddCust_tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(dlgAddCust_tfSIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(dlgAddCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dlgAddCust_btCancel)
                    .addComponent(dlgAddCust_btAdd))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini CRM");

        jLabel1.setText("Select customer:");

        lstReps.setModel(modelRepList);
        lstReps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstRepsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstReps);

        btAddRep.setText("Add representative");
        btAddRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddRepActionPerformed(evt);
            }
        });

        lstCust.setModel(listModelCustomer);
        lstCust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstCustMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lstCust);

        btAddCus.setText("Add customer");
        btAddCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCusActionPerformed(evt);
            }
        });

        jLabel2.setText("Current representative:");

        btManage.setText("Manage Customer Interactions");
        btManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btManageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(btAddRep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(btAddCus, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(btManage, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btManage, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)))
                        .addComponent(btAddCus))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAddRep)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddRepActionPerformed
        dlgAddRep.setVisible(true);
    }//GEN-LAST:event_btAddRepActionPerformed

    private void dlgAddRep_btAddRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgAddRep_btAddRepActionPerformed
        String nameFirst = dlgAddRep_tfNameFirst.getText();
        String nameLast = dlgAddRep_tfNameLast.getText();
        // FIXME: verify correctness of names
        Representative rep = new Representative(0, nameFirst, nameLast);
        try {
            db.addRep(rep);
            dlgAddRep.setVisible(false);
            refreshRepList();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed execute database insert",
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_dlgAddRep_btAddRepActionPerformed

    private void btManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btManageActionPerformed
        dlgManage.setVisible(true);
        refreshInteractionListById(repID);
        //dlgInteraction_jList.add()
    }//GEN-LAST:event_btManageActionPerformed

    private void btAddCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCusActionPerformed
        // TODO add your handling code here:
        dlgAddCus.setVisible(true);
       
    }//GEN-LAST:event_btAddCusActionPerformed

    private void dlgAddCust_btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgAddCust_btAddActionPerformed
        // TODO add your handling code here:
        String nameFirst = dlgAddCust_tfNameFirst.getText();
        String nameLast = dlgAddCust_tfNameLast.getText();
        String custAddress = dlgtfCustAddress.getText();
        String cust_postalCode =dlgtfPostCode.getText();
        String custphoneNumber = dlgAddCust_tfPhone.getText();
        String custSIN = dlgAddCust_tfSIN.getText();
        // FIXME: verify correctness of names
        Customer cus = new Customer(0, nameFirst, nameLast,custAddress,cust_postalCode,custphoneNumber,custSIN);
        try {
            db.addCus(cus);
            dlgAddCus.setVisible(false);
            refreshCustList();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Failed execute database query",
                    "Database error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_dlgAddCust_btAddActionPerformed

    private void dlgAddCust_btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgAddCust_btCancelActionPerformed
        // TODO add your handling code here:
        dlgAddCus.dispose();
    }//GEN-LAST:event_dlgAddCust_btCancelActionPerformed
    
    int repID = 0;
    
    private void lstRepsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstRepsMouseClicked
        // TODO add your handling code here:
        //if choose one of rep 
        if ((evt.getClickCount() >= 1)) {

            lstReps.setSelectedIndex(lstReps.locationToIndex(evt.getPoint()));
            int index = lstReps.getSelectedIndex();
            if (index != -1) {
                Representative r = modelRepList.get(index);
                dlglblRepName.setText(r.toString());
                repID = r.id;
                System.out.println("repID is "+ repID);
                refreshInteractionListById(repID);
            }
        }
    }//GEN-LAST:event_lstRepsMouseClicked

    int custID = 0;
    private void lstCustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstCustMouseClicked
        // TODO add your handling code here:
        if ((evt.getClickCount() >= 1)) {
            lstCust.setSelectedIndex(lstCust.locationToIndex(evt.getPoint()));
            int index = lstCust.getSelectedIndex();
            if (index != -1) {
                Customer c = listModelCustomer.get(index);
                dlglblCustName.setText(c.toString());
                custID = c.id;
                System.out.println("custID is "+ custID);
                //refreshInteractionListById(custID);
            }
        }
    }//GEN-LAST:event_lstCustMouseClicked

    int interactionID = 0;
    String date = "";
    String old_notes = "";

    private void dlgInteraction_jListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dlgInteraction_jListMouseClicked
        // TODO add your handling code here:
        if ((evt.getClickCount() >= 1)) {
            // left button, double-click
            dlgInteraction_jList.setSelectedIndex(dlgInteraction_jList.locationToIndex(evt.getPoint()));
            int index = dlgInteraction_jList.getSelectedIndex();
            if (index != -1) {
                Interaction i = listModelInteraction.get(index);
                interactionID = i.interactionID;
                date = i.date;
                old_notes = i.notes;
                try {
                    String str_temp = db.getRepFullNameByRepID(i.repID);
                    
                    dlglblRepNameDetail.setText(db.getRepFullNameByRepID(i.repID));
                } catch (SQLException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
                dlglblInteraDate.setText(i.date);
                dlglblInteraNotes.setText(i.notes);
                
            }
        }
    }//GEN-LAST:event_dlgInteraction_jListMouseClicked

    private void dlgbtAddNewNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgbtAddNewNotesActionPerformed
        // TODO add your handling code here:
        String str_NewNotes = dlglblInteraNotesNew.getText();
        Interaction i = new Interaction(interactionID,custID,repID,date,old_notes+str_NewNotes);
        try {
            db.updateInteractionNotes(i);
            dlglblInteraNotes.setText(old_notes+str_NewNotes);
            //db.updateInteractionNotes(Interaction i);
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dlgbtAddNewNotesActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddCus;
    private javax.swing.JButton btAddRep;
    private javax.swing.JButton btManage;
    private javax.swing.JDialog dlgAddCus;
    private javax.swing.JButton dlgAddCust_btAdd;
    private javax.swing.JButton dlgAddCust_btCancel;
    private javax.swing.JTextField dlgAddCust_tfNameFirst;
    private javax.swing.JTextField dlgAddCust_tfNameLast;
    private javax.swing.JTextField dlgAddCust_tfPhone;
    private javax.swing.JTextField dlgAddCust_tfSIN;
    private javax.swing.JDialog dlgAddRep;
    private javax.swing.JButton dlgAddRep_btAddRep;
    private javax.swing.JButton dlgAddRep_btCancel;
    private javax.swing.JTextField dlgAddRep_tfNameFirst;
    private javax.swing.JTextField dlgAddRep_tfNameLast;
    private javax.swing.JList<Interaction> dlgInteraction_jList;
    private javax.swing.JDialog dlgManage;
    private javax.swing.JButton dlgbtAddNewNotes;
    private javax.swing.JLabel dlglblCustName;
    private javax.swing.JLabel dlglblInteraDate;
    private javax.swing.JTextArea dlglblInteraNotes;
    private javax.swing.JTextArea dlglblInteraNotesNew;
    private javax.swing.JLabel dlglblRepName;
    private javax.swing.JLabel dlglblRepNameDetail;
    private javax.swing.JTextField dlgtfCustAddress;
    private javax.swing.JTextField dlgtfPostCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<Customer> lstCust;
    private javax.swing.JList<Representative> lstReps;
    // End of variables declaration//GEN-END:variables
}
