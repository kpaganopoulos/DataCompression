
 import java.io.BufferedWriter;
 import java.io.FileNotFoundException;
 import java.io.FileWriter;
 import java.io.IOException;


 public class WriteFile {

 public static void writeFile(String url, String text, boolean withLineWrap){
                try {
                        FileWriter fw = new FileWriter(url);
                        BufferedWriter bw = new BufferedWriter(fw);
                        char[] str = text.toCharArray();

                        for ( int i=0; i<str.length; i++ ) {
                                if ( withLineWrap && i%100==0 && i!=0 )
                                        bw.append('\n');
                                bw.append(str[i]);
                        }
                        bw.close();
                        fw.close();

                        System.out.println("Writing file completed!");
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
        }
   }