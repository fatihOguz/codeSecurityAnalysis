package codeSecurityAnalysis;
import java.util.ArrayList;

public class LineSourceCode {
	
	private String line;
	private String ruleName; 
	private boolean isVulnerability;
	
	public LineSourceCode() {
		super();
		isVulnerability = false;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public boolean isVulnerability() {
		return isVulnerability;
	}
	public void setVulnerability(boolean isVulnerability) {
		this.isVulnerability = isVulnerability;
	}
}
