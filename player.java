public class player {
    String name;
    short age;
    short number;
   String nationality;
   String team;
   String post;


    void pass(){
        System.out.println(name + "passes the ball ");
    }
   
    void shoot (){
        System.out.println(name + "shoots the ball ");
    }
    void score (){
        System.out.println("GOOOOOAAAAAL!! "  + name + 
 " scored a Goal ");
    }
    void info(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Number : " + number);
        System.out.println("Nationality : " + nationality);
        System.out.println("Team : " + team);
        System.out.println("Post : " + post);

    }
}