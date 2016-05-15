/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recyclo;

/**
 *
 * @author Gaming
 */
public class Recyclo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inputs inputInfo = new Inputs();
        Calculations startCompute = new Calculations(inputInfo.getImages(), inputInfo.getAnswers());
    }
    
}
