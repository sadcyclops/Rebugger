package backEnd.registers;

public class StatusRegister {
	public static enum mode {USER, FIQ, IRQ, SUPERVISOR, ABORT, UNDEF, SYSTEM}
	boolean negative;
	boolean zero;
	boolean carryOut;
	boolean overflow;
	boolean irq;
	boolean fiq;
	mode processMode;
	
	public StatusRegister()
	{
		negative = false;
		zero = false;
		carryOut = false;
		overflow = false;
		irq = false;
		fiq = false;
		processMode = mode.USER;
	}
}
