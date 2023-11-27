public class Pet{
    private int id;
    private String name;
    private String type;
    private int age;
    private static int numberOfPets;

    public Pet(int id,String name, String type, int age){
        this.id=id;
        this.name=name;
        this.type=type;
        this.age=age;
        numberOfPets++;
    }
    public static int getNumberOfPets(){
        return numberOfPets;
    }
    public void purchasePet(){
        System.out.println("purchase pet:"+name);

    }
    public void displayDetail(){
        System.out.println("profit calculated for pet:"+name);
    }
    public void displayDetails(){
        System.out.println("pet Details:");
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Type:"+type);
        System.out.println("Age:"+age);

    }
}

