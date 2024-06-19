package org.example;

import org.w3c.dom.Attr;
import javax.swing.*;
import java.awt.*;
import java.util.*;



// this class is for a data structure called pair for saving things in pair
class Pair<A, B> {

    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public void setSecond(B second) {
        this.second = second;
    }
}




// this interface is for a class which implements discount.
interface Discountable {

    public void setDeals(int x, int y);

    public void setDiscounts(int x, int y);

    public void view_discounts();
    // this function is for viewing discounts

    public void view_special_deals();
    // this fucntion is for viewing special deals

    public void removeDeal(int x, int y);
    // this is to remove a speical deal

    public void set_special_deals(int num_of_attr, int discount);

    public int getDiscount_children();

    public void setDiscount_children(int discount_children);


    public ArrayList<Pair<Integer, Integer>> getGeneral_discount();

    public void setGeneral_discount(ArrayList<Pair<Integer, Integer>> general_discount);

    public int getDiscount_senior();


    public void setDiscount_senior(int discount_senior);

}



// this interface is for classes in which users need to provide feedback.
interface FeedbackProvider {
    public void provide_feedback(String feed);
    // this function is for providing feedback from the visitor
}


// this interface is for error handling of various things, for particular function on reading name you can udnerstand which part is is checking
interface Validator {
    boolean isValidEmail(String email);
    boolean isValidPhoneNumber(String phoneNumber);
    boolean isValidName(String s);
    boolean isValidPassword(String password);
}



class ValidationUtils implements Validator
{
    public ValidationUtils() {
    }

    @Override
    public boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }

    @Override
    public boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{10}");
    }

    @Override
    public boolean isValidName(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i)) && s.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValidPassword(String password) {
        if (password.length() < 7) {
            return false;
        }

        boolean hasLetter = false;
        boolean hasNumber = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLetter(c)) {
                hasLetter = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            }
        }
        return hasLetter && hasNumber;
    }
}



// this is the attraction class
abstract class Attractions {
    private int open_close_status = 0;
    // 0 for close and 1 if attaction is open
    private int cost;
    // this is the cost of the attraction
    private int ID;
    // this is the id of the attraction

    private int ticketed_visitors = 0;
    // this is the number of visitors who bouht ticket

    private int num_of_vis;
    // this is the total number of visitos
    private String name;
    // this is the name of the attraction
    private String Description;
    // this is the description of the attraction
    private int flag = 0;
    public int getFlag() {
        return flag;
    }
    public void setFlag(int i) {
        this.flag = i;
    }


    // this is to add attraction in the zoo
    public abstract void add_attraction(Attractions A);

    //this is to view attraction in the zoo
    public abstract void view_attraction();

    // this is to modify attraction
    public abstract void modify_attraction(Attractions A);



    // this is to remove attraction
    public abstract void remove_attraction(int id);



    public int getOpen_close_status() {
        return open_close_status;
    }

    public void setOpen_close_status(int open_close_status) {
        this.open_close_status = open_close_status;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getNum_of_vis() {
        return num_of_vis;
    }

    public void setNum_of_vis(int num_of_vis) {
        this.num_of_vis = num_of_vis;
    }

    public int getTicketed_visitors() {
        return ticketed_visitors;
    }

    public void setTicketed_visitors(int ticketed_visitors) {
        this.ticketed_visitors = ticketed_visitors;
    }

    @Override
    public String toString() {
        return "Attractions{" +
                "open_close_status=" + open_close_status +
                ", cost=" + cost +
                ", ID=" + ID +
                ", ticketed_visitors=" + ticketed_visitors +
                ", num_of_vis=" + num_of_vis +
                ", name='" + name + '\'' +
                ", Description='" + Description + '\'' +
                ", flag=" + flag +
                '}';
    }
}




// this class was to make an object to type attraction
class ConcreteAttraction extends Attractions {

    public  void add_attraction(Attractions A)
    {

    }

    public  void view_attraction()
    {

    }

    public  void modify_attraction(Attractions A)
    {

    }

    public  void remove_attraction(int id)
    {

    }
}




// this is the animal class used in the zoo
abstract class Animal {
    private String category;
    private String name;
    private String history;

    private String voice;
    public Animal(String category, String name) {
        this.category = category;
        this.name = name;
    }

    public Animal(String category, String name, String history, String voice) {
        this.category = category;
        this.name = name;
        this.history = history;
        this.voice = voice;
    }
    // this is to add animal in the zooo
    public abstract void add_animal(Animal a);


    // this is to update animal details in the zoo
    public abstract void update_animal_details(Animal a, String name, String category) ;

    // this is to remove animal from the zoo
    public abstract void remove_animal(Animal a);


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}




// this is the mammal class
class Mammal extends Animal {
    public Mammal(String name, String history, String voice) {
        super("Mammal", name, history, voice);
    }

    @Override
    public void add_animal(Animal a) {

    }

    @Override
    public void update_animal_details(Animal a, String name, String category) {

    }

    @Override
    public void remove_animal(Animal a) {

    }
}




// this is the amplibian class
class Amphibian extends Animal {
    public Amphibian(String name, String history, String voice) {
        super("Amphibian", name, history, voice);
    }

    @Override
    public void add_animal(Animal a) {

    }

    @Override
    public void update_animal_details(Animal a, String name, String category) {

    }

    @Override
    public void remove_animal(Animal a) {

    }
}



// this is the reptile class
class Reptile extends Animal {
    public Reptile(String name, String history, String voice) {
        super("Reptile", name, history, voice);
    }

    @Override
    public void add_animal(Animal a) {

    }

    @Override
    public void update_animal_details(Animal a, String name, String category) {

    }

    @Override
    public void remove_animal(Animal a) {

    }
}



// this is the zoo class which contains both attractions and animals
class zoo extends Animal
{
    public ArrayList<Animal> animals;

    public zoo(String category, String name) {
        super(category, name);
        animals = new ArrayList<Animal>(); // Initialize the animals ArrayList
    }

    @Override
    public void add_animal(Animal a) {
        animals.add(a);
    }

    @Override
    public void update_animal_details(Animal a, String name, String category) {
        a.setCategory(category);
        a.setName(name);
    }

    @Override
    public void remove_animal(Animal a) {
        for (int i = 0; i < animals.size(); i++) {
            if (Objects.equals(animals.get(i).getName(), a.getName())) {
                animals.remove(i);
                break;
            }
        }
    }

    public void show_animal() {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Animal Name: " + animals.get(i).getName() +
                    "\nAnimals Category: " + animals.get(i).getCategory());
            System.out.println("---------------");
        }
    }
}



