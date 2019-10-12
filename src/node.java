
public class node {
	
	private int nodeValue;
	private int depth;
	private node child1;
	private node child2;
	
	public node (int i, int d) {nodeValue=i; depth = d;}
	
	public void setValue (int i) {nodeValue=i;}
	public int getValue() {return nodeValue;}
	public void updateDepth(int d) {depth = d;}
	public int giveDepth () {return depth;}
	public void setChild1(node n) {child1 = n;}
	public void setChild2(node n) {child2 = n;}
	public node getChild1() {return child1;}
	public node getChild2() {return child2;}

}
