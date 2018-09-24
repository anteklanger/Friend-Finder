package pl.coderslab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.domain.entities.CategoryEntity;
import pl.coderslab.domain.entities.Interest;
import pl.coderslab.repositories.CategoryRepository;
import pl.coderslab.repositories.InterestRepository;

@Service
public class InterestCreator {

    @Autowired
    private InterestRepository interestRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    String categories = "SPORTS,MOVIES,SCIENCE,MUSIC,GAMES,BOOKS,LIFESTYLE,CULTURE";

    String interestCat1 = "Bowling,Golf,Football,Soccer,Basketball,Tennis,Chess,Baseball,Boxing,MMA";
    String interestCat2 = "Comedy,Horror,Action,SciFi,Gangster,Adventure";
    String interestCat3 = "Biology,Chemistry,Space Exploration,Physics,Tech";
    String interestCat4 = "POP,Rock,Metal,Rap,Alternative,Classical,Folk";
    String interestCat5 = "FPS,Strategy,Simulator,Racing,Mobile,Sport";
    String interestCat6 = "Thriller,Horror,Fantasy,Biography,Historical,Plays";
    String interestCat7 = "Travelling,Parties,Long walks,Peace and quiet,Sleeping";
    String interestCat8 = "Theatre,Opera,Classical Art,Modern Art,Photography";

    String[] arrayOfInterest = {interestCat1, interestCat2, interestCat3, interestCat4, interestCat5, interestCat6, interestCat7, interestCat8};

    public void createInterestArray() {

        String[] categoriesArray = categories.split(",");

        for (int i = 0; i < categoriesArray.length; i++) {

            String[] interestsArray = arrayOfInterest[i].split(",");

            for (String st : interestsArray
                    ) {
                Interest interest = new Interest();
                interest.setIntrestName(st);
                interest.setCategoryEntity(categoryRepository.findFirstByCategoryName(categoriesArray[i]));
                interestRepository.save(interest);
                System.out.println(st);
            }
        }
    }


}
