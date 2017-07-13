package ks.model;

import java.util.UUID;

public class EntityFactory {

	static EntityFactory factory = null;
	
	private UUID getNewUUID() {
		UUID result = UUID.randomUUID();
		return result;
	}
	
	public Entity getNewEntity() {
		
		Entity result = new Entity();
		result.setId(getNewUUID());
		
		return result;
	}
	
	protected static EntityFactory getInstance() {
		
		if (factory==null) {
			factory = new EntityFactory();
		}
		
		return factory;
	}
}
