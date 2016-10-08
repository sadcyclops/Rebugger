package ALU;

public interface IALU {
	/*Arithmertic*/
	public static void add(RegisterFile file, int rd, int rs, int rt);
	public static void addi(RegisterFile file, int rt, int rs, int immediate);
	public static void addiu(RegisterFile file, int rt, int rs, int immediate);
	public static void addu(RegisterFile file, int rt, int rs, int immediate);
	public static void mult(RegisterFile file, int rt, int rs);
	public static void multu(RegisterFile file, int rt, int rs);
	public static void div(RegisterFile file, int rt, int rs);
	public static void divu(RegisterFile file, int rt, int rs);
	public static void sub(RegisterFile file, int rd, int rs, int rt);
	public static void subu(RegisterFile file, int rd, int rs, int rt);
	
	/*Logic*/
	public static void and(RegisterFile file, int rd, int rt, int rs);
	public static void andi(RegisterFile file, int rt, int rs, int immediate);
	public static void nor(RegisterFile file, int rd, int rt, int rs);
	public static void or(RegisterFile file, int rd, int rt, int rs);
	public static void ori(RegisterFile file, int rt, int rs, int immediate);
	public static void slt(RegisterFile file, int rd, int rs, int rt);
	public static void slti(RegisterFile file, int rt, int rs, int immediate);
	public static void sltiu(RegisterFile file, int rt, int rs, int immediate);
	public static void sltu(RegisterFile file, int rd, int rs, int rt);
	
	/*Braching*/
	public static void beq(RegisterFile file, int rs, int rt, int addr);
	public static void bne(RegisterFile file, int rs, int rt, int addr);
	
	/*Unconditional Jumping*/
	public static void j(RegisterFile file, int addr);
	public static void jal(RegisterFile file, int addr);
	public static void jr(RegisterFile file, int rs);
	
	/*Data Transfer*/
	public static void lbu(RegisterFile file, StackFile stack, int rt, int rs, int offset);
	public static void lhu(RegisterFile file, StackFile stack, int rt, int rs, int offset);
	public static void ll(RegisterFile file, StackFile stack, int rt, int rs, int offset);
	public static void lb(RegisterFile file, StackFile stack, int rt, int rs, int offset);
	public static void lh(RegisterFile file, StackFile stack, int rt, int rs, int offset);
	public static void lui(RegisterFile file, int rt, int immediate);
	public static void lw(RegisterFile file, int rt, int rs, int offset);
	public static void sb(RegisterFile file, StackFile stack, int rt, int rs, int offset);
	public static void sh(RegisterFile file, StackFile stack, int rt, int rs, int offset);
	public static void sw(RegisterFile file, StackFile stack, int rt, int rs, int offset);
	public static void mfhi(RegisterFile file, int rd);
	public static void mflo(RegisterFile file, int rd);
	
	/*Bitwise Shift*/
	public static void sll(RegisterFile file, int rd, int rt, int immediate);
	public static void srl(RegisterFile file, int rd, int rt, int immediate);
	public static void sra(RegisterFile file, int rd, int rt, int immediate);
	public static void sllv(RegisterFile file, int rd, int rt, int rs);
	public static void srlv(RegisterFile file, int rd, int rt, int rs);
	public static void srav(RegisterFile file, int rd, int rt, int rs);



}
