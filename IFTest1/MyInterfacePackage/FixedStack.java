package MyInterfacePackage;

public class FixedStack implements IntStack {
	private int stck[];
	private int tos;
	
	FixedStack(int size) {
		System.out.println("������ ������������ �� "+ size +" ���������."); 
		stck = new int[size];
		tos = -1;
	}
		
	public void push(int item) {
		if (tos==stck.length-1)
			  System.out.println("���� ��������.");
		else
			stck[++tos] = item;
	}
	
	public int pop() {
		if (tos<0) {
			System.out.println("���� �� ��������.");
			return(0);
		}
		else
			return stck[tos--];
	}
}


