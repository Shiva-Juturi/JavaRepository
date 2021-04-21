import java.io.*;

class  filewriter1
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		String name=br.readLine();
				//System.out.println("Please enter string");
				FileWriter fw =new FileWriter ("text.txt",true);
				for (int i=0;i<name.length() ;i++ )
				fw.write(name.charAt(i));
				fw.close();
	}
}
