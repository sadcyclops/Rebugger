package backEnd;

import java.util.ArrayList;

public class StackFile {
	
	private ArrayList<Integer> stack;
	private int stackPointer;
	
	public StackFile() {
		this.stack = new ArrayList<Integer>();
		this.stackPointer = 64000; }
	
	public void changeStackPointer(int difference) {
		if (difference < 0) {
			int someThing = (-1 * stackPointer) % 4;
			difference -= someThing;
			stackPointer -= difference;
			while (difference >= 0) {
				this.stack.add(0);
				difference -= 4;}
		} else {
			while (difference >= 4) {
				stackPointer += 4;
				this.stack.remove(this.stack.size());
			}
			stackPointer -= difference; }}
	
	
}
