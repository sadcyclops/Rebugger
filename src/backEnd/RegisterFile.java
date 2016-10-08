package backEnd;

public class RegisterFile {
	
	private int[] data;
	
	 public RegisterFile() {
		 this.data = new int[30]; }
	 
	 public byte getByte(int register, int position) {
		 return (byte) (this.data[register] >> (position << 3)); }
	 
	 public short getWord(int register, int position) {
		 return (short) (this.data[register] >> (position << 4)); }
	 
	 public int getInt(int register) {
		 return this.data[register]; }
	 
	 public void setByte(int register, int value){
		 this.data[register] = value;
	 }
	 
	 public void setWord(int register, short value){
		 this.data[register] = value;
		 
	 }
	 
	 public void setByte(int register, byte value){
		 this.data[register] = value;
	 }
}
