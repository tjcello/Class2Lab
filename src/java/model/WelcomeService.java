package model;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class WelcomeService {

    

    public String getTimeOfDay() {
        int hour = LocalDateTime.now().getHour();
        String timeOfDay = "";
        
        if (hour >= 0 && hour < 12) {
            timeOfDay = "Morning";
        } else if (hour >= 12 && hour <= 17) {
            timeOfDay = "Afternoon";
        } else {
            timeOfDay = "Evening";
        }
        return timeOfDay;
    }
    
    public String addNameToGreeting(String name){
        return "Good " + getTimeOfDay() + " "+ name + ", Welcome!";
    
    }

}
