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
			int someThing = stackPointer % 4;
			difference -= someThing;
			stackPointer -= difference;
			while (difference >= 0) {
				this.stack.add(0);
				difference -= 4;}
		} else {
			while (difference >= 4) {
				stackPointer += 4;
				this.stack.remove(this.stack.size()); }
			stackPointer -= difference; }}
	
	public void pushByte(byte value) {
		this.stackPointer -= 1;
		if (stackPointer % 4 == 3) {
			this.stack.add((int) value);
		} else {
			int end = this.stack.get(this.stack.size());
			value <<= ((stackPointer + 2 % 4) << 3);
			end += value;
			this.stack.add(end); }}
	
	public void pushShort(short value) {
		
		//Align
		if (this.stackPointer % 2 == 1) 
			this.stackPointer -= 1;
		
		this.stackPointer -= 2;
		if (stackPointer % 4 == 2) {
			this.stack.add((int) value);
		} else {
			int end = this.stack.get(this.stack.size());
			value <<= 16;
			end += value;
			this.stack.add(end); }}
	
	public void pushInt(int value) {

		//Align
		this.stackPointer -= this.stackPointer % 4;
		this.stackPointer -= 4;
		this.stack.add(value);
	}
}
