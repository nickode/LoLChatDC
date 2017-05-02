import java.io.*;
import java.util.Scanner;

public class filewriter {
	public String filename = "C:\\Riot Games\\League of Legends\\RADS\\projects\\lol_air_client\\releases\\0.0.1.236\\deploy\\lol.properties";
	public StringBuffer stringBufferOfData = new StringBuffer();

	public void readFile() {

		Scanner fileRead = null;

		try {
			fileRead = new Scanner(new File(filename));

			for (String line = null; fileRead.hasNextLine() && (line = fileRead.nextLine()) != null;) {
				System.out.println(line);
				stringBufferOfData.append(line).append("\r\n");
			}
			fileRead.close();
			

		} catch (FileNotFoundException e) {
			System.out.println("The file " + filename + " could not be found!");
			
		} finally {
			fileRead.close();
		}

	}

	public boolean editText() {
		
		String lineToEdit = "xmpp_server_url=chat.na2.lol.riotgames.com";
		String replacementText = "xmpp_server_url=chat.google.com";
		int startIndex = stringBufferOfData.indexOf(lineToEdit);
		int endIndex = startIndex + lineToEdit.length();
		try {
			stringBufferOfData.replace(startIndex, endIndex, replacementText);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public void overwrite() {

		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(filename));
			br.write(stringBufferOfData.toString());
			br.close();
		} catch (IOException e) {
			System.out.println("Error occured while trying to write to file");
			e.printStackTrace();
		}

	}
}
