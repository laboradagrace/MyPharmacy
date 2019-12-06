/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypharmacy;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import validate.Medicine;
import validate.db;
import validate.Validate;

/**
 *
 * @author laboradagr_sd2022
 */
public class main extends JFrame {

    private ArrayList<Medicine> Medicines = new ArrayList<>();
    static ArrayList<Medicine> Mycart = new ArrayList<>();
    db db = new db();
    static int quant1 =0;
    static int quant2 = 0;
    static int quant3 =0;
    Validate storage = new Validate();
    // main panel 
    private javax.swing.JPanel MedicinePanel;
    private javax.swing.JButton PrevButton;
    private javax.swing.JButton ViewCartButton;
    private javax.swing.JButton addToCartButton1;
    private javax.swing.JButton addToCartButton2;
    private javax.swing.JButton addtoCartButton3;
    private javax.swing.JLabel appNameLabel;
    private javax.swing.JLabel availableMedText;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel med1BrandName;
    private javax.swing.JLabel med1BrandNameLabel;

    private javax.swing.JLabel med1GenericName;
    private javax.swing.JLabel med1GenericNameLabel;
    private javax.swing.JLabel med1MedType;
    private javax.swing.JLabel med1Price;
    private javax.swing.JLabel med1PriceLabel;
    private javax.swing.JLabel med1Quant;
    private javax.swing.JLabel med1descLabel;
    private javax.swing.JLabel med1medtypeLabel;
    private javax.swing.JLabel med1quantLabel;
    private javax.swing.JLabel med2BrandName;
    private javax.swing.JLabel med2BrandNameLabel;

    private javax.swing.JLabel med2GenericName;
    private javax.swing.JLabel med2GenericNameLabel;
    private javax.swing.JLabel med2MedType;
    private javax.swing.JLabel med2Price;
    private javax.swing.JLabel med2PriceLabel;
    private javax.swing.JLabel med2Quant;
    private javax.swing.JLabel med2descLabel;
    private javax.swing.JLabel med2medtypeLabel;
    private javax.swing.JLabel med2quantLabel;
    private javax.swing.JLabel med3BrandName;
    private javax.swing.JLabel med3BrandNameLabel;

    private javax.swing.JLabel med3GenericName;
    private javax.swing.JLabel med3GenericNameLabel;
    private javax.swing.JLabel med3MedType;
    private javax.swing.JLabel med3Price;
    private javax.swing.JLabel med3PriceLabel;
    private javax.swing.JLabel med3Quant;
    private javax.swing.JLabel med3descLabel;
    private javax.swing.JLabel med3medtypeLabel;
    private javax.swing.JLabel med3quantLabel;
    private javax.swing.JPanel medPanel1;
    private javax.swing.JPanel medPanel2;
    private javax.swing.JPanel medPanel3;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField textFieldSearch;
   

