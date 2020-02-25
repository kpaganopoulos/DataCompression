 /**
         * Calculate the compress rate. Assuming that the original code is 8-bit ASCII code.
         * @param text
         * @param code
         * @return
         */

import java.util.Collections;

import java.util.ArrayList;
public class Diagnostics {



 public static double calCompRate(String text, ArrayList<String> code){
                double compRate = 0;
                double preNum = 8*text.length();
                double postNum = 0;
                for ( String s: code) {
                        postNum += s.length();
                }

                compRate = preNum/postNum;
                System.out.println("If simply using ASCII code, there are in total " + (int)preNum + " bits.");
                System.out.println("If using huffman coding, there are in total " + (int)postNum + " bits.");
                System.out.println("The compress rate is: " + compRate);
                return compRate;
        }
}
