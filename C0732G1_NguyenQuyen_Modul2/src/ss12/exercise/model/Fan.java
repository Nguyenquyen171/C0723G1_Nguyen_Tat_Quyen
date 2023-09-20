package ss12.exercise.model;

public  class Fan extends Product{
    private int wattage;

    public Fan(int id, String name, double value, int wattage) {
        super(id, name, value);
        this.wattage = wattage;
    }

    public Fan(int wattage) {
        this.wattage = wattage;
    }

    public Fan(){}

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Id of the Fan " + getId()+
                " , name is : " + getName() +
                " with wattage is " + getWattage()+
                " valuable is " + getValue()
                ;
    }


}