    public main() {

        this.Medicines = db.fetchMedicines();
        //cough
//        Medicine med1 = new Medicine("Tessalon", "benzonatate", "cough", 206.90, 20, "/mypharmacy/med1.jpg");
//        for(int i =0; i <this.Medicines.size(); i++){
//            System.out.println("FDSF");
//            if(db.saveMedData(Medicines.get(i).getBrandName(),Medicines.get(i).getGenericName(),Medicines.get(i).getType(),Medicines.get(i).getPrice(),
//            Medicines.get(i).getQuantity(),Medicines.get(i).getImg())){
//                System.out.println("saved");
//            }
//            else{
//                System.out.println("error");
//            }
//        }
        backgroundPanel = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        textFieldSearch = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        appNameLabel = new javax.swing.JLabel();
        MedicinePanel = new javax.swing.JPanel();
        availableMedText = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        PrevButton = new javax.swing.JButton();
        ViewCartButton = new javax.swing.JButton();
        medPanel2 = new javax.swing.JPanel();
        img2 = new javax.swing.JLabel();
        med2descLabel = new javax.swing.JLabel();
        med2GenericNameLabel = new javax.swing.JLabel();
        med2medtypeLabel = new javax.swing.JLabel();
        med2BrandNameLabel = new javax.swing.JLabel();
        med2quantLabel = new javax.swing.JLabel();
        med2PriceLabel = new javax.swing.JLabel();
        addToCartButton2 = new javax.swing.JButton();
        med2GenericName = new javax.swing.JLabel();
        med2BrandName = new javax.swing.JLabel();
        med2MedType = new javax.swing.JLabel();
        med2Price = new javax.swing.JLabel();
        med2Quant = new javax.swing.JLabel();
        medPanel1 = new javax.swing.JPanel();
        img1 = new javax.swing.JLabel();
        med1descLabel = new javax.swing.JLabel();
        med1GenericNameLabel = new javax.swing.JLabel();
        med1medtypeLabel = new javax.swing.JLabel();
        med1BrandNameLabel = new javax.swing.JLabel();
        med1quantLabel = new javax.swing.JLabel();
        med1PriceLabel = new javax.swing.JLabel();
        addToCartButton1 = new javax.swing.JButton();
        med1GenericName = new javax.swing.JLabel();
        med1BrandName = new javax.swing.JLabel();
        med1MedType = new javax.swing.JLabel();

        med1Price = new javax.swing.JLabel();
        med1Quant = new javax.swing.JLabel();
        medPanel3 = new javax.swing.JPanel();
        img3 = new javax.swing.JLabel();
        med3descLabel = new javax.swing.JLabel();
        med3GenericNameLabel = new javax.swing.JLabel();
        med3medtypeLabel = new javax.swing.JLabel();
        med3BrandNameLabel = new javax.swing.JLabel();
        med3quantLabel = new javax.swing.JLabel();
        med3PriceLabel = new javax.swing.JLabel();
        addtoCartButton3 = new javax.swing.JButton();
        med3GenericName = new javax.swing.JLabel();
        med3BrandName = new javax.swing.JLabel();
        med3MedType = new javax.swing.JLabel();

        med3Price = new javax.swing.JLabel();
        med3Quant = new javax.swing.JLabel();

        this.setLayout(null);
        this.setVisible(true);
        this.setSize(1000, 700);
        this.setLocation(200, 200);
        this.add(backgroundPanel);
        this.setBackground(Color.black);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        availableMedText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        availableMedText.setText("Available Medicines");

        nextButton.setText("Next");
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonMouseClicked(evt);
            }
        });
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        PrevButton.setText("Previous");
        PrevButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrevButtonMouseClicked(evt);
            }
        });
        PrevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevButtonActionPerformed(evt);
            }
        });

        ViewCartButton.setText("View Cart");
        ViewCartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewCartButtonMouseClicked(evt);
            }
        });
   

        medPanel2.setBackground(new java.awt.Color(0, 0, 0));

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource(this.Medicines.get(1).getImg()))); // NOI18N
        //.setText("jLabel1");

        med2descLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        med2descLabel.setForeground(new java.awt.Color(255, 255, 255));
        med2descLabel.setText("Description:");

        med2GenericNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        med2GenericNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        med2GenericNameLabel.setText("Generic name: ");

        med2medtypeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        med2medtypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        med2medtypeLabel.setText("Medicine Type :");

        med2BrandNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        med2BrandNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        med2BrandNameLabel.setText("Brand names: ");

        med2quantLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        med2quantLabel.setForeground(new java.awt.Color(255, 255, 255));
        med2quantLabel.setText("Available Quantity:");

        med2PriceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        med2PriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        med2PriceLabel.setText("Price:");

        addToCartButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addToCartButton2.setText("Add to cart");
        addToCartButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addToCartButton2MouseClicked(evt);
            }
        });
        addToCartButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButton2ActionPerformed(evt);
            }
        });

        med2GenericName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        med2GenericName.setForeground(new java.awt.Color(255, 255, 255));
        med2GenericName.setText(this.Medicines.get(1).getGenericName());

        med2BrandName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        med2BrandName.setForeground(new java.awt.Color(255, 255, 255));
        med2BrandName.setText(this.Medicines.get(1).getBrandName());

        med2MedType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        med2MedType.setForeground(new java.awt.Color(255, 255, 255));
        med2MedType.setText(this.Medicines.get(1).getType());

        med2Price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        med2Price.setForeground(new java.awt.Color(255, 255, 255));
        String price2 = Double.toString(this.Medicines.get(1).getPrice());
        med2Price.setText(price2);

        med2Quant.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        med2Quant.setForeground(new java.awt.Color(255, 255, 255));
        String quant2 = Integer.toString(this.Medicines.get(1).getQuantity());
        med2Quant.setText(quant2);

        javax.swing.GroupLayout medPanel2Layout = new javax.swing.GroupLayout(medPanel2);
        medPanel2.setLayout(medPanel2Layout);
        medPanel2Layout.setHorizontalGroup(
                medPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(medPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(medPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(medPanel2Layout.createSequentialGroup()
                                                .addComponent(med2medtypeLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(med2MedType, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                                        .addGroup(medPanel2Layout.createSequentialGroup()
                                                .addComponent(med2quantLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(med2Quant))
                                        .addGroup(medPanel2Layout.createSequentialGroup()
                                                .addComponent(med2PriceLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(med2Price, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(medPanel2Layout.createSequentialGroup()
                                                .addComponent(med2GenericNameLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(med2GenericName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(medPanel2Layout.createSequentialGroup()
                                                .addComponent(med2BrandNameLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(med2BrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                        .addGroup(medPanel2Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(addToCartButton2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        medPanel2Layout.setVerticalGroup(
                medPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(medPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(medPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(med2GenericNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(med2GenericName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(medPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(med2BrandNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(med2BrandName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(medPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(med2medtypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(med2MedType))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(medPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(med2PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(med2Price))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(medPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(med2quantLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(med2Quant))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addToCartButton2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        medPanel1.setBackground(new java.awt.Color(0, 0, 0));

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource(this.Medicines.get(0).getImg()))); // NOI18N
        //img1.setText("jLabel1");

        med1descLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        med1descLabel.setForeground(new java.awt.Color(255, 255, 255));
        med1descLabel.setText("Description:");

        med1GenericNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        med1GenericNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        med1GenericNameLabel.setText("Generic name: ");

        med1medtypeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        med1medtypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        med1medtypeLabel.setText("Medicine Type :");

        med1BrandNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        med1BrandNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        med1BrandNameLabel.setText("Brand names: ");

        med1quantLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        med1quantLabel.setForeground(new java.awt.Color(255, 255, 255));
        med1quantLabel.setText("Available Quantity:");

        med1PriceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        med1PriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        med1PriceLabel.setText("Price:");

        addToCartButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addToCartButton1.setText("Add to cart");
        addToCartButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addToCartButton1MouseClicked(evt);
            }
        });
        addToCartButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButton1ActionPerformed(evt);
            }
        });

        med1GenericName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        med1GenericName.setForeground(new java.awt.Color(255, 255, 255));
        med1GenericName.setText(this.Medicines.get(0).getGenericName());

        med1BrandName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        med1BrandName.setForeground(new java.awt.Color(255, 255, 255));
        med1BrandName.setText(this.Medicines.get(0).getBrandName());

        med1MedType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        med1MedType.setForeground(new java.awt.Color(255, 255, 255));
        med1MedType.setText(this.Medicines.get(0).getType());

        med1Price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        med1Price.setForeground(new java.awt.Color(255, 255, 255));
        String price1 = Double.toString(this.Medicines.get(0).getPrice());
        med1Price.setText(price1);

        med1Quant.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        med1Quant.setForeground(new java.awt.Color(255, 255, 255));
        String quant1 = Integer.toString(this.Medicines.get(0).getQuantity());
        med1Quant.setText(quant1);

        javax.swing.GroupLayout medPanel1Layout = new javax.swing.GroupLayout(medPanel1);
        medPanel1.setLayout(medPanel1Layout);
        medPanel1Layout.setHorizontalGroup(
                medPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(medPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(medPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(medPanel1Layout.createSequentialGroup()
                                                .addComponent(med1medtypeLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(med1MedType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(medPanel1Layout.createSequentialGroup()
                                                .addComponent(med1quantLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(med1Quant))
                                        .addGroup(medPanel1Layout.createSequentialGroup()
                                                .addComponent(med1PriceLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(med1Price, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(medPanel1Layout.createSequentialGroup()
                                                .addComponent(med1GenericNameLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(med1GenericName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(medPanel1Layout.createSequentialGroup()
                                                .addComponent(med1BrandNameLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(med1BrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                        .addGroup(medPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(addToCartButton1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        medPanel1Layout.setVerticalGroup(
                medPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(medPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(medPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(med1GenericNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(med1GenericName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(medPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(med1BrandNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(med1BrandName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(medPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(med1medtypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(med1MedType))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(medPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(med1PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(med1Price))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(medPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(med1quantLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(med1Quant))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addToCartButton1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        medPanel3.setBackground(new java.awt.Color(0, 0, 0));

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource(this.Medicines.get(2).getImg()))); // NOI18N
        //img3.setText("jLabel1");

        med3GenericNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        med3GenericNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        med3GenericNameLabel.setText("Generic name: ");

        med3medtypeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        med3medtypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        med3medtypeLabel.setText("Medicine Type :");

        med3BrandNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        med3BrandNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        med3BrandNameLabel.setText("Brand names: ");

        med3quantLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        med3quantLabel.setForeground(new java.awt.Color(255, 255, 255));
        med3quantLabel.setText("Available Quantity:");

        med3PriceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        med3PriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        med3PriceLabel.setText("Price:");

        addtoCartButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addtoCartButton3.setText("Add to cart");
        addtoCartButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addtoCartButton3MouseClicked(evt);
            }
        });
        addtoCartButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoCartButton3ActionPerformed(evt);
            }
        });

        med3GenericName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        med3GenericName.setForeground(new java.awt.Color(255, 255, 255));
        med3GenericName.setText(this.Medicines.get(2).getGenericName());

        med3BrandName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        med3BrandName.setForeground(new java.awt.Color(255, 255, 255));
        med3BrandName.setText(this.Medicines.get(2).getBrandName());

        med3MedType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        med3MedType.setForeground(new java.awt.Color(255, 255, 255));
        med3MedType.setText(this.Medicines.get(2).getType());

        med3Price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        med3Price.setForeground(new java.awt.Color(255, 255, 255));
        String price3 = Double.toString(this.Medicines.get(2).getPrice());
        med3Price.setText(price3);

        med3Quant.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        med3Quant.setForeground(new java.awt.Color(255, 255, 255));
        String quant3 = Integer.toString(this.Medicines.get(2).getQuantity());
        med3Quant.setText(quant3);

        javax.swing.GroupLayout medPanel3Layout = new javax.swing.GroupLayout(medPanel3);
        medPanel3.setLayout(medPanel3Layout);
        medPanel3Layout.setHorizontalGroup(
                medPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(medPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(medPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(medPanel3Layout.createSequentialGroup()
                                                .addComponent(med3medtypeLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(med3MedType, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                                        .addGroup(medPanel3Layout.createSequentialGroup()
                                                .addComponent(med3quantLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(med3Quant))
                                        .addGroup(medPanel3Layout.createSequentialGroup()
                                                .addComponent(med3PriceLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(med3Price, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(medPanel3Layout.createSequentialGroup()
                                                .addComponent(med3GenericNameLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(med3GenericName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(medPanel3Layout.createSequentialGroup()
                                                .addComponent(med3BrandNameLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(med3BrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                        .addGroup(medPanel3Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(addtoCartButton3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        medPanel3Layout.setVerticalGroup(
                medPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(medPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(medPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(med3GenericNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(med3GenericName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(medPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(med3BrandNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(med3BrandName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(medPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(med3medtypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(med3MedType))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(medPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(med3PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(med3Price))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(medPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(med3quantLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(med3Quant))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addtoCartButton3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MedicinePanelLayout = new javax.swing.GroupLayout(MedicinePanel);
        MedicinePanel.setLayout(MedicinePanelLayout);
        MedicinePanelLayout.setHorizontalGroup(
                MedicinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MedicinePanelLayout.createSequentialGroup()
                                .addGroup(MedicinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(MedicinePanelLayout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(availableMedText, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(MedicinePanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(medPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(MedicinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(MedicinePanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                //.addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(382, 382, 382))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MedicinePanelLayout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(PrevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ViewCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MedicinePanelLayout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(medPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                                .addComponent(medPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
        );
        MedicinePanelLayout.setVerticalGroup(
                MedicinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MedicinePanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(MedicinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(MedicinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(PrevButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ViewCartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(availableMedText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(MedicinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(medPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(MedicinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(medPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(medPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(76, 76, 76)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backgroundPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();

        //set visible background panel
        backgroundPanel.setVisible(true);
    }

    public ArrayList<Medicine> getMycart() {
        return Mycart;
    }

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
//        for(int i = 0; i< this.Mycart.size(); i++){
//            System.out.println(Mycart.get(i));
//        }
    }

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        
    }

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // logout button clicked redirect to login panel
        System.out.println("logout button clicked");
        this.dispose();
        new MyPharmacy();
        //backgroundPanel.setVisible(false);
        //panel.setVisible(true);

    }

    private void addToCartButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void addToCartButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    }


    private void PrevButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //1st panel
            img1.setIcon(new javax.swing.ImageIcon(getClass().getResource(this.Medicines.get(0).getImg())));
            med1GenericName.setText(this.Medicines.get(0).getGenericName());
            med1BrandName.setText(this.Medicines.get(0).getBrandName());
            med1MedType.setText(this.Medicines.get(0).getType());
            String price1 = Double.toString(this.Medicines.get(0).getPrice());
            med1Price.setText(price1);
            String quant1 = Integer.toString(this.Medicines.get(0).getQuantity());
            med1Quant.setText(quant1);
            //2ndpanel
            img2.setIcon(new javax.swing.ImageIcon(getClass().getResource(this.Medicines.get(1).getImg())));
            med2GenericName.setText(this.Medicines.get(1).getGenericName());
            med2BrandName.setText(this.Medicines.get(1).getBrandName());
            med2MedType.setText(this.Medicines.get(1).getType());
            String price2 = Double.toString(this.Medicines.get(1).getPrice());
            med2Price.setText(price2);
            String quant2 = Integer.toString(this.Medicines.get(1).getQuantity());
            med2Quant.setText(quant2);
            //3rd panel
            img3.setIcon(new javax.swing.ImageIcon(getClass().getResource(this.Medicines.get(2).getImg())));
            med3GenericName.setText(this.Medicines.get(2).getGenericName());
            med3BrandName.setText(this.Medicines.get(2).getBrandName());
            med3MedType.setText(this.Medicines.get(2).getType());
            String price3 = Double.toString(this.Medicines.get(2).getPrice());
            med3Price.setText(price3);
            String quant3 = Integer.toString(this.Medicines.get(2).getQuantity());
            med3Quant.setText(quant3);
    }

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (this.Medicines.size() > 3) {
            //1st panel
            img1.setIcon(new javax.swing.ImageIcon(getClass().getResource(this.Medicines.get(3).getImg())));
            med1GenericName.setText(this.Medicines.get(3).getGenericName());
            med1BrandName.setText(this.Medicines.get(3).getBrandName());
            med1MedType.setText(this.Medicines.get(3).getType());
            String price1 = Double.toString(this.Medicines.get(3).getPrice());
            med1Price.setText(price1);
            String quant1 = Integer.toString(this.Medicines.get(3).getQuantity());
            med1Quant.setText(quant1);
            //2ndpanel
            img2.setIcon(new javax.swing.ImageIcon(getClass().getResource(this.Medicines.get(4).getImg())));
            med2GenericName.setText(this.Medicines.get(4).getGenericName());
            med2BrandName.setText(this.Medicines.get(4).getBrandName());
            med2MedType.setText(this.Medicines.get(4).getType());
            String price2 = Double.toString(this.Medicines.get(4).getPrice());
            med2Price.setText(price2);
            String quant2 = Integer.toString(this.Medicines.get(4).getQuantity());
            med2Quant.setText(quant2);
            //3rd panel
            img3.setIcon(new javax.swing.ImageIcon(getClass().getResource(this.Medicines.get(5).getImg())));
            med3GenericName.setText(this.Medicines.get(5).getGenericName());
            med3BrandName.setText(this.Medicines.get(5).getBrandName());
            med3MedType.setText(this.Medicines.get(5).getType());
            String price3 = Double.toString(this.Medicines.get(5).getPrice());
            med3Price.setText(price3);
            String quant3 = Integer.toString(this.Medicines.get(5).getQuantity());
            med3Quant.setText(quant3);
        }
    }

    private void addtoCartButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void PrevButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void ViewCartButtonMouseClicked(java.awt.event.MouseEvent evt) {
        //storage.storeCart(Mycart);
        if(main.Mycart.size() <5){
            JOptionPane.showMessageDialog(this,
                    "Minimum and Maximum of items must be 5" );  
        }
        else{
            this.dispose();
            new cart();
        }
            
          
    }

    private void addToCartButton1MouseClicked(java.awt.event.MouseEvent evt) {
        
        String generic = this.med1GenericName.getText();
        String brand = this.med1BrandName.getText();
        String type = this.med1MedType.getText();
        String price1 = this.med1Price.getText();
        Double price = Double.parseDouble(price1);
   
        String image = this.img1.getText();
        Medicine m = new Medicine(generic,brand,type,price,0,image);
        main.Mycart.add(m);
        JOptionPane.showMessageDialog(this,
                   main.Mycart.size() + " Added to cart" );
        
    }

    private void addToCartButton2MouseClicked(java.awt.event.MouseEvent evt) {
        main.quant2++;
        String generic = this.med2GenericName.getText();
        String brand = this.med2BrandName.getText();
        String type = this.med2MedType.getText();
        String price1 = this.med2Price.getText();
        Double price = Double.parseDouble(price1);
        //String q = this.med2Quant.getText();
        //int qty = Integer.parseInt(q);
        String image = this.img2.getText();
        Medicine m = new Medicine(generic,brand,type,price,0,image);
        main.Mycart.add(m);
        JOptionPane.showMessageDialog(this,
                   main.Mycart.size() + " Added to cart" );
        
    }

    private void addtoCartButton3MouseClicked(java.awt.event.MouseEvent evt) {
        main.quant3++;
        String generic = this.med3GenericName.getText();
        String brand = this.med3BrandName.getText();
        String type = this.med3MedType.getText();
        String price1 = this.med3Price.getText();
        Double price = Double.parseDouble(price1);
        //String q = this.med3Quant.getText();
        //int qty = Integer.parseInt(q);
        String image = this.img3.getText();
        Medicine m = new Medicine(generic,brand,type,price,0,image);
        main.Mycart.add(m);
        JOptionPane.showMessageDialog(this,
                   main.Mycart.size() + " Added to cart" );
        
    }

    
}
