/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SEPackage;

import java.awt.Color;
import static java.awt.Color.BLACK;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import static javax.swing.SwingConstants.BOTTOM;
import static javax.swing.SwingConstants.LEFT;
import javax.swing.border.LineBorder;

/**
 *
 * @author Rajendra
 */
public class BoardGame extends javax.swing.JFrame {

    /**
     * Creates new form BoardGame
     */
    private Customize cust;
    private int q;
    private Player player[];
    private ImageIcon plyr[];
    public BoardGame(Customize cus,Player pl[]) throws InterruptedException {
        initComponents();
        cust=cus;
        player=Arrays.copyOf(pl,pl.length);
        setBoard();
        q=0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    public int panelSize=600;
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        playerIcon1 = new javax.swing.JLabel();
        playerIcon2 = new javax.swing.JLabel();
        playerIcon3 = new javax.swing.JLabel();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, panelSize, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, panelSize, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, panelSize, panelSize));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SEPackage/Image/dice1.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10+panelSize, 40, 70, 70));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    jLabel1MouseClicked(evt);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoardGame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10+panelSize, 130, 60, 20));
        //jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 153, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(0, 51, 0)));
        
        
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10+panelSize, 160, 60, 20));
        //jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 153, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(0, 51, 0)));
        
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10+panelSize, 190, 60, 20));
        //jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 153, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(0, 51, 0)));
        
        playerIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(playerIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10+panelSize, 210, 60, 50));
        //playerIcon1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 153, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(0, 51, 0)));
        
        playerIcon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(playerIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10+panelSize, 270, 60, 50));
        //playerIcon2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 153, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(0, 51, 0)));
        
        playerIcon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(playerIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10+panelSize, 330, 60, 50));
        //playerIcon3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 153, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(0, 51, 0)));
        
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("New Game");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10+panelSize, 390, 80, 30));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
              
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Exit");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10+panelSize, 430, 80, 30));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        pack();
    }// </editor-fold>                        

    private JPanel board[];
    private JLabel boards;
    private int DiceNo;
    ImageIcon dice[],snakeImg,ladderImg;
    void setHighScore(String s)
    {
        try {
        FileWriter fw = new FileWriter("C:\\Users\\Rajendra\\Documents\\NetBeansProjects\\snakeladder\\HighScore.txt",false);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(s);
        bw.close();
        } catch (Exception ex) {
            Logger.getLogger(StartGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public int isSnake(int pos)
    {
        for(int i=0;i<cust.snakes.size();i++)
            if(cust.snakes.get(i).head==pos)
            {
              return cust.snakes.get(i).tail;  
            }
        return -1;
    }
    public int isLadder(int pos)
    {
        for(int i=0;i<cust.ladders.size();i++)
            if(cust.ladders.get(i).bottom==pos)
            {
              return cust.ladders.get(i).top;  
            }
        return -1;
    }
    private void recust(int point)
    {
            board[point].setBackground(Color.GRAY);
    }
    private void newcust(int point,int p)
    {
        if(point>=0 && point<cust.size*cust.size)
        {
            if(p==0)
                board[point].setBackground(Color.BLACK);
            if(p==1)
                board[point].setBackground(Color.MAGENTA);
            if(p==2)
                board[point].setBackground(Color.YELLOW);
        }
    }
    private void move(int p) throws InterruptedException
    {
        int pl=cust.players,sn,la,flag;
        if(player[p].currentPos>=1)
        recust(player[p].currentPos-1);
        JOptionPane.showMessageDialog(null,player[p].name+"'s turn. Click on the dice to roll.");
        player[p].moves++;
        player[p].currentPos+=DiceNo;
        sn=isSnake(player[p].currentPos);
        la=isLadder(player[p].currentPos);
        if(DiceNo==6)
        {
            JOptionPane.showMessageDialog(null,"You got a six! Make one more move.");
            player[p].moves--;
            q--;
        }
        if(sn!=-1)
        {
            JOptionPane.showMessageDialog(null,"O My God! Snake at position "+player[p].currentPos+"got you.");
            player[p].currentPos=sn;
        }
        else if(la!=-1)
        {
            JOptionPane.showMessageDialog(null,"Wow! You got a ladder at"+player[p].currentPos+"!");
            player[p].currentPos=la;
        }
        else if(player[p].currentPos==cust.size*cust.size)
        {
            JOptionPane.showMessageDialog(null,"Hurray You won the Game in "+player[p].moves+"!");
            if(cust.HighScore>player[p].moves || cust.HighScore==-1)
            {
                JOptionPane.showMessageDialog(null,"And you have set a New HighScore!");
                setHighScore(player[p].moves+"");
            }
            new StartGUI().setVisible(true);
            this.dispose();
        }
        else if(player[p].currentPos>cust.size*cust.size)
        {
            player[p].currentPos-=DiceNo;
            JOptionPane.showMessageDialog(null,"You Have to wait for a while to end your game!");
        }

        newcust(player[p].currentPos-1,p);
    }
    void loadImages()
	{
            plyr=new ImageIcon[3];
            plyr[0]=new ImageIcon(new File("C:\\Users\\Rajendra\\Documents\\NetBeansProjects\\snakeladder\\images\\player0.png").getAbsolutePath());
            plyr[1]=new ImageIcon(new File("C:\\Users\\Rajendra\\Documents\\NetBeansProjects\\snakeladder\\images\\player1.png").getAbsolutePath());
            plyr[2]=new ImageIcon(new File("C:\\Users\\Rajendra\\Documents\\NetBeansProjects\\snakeladder\\images\\player2.png").getAbsolutePath());
            File snakeFile = new File("C:\\Users\\Rajendra\\Documents\\NetBeansProjects\\snakeladder\\images\\snake.png");
            String snakePath = snakeFile.getAbsolutePath();
            snakeImg = new ImageIcon(snakePath);
            File ladderFile = new File("C:\\Users\\Rajendra\\Documents\\NetBeansProjects\\snakeladder\\images\\ladder.png");
            String ladderPath = ladderFile.getAbsolutePath();
            ladderImg = new ImageIcon(ladderPath);
        }
    private void setBoard() throws InterruptedException
    {
        loadImages();
        int dim=panelSize/(cust.size);
        board=new JPanel[cust.size*cust.size];
        int i,j,cnt=0,k;
        for(i=cust.size-1;i>=0;i--)
        {
            if((cust.size-i-1)%2==0)
            {
                
                for(j=0;j<cust.size;j++)
                {
                    board[cnt++]=new JPanel();//Start from here.See for values of cell number to be displayed.
                    board[cnt-1].setBounds(j*dim, i*dim, dim, dim);                    
                    boards=new JLabel((cust.size-1-i)*cust.size+(j+1)+"",SwingConstants.LEFT);
                    boards.setVerticalAlignment(SwingConstants.TOP);
                    boards.setBounds(board[cnt-1].getX(),board[cnt-1].getY(),dim/2,12);
                    boards.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
                    board[cnt-1].setBackground(Color.GRAY);
                    board[cnt-1].setBorder(new LineBorder(BLACK));
                    board[cnt-1].add(boards);
                    for(k=0;k<cust.snakes.size();k++)
                    {
                        if(cust.snakes.get(k).head==(cust.size-1-i)*cust.size+(j+1))
                        {
                            boards=new JLabel();
                            boards.setIcon(snakeImg);
                            boards.setBounds(board[cnt-1].getX(), board[cnt-1].getY(), 52, 33);
                            JLabel lblSnake = new JLabel("Go to "+cust.snakes.get(k).tail,SwingConstants.RIGHT);
                            lblSnake.setVerticalAlignment(SwingConstants.TOP);
                            lblSnake.setBounds(board[cnt-1].getX(),board[cnt-1].getY(),dim,dim);
                            lblSnake.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
                            lblSnake.setForeground(Color.BLACK);
                            
                            board[cnt-1].add(lblSnake);
                            board[cnt-1].add(boards);
                        }
                    }
                    for(k=0;k<cust.ladders.size();k++)
                    {
                        if(cust.ladders.get(k).bottom==(cust.size-1-i)*cust.size+(j+1))
                        {
                            boards=new JLabel();
                            boards.setIcon(ladderImg);
                            boards.setBounds(board[cnt-1].getX()+(dim-37)/2, board[cnt-1].getY()+(dim-36)/2, 37, 36);
                            JLabel lblSnake = new JLabel("Go to "+cust.ladders.get(k).top,SwingConstants.RIGHT);
                            lblSnake.setVerticalAlignment(SwingConstants.TOP);
                            lblSnake.setBounds(board[cnt-1].getX(),board[cnt-1].getY(),dim,dim);
                            lblSnake.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
                            lblSnake.setForeground(Color.BLACK);
                            
                            board[cnt-1].add(lblSnake);
                            board[cnt-1].add(boards);
                        }
                    }
                    jPanel1.add(board[cnt-1]);
                }
                
            }
            else
            {
                
                for(j=cust.size-1;j>=0;j--)
                {
                    board[cnt++]=new JPanel();
                    board[cnt-1].setBounds(j*dim, i*dim, dim, dim);
                    boards=new JLabel((cust.size-1-i)*cust.size+cust.size-j+"",LEFT);
                    boards.setBounds(board[cnt-1].getX(),board[cnt-1].getY(),dim/2,12);
                    boards.setVerticalAlignment(SwingConstants.TOP);
                    boards.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
                    board[cnt-1].setBackground(Color.GRAY);
                    board[cnt-1].setBorder(new LineBorder(BLACK));
                    board[cnt-1].add(boards);
                    for(k=0;k<cust.snakes.size();k++)
                    {
                        if(cust.snakes.get(k).head==(cust.size-1-i)*cust.size+cust.size-j)
                        {
                            boards=new JLabel();
                            boards.setIcon(snakeImg);
                            boards.setBounds(board[cnt-1].getX()+(dim-52)/2, board[cnt-1].getY()+(dim-33)/2, 52, 33);
                            JLabel lblSnake = new JLabel("Go to "+cust.snakes.get(k).tail,SwingConstants.RIGHT);
                            lblSnake.setVerticalAlignment(SwingConstants.TOP);
                            lblSnake.setBounds(board[cnt-1].getX(),board[cnt-1].getY(),dim,dim);
                            lblSnake.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
                            lblSnake.setForeground(Color.BLACK);
                            
                            board[cnt-1].add(lblSnake);
                            board[cnt-1].add(boards);
                        }
                    }
                    for(k=0;k<cust.ladders.size();k++)
                    {
                        if(cust.ladders.get(k).bottom==(cust.size-1-i)*cust.size+(j+1))
                        {
                            boards=new JLabel();
                            boards.setIcon(ladderImg);
                            boards.setBounds(board[cnt-1].getX()+(dim-37)/2, board[cnt-1].getY()+(dim-36)/2, 37, 36);
                            JLabel lblSnake = new JLabel("Go to "+cust.ladders.get(k).top,SwingConstants.RIGHT);
                            lblSnake.setVerticalAlignment(SwingConstants.TOP);
                            lblSnake.setBounds(board[cnt-1].getX(),board[cnt-1].getY(),dim,dim);
                            lblSnake.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
                            lblSnake.setForeground(Color.BLACK);
                            
                            board[cnt-1].add(lblSnake);
                            board[cnt-1].add(boards);
                        }
                    }
                    jPanel1.add(board[cnt-1]);
                }
                
            }
        }
        if(player.length==1)
        {
            jLabel2.setText(player[0].name);
            playerIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SEPackage/Image/player0.png")));
        }
        else if(player.length==2)
        {
            jLabel2.setText(player[0].name);
            playerIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SEPackage/Image/player0.png")));
            jLabel3.setText(player[1].name);
            playerIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SEPackage/Image/player1_1.png")));
        }
        else
        {
            jLabel2.setText(player[0].name);
            playerIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SEPackage/Image/player0.png")));
            jLabel3.setText(player[1].name);
            playerIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SEPackage/Image/player1_1.png")));
            jLabel4.setText(""+player[2].name);
            playerIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SEPackage/Image/player2_1.png")));
        }
        jPanel1.setVisible(true);
        //move(player,cust);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(final Customize cust,final Player player[]) {
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
            java.util.logging.Logger.getLogger(BoardGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoardGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoardGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoardGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BoardGame(cust,player).setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BoardGame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel playerIcon1;
    private javax.swing.JLabel playerIcon2;
    private javax.swing.JLabel playerIcon3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {                                   
        new StartGUI().setVisible(true);
        this.dispose();
    }
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {                                   
        System.exit(0);
    }
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) throws InterruptedException {                                   
        DiceNo= (int) (1+(Math.random()*6));
        jLabel1.removeAll();
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SEPackage/Image/dice"+DiceNo+".png")));
        move((q++)%cust.players);
    }
}