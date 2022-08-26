public abstract class GamingShop {

    protected int Number,Age;
    protected double NumberOfHours;
    protected TypeOfDevice typeOfDevice;

    public GamingShop(String name, int number , int age , double numberOfHours, TypeOfDevice typeOfDevice){
        setName(name);
        this.Number = number;
        this.Age = age;
        this.NumberOfHours=numberOfHours;
        this.typeOfDevice = typeOfDevice;
    }

    private String Name;
    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public abstract double Discount();

    public abstract String CheckAge();

    public double TotalPrice(){
        return ((NumberOfHours*Number)-Discount());
    }

    public String toString(){
        return "RECEIPT"+
                "\nReceipt Name:"+getName()+
                "\nAge:"+ Age+
                "\nCheck Age:"+CheckAge()+
                "\nNumber of People:"+Number+
                "\nNumber of Hours:"+NumberOfHours+
                "\nType Of Game:"+ typeOfDevice +
                "\nDiscount:"+Discount();
    }



}
