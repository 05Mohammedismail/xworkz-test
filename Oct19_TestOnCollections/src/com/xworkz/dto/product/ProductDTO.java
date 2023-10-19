package com.xworkz.dto.product;

import com.xworkz.Enum.type.Type;
import com.xworkz.dto.brand.BrandDTO;

public class ProductDTO {

	private Integer productId;
	private String productName;
	private Type productType;
	private BrandDTO brandDto;
	private Double productPrice;
	private Integer productQuantity;
	
	public ProductDTO() {
	}

	public ProductDTO(Integer productId, String productName, Type productType, BrandDTO brandDto, Double productPrice,
			Integer productQuantity) {
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.brandDto = brandDto;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}

	public Integer getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public Type getProductType() {
		return productType;
	}

	public BrandDTO getBrandDto() {
		return brandDto;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductType(Type productType) {
		this.productType = productType;
	}

	public void setBrandDto(BrandDTO brandDto) {
		this.brandDto = brandDto;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	@Override
	public String toString() {
		return "productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", brandDto=" + brandDto + ", productPrice=" + productPrice + ", productQuantity=" + productQuantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandDto == null) ? 0 : brandDto.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(productPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(productQuantity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((productType == null) ? 0 : productType.hashCode());
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
		ProductDTO other = (ProductDTO) obj;
		if (brandDto == null) {
			if (other.brandDto != null)
				return false;
		} else if (!brandDto.equals(other.brandDto))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (Double.doubleToLongBits(productPrice) != Double.doubleToLongBits(other.productPrice))
			return false;
		if (Double.doubleToLongBits(productQuantity) != Double.doubleToLongBits(other.productQuantity))
			return false;
		if (productType != other.productType)
			return false;
		return true;
	}

	
	

	
	
}
