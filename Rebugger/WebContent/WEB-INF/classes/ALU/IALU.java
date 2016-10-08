package ALU;

import Structures.RegisterFile;
import Structures.StackFile;

public interface IALU {
	/*Arithmertic*/
	public void add(RegisterFile file, int rd, int rs, int rt);
	public void addi(RegisterFile file, int rt, int rs, int immediate);
	public void addiu(RegisterFile file, int rt, int rs, int immediate);
	public void addu(RegisterFile file, int rt, int rs, int immediate);
	public void mult(RegisterFile file, int rt, int rs);
	public void multu(RegisterFile file, int rt, int rs);
	public void div(RegisterFile file, int rt, int rs);
	public void divu(RegisterFile file, int rt, int rs);
	public void sub(RegisterFile file, int rd, int rs, int rt);
	public void subu(RegisterFile file, int rd, int rs, int rt);
	
	/*Logic*/
	public void and(RegisterFile file, int rd, int rt, int rs);
	public void andi(RegisterFile file, int rt, int rs, int immediate);
	public void nor(RegisterFile file, int rd, int rt, int rs);
	public void or(RegisterFile file, int rd, int rt, int rs);
	public void ori(RegisterFile file, int rt, int rs, int immediate);
	public void slt(RegisterFile file, int rd, int rs, int rt);
	public void slti(RegisterFile file, int rt, int rs, int immediate);
	public void sltiu(RegisterFile file, int rt, int rs, int immediate);
	public void sltu(RegisterFile file, int rd, int rs, int rt);
	
	/*Branching*/
	public void beq(RegisterFile file, int rs, int rt, int addr);
	public void bne(RegisterFile file, int rs, int rt, int addr);
	
	/*Unconditional Jumping*/
	public void j(RegisterFile file, int addr);
	public void jal(RegisterFile file, int addr);
	public void jr(RegisterFile file, int rs);
	
	/*Data Transfer*/
	public void lbu(RegisterFile file, StackFile stack, int rt, int rs, int offset);
	public void lhu(RegisterFile file, StackFile stack, int rt, int rs, int offset);
	public void ll(RegisterFile file, StackFile stack, int rt, int rs, int offset);
	public void lb(RegisterFile file, StackFile stack, int rt, int rs, int offset);
	public void lh(RegisterFile file, StackFile stack, int rt, int rs, int offset);
	public void lui(RegisterFile file, int rt, int immediate);
	public void lw(RegisterFile file, int rt, int rs, int offset);
	public void sb(RegisterFile file, StackFile stack, int rt, int rs, int offset);
	public void sh(RegisterFile file, StackFile stack, int rt, int rs, int offset);
	public void sw(RegisterFile file, StackFile stack, int rt, int rs, int offset);
	public void mfhi(RegisterFile file, int rd);
	public void mflo(RegisterFile file, int rd);
	
	/*Bitwise Shift*/
	public void sll(RegisterFile file, int rd, int rt, int immediate);
	public void srl(RegisterFile file, int rd, int rt, int immediate);
	public void sra(RegisterFile file, int rd, int rt, int immediate);
	public void sllv(RegisterFile file, int rd, int rt, int rs);
	public void srlv(RegisterFile file, int rd, int rt, int rs);
	public void srav(RegisterFile file, int rd, int rt, int rs);
}