// this is the visitor class
class Visitor implements FeedbackProvider{
    private int age, status, discount, number_of_attractions;
    // status = 0 for basic membership 1 for premuium membership and 2 for null
    private float balance;
    private String email, password, name, feedback, phone_number, experience;
    private ArrayList<Attractions> attraction;

    private int stu_flag = 0,sen_flag = 0;
    // these are for the discount code

    public Visitor(int age, int status, int discount, int number_of_attractions, float balance, String email, String password, String name, String feedback, String phone_number, String experience) {
        this.age = age;
        this.status = status;
        this.discount = discount;
        this.number_of_attractions = number_of_attractions;
        this.balance = balance;
        this.email = email;
        this.password = password;
        this.name = name;
        this.feedback = feedback;
        this.phone_number = phone_number;
        this.experience = experience;
        this.attraction = new ArrayList<Attractions>();
    }

    // this is for the functionality explor zoo
    public void explore_zoo(Admin A) {
        System.out.println("Here are the Attractions with their prices and current opening and closed status\n--------------------------------");
        A.view_attraction();
        System.out.println("--------------------------------\n\n Here are the animals Available");
        A.getAdmin_zoo().show_animal();
    }

    // this function is for the functionality to provide the visitor for visit animal
    public void visit_animal(Animal A,int x) {

        if (x == 1) {
            System.out.println(A.getVoice());
        } else if (x == 0) {
            System.out.println(A.getHistory());
        } else {
            System.out.println("Wrong input");
        }
    }

    // this function is to buy membership
    public void Buy_Membership(int h) {

        // if h == 0 basic else h == 1 premium
        if (h == 0)
        {
            this.status = 0;
        }
        else
        {
            this.status = 1;
        }
    }
    // this function is for providiing feedback
    public void provide_feedback(String feed) {
        this.feedback = feed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setNumber_of_attractions(int number_of_attractions) {
        this.number_of_attractions = number_of_attractions;
    }

    public void setAttraction(ArrayList<Attractions> attraction) {
        this.attraction = attraction;
    }

    public String getName() {
        return name;
    }

    public String getFeedback() {
        return feedback;
    }

    public int getStatus() {
        return status;
    }

    public int getDiscount() {
        return discount;
    }

    public int getNumber_of_attractions() {
        return number_of_attractions;
    }

    public ArrayList<Attractions> getAttraction() {
        return attraction;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Visitor(String name) {
        this.name = name;
    }


    public int getStu_flag() {
        return stu_flag;
    }

    public void setStu_flag(int stu_flag) {
        this.stu_flag = stu_flag;
    }

    public int getSen_flag() {
        return sen_flag;
    }

    public void setSen_flag(int sen_flag) {
        this.sen_flag = sen_flag;
    }
}



class Admin extends Attractions implements Discountable{
    private double total_revenue;
    // this is the total revenue that the zoo makes
    private zoo Admin_zoo;
    // this is the zoo ibject for saving the attractions and the animals
    private ArrayList<Visitor> visitors;
    // this is the visitors arraylist to store the data of all the visitors
    private int discount_children;
    // this is the children discount
    private ArrayList<Pair<Integer, Integer>> general_discount;
    // this is for sving special deals
    private ArrayList<Attractions> attraction_zoo;
    // this is the attraction array list
    private int discount_senior;
    private int number_of_attractions = 0;

    private int number_of_visitors;



    // this is for login of admin details
    public boolean Enter_as_Admin(String a, String b) {
        if (Objects.equals(a, "user12") && Objects.equals(b, "pass12")) {
            return true;
        }
        return false;
    }


    public Admin(double total_revenue, zoo admin_zoo, ArrayList<Visitor> visitors, int discount_children, ArrayList<Pair<Integer, Integer>> general_discount, ArrayList<Attractions> attraction_zoo, int discount_senior) {
        this.total_revenue = total_revenue;
        this.attraction_zoo = new ArrayList<Attractions>(); // Initialize the attraction_zoo ArrayList
        Admin_zoo = admin_zoo;
        this.visitors = visitors;
        this.discount_children = discount_children;
        this.general_discount = general_discount;
        this.attraction_zoo = attraction_zoo;
        this.discount_senior = discount_senior;
    }

    public Admin() {
        this.total_revenue = 0;
        this.Admin_zoo = new zoo("CategoryName", "ZooName");
        this.visitors = new ArrayList<Visitor>();
        this.discount_children = 0;
        this.general_discount = new ArrayList<Pair<Integer, Integer>>(); // Initialize the general_discount ArrayList
        this.attraction_zoo = new ArrayList<Attractions>(); // Initialize the attraction_zoo ArrayList
        this.discount_senior = 0;
    }

    public void setDiscounts(int x, int y) {
        discount_children = x;
        discount_senior = y;
    }

    public void setDeals(int x, int y) {
        general_discount.add(new Pair<>(x, y));
    }
    public void Changeprice(int hu,int ht)
    {
        this.attraction_zoo.get(hu).setCost(ht);
    }
    public void Changeattractionstatus(int hu,int ht)
    {
            this.attraction_zoo.get(hu).setOpen_close_status(ht);
    }

    public void view_discounts()
    {
        System.out.println("View Discounts: ");
        System.out.println("1. Minor("+discount_children+" discount) - MINOR"+discount_children);
        System.out.println("2. Senior Citizen("+discount_senior+" discount) - SENIOR"+discount_senior);
    }
    public void view_special_deals()
    {
        System.out.println("Special Deals: ");
        for (int i = 1; i <= this.general_discount.size(); i++) {
            System.out.print(i+". ");
            System.out.println("Buy " + general_discount.get(i-1).getFirst()+"tickets and get "+general_discount.get(i-1).getSecond() + "% of discount");
        }
    }

    public void removeDeal(int x, int y) {
        Pair<Integer, Integer> p;
        for (int i = 0; i < general_discount.size(); i++) {
            if (general_discount.get(i).getFirst() == x && general_discount.get(i).getSecond() == y) {
                p = general_discount.get(i);
                general_discount.remove(p);
                break;
            }
        }
    }
    public void see_status()
    {
        System.out.println("Total Revenue: " + this.total_revenue);
        System.out.println("Total Number of Visitors: "+this.number_of_visitors);
        System.out.println("\nTop (max 3) Popular Attractions: ");


        ArrayList<Attractions> attrList = new ArrayList<>();
        attrList = this.getAttraction_zoo();
        Comparator<Attractions> comparator = Comparator.comparingInt(Attractions::getNum_of_vis);
        Collections.sort(attrList, comparator);
        int u = 0;
        for (int i = attrList.size()-1;i>=0 ; i--) {
            System.out.println(attrList.get(i).getName());
            u++;
            if (u == 3)
            {
                break;
            }
        }

        // need to add top three popular attractions
        System.out.println("--------------------------------------");
        System.out.println("Visitors Data: ");
        for (int i = 0; i < visitors.size(); i++) {
            System.out.println("Name: " + visitors.get(i).getName());

        }
    }
    public void view_feedback() {
        System.out.println("Visitors feedback are :-\n-------------------------------------------\n");
        for (int i = 0; i < visitors.size(); i++) {
            System.out.println(visitors.get(i).getFeedback());
        }
    }

    public void set_special_deals(int num_of_attr, int discount) {
        Pair<Integer, Integer> p = new Pair<>(num_of_attr, discount);
        general_discount.add(p);
    }

    public void manage_animals() {
        System.out.println("Manage Animals\n---------------------\n" +
                "1. Add Animal\n" +
                "2. Update Animal Details 3. Remove Animal\n" +
                "4. Exit");
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        // if ()
    }

    public void ChangeFlag(int hu)
    {
        this.attraction_zoo.get(hu).setFlag(1);
    }



    @Override
    public void add_attraction(Attractions A) {
        A.setID(number_of_attractions);
        number_of_attractions++;
        attraction_zoo.add(A);
    }

    @Override
    public void view_attraction() {
        int lol = 1;
        for (int i = 0; i < attraction_zoo.size(); i++) {
            System.out.println(lol+". Attraction Name: " + attraction_zoo.get(i).getName());
            System.out.println(lol+". Attraction Description: " + attraction_zoo.get(i).getDescription());
            lol++;
//            System.out.println("Attraction ID: " + attraction_zoo.get(i).getID());
//            System.out.print("Attraction open close status: ");
//            if (attraction_zoo.get(i).getOpen_close_status() == 1) {
//                System.out.println("OPEN");
//            } else {
//                System.out.println("CLOSE");
//            }
        }
    }

    @Override
    public void modify_attraction(Attractions A) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter 'c' to change the Cost of attraction");
        String s = x.nextLine();
        if (Objects.equals(s, "c")) {
            System.out.println("Enter the New Cost: ");
            int a = x.nextInt();
            x.nextLine();
            A.setCost(a);
        } else {
            System.out.println("Invalid option. No changes made.");
        }
    }


    @Override
    public void remove_attraction(int id) {
        Attractions A;
        for (int i = 0; i < attraction_zoo.size(); i++) {
            if (attraction_zoo.get(i).getID() == id) {
                A = attraction_zoo.get(i);
                attraction_zoo.remove(A);
            }
        }
    }

    public double getTotal_revenue() {
        return total_revenue;
    }

    public void setTotal_revenue(double total_revenue) {
        this.total_revenue = total_revenue;
    }

    public zoo getAdmin_zoo() {
        return Admin_zoo;
    }

    public void setAdmin_zoo(zoo admin_zoo) {
        Admin_zoo = admin_zoo;
    }

    public ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public void setVisitors(ArrayList<Visitor> visitors) {
        this.visitors = visitors;
    }

    public int getDiscount_children() {
        return discount_children;
    }

    public void setDiscount_children(int discount_children) {
        this.discount_children = discount_children;
    }

    public ArrayList<Pair<Integer, Integer>> getGeneral_discount() {
        return general_discount;
    }

    public void setGeneral_discount(ArrayList<Pair<Integer, Integer>> general_discount) {
        this.general_discount = general_discount;
    }

    public int getDiscount_senior() {
        return discount_senior;
    }

    public void setDiscount_senior(int discount_senior) {
        this.discount_senior = discount_senior;
    }
    public ArrayList<Attractions> getAttraction_zoo() {
        return attraction_zoo;
    }

    public void setAttraction_zoo(ArrayList<Attractions> attraction_zoo) {
        this.attraction_zoo = attraction_zoo;
    }



    public int getNumber_of_attractions() {
        return number_of_attractions;
    }

    public void setNumber_of_attractions(int number_of_attractions) {
        this.number_of_attractions = number_of_attractions;
    }

    public int getNumber_of_visitors() {
        return number_of_visitors;
    }

    public void setNumber_of_visitors(int number_of_visitors) {
        this.number_of_visitors = number_of_visitors;
    }
}


public class Main
{

