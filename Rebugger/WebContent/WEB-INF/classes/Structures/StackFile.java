package Structures;

import java.util.ArrayList;
import Exceptions.*;

public class StackFile {
	final static int BYTE = 255;
	final static int WORD = 65535;
	
	private ArrayList<Integer> stack;
	private int stackPointer;

	public StackFile() {
		this.stack = new ArrayList<Integer>();
		this.stackPointer = 64000;
	}

	public void changeStackPointer(int difference) {
		if (difference < 0) {
			int someThing = stackPointer % 4;
			difference -= someThing;
			stackPointer -= difference;
			while (difference >= 0) {
				this.stack.add(0);
				difference -= 4;
			}
		} else {
			while (difference >= 4) {
				stackPointer += 4;
				this.stack.remove(this.stack.size());
			}
			stackPointer -= difference;
		}
	}

	public void pushByte(byte value) {
		this.stackPointer -= 1;
		if (stackPointer % 4 == 3) {
			this.stack.add((int) value);
		} else {
			int end = this.stack.get(this.stack.size());
			value <<= ((stackPointer + 2 % 4) << 3);
			end += value;
			this.stack.add(end);
		}
	}

	public void pushShort(short value) {

		// Align
		if (this.stackPointer % 2 == 1)
			this.stackPointer -= 1;

		this.stackPointer -= 2;
		if (stackPointer % 4 == 2) {
			this.stack.add((int) value);
		} else {
			int end = this.stack.get(this.stack.size());
			value <<= 16;
			end += value;
			this.stack.add(end);
		}
	}

	public void pushInt(int value) {

		// Align
		this.stackPointer -= this.stackPointer % 4;
		this.stackPointer -= 4;
		this.stack.add(value);
	}

	public byte popByte() {
		byte value;
		this.stackPointer++;
		if (this.stackPointer % 4 == 0) {
			value = this.stack.remove(this.stack.size()).byteValue();
		} else {
			int end = this.stack.get(this.stack.size());
			end >>= ((this.stackPointer - 1) << 3);
			value = (byte) end;
		}
		return value;
	}

	public short popShort() throws StackException {
		if (this.stackPointer % 2 != 0) {
			throw new StackException();
		}
		short value;
		this.stackPointer += 2;
		if (this.stackPointer % 4 == 0) {
			value = this.stack.remove(this.stack.size()).shortValue();
		} else {
			int end = this.stack.get(this.stack.size());
			end >>= (16);
			value = (short) end;
		}
		return value;
	}

	public int popInt() throws StackException {
		if (this.stackPointer % 4 != 0) {
			throw new StackException();
		}
		return this.stack.remove(this.stack.size());
	}

	public byte peekByte(int offset) {
		int index = (this.stackPointer + offset);
		index /= 4;
		int target = this.stack.get(index);
		return (byte) (target >> (8 * (index % 4)));
	}

	public short peekShort(int offset) throws StackException {
		int index = (this.stackPointer + offset);
		if (index % 2 != 0) {
			throw new StackException();
		}
		index /= 4;
		int target = this.stack.get(index);
		return (short) (target >> (16 * (index % 2)));
	}

	public int peekInt(int offset) throws StackException {
		int index = (this.stackPointer + offset);
		if (index % 4 != 0) {
			throw new StackException();
		}
		index /= 4;
		return this.stack.get(index);
	}

	public void setByte(int offset, byte data) {
		int index = (this.stackPointer + offset);
		int temp_index = index/4;
		int target = this.stack.get(temp_index);
		target &= ~((BYTE) << index % 4);
		target += (data << (8 * (index % 4)));
		this.stack.set(temp_index, target);
	}

	public void setShort(int offset, short data) throws StackException {
		int index = (this.stackPointer + offset);
		if (index % 2 != 0) {
			throw new StackException();
		}
		index /= 4;
		int target = this.stack.get(index);
		target &= ~((WORD << (8*index)));
		target += (data << (8*index));
		this.stack.set(index, target);
	}

	public void setInt(int offset, int data) throws StackException {
		int index = (this.stackPointer + offset);
		if (index % 4 != 0) {
			throw new StackException();
		}
		index /= 4;
		this.stack.set(index, data);
	}
}
