package com.java.optim.hash.collection;

import java.util.Date;
import java.util.List;

public class BeanWithHash extends RootBean{

	
	public BeanWithHash() {}
	

	public BeanWithHash(int price, boolean available, String name, Date creation, List<String> owner) {
		super();
		this.price = price;
		this.available = available;
		this.name = name;
		this.creation = creation;
		this.owner = owner;
	}
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (available ? 1231 : 1237);
		result = prime * result + ((creation == null) ? 0 : creation.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + price;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BeanWithHash other = (BeanWithHash) obj;
		if (available != other.available)
			return false;
		if (creation == null) {
			if (other.creation != null)
				return false;
		} else if (!creation.equals(other.creation))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
}
