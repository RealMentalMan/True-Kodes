

public class PR3dot2 {
    public static void main(String[] args){
        double d = 18.85;
        Double DB =  Double.valueOf(d);
        String str = "100";
        double D = Double.parseDouble(str);
        Double dou = new Double(10.9);

       int c = dou.intValue();
       byte b = dou.byteValue();
       float f = dou.floatValue();
       long l = dou.longValue();
       short s = dou.shortValue();
       double dd = dou.doubleValue();
       System.out.println("Значение объекта Double: " + f);
       Double DD = 0.388;
       String STR = DD.toString();
    }
}
