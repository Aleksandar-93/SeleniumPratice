package TESTIRANJE;

public class metode {
    String color;

    public metode(String carColor) {
        color = carColor;
    }

    public void startRadio(String station) {
        System.out.println("Turning on the radio to " + station + "!");
        System.out.println("Enjoy!");
    }

    public static void main(String[] args){
        metode myCar = new metode("red");
        myCar.startRadio("Meditation Station");
        System.out.println(myCar);
                
    }
}
