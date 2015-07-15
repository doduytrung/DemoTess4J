/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demotess4j;

import java.io.File;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 *
 * @author test
 */
public class DemoTess4J {

     public static void main(String[] args) {
        File imageFile = new File("eurotext.tif");
        Tesseract instance = Tesseract.getInstance();  // JNA Interface Mapping
        // Tesseract1 instance = new Tesseract1(); // JNA Direct Mapping

        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
    
}
