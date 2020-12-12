package TESTIRANJE;

public class Droid {
    int batteryLevel;
    String name;

    public Droid (String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    public static void main(String[] args) {
        Droid Codey = new Droid("Codey");
        System.out.println(Codey);
        Codey.performTask("dancing");
        Codey.energyReport();
        Codey.performTask("Sviming");
        Codey.energyReport();

        Droid Mark = new Droid("Mark");
        System.out.println(Mark);
        Mark.performTask("jumping");
        Mark.energyReport();
        Mark.performTask("defenfing");
        Mark.energyReport();
        Mark.performTask("playing");
        Mark.energyReport();

        System.out.println();
        System.out.println("Energy before transfer");
        Codey.energyReport();
        Mark.energyReport();

        System.out.println("-----------------");

        Mark.energyTransfer(40, Codey);
        Codey.energyReport();
        Mark.energyReport();




    }
    public String toString(){
        return "Hello, I’m the droid:"  + name;
    }
    public void performTask(String task){
        System.out.println(name+ " is performing task: " +task);
        batteryLevel=batteryLevel-10;
    }
    public void energyReport(){
        System.out.println(name +" battery lvl is: " +batteryLevel+"%");
    }
    public void energyTransfer(int power, Droid transferTo){
        System.out.println(name +" transfering "+ power + "% battery life TO " + transferTo.name);

        batteryLevel -= power;
        transferTo.batteryLevel += power;
    }

}
