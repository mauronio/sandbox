package ks.model;

import java.util.HashMap;
import java.util.Map;

public class Node extends Entity {

	protected static String RELATIONSHIPS_GROUP_KEY = "_relationships_group";

	private Map<String, Relationship> relationships = new HashMap<String, Relationship>();

	public Node() {
		super();
	}

	public Map<String, Relationship> getRelationships() {
		return relationships;
	}
	
}
