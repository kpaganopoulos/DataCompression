import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static String readFile(String url, boolean withLineWrap){
		String result = "";
                try {
                        FileReader fr = new FileReader(url);
                        BufferedReader br = new BufferedReader(fr);
                        String temp = null;

                        if ( withLineWrap ) {
                                while ( ( temp=br.readLine() ) !=null ){
                                        result += (temp+"\n");
                                }
                        }
                        else {
                                while ( ( temp=br.readLine() ) !=null ){
                                        result += temp;
                                }
                        }

                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                }
                return result;
        }
	}
