package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Repository
public class InMemoryBrandRepository implements BrandRepository{
	List<Brand> brands;
	
	
	public InMemoryBrandRepository() {
		this.brands = new ArrayList<Brand>();
		this.brands.add(new Brand(1, "BMW"));
		this.brands.add(new Brand(2, "Mercedes"));
		this.brands.add(new Brand(3, "Audi"));
		this.brands.add(new Brand(4, "Flat"));
		this.brands.add(new Brand(5, "Renault"));
	}
	
	@Override
	public List<Brand> getAll() {
		return brands;
	}
	
}
