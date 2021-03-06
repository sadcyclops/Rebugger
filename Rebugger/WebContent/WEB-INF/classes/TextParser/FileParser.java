package TextParser;

import java.util.ArrayList;
import java.util.HashMap;

public class FileParser {

	private String[] block;
	private HashMap<String, Integer> labels;
	private HashMap<String, Object> RO_Data;

	public FileParser(String[] input) {
		this.block = input;
	}
	
	public void getLabels() {
		boolean isText = false;
		for (int i = 0; i < block.length; i++) {
			if (!isText) {
				isText = block[i].trim().equals(".text");
			} else {
				if (block[i].matches(".*:.*")) {
					labels.put(block[i].split(":")[0], i+1);
				}
			}
		}
	}

	// public void parse() {
	// ArrayList<String> dataLines = new ArrayList<String>();
	// ArrayList<String> textLines = new ArrayList<String>();
	// boolean inDataSection = false;
	// boolean inTextSection = false;
	// for (String x : this.block) {
	//
	// //It's not a comment
	// if (!(x.trim().charAt(0) == '#')) {
	// if (x.equals(".data"))
	// inDataSection = true;
	// else if (x.equals(".text")) {
	// inTextSection = true;
	// inDataSection = false;
	// } else if (inDataSection) {
	// if (x.indexOf('#') != -1) {
	// dataLines.add(x.substring(0, x.indexOf('#')));
	// } else {
	// dataLines.add(x); }
	// } else if (inTextSection) {
	// if (x.indexOf('#') != -1) {
	// textLines.add(x.substring(0, x.indexOf('#')));
	// } else {
	// textLines.add(x); }}}}
	// data = (String[]) dataLines.toArray();
	// text = (String[]) textLines.toArray(); }

	public static void main(String[] args) {
		String[] input = { ".data", "c = 9", "w = 10", ".text", "starwars", "#rekt", "wow rekt #2.0" };
		FileParser parser = new FileParser(input);
		parser.parse();
	}
}
