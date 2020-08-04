package objectclassmethods;

public class ElectricityBill {

	private int meterNo;
	private String name;
	private String address;

	public int getMeterNo() {
		return meterNo;
	}

	public void setMeterNo(int meterNo) {
		this.meterNo = meterNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ElectricityBill [meterNo=" + meterNo + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return this.meterNo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectricityBill electricityBill = (ElectricityBill) obj;
		if (address == null) {
			if (electricityBill.address != null)
				return false;
		} else if (!address.equals(electricityBill.address))
			return false;
		if (meterNo != electricityBill.meterNo)
			return false;
		if (name == null) {
			if (electricityBill.name != null)
				return false;
		} else if (!name.equals(electricityBill.name))
			return false;
		return true;
	}

}
