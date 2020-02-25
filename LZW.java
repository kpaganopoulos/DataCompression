import java.util.List;

public class LZW {
	public static void main(String[] args) {


        //
        String code = ReadFile.readFile("path", false);
        List<Integer> compressed = ComLZW.compress(code);
        System.out.println(compressed);


        String decompressed = DecLZW.decompress(compressed);
        System.out.println(decompressed);
    }
}

