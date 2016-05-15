/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recyclo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Gaming
 */
public class Application extends JPanel {
    public JFrame gameFrame;
    private final int timerSpeed = 60;//graphics refresh rate
    public int numCorrect, numQuestions;
    public Timer timer;
    public final String winnerCode;
    public int imageNumber;
    public ArrayList<Image>imageList;
    private BufferedImage back;//backdrop where images are drawn
    
    public Application(){
        gameFrame = new JFrame(); 
        gameFrame.setSize(1200, 800);
        gameFrame.setVisible(true);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        winnerCode = getCode();
        imageList = new ArrayList<>();
    }
    public final String getCode() {
        String toReturn = "";
        int digit1 = (int) (Math.random() * 10);
        int digit2 = (int) (Math.random() * 10);
        int digit3 = (int) (Math.random() * 10);
        int digit4 = (int) (Math.random() * 10);
        int digit5 = (int) (Math.random() * 10);
        int sum = digit1+digit2+digit3+digit4+digit5;
        toReturn = toReturn+digit1+digit2+digit3+digit4+digit5+sum;
        return toReturn;
    }
    public void setImageList(ArrayList<Image>list) {
        imageList = list;
    }
    public void updateScore(int c, int q) {
        numCorrect = c;
        numQuestions = q;
    }
    public void updateCurrentImgNumber(int num){
        imageNumber = num;
    }
    
    public boolean hasGameEnded(){
        if(numCorrect>25&&(double)numCorrect/(double)numQuestions>0.7){
            return true;
        }
        else {
            return false;
        }
    }
    public void startPaint() {
        //new timer for repaint rate
        try {
            ActionListener timerListener = new ActionListener()  {
                @Override
                public void actionPerformed(ActionEvent e){
                    gameFrame.repaint();//action of repaint
                }
            };
            timer = new Timer(timerSpeed, timerListener);
            timer.start();//start timer
            gameFrame.add(this); //add to frame
        }
        catch(RuntimeException ex){
            System.out.println("Fuck, could not start paint timer"+ex);
        }  
    }
    
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
    }
    
    @Override
    public void paint(Graphics g) {    
        try { 
            //if canvas has not been created, create canvsas
            if(back==null){
                back=(BufferedImage)createImage(1200,900);
            }
            //if game has not ended
            if(!hasGameEnded()) {
                Graphics2D twoDGraph = (Graphics2D)g;
                Graphics graphToBack= back.createGraphics(); //prepares drawing onto bufferedimage graphics
                //draw using graphToBack
                
                graphToBack.drawImage(imageList.get(30), 0,0,1200,800, null);
                //draw backgrond
                //draw new object according to imageNum
                //draw the score text
                int imageWidth = imageList.get(imageNumber).getWidth(null);
                int imageHeight = imageList.get(imageNumber).getHeight(null);
                if(imageWidth>imageHeight) {
                    double scaleFactor = (double)imageWidth/400;
                    imageWidth =(int)(imageWidth/scaleFactor);
                    imageHeight = (int)(imageHeight/scaleFactor);
                }
                else {
                    double scaleFactor = (double)imageHeight/400;
                    imageWidth =(int)(imageWidth/scaleFactor);
                    imageHeight = (int)(imageHeight/scaleFactor);
                }
                graphToBack.drawImage(imageList.get(imageNumber),210-imageWidth/2,600-imageHeight/2,imageWidth,imageHeight,null);
                Font myFont=new Font("Impact",Font.PLAIN, 50);
                graphToBack.setFont(myFont);
                graphToBack.setColor(Color.white);
                graphToBack.drawString("Score:"+numCorrect,100,100);
                if(numQuestions == 0) {
                    graphToBack.drawString("%Correct:0%",100,200);
                }
                else {
                    graphToBack.drawString("%Correct:"+100*numCorrect/numQuestions+"%",100,200);
                }
                
                
                twoDGraph.drawImage(back,0,0,gameFrame.getWidth(),gameFrame.getHeight(),null);//draws bufferedimage to frame
                repaint();//redo again in loop
            }
            else {
                //do something with winner code
                Graphics2D twoDGraph = (Graphics2D)g;
                Graphics graphToBack= back.createGraphics(); //prepares drawing onto bufferedimage graphics
                //draw using graphToBack
                graphToBack.drawImage(imageList.get(30), 1200,900, null);
                //draw backgrond
                //draw new object according to imageNum
                //draw the score text
                Font myFont=new Font("Impact",Font.PLAIN, 50);
                graphToBack.setFont(myFont);
                graphToBack.setColor(Color.WHITE);
                graphToBack.drawString("Code:"+winnerCode,100,300);
                graphToBack.setColor(Color.BLUE);
                graphToBack.drawString("CLAIM YOUR FREE PRIZE!", 0,400);
                twoDGraph.drawImage(back,0,0,gameFrame.getWidth(),gameFrame.getHeight(),null);//draws bufferedimage to frame
                
                repaint();//redo again in loop
            } 
        }
        catch(RuntimeException ex) {
            System.out.println(ex);
        } 
    }
}
