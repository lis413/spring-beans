package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
   // @Qualifier("Dog")
    private Animal dog;
    @Autowired
    private Timer timer;



    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(dog.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
        System.out.println(timer.getTime());
    }

    public Timer getTimer() {
        return timer;
    }
}
