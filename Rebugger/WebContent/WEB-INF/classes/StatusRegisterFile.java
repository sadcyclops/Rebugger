package backEnd.registers;

public class StatusRegisterFile {

	private StatusRegister[] data;
	
	public StatusRegisterFile(){
		this.data = new StatusRegister[6];
	}
	
	public boolean getNegative(int register){
		return this.data[register].negative;
	}
	
	public void setNegative(int register, boolean value){
		this.data[register].negative = value;
	}
	
	public boolean getZero(int register){
		return this.data[register].zero;
	}
	
	public void setZero(int register, boolean value){
		this.data[register].zero = value;
	}
	
	public boolean getCarry(int register){
		return this.data[register].carryOut;
	}
	
	public void setCarry(int register, boolean value){
		this.data[register].carryOut = value;
	}
	
	public boolean getOverflow(int register){
		return this.data[register].overflow;
	}
	
	public void setOverflow(int register, boolean value){
		this.data[register].overflow = value;
	}
	
	public boolean getIRQ(int register){
		return this.data[register].irq;
	}
	
	public void setIRQ(int register, boolean value){
		this.data[register].irq = value;
	}
	public boolean getFIQ(int register){
		return this.data[register].fiq;
	}
	
	public void setFIQ(int register, boolean value){
		this.data[register].fiq = value;
	}
	
	public StatusRegister.mode getMode(int register){
		return this.data[register].processMode;
	}
	
	public void setMode(int register, StatusRegister.mode value){
		this.data[register].processMode = value;
	}
	
}
