package com.xworkz.dto.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.stream.Collectors;


import com.xworkz.Enum.type.Type;
import com.xworkz.dto.address.AddressDTO;
import com.xworkz.dto.brand.BrandDTO;
import com.xworkz.dto.product.ProductDTO;

public class DTORunner {

	public static void main(String[] args) {

		AddressDTO address1 = new AddressDTO(1, 123, "Main Street", "New York", "New York", 10001);
		AddressDTO address2 = new AddressDTO(2, 456, "Oak Avenue", "Los Angeles", "California", 90001);
		AddressDTO address3 = new AddressDTO(3, 789, "Elm Road", "Chicago", "Illinois", 60601);
		AddressDTO address4 = new AddressDTO(4, 101, "Cedar Lane", "San Francisco", "California", 94101);
		AddressDTO address5 = new AddressDTO(5, 234, "Maple Drive", "Miami", "Florida", 33101);
		AddressDTO address6 = new AddressDTO(6, 789, "Pine Street", "Boston", "Massachusetts", 02101);
		AddressDTO address7 = new AddressDTO(7, 222, "Willow Lane", "Seattle", "Washington", 98101);
		AddressDTO address8 = new AddressDTO(8, 555, "Cypress Avenue", "Dallas", "Texas", 75201);
		AddressDTO address9 = new AddressDTO(9, 333, "Spruce Road", "Denver", "Colorado", 80201);
		AddressDTO address10 = new AddressDTO(10, 888, "Birch Drive", "Phoenix", "Arizona", 85001);


		BrandDTO brand1 = new BrandDTO(101, "Manoj Electronics", 98765, address1, LocalDate.of(1990, 7, 12));
		BrandDTO brand2 = new BrandDTO(102, "YashRaj appliances", 54321, address2, LocalDate.of(1985, 3, 28));
		BrandDTO brand3 = new BrandDTO(103, "Hari Furnitures", 13579, address3, LocalDate.of(2005, 11, 5));
		BrandDTO brand4 = new BrandDTO(104, "Tanusha Beauty Cares", 24680, address4, LocalDate.of(2020, 5, 10));
		BrandDTO brand5 = new BrandDTO(105, "Lahari Travels", 86420, address5, LocalDate.of(2015, 12, 1));
		BrandDTO brand6 = new BrandDTO(106, "Suresh Auto Parts", 35791, address6, LocalDate.of(1999, 8, 15));
		BrandDTO brand7 = new BrandDTO(107, "Rajesh Clothing", 65432, address7, LocalDate.of(2008, 2, 22));
		BrandDTO brand8 = new BrandDTO(108, "Neha Sports Goods", 12345, address8, LocalDate.of(2012, 9, 7));
		BrandDTO brand9 = new BrandDTO(109, "Sanjay Books and Stationery", 98701, address9, LocalDate.of(1997, 6, 18));
		BrandDTO brand10 = new BrandDTO(110, "Mira Home Decor", 54310, address10, LocalDate.of(2003, 4, 30));



		ProductDTO product1 = new ProductDTO(1, "Fridge", Type.ELECTRONICS, brand1, 2500.0, 1);
		ProductDTO product2 = new ProductDTO(2, "Knife", Type.KITCHEN_APPLIANCES, brand2, 500.0, 2);
		ProductDTO product3 = new ProductDTO(3, "Sofa", Type.FURNITURE, brand3, 14000.0, 1);
		ProductDTO product4 = new ProductDTO(4, "FaceWash", Type.BEAUTY, brand4, 400.0, 3);
		ProductDTO product5 = new ProductDTO(5, "Tent", Type.TRAVEL, brand5, 2500.0, 1);
		ProductDTO product6 = new ProductDTO(6, "Microwave Oven", Type.ELECTRONICS, brand6, 800.0, 2);
		ProductDTO product7 = new ProductDTO(7, "Toaster", Type.KITCHEN_APPLIANCES, brand7, 150.0, 5);
		ProductDTO product8 = new ProductDTO(8, "Coffee Table", Type.FURNITURE, brand8, 1200.0, 3);
		ProductDTO product9 = new ProductDTO(9, "Shampoo", Type.BEAUTY, brand9, 250.0, 4);
		ProductDTO product10 = new ProductDTO(10, "Backpack", Type.TRAVEL, brand10, 50.0, 10);


		Collection<ProductDTO> products = new ArrayList<ProductDTO>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		products.add(product6);
		products.add(product7);
		products.add(product8);
		products.add(product9);
		products.add(product10);

		getProductByPincode(products, 60601);

		getAddressByProductName(products, "Sofa");

		getBrandByProductDTO(products, product3);

		getAddressByBrandDTO(products, brand5);

		getProductsBymaxPrice(products);

		getProductByType(products, Type.ELECTRONICS);

		getQuantityInDesc(products);
		
		showIterator(products, product5);
		System.out.println("Products after invoking Iterator ");
		products.forEach(ref -> System.out.println(ref));
		System.out.println();
		
		List<String> names = new LinkedList<String>();
		names.add("ismail");
		names.add("manoj");
		names.add("suraj");
		names.add("abhi");
		names.add("suhas");
		
		System.out.println("List before invoking ListIterator");
		names.forEach(ref -> System.out.println(ref));
		System.out.println();
		
		removeAndAddNames(names, "ismail", "suhas");

		System.out.println("List after invoking ListIterator");
		names.forEach(ref -> System.out.println(ref));

	}

