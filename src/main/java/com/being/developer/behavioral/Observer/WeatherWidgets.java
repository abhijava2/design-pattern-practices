package com.being.developer.behavioral.Observer;

// concrete observer
public class WeatherWidgets implements Observer {
    private final Station subject;

    public WeatherWidgets(Station subject) {
        this.subject = subject;
        subject.registerMe(this);
    }

    @Override
    public void update() {
        System.out.println("New Temperature update recieved!");
        display();
    }

    void display() {
        if (subject instanceof WeatherStation) {
            float temperature = ((WeatherStation) subject).getTemperature();
            System.out.println("Temperature: " + temperature);
        }
    }

    public void onDestroy(){
        this.subject.unRegisterMe(this);
    }

}
