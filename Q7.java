public class Q7 {
    private String name;
    private int age;

    public Q7(String name,int age){
        this .name=name;
        this.age=age;


    }

public String getName(){
        return name;

}

    public int getAge() {
        return age;


    }
    public String toString(){
        return "Student{" +"name="+ name + '\'' +" age=" + age +'}';

    }

    public static void main( String [] args){

        Q7 [] Q7 = new Q7 [2];

    }
    public static void main (String [] args){
        Q7 [] Q7 new= Q7[2];
        Q7 [0]= new Q7( name: "hind" , age :20);
        Q7 [1]=new Q7(name : "asma",age 20);

        for (int i=0 ; i<Q7 .length ;i++){
            System.out.println("name Q7 :" +Q7[1] .getName());
            System.out.println("age Q7:"+Q7[i].getAge());
            System.out.println();
        }
    }

        }