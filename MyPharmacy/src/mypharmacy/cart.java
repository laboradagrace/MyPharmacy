/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypharmacy;

import java.awt.Color;
//////import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
/////import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
///import javax.swing.JTable;
//import javax.swing.table.DefaultTableModel;
//import javax.swing.table.TableCellRenderer;
//import javax.swing.table.TableModel;
//import static mypharmacy.main.Mycart;
import validate.Medicine;
import validate.Validate;
import validate.db;

/**
 *
 * @author laboradagr_sd2022
 */
public class cart extends JFrame {
   

    private javax.swing.JButton CartbackButton;
    private javax.swing.JPanel MedicinePanel;
    private javax.swing.JLabel MyCart_Label;
    private javax.swing.JLabel appNameLabel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton buttonPurchase;
    private java.awt.Canvas canvas1;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JTable cartTable;
    private javax.swing.JTextField cash;
    private javax.swing.JButton PurchaseCancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel purchasePanel;
    private javax.swing.JTextField removeBrandName;
    private javax.swing.JButton removeButton;
    private javax.swing.JPanel removePanel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField textFieldSearch;
    private javax.swing.JLabel totalcost;
    private javax.swing.JButton saveButton;
    private ArrayList<Medicine> cart = new ArrayList<>();
    Validate storage = new Validate();
    private Object[][] data = {};
    private Double total;
    db db = new db();
    public cart() {
        // init components
        PurchaseCancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        backgroundPanel = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        textFieldSearch = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        appNameLabel = new javax.swing.JLabel();
        MedicinePanel = new javax.swing.JPanel();
        canvas1 = new java.awt.Canvas();
        cartPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        MyCart_Label = new javax.swing.JLabel();
        purchasePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        totalcost = new javax.swing.JLabel();
        buttonPurchase = new javax.swing.JButton();
        //cancelButtonPurchase = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cash = new javax.swing.JTextField();
        removePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        removeBrandName = new javax.swing.JTextField();
        removeButton = new javax.swing.JButton();
        CartbackButton = new javax.swing.JButton();

        cart = main.Mycart;
        //for(int i = 0; i< this.cart.size(); i++){

        Object[][] data1 = {
            {cart.get(0).getBrandName(), cart.get(0).getGenericName(), 0, cart.get(0).getPrice()},
            {cart.get(1).getBrandName(), cart.get(1).getGenericName(), 0, cart.get(1).getPrice()},
            {cart.get(2).getBrandName(), cart.get(2).getGenericName(), 0, cart.get(2).getPrice()},
            {cart.get(3).getBrandName(), cart.get(3).getGenericName(), 0, cart.get(3).getPrice()},
            {cart.get(4).getBrandName(), cart.get(4).getGenericName(), 0, cart.get(4).getPrice()},};
        this.data = data1;

        this.setLayout(null);
        this.setVisible(true);
        this.setSize(1000, 700);
        this.setLocation(200, 200);
        this.add(backgroundPanel);
        this.setBackground(Color.black);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        backgroundPanel.setBackground(new java.awt.Color(0, 0, 0));

        logoutButton.setBackground(new java.awt.Color(255, 204, 204));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logoutButton.setText("LOG OUT");
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(255, 204, 204));
        searchButton.setText("Search");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        appNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        appNameLabel.setForeground(new java.awt.Color(255, 204, 204));
        appNameLabel.setText("MY PHARMACY APP");

        MedicinePanel.setBackground(new java.awt.Color(255, 204, 204));

