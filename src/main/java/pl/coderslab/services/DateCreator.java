package pl.coderslab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.repositories.UserRepository;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

@Service
public class DateCreator {

    @Autowired
    private UserRepository userRepository;

//    public void calendar() {
//
//        int[] days = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
//        int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
//        String yearNow = Year.now().toString();
//        int yearNowInt = Integer.parseInt(yearNow);
//        List<Integer> years = new ArrayList<>();
//
//        for (int minYear = 1900; minYear <= yearNowInt; yearNowInt++){
//            years.add(minYear);
//        }
//    }

    public int[] getDay(){

        int[] days1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        int[] days2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
        int[] days3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};


//        String yearNow = Year.now().toString();
//        int yearNowInt = Integer.parseInt(yearNow);
//
//        for (int minYear = 1900; minYear <= yearNowInt; minYear++){
//            if (getMonth().equals(2) && minYear % 4 == 0 && minYear % 100 != 0 || minYear % 400 == 0){
//                return days3;
//            }else if (getMonth().equals(2) && !(minYear % 4 == 0 && minYear % 100 != 0 || minYear % 400 == 0)){
//                return days2;
//            }else {
//                return days1;
//            }
//        }

        return days1;
    }

    public int[] getMonth(){
        int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        return months;
    }

    public List<Integer> getYear(){
        String yearNow = Year.now().toString();
        int yearNowInt = Integer.parseInt(yearNow);
        List<Integer> years = new ArrayList<>();

        for (int maxYear = yearNowInt; maxYear >= 1900; maxYear--){
            years.add(maxYear);
//            System.out.println(minYear);
        }

        return years;
    }


}

