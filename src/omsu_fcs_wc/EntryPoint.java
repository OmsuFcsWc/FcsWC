package omsu_fcs_wc;

import omsu_fcs_wc.entity.Room;
import omsu_fcs_wc.exception.SomethingHereException;
import omsu_fcs_wc.exception.WcState;
import omsu_fcs_wc.services.impl.SimpleDoorService;

public class EntryPoint {
	
	/**
	 * FIXME:random
	 */
	public static int chooseRoom(){
		return 0;
	}
	public static Person userEntered(){
		Person p = new Person();
		//FIXME
		//init user here
		return p;
	}
	
	public static void runAway(Person me){
		System.err.println("I'm sorry :c");
		System.exit(1);
	}

	public static void main(String[] args) {
		WcState wcState = WcState.instance();
		
		Person me = userEntered();
		
		Room selected = wcState.getRoom(chooseRoom());

		try {
			SimpleDoorService.open(selected, me);
			selected.setLocked(true);
			//FIXME: process here
			
			
		} catch (SomethingHereException e) {
			runAway(me);
		}
	}

}
