package codeSecurityAnalysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ScanSourceCode {
	public ArrayList<LineSourceCode> sourceCode = new ArrayList<LineSourceCode>();
	public ArrayList<LineSourceCode> getSourceCode() {
		return sourceCode;
	}
	public void setSourceCode(ArrayList<LineSourceCode> sourceCode) {
		this.sourceCode = sourceCode;
	}
	public void readSourceCode(String filePath ) {
		try{
			File file =new File(filePath);
			FileReader fr=new FileReader(file);  
			BufferedReader br=new BufferedReader(fr);  
			String line;  

			while((line=br.readLine())!=null)  
			{  
				LineSourceCode lineSourceCode = new LineSourceCode();
				lineSourceCode.setVulnerability(false);
				lineSourceCode.setLine(line);
				//System.out.println(line);
				sourceCode.add(lineSourceCode);    
			}  
			fr.close();   
		}  
		catch(IOException e){  
			e.printStackTrace();  
		}  
	}
	public void read() {
		for(int i=0;i<sourceCode.size();i++) {
			System.out.println(sourceCode.get(i).getLine());
		}
	}
	
	
	/**
	 * start indexten son line a kadar str ilk hangi line içierinde yer alýyorsa index ini döndürür.
	 * Source code da yok ise -1 return eder.
	 * @param start
	 * @param str
	 * @return
	 */
	public int search(int start , String str) {
		
		for(int i=start;i<sourceCode.size();i++) {
			if(sourceCode.get(i).getLine().contains(str)) {
				return i;
			}
		}
		return -1;
	}
}
