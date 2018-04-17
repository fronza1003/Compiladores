/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoFinal1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

/**
 *
 * @author asus
 */
public class Arquivo {
	

    static String leTodasAsLinhas(File arquivoAtual) throws IOException {
        
       String texto = "";
       
        for(String s : Files.readAllLines(Paths.get(arquivoAtual.toString()))){
            texto += s;
            texto += "\n";
        }
        return texto;
	}
    
      public static void escreveNoArquivo(String string, File file) throws IOException {
        try (
                BufferedReader reader = new BufferedReader(new StringReader(string));
                PrintWriter writer = new PrintWriter(new FileWriter(file))
        ) {
            reader.lines().forEach(writer::println);
        }
    }
       
    }


    
   // public File getArquivo(){
        //Create a file chooser

  //  }
    

