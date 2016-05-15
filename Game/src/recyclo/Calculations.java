/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recyclo;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 *
 * @author Gaming
 */
public class Calculations implements KeyListener {
    public int numCorrect, numQuestions,currentNumber;
    public ArrayList<Image>imageList; 
    public String[]keyAnswers;
    public Application newApp;
    
    public Calculations(ArrayList<Image>list, String[]answers) {
        newApp = new Application();
        imageList = list;
        keyAnswers = answers;
        newApp.setImageList(imageList);
        newApp.getCode();
        newApp.startPaint();   
        numCorrect = 0;
        numQuestions = 0;
        newRandomQuestion();
        newApp.gameFrame.addKeyListener(this);
    }
    public void newRandomQuestion(){
        currentNumber = (int)(Math.random()*30);
        newApp.updateCurrentImgNumber(currentNumber);
        newApp.updateScore(numCorrect, numQuestions);
    }
    
    public void checkInput(String inputLetter){
        String correctLetter = keyAnswers[currentNumber];
        if(!newApp.hasGameEnded()){
            if(correctLetter.equals(inputLetter)){
                numCorrect++;
                numQuestions++;
            }
            else{
                numQuestions++;
            }
            newRandomQuestion();
        }     
    }

    @Override
    public void keyPressed(KeyEvent e) {
        try {
            if(e.getKeyCode() == KeyEvent.VK_1) {
                checkInput("1");//Polyethelene
            }
            if(e.getKeyCode() == KeyEvent.VK_2) {
                checkInput("2");//Polyvinyl Chloride
            }
            if(e.getKeyCode() == KeyEvent.VK_3) {
                checkInput("3");//Polystyrene
            }
            if(e.getKeyCode() == KeyEvent.VK_4) {
                checkInput("4");//Polypropylene
            }
            if(e.getKeyCode() == KeyEvent.VK_5) {
                checkInput("5");//Glass
            }
            if(e.getKeyCode() == KeyEvent.VK_6) {
                checkInput("6");//Ferrous
            }
            if(e.getKeyCode() == KeyEvent.VK_7) {
                checkInput("7");//NonFerrous
            }
            if(e.getKeyCode() == KeyEvent.VK_8) {
                checkInput("8");//Lead Battery
            }
            if(e.getKeyCode() == KeyEvent.VK_9) {
                checkInput("9");//Lithium ion
            }
            if(e.getKeyCode() == KeyEvent.VK_0) {
                checkInput("0");//Motor oil
            }
            if(e.getKeyCode() == KeyEvent.VK_Q) {
                checkInput("Q");//Cardboard
            }
            if(e.getKeyCode() == KeyEvent.VK_W) {
                checkInput("W");//Highgrade paper
            }
            if(e.getKeyCode() == KeyEvent.VK_E) {
                checkInput("E");//Lowgrade paper
            }
            if(e.getKeyCode() == KeyEvent.VK_SPACE) {
                checkInput("Space");//trash
            }
           
        }
        catch(RuntimeException ex) {
            System.out.println("Error with this keyboard input"+ex);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }
    
}