	static void getProductByPincode(Collection<ProductDTO> products, Integer pinCode) {
		System.out.println("Products by pincode " + pinCode + " in Desc Order are");
		List<ProductDTO> pros = products.stream()
				.filter(product -> product.getBrandDto().getAddressDto().getPincode().equals(pinCode))
				.sorted((p1, p2) -> p2.getProductId().compareTo(p1.getProductId())).collect(Collectors.toList());
		pros.forEach(ref -> System.out.println(ref));
		if (pros.size() <= 0) {
			System.err.println("None found");
		}
		System.out.println();
	}

	static void getAddressByProductName(Collection<ProductDTO> products, String productName) {
		System.out.println("Address by Product name " + productName + " in Desc Order of addressId are");
		List<AddressDTO> addressDto = products.stream().filter(product -> product.getProductName().equals(productName))
				.map(add -> add.getBrandDto().getAddressDto())
				.sorted((a1, a2) -> a2.getAddressId().compareTo(a1.getAddressId())).collect(Collectors.toList());
		addressDto.forEach(ref -> System.out.println(ref));
		if (addressDto.size() <= 0) {
			System.err.println("None found");
		}
		System.out.println();
	}

	static void getBrandByProductDTO(Collection<ProductDTO> products, ProductDTO productDto) {
		System.out.println("Brand DTO by ProductDTO is");
		List<BrandDTO> brandDtos = products.stream().filter(prod -> prod.equals(productDto))
				.map(product -> product.getBrandDto()).collect(Collectors.toList());
		brandDtos.forEach(ref -> System.out.println(ref));
		if (brandDtos.size() <= 0) {
			System.err.println("None found");
		}
		System.out.println();
	}

	static void getAddressByBrandDTO(Collection<ProductDTO> products, BrandDTO brandDto) {
		System.out.println("AddressDTO by BrandDTO");
		List<AddressDTO> addressDtos = products.stream().filter(product -> product.getBrandDto().equals(brandDto))
				.map(brand -> brand.getBrandDto().getAddressDto()).collect(Collectors.toList());
		addressDtos.forEach(ref -> System.out.println(ref));
		if (addressDtos.size() <= 0) {
			System.err.println("None found");
		}
		System.out.println();
	}

	static void getProductsBymaxPrice(Collection<ProductDTO> products) {
		System.out.println("Product by max Price is ");
		 Optional<ProductDTO> max = products.stream().sorted((p1, p2) -> p2.getProductPrice().compareTo(p1.getProductPrice())).findFirst();
		 System.out.println(max);
		 System.out.println();
		
	}

	static void getProductByType(Collection<ProductDTO> products, Type type) {
		System.out.println("Products by " + type + " in Desc Order of Price is ");
		List<ProductDTO> byType = products.stream().filter(product -> product.getProductType().equals(type))
				.sorted((p1, p2) -> p1.getProductPrice().compareTo(p2.getProductPrice())).collect(Collectors.toList());
		byType.forEach(ref -> System.out.println(ref));
		if (byType.size() <= 0) {
			System.err.println("None found");
		}
		System.out.println();
	}

	static void getQuantityInDesc(Collection<ProductDTO> products) {
		System.out.println("Products where Quantity in Desc Order");
		products.stream().sorted((q1, q2) -> q2.getProductQuantity().compareTo(q1.getProductQuantity()))
				.forEach(ref -> System.out.println(ref));
		System.out.println();
	}
	
	static void showIterator(Collection<ProductDTO> products, ProductDTO dto) {
		System.out.println("Remove element using remove in Iterator");
		Iterator<ProductDTO> it = products.iterator();
		while(it.hasNext()) {
			ProductDTO ele = it.next();
			if(ele.equals(dto)) {
				it.remove();
			}
		}
		System.out.println();
	}
	
	static void removeAndAddNames(List<String> names, String removeName, String addName) {
		System.out.println("Running add and remove by ListIterator");
		ListIterator<String> name = names.listIterator();
		while(name.hasNext()) {
			String ele = name.next();
			if(ele.equals(removeName)) {
				name.remove();
				name.add(addName);
			}
		}
		System.out.println();
	}

}
