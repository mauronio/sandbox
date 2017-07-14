package ks.model;

import java.util.Map;
import java.util.UUID;

public class NodeFactory {

	static NodeFactory factory = null;
	
	private UUID getNewUUID() {
		UUID result = UUID.randomUUID();
		return result;
	}
	
	public Node createNode() {
		
		Node result = new Node();
		result.setId(getNewUUID().toString());
		
		return result;
	}

	public Relationship createRelationship(Node nodeA, Node nodeB, Relationship.Type relationshipType) {
		
		Relationship newRelationship = new Relationship();
		newRelationship.setId(getNewUUID().toString());
		newRelationship.setNodeA(nodeA);
		newRelationship.setNodeB(nodeB);

		nodeA.getRelationships().put(newRelationship.getId(), newRelationship);
		
		return newRelationship;
	}

	protected static NodeFactory getInstance() {
		
		if (factory==null) {
			factory = new NodeFactory();
		}
		
		return factory;
	}
}
