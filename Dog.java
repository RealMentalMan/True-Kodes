import java.util.*;
class Dog {
    public String name;
    public int age;

    Dog(String _name, int _age) {
        name = _name;
        if ( _age > 0 && _age < 20)
            age = _age;
        else
            age = 0;
        System.out.println("Собака родилась! Её имя:  " + name);
    }

    public void set_age(int _age) {
        if (_age > 0 && _age <= 20) {
            age = _age;
            System.out.println("Теперь собаке " + name + age + "лет");

        }
        else
            System.out.println("Такой собаки быть не может");
    }
    public void set_name(String _name) {
        name = _name;
        System.out.println("Теперь собаку зовут:  " + name);
    }
    public int get_age() {
        return age;
    }

    public String get_name(){
        return name;
    }

    public int get_human_age() {

        return   7 * age ;
    }

    public String Information() {
        return "Собаке по кличке " + name  + age + " лет";
    }
}

class Dog_pitomnik {
    public ArrayList<Dog> many_dogs;
    Dog_pitomnik() {
        many_dogs = new ArrayList<>();
    }

    public void add_dogs(Dog dogs[]) {
        many_dogs.addAll(List.of(dogs) );
        System.out.println("Добавлены следующие собаки :  " );
        for (int i = 0; i < dogs.length; i++)
        System.out.println(dogs[i].get_name() + ", " +dogs[i].get_age() );
    }

    public String Information() {
        if (many_dogs.isEmpty())
            return "Собачник пуст";
        else
            return "В собачнике следующие собаки: " + many_dogs;
    }
}
class Main{
    public static void main(String[] args){
        Dog God = new Dog("Наташа", 5);
        God.set_name("Майкрафт");
        Dog Good = new Dog("Катриона",4);
        Dog_pitomnik P = new Dog_pitomnik();
        Dog p[]  = {God, Good};
        P.add_dogs(p);
        P.Information();
    }
}