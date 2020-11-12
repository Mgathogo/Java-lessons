package brainFeed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class TryWithResources {
 
	public static void main(String[] args) {
		System.out.println();
		//auto-closable try with resources
		try(BufferedReader reader = new BufferedReader(new StringReader("Hello Michael Keep on improving and growing, this is awesome!"));
				StringWriter writer = new StringWriter()) {
			
			
			writer.write(reader.readLine());
			System.out.println(writer.toString());
		} catch (IOException ioe) {
			
		}

	}

}
