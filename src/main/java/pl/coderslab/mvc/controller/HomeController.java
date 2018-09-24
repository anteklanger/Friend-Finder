package pl.coderslab.mvc.controller;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.domain.entities.CategoryEntity;
import pl.coderslab.domain.entities.Country;
import pl.coderslab.domain.entities.Interest;
import pl.coderslab.domain.entities.User;
import pl.coderslab.repositories.CategoryRepository;
import pl.coderslab.repositories.CountryRepository;
import pl.coderslab.repositories.InterestRepository;
import pl.coderslab.repositories.UserRepository;
import pl.coderslab.services.CategoryCreator;
import pl.coderslab.services.CountryCreator;
import pl.coderslab.services.DateCreator;
import pl.coderslab.services.InterestCreator;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private InterestRepository interestRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private CountryCreator countryCreator;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DateCreator dateCreator;

    @Autowired
    private CategoryCreator categoryCreator;

    @Autowired
    private InterestCreator interestCreator;

    @GetMapping("/login")
    public String loginUser(Model model) {
        model.addAttribute("user", new User());

//        countryCreator.createCountryArray();
//        categoryCreator.createCategoryArray();
//        interestCreator.createInterestArray();


        return "/login";
    }

    @PostMapping("/login")
    public String loggedUser(@RequestParam String password, @RequestParam String nick, Model model, HttpServletRequest request) {

        String userNick = nick;
        String userPasswd = password;

        HttpSession session = request.getSession();
        User user = userRepository.findFirstByNick(nick);
        if (password.equals(user.getPassword())) {
            model.addAttribute("nick", nick);
            session.setAttribute("user", user);
            return "/user_panel";
        } else {
            return "redirect:/home/login";
        }
    }


    @GetMapping("/register")
    public String registerUser(Model model) {
        model.addAttribute("user", new User());
        List<Country> countries = countryRepository.findAll();
        List<String> countryNames = new ArrayList<>();
        for (Country country : countries) {
            countryNames.add(country.getCountry_name());
        }
        model.addAttribute("countryNames", countryNames);

        model.addAttribute("dayC", dateCreator.getDay());
        model.addAttribute("monthC", dateCreator.getMonth());
        model.addAttribute("yearC", dateCreator.getYear());


        return "/register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model) {

        userRepository.save(user);

        String register2 = "/register_2/" + user.getId();

        System.out.println(register2);
        model.addAttribute("user", user);


        return "/registersuccess1";
    }


    @GetMapping("/register_2/{userId}")
    public String register2User(@PathVariable String userId, Model model) {
        User user = userRepository.findOne(Long.parseLong(userId));
        model.addAttribute("user", user);
        model.addAttribute("category", new CategoryEntity());

        List<Interest> interestList = interestRepository.findAll();
        List<CategoryEntity> categoryList = categoryRepository.findAll();

        List<Interest> sport = interestRepository.findAllByCategoryEntity_id(1L);
        List<Interest> movies = interestRepository.findAllByCategoryEntity_id(2L);
        List<Interest> science = interestRepository.findAllByCategoryEntity_id(3L);
        List<Interest> music = interestRepository.findAllByCategoryEntity_id(4L);
        List<Interest> games = interestRepository.findAllByCategoryEntity_id(5L);
        List<Interest> books = interestRepository.findAllByCategoryEntity_id(6L);
        List<Interest> lifestyle = interestRepository.findAllByCategoryEntity_id(7L);
        List<Interest> culture = interestRepository.findAllByCategoryEntity_id(8L);

        List<String> interests = new ArrayList<>();
        for (Interest interest : interestList) {
            interests.add(interest.getIntrestName());
        }
        model.addAttribute("stringList", interests);
        model.addAttribute("interestList", interestList);
        model.addAttribute("sport", sport);
        model.addAttribute("movies", movies);
        model.addAttribute("science", science);
        model.addAttribute("music", music);
        model.addAttribute("games", games);
        model.addAttribute("books", books);
        model.addAttribute("lifestyle", lifestyle);
        model.addAttribute("culture", culture);
        return "/register_2";
    }


    @PostMapping("/register_2/{userId}")
    public String registerUserCheckbox(@ModelAttribute User user, HttpServletRequest request, Model model) {

        userRepository.save(user);
        HttpSession session = request.getSession();
        session.setAttribute("user", user);

        model.addAttribute("user", user);

        return "/user_panel";
    }

    @GetMapping("/user_panel")
    public String userPanel() {

        return "/user_panel";
    }

    @PostMapping("/user_panel")
    public String userPanel(Model model, User user){
        model.addAttribute("user",user);
        return "/user_panel";
    }

    @GetMapping("/update")
    public String updateUser(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
//        User user = (User) session.getAttribute("user");

        User user = (User) session.getAttribute("user");

        model.addAttribute("dayC", dateCreator.getDay());
        model.addAttribute("monthC", dateCreator.getMonth());
        model.addAttribute("yearC", dateCreator.getYear());
        List<Country> countries = countryRepository.findAll();
        List<String> countryNames = new ArrayList<>();
        for (Country country : countries) {
            countryNames.add(country.getCountry_name());
        }
        model.addAttribute("countryNames", countryNames);

        model.addAttribute("user", user);

        return "/update_data";
    }

    @PostMapping("/update")
    public String updatedUser(@ModelAttribute User user, Model model, HttpServletRequest request){

        HttpSession session = request.getSession();
        User sessionUser =(User) session.getAttribute("user");
//        user.setPassword(sessionUser.getPassword());
        user.setId(sessionUser.getId());
        userRepository.save(user);

        return "/user_panel";
    }

    @GetMapping("/friends")
    public String friends(){
        return "/friends";
    }

    @GetMapping("/messages")
    public String message(){
        return "/messages";
    }
}
