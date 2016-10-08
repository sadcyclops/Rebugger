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
			if (!(x.trim().charAt(0) == '#')) {
				if (x.equals(".data"))
					inDataSection = true;
				else if (x.equals(".text")) {
					inTextSection = true;
					inDataSection = false; 
				} else if (inDataSection) {
					if (x.indexOf('#') != -1) {
					dataLines.add(x.substring(0, x.indexOf('#')));
					} else {
						dataLines.add(x); }
				} else if (inTextSection) {
					if (x.indexOf('#') != -1) {
					textLines.add(x.substring(0, x.indexOf('#')));
					} else {
						textLines.add(x); }}}}
		data = (String[]) dataLines.toArray();
		text = (String[]) textLines.toArray(); }

	public static void main(String[] args) {
		String[] input = {".data", "c = 9", "w = 10", ".text", "starwars", "#rekt", "wow rekt #2.0" };
		FileParser parser = new FileParser(input);
		parser.parse();
	}
}
