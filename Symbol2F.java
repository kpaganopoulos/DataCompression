
 import java.io.BufferedWriter;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.util.ArrayList;

 public class Symbol2F {
	 public static void writeSymbolToFile(String url, ArrayList<Symbol> symbolList) {
                // TODO Auto-generated method stub
                try {
                        FileWriter fw = new FileWriter(url);
                        BufferedWriter bw = new BufferedWriter(fw);

                        for ( Symbol s: symbolList ){

                                if ( s.letter.equals("\n") ) {
                                        bw.write( "lineWrapper" + " " + s.probability + " " + s.low + " " + s.high );
                                }
                                else if ( s.letter.equals(" ") ){
                                        bw.write( "space" + " " + s.probability + " " + s.low + " " + s.high );
                                } else {
                                        bw.write( s.letter + " " + s.probability + " " + s.low + " " + s.high );
                                }
                                bw.newLine();
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