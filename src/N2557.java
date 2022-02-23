

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class N2557 {

	public static void main(String[] args) {
		try {
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			bw.write("Hello World!\n");
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
