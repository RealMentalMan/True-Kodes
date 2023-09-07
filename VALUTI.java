class VALUTI {
    public double Dkurse = 101.10;
    public double Ekurse = 110.89;
    public double Tkurse = 4.5;
    int way = 1;
    VALUTI(double Dollar_kurse, double Euro_kurse, double Turkish_lirs_kurse){
        Dkurse = Dollar_kurse;
        Ekurse = Euro_kurse;
        Tkurse = Turkish_lirs_kurse;
    }


    public double Dkonvert(double i) {
        double res = 0;
        if(way == 1)
            res = Dkurse * i;
        if (way == 0)
            res  = i/  Dkurse;
        else
            System.out.println("Неправильные данные");
        return res;
    }
    public double Ekonvert(double i) {
        double res = 0;
        if(way == 1)
            res = Ekurse * i;
        if (way == 0)
            res  = i/  Ekurse;
        else
            System.out.println("Неправильные данные");
        return res;
    }
    public double Tkonvert(double i) {
        double res = 0;
        if(way == 1)
            res = Tkurse * i;
        if (way == 0)
            res  = i/  Tkurse;
        else
            System.out.println("Неправильные данные");
        return res;
    }
    public double get_D(){
        return Dkurse;
    }
    public double get_E(){
        return Ekurse;
    }
    public double get_T(){
        return Tkurse;
    }
    public void set_D(double i){
        Dkurse = i;
    }
    public void set_E(double i){
        Ekurse = i;
    }
    public void set_T(double i){
        Tkurse = i;
    }
}
class MaiN{
    public static void main(String[] args){
        VALUTI V = new VALUTI(102.97,105.43, 4.9);
        V.way = 1;
        double MyDollars = 1000;
        double MyRubles = V.Dkonvert(MyDollars);
        System.out.println("Я продал" + MyDollars + "долдларов и получил" + MyRubles + "рублей");
        System.out.println(V.get_E() + "- курс евро");
        V.set_E(111.11);
        System.out.println(V.get_E() + "- курс евро теперь");
    }
}
