public class Vehicle {
    protected int id;
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle( int id, String brand ,String model, int year){
        this.id=id;
        this.brand=brand;
        this.model=model;
        this.year=year;

    }

    public Vehicle() {
    }

    public void displayDetails(){
        System.out.println("Vehicle Details:");
        System.out.println("ID:"+id);
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Year"+year);

    }
    public class Truck extends Vehicle{
        private double cargoCapacity;

        public Truck(int id, String brand, String model, int year ,double cargoCapacity) {
            super(id, brand, model, year );
            this.cargoCapacity=cargoCapacity;

        }
        public void calcuateDistnceTraveled(double speed,double time ){
            double distance= speed *time;
            System.out.println("Distance Traveled:" + distance + "kilometers");
        }
    }
    public class Main{
        public void main(String[] args){
            Truck truck =new Truck(1,"volvo","FH16", 2022,25.5 );
            truck.displayDetails();
            truck.calcuateDistnceTraveled(80,5);
        }
    }
}
