package omsu_fcs_wc.entity;

import omsu_fcs_wc.Person;

public class Room {
	Person user;
	boolean locked;

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public Person getUser() {
		return user;
	}

	public void setUser(Person user) {
		this.user = user;
	}
}
