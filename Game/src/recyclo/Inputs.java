/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recyclo;

import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author Gaming
 */
public class Inputs {
    public ArrayList<Image>imageList; 
    public String[]keyAnswers; 
    
    public Inputs(){
        imageList = new ArrayList<>();
        keyAnswers = new String[30];
    }
    
    public ArrayList<Image> getImages(){
        try {
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/PlasticBag.png")));//0
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/MilkJug.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/PlasticBucket.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/VinylRecord.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/PVCPipe.png")));//4
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/CreditCard.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/PackingPeanuts.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Cutlery.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Legos.png")));//8
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/YogurtCup.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/GlassBottle.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/BeerBottle.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Nails.png")));//12
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/PotsAndPans.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/AluminumCan.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/LeadBattery.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/LithiumIonBattery.png")));//16
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/MotorOil.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Cardboard.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Paper.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Tissue.png")));//20
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Newspaper.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Trash1.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Trash2.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Trash3.png")));//24
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Trash4.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Trash5.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Trash6.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Trash7.png")));//28
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Trash8.png")));
            
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Background.png")));//30
            return imageList;
            
            
        }
        catch (IOException ex){
            System.out.println("Fuck, the images didn't import");
        }
        return null;
    }
    public String[] getAnswers(){
        keyAnswers[0] = "1";
        keyAnswers[1] = "1";
        keyAnswers[2] = "1";
        keyAnswers[3] = "2";
        keyAnswers[4] = "2";
        keyAnswers[5] = "2";
        keyAnswers[6] = "3";
        keyAnswers[7] = "3";
        keyAnswers[8] = "4";
        keyAnswers[9] = "4";
        keyAnswers[10] = "5";
        keyAnswers[11] = "5";
        keyAnswers[12] = "6";
        keyAnswers[13] = "6";
        keyAnswers[14] = "7";
        keyAnswers[15] = "8";
        keyAnswers[16] = "9";
        keyAnswers[17] = "0";
        keyAnswers[18] = "Q";
        keyAnswers[19] = "W";
        keyAnswers[20] = "E";
        keyAnswers[21] = "E";
        keyAnswers[22] = "Space";
        keyAnswers[23] = "Space";
        keyAnswers[24] = "Space";
        keyAnswers[25] = "Space";
        keyAnswers[26] = "Space";
        keyAnswers[27] = "Space";
        keyAnswers[28] = "Space";
        keyAnswers[29] = "Space";
        
        return keyAnswers;
    }  
}
