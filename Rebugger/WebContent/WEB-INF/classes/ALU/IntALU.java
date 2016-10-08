package ALU;

import Structures.RegisterFile;
import Structures.StackFile;

public class IntALU implements IALU{

	@Override
	public void add(RegisterFile file, int rd, int rs, int rt) {
		file.setInt(rd, file.getInt(rs)+file.getInt(rt));	
	}

	@Override
	public void addi(RegisterFile file, int rt, int rs, int immediate) {
		file.setInt(rt, file.getInt(rs)+immediate);
	}

	@Override
	public void addiu(RegisterFile file, int rt, int rs, int immediate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addu(RegisterFile file, int rt, int rs, int immediate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mult(RegisterFile file, int rt, int rs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multu(RegisterFile file, int rt, int rs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div(RegisterFile file, int rt, int rs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divu(RegisterFile file, int rt, int rs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub(RegisterFile file, int rd, int rs, int rt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subu(RegisterFile file, int rd, int rs, int rt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void and(RegisterFile file, int rd, int rt, int rs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void andi(RegisterFile file, int rt, int rs, int immediate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nor(RegisterFile file, int rd, int rt, int rs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void or(RegisterFile file, int rd, int rt, int rs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ori(RegisterFile file, int rt, int rs, int immediate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void slt(RegisterFile file, int rd, int rs, int rt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void slti(RegisterFile file, int rt, int rs, int immediate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sltiu(RegisterFile file, int rt, int rs, int immediate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sltu(RegisterFile file, int rd, int rs, int rt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beq(RegisterFile file, int rs, int rt, int addr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bne(RegisterFile file, int rs, int rt, int addr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void j(RegisterFile file, int addr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jal(RegisterFile file, int addr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jr(RegisterFile file, int rs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lbu(RegisterFile file, StackFile stack, int rt, int rs, int offset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lhu(RegisterFile file, StackFile stack, int rt, int rs, int offset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ll(RegisterFile file, StackFile stack, int rt, int rs, int offset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lb(RegisterFile file, StackFile stack, int rt, int rs, int offset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lh(RegisterFile file, StackFile stack, int rt, int rs, int offset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lui(RegisterFile file, int rt, int immediate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lw(RegisterFile file, int rt, int rs, int offset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sb(RegisterFile file, StackFile stack, int rt, int rs, int offset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sh(RegisterFile file, StackFile stack, int rt, int rs, int offset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sw(RegisterFile file, StackFile stack, int rt, int rs, int offset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mfhi(RegisterFile file, int rd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mflo(RegisterFile file, int rd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sll(RegisterFile file, int rd, int rt, int immediate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void srl(RegisterFile file, int rd, int rt, int immediate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sra(RegisterFile file, int rd, int rt, int immediate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sllv(RegisterFile file, int rd, int rt, int rs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void srlv(RegisterFile file, int rd, int rt, int rs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void srav(RegisterFile file, int rd, int rt, int rs) {
		// TODO Auto-generated method stub
		
	}
	

}
