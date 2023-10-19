package com.xworkz.dto.brand;

import java.time.LocalDate;

import com.xworkz.dto.address.AddressDTO;

public class BrandDTO {

	private Integer brandId;
	private String brandName;
	private Integer brandGstNumber;
	private AddressDTO addressDto;
	private LocalDate brandEstablishedFrom;
	
	public BrandDTO() {
	}

	public BrandDTO(Integer brandId, String brandName, Integer brandGstNumber, AddressDTO addressDto,
			LocalDate brandEstablishedFrom) {
		this.brandId = brandId;
		this.brandName = brandName;
		this.brandGstNumber = brandGstNumber;
		this.addressDto = addressDto;
		this.brandEstablishedFrom = brandEstablishedFrom;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public Integer getBrandGstNumber() {
		return brandGstNumber;
	}

	public AddressDTO getAddressDto() {
		return addressDto;
	}

	public LocalDate getBrandEstablishedFrom() {
		return brandEstablishedFrom;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public void setBrandGstNumber(Integer brandGstNumber) {
		this.brandGstNumber = brandGstNumber;
	}

	public void setAddressDto(AddressDTO addressDto) {
		this.addressDto = addressDto;
	}

	public void setBrandEstablishedFrom(LocalDate brandEstablishedFrom) {
		this.brandEstablishedFrom = brandEstablishedFrom;
	}

	@Override
	public String toString() {
		return "brandId=" + brandId + ", brandName=" + brandName + ", brandGstNumber=" + brandGstNumber
				+ ", addressDto=" + addressDto + ", brandEstablishedFrom=" + brandEstablishedFrom;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressDto == null) ? 0 : addressDto.hashCode());
		result = prime * result + ((brandEstablishedFrom == null) ? 0 : brandEstablishedFrom.hashCode());
		result = prime * result + ((brandGstNumber == null) ? 0 : brandGstNumber.hashCode());
		result = prime * result + ((brandId == null) ? 0 : brandId.hashCode());
		result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
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
		BrandDTO other = (BrandDTO) obj;
		if (addressDto == null) {
			if (other.addressDto != null)
				return false;
		} else if (!addressDto.equals(other.addressDto))
			return false;
		if (brandEstablishedFrom == null) {
			if (other.brandEstablishedFrom != null)
				return false;
		} else if (!brandEstablishedFrom.equals(other.brandEstablishedFrom))
			return false;
		if (brandGstNumber == null) {
			if (other.brandGstNumber != null)
				return false;
		} else if (!brandGstNumber.equals(other.brandGstNumber))
			return false;
		if (brandId == null) {
			if (other.brandId != null)
				return false;
		} else if (!brandId.equals(other.brandId))
			return false;
		if (brandName == null) {
			if (other.brandName != null)
				return false;
		} else if (!brandName.equals(other.brandName))
			return false;
		return true;
	}
	
	
	
	
}
