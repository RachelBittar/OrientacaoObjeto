import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
/*
 * 
 * 
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String Key= null;
try {
     Key = reader.readLine();
} catch (IOException e) {
   e.printStackTrace();
} 
 * */

public class Arquivos {
	
	    private final String FILENAME;
						
		public Arquivos(String FILENAME) {
			super();
			this.FILENAME = FILENAME;
		}
		public String getFILENAME() {
			return FILENAME;
		}
		

		@SuppressWarnings("finally")
		public  Vector<String> RetornaDados() {
			
			 BufferedReader br = null;
			 StringBuffer palavras = new StringBuffer();
			 FileReader fr = null;
			 Vector<String> v = new Vector<String>();
		
			 try	{
					fr = new FileReader(FILENAME);
					br = new BufferedReader(fr);
				    String sCurrentLine;	
					
					while ((sCurrentLine = br.readLine()) != null) {
							v.add(sCurrentLine.trim());
					}

				}catch(IOException e){
					e.printStackTrace();
				}
			 finally{
					try {
						if (br != null)
							br.close();
						if (fr != null)
							fr.close();
					} catch (final IOException ex) {
						ex.printStackTrace();
					}
				return v;
				}
		}
		
		
		public String myGuess() {
		
			String myguess;
			 Scanner s = new Scanner(System.in);
			 
			 System.out.println("Guess : ");
		     myguess = s.next();
		     return myguess;
		     
		}
				  


}
