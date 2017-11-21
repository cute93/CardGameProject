package kr.hs.hcinfo;

public class ValuedCard extends BasicCard implements Comparable<ValuedCard>{
	private int value;

	public ValuedCard() {
		super();
		value=0;
	}
	public ValuedCard(int num, String shape) {
		super(num, shape);
		value=0;
	}
	public ValuedCard(String shape, int num) {
		super(shape, num);
		value=0;
	}
	public ValuedCard(int num, String shape, int v) {
		super(num, shape);
		value=v;
	}
	public ValuedCard(String shape, int num, int v) {
		super(shape, num);
		value=v;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public int compareTo(ValuedCard o) {
		// TODO Auto-generated method stub
		return value - o.getValue();
	}
	
	
}








