public class ParkingPass extends Product {
	private double parkingFee;

	/**
	 * @param productCode
	 * @param type
	 * @param parkingFee
	 */
	public ParkingPass(String productCode, char type, double parkingFee) {
		super(productCode, type);
		this.parkingFee = parkingFee;
	}

	/**
	 * @return the parkingFee
	 */
	public double getParkingFee() {
		return parkingFee;
	}

	/**
	 * @param parkingFee the parkingFee to set
	 */
	public void setParkingFee(double parkingFee) {
		this.parkingFee = parkingFee;
	}

}
