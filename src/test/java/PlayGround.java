import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class PlayGround {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = null;
		 
		try {
			ArrayList<String>  itemXmlList = new ArrayList<String>();
			String sCurrentLine;
			String b="";
			
			FileReader fl = new FileReader("C:\\testing.txt");
			br = new BufferedReader(fl);
			
			//br = new BufferedReader(new FileReader("C:\testing.txt"));
 
			while ((sCurrentLine = br.readLine()) != null) {
				itemXmlList.add(sCurrentLine);
				b=b+sCurrentLine+"\n";
			}
			 System.out.println(itemXmlList);
			 System.out.println(b);
			 
			 String file;
			  
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}

	}


}
