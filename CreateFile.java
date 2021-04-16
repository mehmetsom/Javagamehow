
package javafinal;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;  // File sınıfını içe aktarın
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;  // Hataları işlemek için IOException sınıfını içe aktar
import java.util.Arrays;
import java.util.Random;
import javax.swing.JLabel;


public class CreateFile {
  Random rn = new Random();

    
    
    public  void olusturVeYaz(String soru, String cevap) throws IOException {

      
      File myObj = new File(cevap.length()+"sorular.txt");
      if(!myObj.exists())
      {
         try {
              myObj.createNewFile();
          } catch (Exception e) {
          }
      }
       FileWriter a = new FileWriter(myObj.getAbsoluteFile(),true);
       BufferedWriter b = new BufferedWriter(a);
       b.write(soru+":"+cevap+"\n");
       b.close();
  }
    String[] part;
    String cevapTexti;
    int kazanılacakPuan;
  public void oku(int soruNo, JLabel label, JLabel cevapLabel) throws FileNotFoundException, IOException{
  
  FileReader fileReader = new FileReader(soruNo+"sorular.txt"); 
  BufferedReader buffReader = new BufferedReader(fileReader);
  
  String[] soruVeCevap=buffReader.lines().toArray(String[]::new);
  int rasgeleIndex=rn.nextInt(soruVeCevap.length);
   part= soruVeCevap[rasgeleIndex].split(":");
  label.setText(part[0]);
  cevapTexti="";
 
  for(int i = 0;i<(part[1].length());i++){
      cevapTexti=cevapTexti+"*";
  }
  bilinmeyenCevap=part[1].toCharArray();
  cevabınKendisi=part[1].toCharArray();
  for(int i=0;i<cevabınKendisi.length;i++){
      cevabınKendisi[i]='*';
  }
   cevapLabel.setText(cevapTexti);      
  
  }
  String yeniHal1="";
   char[] bilinmeyenCevap;
   char[] cevabınKendisi;
   int sayac= 0;
  public void harfAlim(JLabel cevapLabel) throws FileNotFoundException, IOException{
     if(sayac<(cevabınKendisi.length-1)){
      yeniHal1="";
       int rasgele;
       
      do{    
      rasgele=rn.nextInt(bilinmeyenCevap.length);
        }
  while(bilinmeyenCevap[rasgele]=='*');
  cevabınKendisi[rasgele]=bilinmeyenCevap[rasgele];
  bilinmeyenCevap[rasgele]='*';
  for(int a=0;a<cevabınKendisi.length;a++)
  {
     yeniHal1= yeniHal1+ String.valueOf(cevabınKendisi[a]);
  }
  cevapLabel.setText(yeniHal1);
  sayac++;
  kazanılacakPuan=kazanılacakPuan-100;
  }
  }
}
