package backEnd;

import java.util.HashMap;

public class StackFile {
	
	private HashMap<Integer, Integer> stack;
	private int stackPointer;
	
	public StackFile() {
		this.stack = new HashMap<Integer, Integer>();}
	
	public void pushByte(int element) {
		stackPointer++;
		this.stack.put(stackPointer, element);}
	
	public int popByte() {
		int value = this.stack.remove(stackPointer);
		this.stackPointer--;
		return value;}
	
	public void pushWord(int element) {
		stackPointer += 2;
		this.stack.put(stackPointer, element);}
	
	public int popWord() {
		int value = this.stack.remove(stackPointer);
		this.stackPointer -= 2;
		return value;}

	public void pushElement(int element) {
		stackPointer += 4;
		this.stack.put(stackPointer, element);}
	
	public int popElement() {
		int value = this.stack.remove(stackPointer);
		this.stackPointer -= 4;
		return value;}}
