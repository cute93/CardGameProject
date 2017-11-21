package kr.hs.hcinfo;

public class BasicCard {
	private String shape;
	private int num;
	public BasicCard(){
		super();
		shape="Joker";
		num=0;
	}
	public BasicCard(String shape, int num) {
		super();
		this.shape = shape;
		this.num = num;
	}
	public BasicCard(int num, String shape) {
		super();
		this.shape = shape;
		this.num = num;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "[" + shape + ", " + num + "]";
	}
	public void show(){
		System.out.println(toString());
	}
	public void hide(){
		System.out.println("[#, #]");
	}
}











