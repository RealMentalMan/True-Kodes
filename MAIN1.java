import java.text.NumberFormat;
import java.util.Locale;
class VALUTI {
    public double Dkurse = 101.10;
    public double Ekurse = 110.89;
    int way = 1;

    VALUTI(double Dollar_kurse, double Euro_kurse) {
        Dkurse = Dollar_kurse;
        Ekurse = Euro_kurse;
    }


    public double Dkonvert(double i) {
        double res = 0;
        if (way == 1)
            res = Dkurse * i;
        if (way == 0)
            res = i / Dkurse;

        return res;
    }

    public double Ekonvert(double i) {
        double res = 0;
        if (way == 1)
            res = Ekurse * i;
        if (way == 0)
            res = i / Ekurse;

        return res;
    }


    public double get_D() {
        return Dkurse;
    }

    public double get_E() {
        return Ekurse;
    }


    public void set_D(double i) {
        Dkurse = i;
    }

    public void set_E(double i) {
        Ekurse = i;
    }


}
public class MAIN1 {
    public static void main(String[] args) {
        VALUTI V = new VALUTI(102.97, 105.43);
        V.way = 1;
        double MyDollars = 1000;
        double MyRubles = V.Dkonvert(MyDollars);
        NumberFormat NUM = NumberFormat.getCurrencyInstance(Locale.CANADA);
        NumberFormat NUM2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("Я продал " + NUM.format(MyDollars) + " и получил " + MyRubles + " руб.");
        double LOP = 1;
        System.out.println(V.get_E() +  " руб. = " +  NUM2.format(LOP));
        V.set_E(111.11);
        System.out.println("Теперь "  + V.get_E() +  " руб. = " +  NUM2.format(LOP));
    }
}

