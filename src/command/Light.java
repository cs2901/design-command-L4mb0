package command;

public class Light {
    private boolean isOn = false;
    Light(String place){}


    public void  on(){
        isOn = true;
        System.out.println("Light is "+isOn);
    }

    public void off(){
        isOn = false;
        System.out.println("Light is "+isOn);
    }

}