    public static void main(String[] args)
    {

        String Head_username = "user12";
        String Head_password = "pass12";
        System.out.println("Welcome to ZOOtopia!\n\n------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Admin Deatils: \nusername: "+Head_username+" \nPassword: "+Head_password+"\n------------------------------");
        Admin Head = new Admin();
        ValidationUtils Checker = new ValidationUtils();


        // adding 6 animals as minimum 6 animals ( 2 of each category ) are necessary.
        Animal elephant = new Mammal("Elephant", "Elephant is a large mammal.", "Trumpets");
        Animal monkey = new Mammal("Monkey", "Monkeys are intelligent mammals.", "Chatters");

        Animal frog = new Amphibian("Frog", "Frogs are amphibians with unique life cycles.", "Croaks");
        Animal salamander = new Amphibian("Salamander", "Salamanders have colorful skin.", "Hisses");

        Animal snake = new Reptile("Snake", "Snakes are legless reptiles.", "Hisses");
        Animal turtle = new Reptile("Turtle", "Turtles have protective shells.", "No voice");

        Head.getAdmin_zoo().add_animal(elephant);
        Head.getAdmin_zoo().add_animal(monkey);
        Head.getAdmin_zoo().add_animal(frog);
        Head.getAdmin_zoo().add_animal(salamander);
        Head.getAdmin_zoo().add_animal(snake);
        Head.getAdmin_zoo().add_animal(turtle);

        // added 6 animals


        while (true)
        {
            try
            {
                System.out.println(
                        "\n1. Enter as Admin\n" +
                                "2. Enter as a Visitor\n" +
                                "3. View Special Deals\n" +
                                "4. Exit\n\n------------------------------\n");
                int a=0;
                a = sc.nextInt();
                sc.nextLine();
                if (a == 1)
                {
                    String admin_username;
                    String admin_password;
                    System.out.print("Enter Admin Username: ");
                    admin_username = sc.nextLine();
                    System.out.print("Enter Admin Password: ");
                    admin_password = sc.nextLine();
                    if (Head.Enter_as_Admin(admin_username,admin_password))
                    {
                        System.out.println("\nLogged in as admin.\n");
                        while (true)
                        {
                            try
                            {
                                System.out.println("\n-----------------------------                                                                                                                                                                                                                                                                                            " +
                                        "\n\n1. Manage Attractions\n" +
                                        "2. Manage Animals\n" +
                                        "3. Schedule Events\n" +
                                        "4. Set Discounts\n" +
                                        "5. Set Special Deal\n" +
                                        "6. View Visitor Stats\n" +
                                        "7. View Feedback\n" +
                                        "8. Exit\n");
                                int x = sc.nextInt();
                                sc.nextLine();
                                System.out.println("\n------------------------------\n\n");
                                if (x == 1)
                                {
                                    while (true)
                                    {
                                        try
                                        {
                                            System.out.println("Manage Attractions: \n" +
                                                    "1. Add Attraction\n" +
                                                    "2. View Attractions \n" +
                                                    "3. Modify Attraction \n" +
                                                    "4. Remove Attraction \n" +
                                                    "5. Exit");
                                            int xuo = sc.nextInt();
                                            sc.nextLine();
                                            if (xuo == 1)
                                            {
                                                Attractions new_Att = new ConcreteAttraction();

                                                String name_att,Description2;
                                                System.out.print("Enter Attraction Name: ");
                                                name_att = sc.nextLine();
                                                System.out.print("Enter Attraction Description: ");
                                                Description2 = sc.nextLine();
                                                new_Att.setCost(0);
                                                new_Att.setName(name_att);
                                                new_Att.setDescription(Description2);
                                                Head.add_attraction(new_Att);
                                                // add attraction
                                                System.out.println("Attraction added Successfully!\n");

                                            } else if (xuo == 2) {
                                                Head.view_attraction();
                                                // view attraction
                                            } else if (xuo == 3) {
                                                int idx;
                                                System.out.println("Enter the id of the attraction you want to modify");
                                                idx = sc.nextInt();
                                                sc.nextLine();
                                                int yt = 0;
                                                for (int i = 0; i < Head.getAttraction_zoo().size(); i++) {
                                                    if (Head.getAttraction_zoo().get(i).getID() == idx)
                                                    {
                                                        // do the work of manage attraction here
                                                        System.out.print("Enter 'c' if you want to change the cost or 'd' to change the description of the Attraction: ");
                                                        String yulu = sc.nextLine();
                                                        yt = 1;
                                                        if (Objects.equals(yulu, "c"))
                                                        {
                                                            System.out.print("Enter the New Cost of Attraction: ");
                                                            int hulu = sc.nextInt();
                                                            sc.nextLine();
                                                            Head.getAttraction_zoo().get(i).setCost(hulu);
                                                        } else if (Objects.equals(yulu,"d")) {
                                                            System.out.println("Enter the new description of the attraction: ");
                                                            String bn = sc.nextLine();
                                                            Head.getAttraction_zoo().get(i).setDescription(bn);
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (yt == 0)
                                                {
                                                    System.out.println("No id with this attraction exist. ");
                                                }
                                                // manage attraction
                                            } else if (xuo == 4) {
                                                int idy;
                                                System.out.print("Enter the id you want to remove attraction: ");
                                                idy = sc.nextInt();
                                                sc.nextLine();
                                                int ert = 0;
                                                for (int i = 0;i<Head.getAttraction_zoo().size();i++)
                                                {
                                                    if (Head.getAttraction_zoo().get(i).getID() == idy)
                                                    {
                                                        ert = 1;
                                                    }
                                                }
                                                if (ert == 1) {
                                                    Head.remove_attraction(idy);
                                                }
                                                else
                                                {
                                                    System.out.println("Attraction iwth this id does not exist. ");
                                                }
                                                // remove attraction
                                            } else if (xuo == 5) {
                                                break;
                                            } else
                                            {
                                                System.out.println("Invalid Input! ");
                                            }
                                        }
                                        catch (java.util.InputMismatchException e)
                                        {
                                            System.out.println("Invalid Input. Please enter a valid integer.");
                                            sc.nextLine();
                                        }
                                    }
                                }
                                else if (x == 2)
                                {
                                    while (true)
                                    {
                                        try
                                        {
                                            System.out.println("Manage Animals:\n" +
                                                    "1. Add Animal\n" +
                                                    "2. Update Animal Details \n" +
                                                    "3. Remove Animal\n" +
                                                    "4. Exit\n");
                                            int xui = sc.nextInt();
                                            sc.nextLine();
                                            if (xui == 1)
                                            {
                                                String name, category, voice, hist;
                                                System.out.println("Enter the name of animal: ");
                                                name = sc.nextLine();
                                                System.out.println("Enter the name of Category: ");
                                                category = sc.nextLine();
                                                // Mammals, Amphibians and Reptiles.
                                                if (!Objects.equals(category, "Mammal") && !Objects.equals(category, "Reptile") && !Objects.equals(category, "Amphibian")) {
                                                    System.out.println("\nInvalid category! \n");
//                                                    break;
                                                } else
                                                {
                                                    System.out.println("Enter the voice of animal: ");
                                                    voice = sc.nextLine();
                                                    System.out.println("Enter the history of animal: ");
                                                    hist = sc.nextLine();
                                                    Mammal m;
                                                    Reptile r;
                                                    Amphibian am;
                                                    if (category.equals("Mammal"))
                                                    {
                                                        m = new Mammal( name, hist, voice);
                                                        Head.getAdmin_zoo().add_animal(m);
                                                    } else if (category.equals("Reptile")) {
                                                        r = new Reptile(name, hist, voice);
                                                        Head.getAdmin_zoo().add_animal(r);
                                                    } else if (category.equals("Amphibian")) {
                                                        am = new Amphibian(name,hist,voice);
                                                    }
                                                }

                                            } else if (xui == 2)
                                            {
                                                String name;
                                                System.out.print("enter the name of the animal you want to update: ");
                                                name = sc.nextLine();
                                                Animal as;
                                                int ui = 0;
                                                for (int i = 0; i < Head.getAdmin_zoo().animals.size(); i++) {
                                                    if (Objects.equals(Head.getAdmin_zoo().animals.get(i).getName(), name))
                                                    {
                                                        System.out.print("Enter 'v' to change the voice of the animal or enter 'h' to change the history of the animal: ");
                                                        String er = sc.nextLine();
                                                        if (Objects.equals(er,"v"))
                                                        {
                                                            System.out.println("Enter the new voice of the animal: ");
                                                            String df = sc.nextLine();
                                                            Head.getAdmin_zoo().animals.get(i).setVoice(df);
                                                        }
                                                        if (Objects.equals(er,"h"))
                                                        {
                                                            System.out.println("Enter the new history of the animal: ");
                                                            String dhf = sc.nextLine();
                                                            Head.getAdmin_zoo().animals.get(i).setHistory(dhf);
                                                        }

                                                        ui = 1;
                                                        // change what of the animal has to be changed
                                                        break;
                                                    }
                                                }
                                                if (ui == 0)
                                                {
                                                    System.out.println("No animal with the name exist. ");
                                                }
                                            } else if (xui == 3)
                                            {
                                                String name;
                                                System.out.print("enter the name of the animal you want to remove: ");
                                                name = sc.nextLine();
                                                Animal as = null;
                                                String cat3 = "cat3";
                                                int countSameCategory = 0;
                                                int gk = 0;
                                                for (int i = 0; i < Head.getAdmin_zoo().animals.size(); i++) {
                                                    if (Objects.equals(Head.getAdmin_zoo().animals.get(i).getName(), name)) {
                                                        as = Head.getAdmin_zoo().animals.get(i);
                                                        cat3 = Head.getAdmin_zoo().animals.get(i).getCategory();
//                                                        Head.getAdmin_zoo().remove_animal(as);
                                                        gk = 1;
                                                        break;
                                                    }
                                                }
                                                for (int i = 0; i < Head.getAdmin_zoo().animals.size(); i++)
                                                {
                                                    if (Objects.equals(Head.getAdmin_zoo().animals.get(i).getCategory(), cat3))
                                                    {
                                                     countSameCategory++;
                                                    }
                                                }
                                                if (gk == 0)
                                                {
                                                    System.out.println("No Animal with such name exist. ");
                                                }
                                                else
                                                {
                                                    if (countSameCategory<=2)
                                                    {
                                                        System.out.println("You cannot remove this animal as it is one of the last two in its category.");
                                                    }
                                                    else
                                                    {
                                                        Head.getAdmin_zoo().remove_animal(as);
                                                        System.out.println(name + " has been removed.");
                                                    }
                                                    break;
                                                }
                                            }
                                            else if (xui == 4)
                                            {
                                                break;
                                            }
                                            else
                                            {
                                                System.out.println("Invalid input! ");
                                            }
                                        }
                                        catch (java.util.InputMismatchException e)
                                        {
                                            System.out.println("Invalid Input. Please enter a valid integer.");
                                            sc.nextLine();
                                        }
                                    }
                                }
                                else if (x == 3)
                                {
                                    for (int i = 0; i < Head.getAttraction_zoo().size(); i++) {
                                        System.out.println("Attraction name: "+ Head.getAttraction_zoo().get(i).getName());
                                        System.out.println("Attraction id: "+Head.getAttraction_zoo().get(i).getID());
                                    }
                                    System.out.println("Enter the id of the attraction you want to set price and also change the open/close status.");
                                    int idr = sc.nextInt();
                                    sc.nextLine();
                                    int olo = 0;
                                    for (int i = 0; i < Head.getAttraction_zoo().size(); i++) {
                                        if (Head.getAttraction_zoo().get(i).getID() == idr) {
                                            olo = 1;
                                            System.out.print("Enter the price of the Attraction: ");
                                            int dc = sc.nextInt();
                                            sc.nextLine();
                                            Head.Changeprice(i,dc);
                                            System.out.print("Enter 1 to open the attraction and 0 to close the attraction: ");
                                            int fd = sc.nextInt();
                                            sc.nextLine();
                                            Head.Changeattractionstatus(i,fd);
                                        }
                                    }
                                    if (olo == 0)
                                    {
                                        System.out.println("No id with such attraction exist");
                                    }
                                    // schedule events
                                }
                                else if (x == 4)
                                {

                                    while (true)
                                    {
                                        try
                                        {
                                            System.out.println("\n" +
                                                    "Set Discounts:\n" +
                                                    "1. Add Discount\n" +
                                                    "2. Modify Discount \n" +
                                                    "3. Remove Discount \n" +
                                                    "4. Exit");
                                            int xuy = sc.nextInt();
                                            sc.nextLine();
                                            if (xuy == 1)
                                            {
                                                int dis;
                                                System.out.print("Enter Discount Category(Enter 'c' for children and 's' for senior): ");
                                                String cat = sc.nextLine();
                                                System.out.print("Enter Discount Percentage(20 for 20%): ");
                                                dis = sc.nextInt();
                                                sc.nextLine();
                                                System.out.println("Discount added successfully\n");
                                                if (Objects.equals(cat, "c"))
                                                {
                                                    Head.setDiscount_children(dis);
                                                } else if (Objects.equals(cat, "s")) {
                                                    Head.setDiscount_senior(dis);
                                                }
                                                else
                                                {
                                                    System.out.println("wrong input");
                                                }
                                                // add discount
                                            } else if (xuy == 2) {
                                                int dis;
                                                System.out.print("Enter Discount Category which needs to modify(Enter 'c' for children and 's' for senior): ");
                                                String cat = sc.nextLine();
                                                System.out.print("Enter New Discount Percentage(20 for 20%): ");
                                                dis = sc.nextInt();
                                                sc.nextLine();
                                                if (Objects.equals(cat, "c"))
                                                {
                                                    Head.setDiscount_children(dis);
                                                } else if (Objects.equals(cat, "s")) {
                                                    Head.setDiscount_senior(dis);
                                                }
                                                else
                                                {
                                                    System.out.println("wrong input");
                                                }
                                                // modify discount
                                            } else if (xuy == 3) {
                                                System.out.print("Enter Discount Category which needs to Delete(Enter 'c' for children and 's' for senior): ");
                                                String cat = sc.nextLine();
                                                if (Objects.equals(cat, "c"))
                                                {
                                                    Head.setDiscount_children(0);
                                                } else if (Objects.equals(cat, "s")) {
                                                    Head.setDiscount_senior(0);
                                                }
                                                else
                                                {
                                                    System.out.println("wrong input");
                                                }
                                                // remove discount
                                            }
                                            else
                                            {
                                                break;
                                            }
                                        }
                                        catch (java.util.InputMismatchException e)
                                        {
                                            System.out.println("Invalid Input. Please enter a valid integer.");
                                            sc.nextLine();
                                        }
                                    }
                                }
                                else if (x == 5)
                                {
                                    while (true)
                                    {
                                        try
                                        {
                                            int discount,days;
                                            System.out.print("Enter the number of attractions on which user should have to give some amount of discount: ");
                                            days = sc.nextInt();
                                            sc.nextLine();
                                            System.out.print("Enter the Discount(20 for 20%) for users having "+days+" number of attractions ticket: ");
                                            discount = sc.nextInt();
                                            sc.nextLine();
                                            Head.set_special_deals(days,discount);
                                            break;
                                        }
                                        catch (java.util.InputMismatchException e)
                                        {
                                            System.out.println("Invalid Input. Please enter a valid integer.");
                                            sc.nextLine();
                                        }
                                    }
                                }
                                else if (x == 6)
                                {
                                    //6. View Visitor Stats
                                    Head.see_status();
                                }
                                else if (x == 7)
                                {
                                    //7. View Feedback
                                    Head.view_feedback();
                                }
                                else if (x == 8)
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("invalid number");
                                }
                            } catch (java.util.InputMismatchException e)
                            {
                                System.out.println("Invalid Input. Please enter a valid integer.");
                                sc.nextLine();
                            }
                        }
                    }
                    else
                    {
                        System.out.println("Wrong Details");
                    }
                }
                if (a == 2)
                {
                    while (true)
                    {
                        int d, flag = 0, f23 = 0;
                        Visitor v = new Visitor("name");
                        try {
                            System.out.println("------------------------------");
                            System.out.println("1. Register");
                            System.out.println("2. Login");
                            System.out.println("3. exit");
                            d = sc.nextInt();
                            sc.nextLine();
                            String name2, phone_number2, email2, password2;
                            int age2;
                            float balance2;
                            if (d == 1) {
                                System.out.println("Enter the Name: ");
                                name2 = sc.nextLine();
                                if (!Checker.isValidName(name2)) {
                                    System.out.println("Invalid name format. Please enter a valid name.");
                                    continue;
                                }
                                System.out.println("Enter the phone number: ");
                                phone_number2 = sc.nextLine();
                                if (!Checker.isValidPhoneNumber(phone_number2)) {
                                    System.out.println("Invalid phone number format. Please enter a 10 digit phone number");
                                    continue;
                                }
                                System.out.println("Enter the email: ");
                                email2 = sc.nextLine();
                                if (!Checker.isValidEmail(email2)) {
                                    System.out.println("Invalid email format. Please enter a valid email.");
                                    continue;
                                }
                                System.out.println("Enter the Age: ");
                                age2 = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter the Balance: ");
                                balance2 = sc.nextFloat();
                                sc.nextLine();
                                System.out.println("Enter the Password:(should be atleast 7 digits long and must contain a number and a letter) ");
                                password2 = sc.nextLine();
                                if (!Checker.isValidPassword(password2)) {
                                    System.out.println("Invalid password format. Please enter a valid password.");
                                    continue;
                                }
                                Visitor vi = new Visitor(age2, 2, 0, 0, balance2, email2, password2, name2, "no feedback", phone_number2, "idk");
                                System.out.println("\nVisitor Registered successfully\n");
                                Head.getVisitors().add(vi);
                                int fghj = Head.getNumber_of_visitors();
                                Head.setNumber_of_visitors(fghj + 1);
                            } else if (d == 2) {
                                flag = 1;
                                System.out.println("Enter Email: ");
                                String email3, password;
                                email3 = sc.nextLine();
                                if (!Checker.isValidEmail(email3)) {
                                    System.out.println("Invalid email format. Please enter a valid email.");
                                    continue;
                                }
                                System.out.println("Enter Password: ");
                                password = sc.nextLine();
                                if (!Checker.isValidPassword(password)) {
                                    System.out.println("Invalid password format. Please enter a valid password.");
                                    continue;
                                }
                                for (int i = 0; i < Head.getVisitors().size(); i++) {
                                    if (Objects.equals(Head.getVisitors().get(i).getEmail(), email3) && Objects.equals(Head.getVisitors().get(i).getPassword(), password) && f23 == 0) {
                                        v = Head.getVisitors().get(i);
                                        System.out.println("Login Successful");
                                        f23 = 1;
                                    }
                                }
                            } else if (d == 3) {
                                break;
                            } else {
                                System.out.println("Invalid Input ");
                            }
                        }
                        catch (java.util.InputMismatchException e) {
                            System.out.println("Invalid Input. Please enter a valid integer.");
                            sc.nextLine();
                        }
                        if (flag == 1 && f23 == 1)
                        {
                            int x = 0 ;
                            System.out.println("Login Successful\n");

                            while (true)
                            {
                                System.out.println("Visitor Menu:\n" +
                                        "1. Explore the Zoo\n" +
                                        "2. Buy Membership \n" +
                                        "3. Buy Tickets\n" +
                                        "4. View Discounts\n" +
                                        "5. View Special Deals \n" +
                                        "6. Visit Animals\n" +
                                        "7. Visit Attractions\n" +
                                        "8. Leave Feedback\n" +
                                        "9. Log Out");
                                try {
                                    x = sc.nextInt();
                                    sc.nextLine();
                                } catch (java.util.InputMismatchException e) {
                                    System.out.println("Invalid Input. Please enter a valid integer.");
                                    sc.nextLine();
                                }
                                if (x == 1)
                                {
                                    while (true) {
                                        int nini=0;
                                        try {
                                            System.out.println("Explore the zoo: \n" +
                                                    "1. View Attractions \n" +
                                                    "2. View Animals\n" +
                                                    "3. Exit\n");
                                            nini = sc.nextInt();
                                            sc.nextLine();
                                        }
                                        catch (java.util.InputMismatchException e)
                                        {
                                            System.out.println("Invalid Input. Please enter a valid integer.");
                                            sc.nextLine();
                                        }
                                        if (nini == 1) {
                                            Head.view_attraction();
                                        } else if (nini == 2) {
                                            Head.getAdmin_zoo().show_animal();
                                        } else if (nini == 3) {
                                            break;
                                        } else {
                                            System.out.println("invalid Input");
                                        }
                                    }
                                } else if (x == 2)
                                {
                                    System.out.println("Buy Membership:\n" +
                                            "1. Basic Membership (₹20)\n" +
                                            "2. Premium Membership (₹50)");
                                    int ygy = sc.nextInt();
                                    sc.nextLine();
                                    if (ygy == 1)
                                    {
                                        if (v.getStatus()==0)
                                        {
                                            System.out.println("You already have basic membership! ");
                                        }
                                        else if (v.getStatus() == 1)
                                        {
                                            System.out.println("You already have premium membership! ");
                                        }
                                        else
                                        {
                                            float qwer = v.getBalance();

                                            if (v.getAge()<18)
                                            {
                                                System.out.println("Based on your age, you are eligible for student discount! ");
                                                System.out.println("Enter code 'STUDENT' to avail "+ Head.getDiscount_children()+"% discount");
                                                String inpdis = sc.nextLine();
                                                if (Objects.equals(inpdis, "STUDENT"))
                                                {
                                                    v.setStu_flag(1);
                                                    double discou = 20*(1-0.01*Head.getDiscount_children());
                                                    if (v.getBalance()<discou)
                                                    {
                                                        System.out.println("You do not have enough balance to buy Basic Membership! ");
                                                    }
                                                    else
                                                    {
                                                        v.setBalance((float) (qwer-discou));
                                                        Head.setTotal_revenue((Head.getTotal_revenue()+discou));
                                                        v.Buy_Membership(0);
                                                        System.out.println("Congratulation you have got student discount. \n");
                                                        System.out.println("Congratulations you got basic membership, your balance is now "+v.getBalance());
                                                    }
                                                }
                                                else
                                                {
                                                    double discou = 20;
                                                    if (v.getBalance()<discou)
                                                    {
                                                        System.out.println("You do not have enough balance to buy Basic Membership! ");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("Such discount code does not exist! ");
                                                        v.setBalance((float) (qwer-discou));
                                                        Head.setTotal_revenue((Head.getTotal_revenue()+discou));
                                                        v.Buy_Membership(0);
                                                        System.out.println("Congratulations you got basic membership, your balance is now "+v.getBalance());


                                                    }
                                                }
                                            }
                                            else if (v.getAge()>=60)
                                            {
                                                System.out.println("Based on your age, you are eligible for senior citizen discount! ");
                                                System.out.println("Enter code 'SENIOR' to avail "+ Head.getDiscount_senior()+"% discount");
                                                String inpdis = sc.nextLine();
                                                if (Objects.equals(inpdis, "SENIOR"))
                                                {
                                                    v.setSen_flag(1);
                                                    double discou = 20*(1-0.01*Head.getDiscount_senior());
                                                    if (v.getBalance()<discou)
                                                    {
                                                        System.out.println("You do not have enough balance to buy Basic Membership! ");
                                                    }
                                                    else
                                                    {
                                                        v.setBalance((float) (qwer-discou));
                                                        Head.setTotal_revenue((Head.getTotal_revenue()+discou));
                                                        v.Buy_Membership(0);
                                                        System.out.println("Congratulation you have got senior citizen discount. \n");
                                                        System.out.println("Congratulations you got basic membership, your balance is now "+v.getBalance());

                                                    }
                                                }
                                                else
                                                {
                                                    double discou = 20;
                                                    if (v.getBalance()<discou)
                                                    {
                                                        System.out.println("You do not have enough balance to buy Basic Membership! ");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("Such discount code does not exist! ");
                                                        v.setBalance((float) (qwer-discou));
                                                        Head.setTotal_revenue((Head.getTotal_revenue()+discou));
                                                        System.out.println("Congratulations you got basic membership, your balance is now "+v.getBalance());
                                                        v.Buy_Membership(0);

                                                    }
                                                }

                                            }
                                            else
                                            {
                                                double discou = 20;
                                                if (v.getBalance()<discou)
                                                {
                                                    System.out.println("You do not have enough balance to buy Basic Membership! ");
                                                }
                                                else
                                                {
                                                    v.setBalance((float) (qwer-discou));
                                                    Head.setTotal_revenue((Head.getTotal_revenue()+discou));
                                                    v.Buy_Membership(0);
                                                    System.out.println("Congratulations you got basic membership, your balance is now "+v.getBalance());
                                                }
                                            }
                                        }
                                    }
                                    else if (ygy == 2)
                                    {
                                        if (v.getStatus() == 1)
                                        {
                                            System.out.println("You already have premium membership! ");
                                        }
                                        else
                                        {
                                            float qwer = v.getBalance();

                                            if (v.getAge()<18)
                                            {
                                                System.out.println("Based on your age, you are eligible for student discount! ");
                                                System.out.println("Enter code 'STUDENT' to avail "+ Head.getDiscount_children()+"% discount");
                                                String inpdis = sc.nextLine();
                                                if (Objects.equals(inpdis, "STUDENT"))
                                                {
                                                    double discou = 50*(1-0.01*Head.getDiscount_children());
                                                    if (v.getBalance()<discou)
                                                    {
                                                        System.out.println("You do not have enough balance to buy Premium Membership! ");
                                                    }
                                                    else
                                                    {
                                                        v.setBalance((float) (qwer-discou));
                                                        Head.setTotal_revenue((Head.getTotal_revenue()+discou));
                                                        v.Buy_Membership(1);
                                                        System.out.println("Congratulation you have got student discount. \n");
                                                        System.out.println("Congratulations you got premium membership, your balance is now "+v.getBalance());
                                                    }
                                                }
                                                else
                                                {
                                                    double discou = 50;
                                                    if (v.getBalance()<discou)
                                                    {
                                                        System.out.println("You do not have enough balance to buy Premium Membership! ");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("Such discount code does not exist! ");
                                                        v.setBalance((float) (qwer-discou));
                                                        Head.setTotal_revenue((Head.getTotal_revenue()+discou));
                                                        v.Buy_Membership(1);
                                                        System.out.println("Congratulations you got premium membership, your balance is now "+v.getBalance());


                                                    }
                                                }
                                            }
                                            else if (v.getAge()>=60)
                                            {
                                                System.out.println("Based on your age, you are eligible for senior citizen discount! ");
                                                System.out.println("Enter code 'SENIOR' to avail "+ Head.getDiscount_senior()+"% discount");
                                                String inpdis = sc.nextLine();
                                                if (Objects.equals(inpdis, "SENIOR"))
                                                {
                                                    double discou = 50*(1-0.01*Head.getDiscount_senior());
                                                    if (v.getBalance()<discou)
                                                    {
                                                        System.out.println("You do not have enough balance to buy Premium Membership! ");
                                                    }
                                                    else
                                                    {
                                                        v.setBalance((float) (qwer-discou));
                                                        Head.setTotal_revenue((Head.getTotal_revenue()+discou));
                                                        v.Buy_Membership(1);
                                                        System.out.println("Congratulation you have got senior citizen discount. \n");
                                                        System.out.println("Congratulations you got premium membership, your balance is now "+v.getBalance());

                                                    }
                                                }
                                                else
                                                {
                                                    double discou = 50;
                                                    if (v.getBalance()<discou)
                                                    {
                                                        System.out.println("You do not have enough balance to buy Premium Membership! ");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("Such discount code does not exist! ");
                                                        v.setBalance((float) (qwer-discou));
                                                        Head.setTotal_revenue((Head.getTotal_revenue()+discou));
                                                        v.Buy_Membership(1);
                                                        System.out.println("Congratulations you got premium membership, your balance is now "+v.getBalance());


                                                    }
                                                }

                                            }
                                            else
                                            {
                                                double discou = 50;
                                                if (v.getBalance()<discou)
                                                {
                                                    System.out.println("You do not have enough balance to buy premium Membership! ");
                                                }
                                                else
                                                {
                                                    v.setBalance((float) (qwer-discou));
                                                    Head.setTotal_revenue((Head.getTotal_revenue()+discou));
                                                    v.Buy_Membership(1);
                                                    System.out.println("Congratulations you got premium membership, your balance is now "+v.getBalance());
                                                }
                                            }
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Wrong Input");
                                    }
                                }
                                else if (x == 3)
                                {
                                    // if h == 0 basic else h == 1 premium
                                    if (v.getStatus() == 2)
                                    {
                                        System.out.println("First Buy Membership, then buy the tickets");
                                    }
                                    else if (v.getStatus() == 1)
                                    {
                                        System.out.println("You have premium membership, you have free access to all attractions! ");
                                    }
                                    else if (v.getStatus() == 0)
                                    {
                                        System.out.println("Buy Tickets\n");
                                        System.out.print("Enter the number of Tickets you want to buy: ");
                                        int rc = sc.nextInt();
                                        sc.nextLine();
                                        int drt = 0;
                                        int dis_tbg=0;
                                        int gy = 0;
                                        for (int i = 0; i < Head.getGeneral_discount().size(); i++) {
                                            if (Head.getGeneral_discount().get(i).getFirst()<=rc)
                                            {
                                                if (Head.getGeneral_discount().get(i).getFirst()>drt)
                                                {
                                                    gy = 1;
                                                    drt = Head.getGeneral_discount().get(i).getFirst();
                                                    dis_tbg = Head.getGeneral_discount().get(i).getSecond();
                                                }
                                            }
                                        }

                                        if (gy == 1)
                                        {
                                            System.out.println("Based on the number of tickets you have bought , you will get offer of "+dis_tbg+"%\n");
                                        }
                                        for (int i = 0; i < rc; i++)
                                        {
                                            Head.view_attraction();
                                            int fed = sc.nextInt();
                                            sc.nextLine();
                                            double dseu = Head.getAttraction_zoo().get(fed-1).getCost()*(1-0.01*dis_tbg);
                                            if (v.getStu_flag() == 1)
                                            {
                                                dseu = dseu*(1-0.01*Head.getDiscount_children());
                                                System.out.println("Congratulations you got a student discount of "+Head.getDiscount_children()+"%");
                                            }
                                            if (v.getSen_flag() == 1)
                                            {
                                                dseu = dseu*(1-0.01*Head.getDiscount_senior());
                                                System.out.println("Congratulations you got a senior citizen discount of "+Head.getDiscount_senior()+"%");
                                            }
                                            float fesu = v.getBalance();
                                            if (v.getBalance()<dseu)
                                            {
                                                System.out.println("You do not have enough balance to buy the ticket for "+Head.getAttraction_zoo().get(fed-1).getName());
                                            }
                                            else
                                            {
                                                v.getAttraction().add(Head.getAttraction_zoo().get(fed-1));
                                                Head.ChangeFlag(fed - 1);
                                                v.setBalance((float) (fesu - dseu));
                                                Head.setTotal_revenue(Head.getTotal_revenue()+dseu);
                                                System.out.println("The Ticket for "+Head.getAttraction_zoo().get(fed-1).getName()+" was purchased Successfully. Your balance is now Rs "+v.getBalance());
                                            }
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Invalid membership status");
                                    }
                                    // buy tickets
                                } else if (x == 4) {
                                    Head.view_discounts();
                                } else if (x == 5) {
                                    Head.view_special_deals();
                                } else if (x == 6) {
                                    System.out.println("Enter the Animal you want to visit: ");
                                    String anime = sc.nextLine();
                                    Animal A;
                                    int dk = 0;
                                    for (int i = 0; i < Head.getAdmin_zoo().animals.size(); i++)
                                    {
                                        if (Objects.equals(Head.getAdmin_zoo().animals.get(i).getName(), anime))
                                        {
                                            System.out.println("Enter 1 to feed the animal or enter 0 to read the animal: ");
                                            int olo;
                                            olo = sc.nextInt();
                                            sc.nextLine();
                                            v.visit_animal(Head.getAdmin_zoo().animals.get(i),olo);
                                            dk = 1;
                                            break;
                                        }
                                    }
                                    if (dk == 0)
                                    {
                                        System.out.println("No such animal exist");
                                    }
                                }
                                else if (x == 7)
                                {
                                    // this portion can contains potential many errors like the flag thing
                                    System.out.println("Visit Attractions: ");
                                    Head.view_attraction();
                                    System.out.println("\n------------------\nSelect an Attraction to visit");
                                    int tr = sc.nextInt();
                                    sc.nextLine();
                                    if (Head.getAttraction_zoo().get(tr-1).getOpen_close_status() == 0)
                                    {
                                        System.out.println("This Attraction is closed ");
                                    }
                                    else
                                    {
                                        if (v.getStatus() == 0)
                                        {
                                            int ghijk = 0;
                                            int id_of_attr = Head.getAttraction_zoo().get(tr-1).getID();

                                            for (int i = 0; i < v.getAttraction().size(); i++) {
                                                if (v.getAttraction().get(i).getID() == id_of_attr)
                                                {
                                                    // we got that attraction.
                                                    v.getAttraction().remove(v.getAttraction().get(i));
                                                    ghijk = 1;
                                                    break;
                                                }
                                            }

                                            if (ghijk == 0) {
                                                System.out.println("Ticket not available. Basic Members need to buy separate tickets for the attractions.");
                                            } else
                                            {

                                                System.out.println("Thank you for visiting " + Head.getAttraction_zoo().get(tr - 1).getName() + ". Hope you enjoyed the attraction.");
                                                Head.getAttraction_zoo().get(tr-1).setNum_of_vis(Head.getAttraction_zoo().get(tr-1).getNum_of_vis()+1);
                                                Head.getAttraction_zoo().get(tr - 1).setFlag(0);
                                                Head.getAttraction_zoo().get(tr-1).setTicketed_visitors(Head.getAttraction_zoo().get(tr-1).getTicketed_visitors()+1);
                                            }

                                        }
                                        else if (v.getStatus() == 1)
                                        {
                                            System.out.println("You are a premium member. Enjoy the attraction for free!");
                                            System.out.println("Welcome to the attraction "+Head.getAttraction_zoo().get(tr-1).getName());
                                            Head.getAttraction_zoo().get(tr-1).setNum_of_vis(Head.getAttraction_zoo().get(tr-1).getNum_of_vis()+1);
                                            Head.getAttraction_zoo().get(tr - 1).setFlag(0);
                                        }
                                        else
                                        {
                                            System.out.println("Please first buy a membership to visit attractions. ");
                                        }
                                    }
                                }
                                else if (x == 8) {
                                    System.out.println("Enter your feedback(max 200 words): ");
                                    String feed = sc.nextLine();
                                    v.provide_feedback(feed);
                                    System.out.println("Thank you for your feedback!");
                                } else if (x == 9) {
                                    break;
                                } else {
                                    System.out.println("invalid input ");
                                }
                                System.out.println("-------------------");
                            }
                        }
                        else if (flag == 1 && f23 == 0)
                        {
                            System.out.println("Wrong Credentials! ");
                        }
                    }
                }
                else if (a == 3)
                {
                    Head.view_special_deals();
                }
                else if (a == 4)
                {
                    System.out.println("Thank you!");
                    break;
                }
                else
                {

                    System.out.println("Invalid Input");
                }
            }
            catch(java.util.InputMismatchException e)
            {
                System.out.println("\nInvalid Input. Please enter a valid integer.");
                sc.nextLine();
            }
        }
    }
}


