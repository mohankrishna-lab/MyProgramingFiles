package cloning.shalanddeep;

public class Address 
{
	private int doorNo;
	private int main;
	private int cross;
	
	public Address(int doorNo ,int main,int cross )
	{
		this.doorNo = doorNo;
		this.main = main;
		this.cross = cross;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public int getMain() {
		return main;
	}

	public void setMain(int main) {
		this.main = main;
	}

	public int getCross() {
		return cross;
	}

	public void setCross(int cross) {
		this.cross = cross;
	}
	
	@Override
	public String toString()
	{
		return doorNo+"\t"+main+"\t"+cross;
	}
}
