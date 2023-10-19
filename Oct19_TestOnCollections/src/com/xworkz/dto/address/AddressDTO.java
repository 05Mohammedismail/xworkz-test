package com.xworkz.dto.address;

public class AddressDTO {

	private Integer addressId;
	private Integer addressNumber;
	private String streetName;
	private String cityName;
	private String stateName;
	private Integer pincode;
	
	public AddressDTO() {
	}

	public AddressDTO(Integer addressId, Integer addressNumber, String streetName, String cityName, String stateName,
			Integer pincode) {
		this.addressId = addressId;
		this.addressNumber = addressNumber;
		this.streetName = streetName;
		this.cityName = cityName;
		this.stateName = stateName;
		this.pincode = pincode;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public Integer getAddressNumber() {
		return addressNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public void setAddressNumber(Integer addressNumber) {
		this.addressNumber = addressNumber;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "addressId=" + addressId + ", addressNumber=" + addressNumber + ", streetName=" + streetName
				+ ", cityName=" + cityName + ", stateName=" + stateName + ", pincode=" + pincode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressId == null) ? 0 : addressId.hashCode());
		result = prime * result + ((addressNumber == null) ? 0 : addressNumber.hashCode());
		result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
		result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
		result = prime * result + ((stateName == null) ? 0 : stateName.hashCode());
		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
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
		AddressDTO other = (AddressDTO) obj;
		if (addressId == null) {
			if (other.addressId != null)
				return false;
		} else if (!addressId.equals(other.addressId))
			return false;
		if (addressNumber == null) {
			if (other.addressNumber != null)
				return false;
		} else if (!addressNumber.equals(other.addressNumber))
			return false;
		if (cityName == null) {
			if (other.cityName != null)
				return false;
		} else if (!cityName.equals(other.cityName))
			return false;
		if (pincode == null) {
			if (other.pincode != null)
				return false;
		} else if (!pincode.equals(other.pincode))
			return false;
		if (stateName == null) {
			if (other.stateName != null)
				return false;
		} else if (!stateName.equals(other.stateName))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		return true;
	}
	
	
	
	
}
