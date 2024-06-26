/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;
import dao.PharmacyUtils;

/**
 *
 * @author prathmesh
 */
public class OpenPdf {
    public static void openByID(String id)
    {
        try
        {
            if((new File(PharmacyUtils.billPath + id + ".pdf")).exists())
            {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll, FileProtocolHandler " + PharmacyUtils.billPath + "" + id + ".pdf");
            }
            
            else
            {
                JOptionPane.showMessageDialog(null, "File does not exits.");
            }
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
