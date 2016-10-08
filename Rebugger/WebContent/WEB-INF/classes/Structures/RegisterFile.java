package Structures;

import Exceptions.RegisterException;

public class RegisterFile {
	final static int BYTE = 255;
	final static int WORD = 65535;
	
	private int[] data;

	public RegisterFile() {
		this.data = new int[30];
	}

	public byte getByte(int register, int position) throws RegisterException {
		if(position > 3){throw new RegisterException();}
		return (byte) (this.data[register] >> (position << 3));
	}

	public short getWord(int register, int position) throws RegisterException {
		if(position > 3){throw new RegisterException();}
		return (short) (this.data[register] >> (position << 4));
	}

	public int getInt(int register) {
		return this.data[register];
	}

	public void setByte(int register, int pos, int value) throws RegisterException {
		if(pos > 3){throw new RegisterException();}
		int target = this.data[register];
		target &= ~((BYTE << 8 * pos));
		target += (value << (8 * pos));
		this.data[register] = target;
	}

	public void setWord(int register, int pos, int value) throws RegisterException{
		if(pos > 2 || pos % 2 != 0){throw new RegisterException();}
		int target = this.data[register];
		target &= ~((WORD << pos*8));
		target += (value << (8 * pos));
		this.data[register] = target;
	}

	public void setInt(int register, int value) {
		this.data[register] = value;
	}
}
