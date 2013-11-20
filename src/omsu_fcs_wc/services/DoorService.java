package omsu_fcs_wc.services;

import omsu_fcs_wc.Person;
import omsu_fcs_wc.entity.Room;
import omsu_fcs_wc.exception.SomethingHereException;

public interface DoorService {
	public boolean open(Room door, Person newUser)
			throws SomethingHereException;
}
