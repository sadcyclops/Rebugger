package TextParser;

import java.util.ArrayList;

public class FileParser {
	
	String[] block;
	String[] data;
	String[] text;
	
	public FileParser(String[] input) {
		this.block = input;
	}
	
	void parse() {
		ArrayList<String> dataLines = new ArrayList<String>();
		ArrayList<String> textLines = new ArrayList<String>();
		boolean inDataSection = false;
		boolean inTextSection = false;
		for (String x : this.block) {
			
			//It's not a comment
			if !(x.trim().charAt(0) == '#') {
				if (x.equals(".data"))
					inDataSection = true;
				else if (x.equals(".text")) {
					inTextSection = true;
					inDataSection = false; 
				} else if (inDataSection) {
					dataLines.add(x.substring(0, x.indexOf('#')));
				} else if (inTextSection) {
					textLines.add(x.substring(0, x.indexOf('#')));}}}
		data = dataLines.toArray(data);
		text = textLines.toArray(text); }}
