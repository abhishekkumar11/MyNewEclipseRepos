import java.io.*;

public class FileProgram {
 
	public static void main(String[] args) throws IOException{
		 
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter file name");
     String fname=br.readLine();
     FileInputStream fin=null;
     
     try{
    	 fin=new FileInputStream(fname);
     }
     catch(FileNotFoundException fe){
    	 System.out.println("File not found");
    	 return;
     }
     BufferedInputStream bin=new BufferedInputStream(fin);
     System.out.println("File content=");
     int ch;
     while((ch=bin.read())!= -1){


    	 System.out.print((char)ch);
    	 bin.close();
	

}}
