package ks.model;

import java.util.HashMap;
import java.util.Map;

public class Entity {

	private Object id = null;
	private String name = null;
	private String description = null;
	
	protected Map<String, Object> attributeValues = new HashMap<>();

	public Object getId() {
		return id;
	}

	protected void setId(Object id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