        cartPanel.setBackground(new java.awt.Color(255, 255, 255));
        cartPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 0, 51)));
        //DefaultTableModel tablemodel = (DefaultTableModel) table.getModel();
        cartTable.setModel(new javax.swing.table.DefaultTableModel(
                //                
                this.data,
                new String[]{
                    "Brand Name", "Generic Name", "Qty", "Price"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jScrollPane1.setViewportView(cartTable);
        saveButton.setForeground(new java.awt.Color(255, 0, 51));
        saveButton.setText("Save");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cartPanelLayout = new javax.swing.GroupLayout(cartPanel);
        cartPanel.setLayout(cartPanelLayout);
        cartPanelLayout.setHorizontalGroup(
                cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cartPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(cartPanelLayout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cartPanelLayout.setVerticalGroup(
                cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cartPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        MyCart_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MyCart_Label.setForeground(new java.awt.Color(255, 0, 51));
        MyCart_Label.setText("My Cart");

        purchasePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Total Cost:");

        totalcost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalcost.setText("0:00");

        buttonPurchase.setForeground(new java.awt.Color(0, 204, 0));
        buttonPurchase.setText("Purchase");
        buttonPurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPurchaseMouseClicked(evt);
            }
        });

        PurchaseCancelButton.setForeground(new java.awt.Color(255, 0, 51));
        PurchaseCancelButton.setText("Cancel");
        PurchaseCancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PurchaseCancelButtonMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Enter Cash:");

        cash.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cash.setText("");

        javax.swing.GroupLayout purchasePanelLayout = new javax.swing.GroupLayout(purchasePanel);
        purchasePanel.setLayout(purchasePanelLayout);
        purchasePanelLayout.setHorizontalGroup(
                purchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(purchasePanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonPurchase)
                                .addGap(38, 38, 38)
                                .addComponent(PurchaseCancelButton)
                                .addGap(38, 38, 38))
                        .addGroup(purchasePanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(purchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(purchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(totalcost, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cash, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        purchasePanelLayout.setVerticalGroup(
                purchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(purchasePanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(purchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(totalcost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(purchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addGroup(purchasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonPurchase)
                                        .addComponent(PurchaseCancelButton))
                                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Enter Brand name : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("REMOVE ITEM");

        removeBrandName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        removeBrandName.setText("");

        removeButton.setText("Remove");
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout removePanelLayout = new javax.swing.GroupLayout(removePanel);
        removePanel.setLayout(removePanelLayout);
        removePanelLayout.setHorizontalGroup(
                removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(removePanelLayout.createSequentialGroup()
                                .addGroup(removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(removePanelLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(removeBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(removePanelLayout.createSequentialGroup()
                                                .addGap(137, 137, 137)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removePanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(removeButton)
                                                .addGap(10, 10, 10)))
                                .addContainerGap(26, Short.MAX_VALUE))
        );
        removePanelLayout.setVerticalGroup(
                removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(removePanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(removeBrandName, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeButton)
                                .addContainerGap())
        );

        CartbackButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CartbackButton.setText("Back");
        CartbackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CartbackButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MedicinePanelLayout = new javax.swing.GroupLayout(MedicinePanel);
        MedicinePanel.setLayout(MedicinePanelLayout);
        MedicinePanelLayout.setHorizontalGroup(
                MedicinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MedicinePanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(382, 382, 382))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MedicinePanelLayout.createSequentialGroup()
                                .addGroup(MedicinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(MedicinePanelLayout.createSequentialGroup()
                                                .addGap(187, 187, 187)
                                                .addComponent(MyCart_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(CartbackButton))
                                        .addGroup(MedicinePanelLayout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(cartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                                .addGroup(MedicinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(purchasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(removePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(51, 51, 51))
        );
        MedicinePanelLayout.setVerticalGroup(
                MedicinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MedicinePanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(MedicinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CartbackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(MyCart_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(MedicinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(MedicinePanelLayout.createSequentialGroup()
                                                .addComponent(removePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(purchasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(166, 166, 166)
                                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
                backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(appNameLabel)
                                                .addGap(117, 117, 117)
                                                .addComponent(textFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(searchButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(MedicinePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        backgroundPanelLayout.setVerticalGroup(
                backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(appNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchButton)
                                        .addComponent(logoutButton))
                                .addGap(18, 18, 18)
                                .addComponent(MedicinePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backgroundPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {
        int qty1;
        int qty2;
        int qty3;
        int qty4;
        int qty5;
        qty1 = (int) this.cartTable.getModel().getValueAt(0, 2);
        qty2 = (int) this.cartTable.getModel().getValueAt(1, 2);
        qty3 = (int) this.cartTable.getModel().getValueAt(2, 2);
        qty4 = (int) this.cartTable.getModel().getValueAt(3, 2);
        qty5 = (int) this.cartTable.getModel().getValueAt(4, 2);

        total = this.cart.get(0).getPrice() * qty1;
        total += this.cart.get(1).getPrice() * qty2;
        total += this.cart.get(2).getPrice() * qty3;
        total += this.cart.get(3).getPrice() * qty4;
        total += this.cart.get(4).getPrice() * qty5;
        System.out.println(total);
        this.totalcost.setText("Php " + total.toString() + " only");
        //System.out.println(qty1+" "+ qty2+" "+qty3+" "+qty4+" "+qty5 );// index 2 is the value of quantity
    }

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        new MyPharmacy();
        this.dispose();
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void CartbackButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        this.dispose();
        new main();
    }

    private void removeButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void buttonPurchaseMouseClicked(java.awt.event.MouseEvent evt) {
        Double amount = Double.parseDouble(this.cash.getText());
        System.out.println(amount);
        if (amount > total) {
            Double change = amount - total;
            this.cash.setText("");
            this.totalcost.setText("");
            this.cart.clear();
            //Date date = java.util.Calendar.getInstance().getTime();
            String user = MyPharmacy.CurrentUser;
            int age = MyPharmacy.CurrentUserAge;
            db.transaction(user, total,age);
            JOptionPane.showMessageDialog(this,
                    "Successfully Purchased!\nYour change is " + change);
            this.dispose();
            new main();

        } else if (Objects.equals(amount, total)) {
            this.cash.setText("");
            this.totalcost.setText("");
            JOptionPane.showMessageDialog(this,
                    "Successfully Purchased!");
            this.dispose();
            new main();
        }
        else{
            JOptionPane.showMessageDialog(this,
                    "Amount is not enough!");
        }
        

    }

    private void PurchaseCancelButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        new main();
        this.dispose();
    }

}
