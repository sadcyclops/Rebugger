package backEnd.registers;

public class RegisterFile {
	final static int BYTE = 255;
	final static int WORD = 65536;
	
	private int[] data;

	public RegisterFile() {
		this.data = new int[30];
	}

	public byte getByte(int register, int position) {
		return (byte) (this.data[register] >> (position << 3));
	}

	public short getWord(int register, int position) {
		return (short) (this.data[register] >> (position << 4));
	}

	public int getInt(int register) {
		return this.data[register];
	}

	public void setByte(int register, int value) {
		this.data[register] = value & BYTE;
	}

	public void setWord(int register, int value) {
		this.data[register] = value & WORD;
	}

	public void setInt(int register, int value) {
		this.data[register] = value;
	}
}
