package pl.coderslab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.domain.entities.CategoryEntity;
import pl.coderslab.repositories.CategoryRepository;

@Service
public class CategoryCreator {

    @Autowired
    private CategoryRepository categoryRepository;

    String categories = "SPORTS,MOVIES,SCIENCE,MUSIC,GAMES,BOOKS,LIFESTYLE,CULTURE";

    public void createCategoryArray() {
        String[] array = categories.split(",");
        for (String st : array
                ) {
            CategoryEntity categoryEntity = new CategoryEntity();
            categoryEntity.setCategoryName(st);
            categoryRepository.save(categoryEntity);
            System.out.println(st);
        }
    }
}
