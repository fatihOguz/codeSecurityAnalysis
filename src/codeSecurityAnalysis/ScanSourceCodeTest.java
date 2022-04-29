package codeSecurityAnalysis;

public class ScanSourceCodeTest {
	
	public static void main(String args[]) {
	
		ScanSourceCode scanSourceCode = new ScanSourceCode();
		scanSourceCode.readSourceCode("C:\\Users\\Lenovo\\eclipse-workspace\\CodeSecurityAnalysis\\src\\codeSecurityAnalysis\\SourceCode.txt");
		scanSourceCode.read();
		System.out.println(scanSourceCode.search(9,"public" ));
		System.out.println(scanSourceCode.getSourceCode().get(scanSourceCode.search(9,"public" )).getLine() );
	}  
}


