public class PrivateRoom extends GamingShop{

   private int PricePerHour=5;

    public PrivateRoom(String name, int number , int age , double numberOfHours, TypeOfDevice typeOfDevice){
        super(name, number, age, numberOfHours, typeOfDevice);
    }


    @Override
    public  double Discount(){
        if (Number>=5){
            return ((NumberOfHours*Number*PricePerHour)*0.1);
        }else
            return 0;
    }

    @Override
    public  String CheckAge(){
        if (Age>=18){
            return "Allowed";
        }else
            throw new IllegalArgumentException("Age must be 18 and above");
    }

    public double TotalPrice(){
        return ((NumberOfHours*Number*PricePerHour)-Discount());
    }

    public String toString(){
        return super.toString()+
                "\nPrice Per Hours:"+PricePerHour+
                "\nTotal Price:"+TotalPrice();
    }
}
