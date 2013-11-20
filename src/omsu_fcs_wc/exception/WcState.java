package omsu_fcs_wc.exception;

import java.util.ArrayList;
import java.util.List;

import omsu_fcs_wc.entity.Room;

/**
 * Singleton
 * @author over
 *
 */
public class WcState {
	
	private static WcState instance;
	private List<Room> rooms;
	
	public static WcState instance(){
		if(instance == null)
			instance = new WcState();
		
		return instance;
	}
	private WcState(){
		//builders built three buildings
		rooms = new ArrayList<>(3);
	}
	
	/**
	 * FIXME: unsafe
	 * @param index
	 * @return
	 */
	public Room getRoom(int index){
		return rooms.get(index);
	}
}
