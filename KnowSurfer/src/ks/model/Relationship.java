package ks.model;

public class Relationship extends Entity {

	public static enum Type {ASSOCIATION, EXTENDS, CONTAINS, CONTAINED_IN};
	
	private Type type = null;
	private Node nodeA = null;
	private Node nodeB = null;
	private boolean aToB = true;

	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Node getNodeA() {
		return nodeA;
	}
	public void setNodeA(Node nodeA) {
		this.nodeA = nodeA;
	}
	public Node getNodeB() {
		return nodeB;
	}
	public void setNodeB(Node nodeB) {
		this.nodeB = nodeB;
	}
	public boolean isaToB() {
		return aToB;
	}
	public void setaToB(boolean aToB) {
		this.aToB = aToB;
	}
	
	
	
}
