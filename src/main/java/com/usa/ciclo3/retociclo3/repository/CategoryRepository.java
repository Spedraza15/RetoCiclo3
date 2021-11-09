package com.usa.ciclo3.retociclo3.repository;

import com.usa.ciclo3.retociclo3.crudrepository.CategoryCrudRespository;
import com.usa.ciclo3.retociclo3.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public class CategoryRepository {

    @Autowired //inyeccion
    private CategoryCrudRespository categoryCrudRespository;

    public List<Category> getAll() {
        return (List<Category>) categoryCrudRespository.findAll();
    }

    public Optional<Category> getCategory(int id) {
        return categoryCrudRespository.findById(id);
    }

    public Category save(Category category) {
        return categoryCrudRespository.save(category);

    }

    public void delete(Category category) {
        categoryCrudRespository.delete(category);
    }

}
