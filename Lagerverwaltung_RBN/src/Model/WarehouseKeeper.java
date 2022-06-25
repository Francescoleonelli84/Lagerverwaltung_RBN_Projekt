package Model;

public class WarehouseKeeper {

	private int keeperID;
	private String keeperName;
	
	
	WarehouseKeeper(String keeperName){	
		this.keeperName = keeperName;	
	}


	public int getKeeperID() {
		return keeperID;
	}


	public void setKeeperID(int keeperID) {
		this.keeperID = keeperID;
	}


	public String getKeeperName() {
		return keeperName;
	}


	public void setKeeperName(String keeperName) {
		this.keeperName = keeperName;
	}
		
	
}
