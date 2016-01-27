package model;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class WelcomeService {

    

    public String getTimeOfDay() {
        int time = LocalDateTime.now().getHour();
        String greeting = "";
        if (time >= 0 && time < 12) {
            greeting = "Morning";
        } else if (time >= 12 && time <= 17) {
            greeting = "Afternoon";
        } else {
            greeting = "Evening";
        }
        return greeting;
    }
    
    public String addNameToGreeting(String name){
        return "Good " + getTimeOfDay() + " "+ name + ", Welcome!";
    
    }

}
