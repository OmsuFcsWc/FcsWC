package omsu_fcs_wc.services.impl;

import omsu_fcs_wc.Person;
import omsu_fcs_wc.entity.Room;
import omsu_fcs_wc.exception.SomethingHereException;
import omsu_fcs_wc.services.DoorService;

public class SimpleDoorService{

	
	public static boolean open(Room door, Person newUser)
			throws SomethingHereException {
		// TODO Auto-generated method stub
		if (door.getUser() == null) {
			if (door.isLocked())
				throw new IllegalStateException(
						"WC implimentation bug. Sorry, service unavail => try to find next WC");
			return true;
		} else {
			if (door.isLocked() == false)
				throw new SomethingHereException();

			door.setUser(newUser);
			return true;
		}

	}

}
