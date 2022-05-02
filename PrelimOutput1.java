//Renier Antony R. Hingco, 1BSCS
import java.util.Scanner;

public class PrelimOutput1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Legend
        1km = 1000m
        1m = 100cm
        1ft = 12in
        1in = 2.54cm
        1cm= 10mm
        */
        
        //kilometer
        double kilometer;
        double km_to_m, km_to_cm, km_to_ft, km_to_in, km_to_mm;
        
        System.out.println("----------km to other units----------");
        System.out.println("Enter the distance in kilometers:");
        kilometer = input.nextDouble();
        
        km_to_m = kilometer*1000;
        km_to_cm = kilometer*100000;
        km_to_ft = kilometer*100000/2.54/12;
        km_to_in = kilometer*100000/2.54;
        km_to_mm = kilometer*100000*10;
        
        System.out.println("\t" + kilometer + "km = " + km_to_m + "m");
        System.out.println("\t" + kilometer + "km = " + km_to_ft + "ft");
        System.out.println("\t" + kilometer + "km = " + km_to_in + "in");
        System.out.println("\t" + kilometer + "km = " + km_to_cm + "cm");
        System.out.println("\t" + kilometer + "km = " + km_to_mm + "mm");
        
        
        //meter
        double meter;
        double m_to_km, m_to_cm, m_to_ft, m_to_in, m_to_mm;
        
        System.out.println("----------m to other units----------");
        System.out.println("Enter the distance in meters:");
        meter = input.nextDouble();
        
        m_to_km = meter/1000;
        m_to_cm = meter*100;
        m_to_ft = meter*100/2.54/12;
        m_to_in = meter*100/2.54;
        m_to_mm = meter*100*10;
        
        System.out.println("\t" + meter + "m = " + m_to_km + "km");
        System.out.println("\t" + meter + "m = " + m_to_ft + "ft");
        System.out.println("\t" + meter + "m = " + m_to_in + "in");
        System.out.println("\t" + meter + "m = " + m_to_cm + "cm");
        System.out.println("\t" + meter + "m = " + m_to_mm + "mm");
        
        
        //feet
        double feet;
        double ft_to_km, ft_to_cm, ft_to_m, ft_to_in, ft_to_mm;
        
        System.out.println("----------ft to other units----------");
        System.out.println("Enter the distance in feet:");
        feet = input.nextDouble();
        
        ft_to_km = feet*12*2.54/100000;
        ft_to_cm = feet*12*2.54;
        ft_to_m = feet*12*2.54/100;
        ft_to_in = feet*12;
        ft_to_mm = feet*12*2.54*10;
        
        System.out.println("\t" + feet + "ft = " + ft_to_km + "km");
        System.out.println("\t" + feet + "ft = " + ft_to_m + "m");
        System.out.println("\t" + feet + "ft = " + ft_to_in + "in");
        System.out.println("\t" + feet + "ft = " + ft_to_cm + "cm");
        System.out.println("\t" + feet + "ft = " + ft_to_mm + "mm");
        
        
        //inches
        double inches;
        double in_to_km, in_to_cm, in_to_m, in_to_ft, in_to_mm;
        
        System.out.println("----------in to other units----------");
        System.out.println("Enter the distance in inches:");
        inches = input.nextDouble();
        
        in_to_km = inches*2.54/100000;
        in_to_cm = inches*2.54;
        in_to_m = inches*2.54/100;
        in_to_ft = inches/12;
        in_to_mm = inches*2.54*10;
        
        System.out.println("\t" + inches + "in = " + in_to_km + "km");
        System.out.println("\t" + inches + "in = " + in_to_m + "m");
        System.out.println("\t" + inches + "in = " + in_to_ft + "ft");
        System.out.println("\t" + inches + "in = " + in_to_cm + "cm");
        System.out.println("\t" + inches + "in = " + in_to_mm + "mm");
        
        
        //centimeter
        double centimeter;
        double cm_to_km, cm_to_ft, cm_to_m, cm_to_in, cm_to_mm;
        
        System.out.println("----------cm to other units----------");
        System.out.println("Enter the distance in centimeters:");
        centimeter = input.nextDouble();
        
        cm_to_km = centimeter/100000;
        cm_to_ft = centimeter/2.54/12;
        cm_to_m = centimeter/100;
        cm_to_in = centimeter/2.54;
        cm_to_mm = centimeter*10;
        
        System.out.println("\t" + centimeter + "cm = " + cm_to_km + "km");
        System.out.println("\t" + centimeter + "cm = " + cm_to_m + "m");
        System.out.println("\t" + centimeter + "cm = " + cm_to_ft + "ft");
        System.out.println("\t" + centimeter + "cm = " + cm_to_in + "in");
        System.out.println("\t" + centimeter + "cm = " + cm_to_mm + "mm");
        
        
        //millimeter
        double millimeter;
        double mm_to_km, mm_to_cm, mm_to_m, mm_to_in, mm_to_ft;
        
        System.out.println("----------mm to other units----------");
        System.out.println("Enter the distance in millimeter:");
        millimeter = input.nextDouble();
        
        mm_to_km = millimeter/10/100/1000;
        mm_to_cm = millimeter/10;
        mm_to_m = millimeter/10/100;
        mm_to_in = millimeter/10/2.54;
        mm_to_ft = millimeter/10/2.54/12;
        
        System.out.println("\t" + millimeter + "mm = " + mm_to_km + "km");
        System.out.println("\t" + millimeter + "mm = " + mm_to_m + "m");
        System.out.println("\t" + millimeter+ "mm = " + mm_to_ft + "ft");
        System.out.println("\t" + millimeter + "mm = " + mm_to_in + "in");
        System.out.println("\t" + millimeter+ "mm = " + mm_to_cm + "cm");
        
        System.out.println("-------------------------------------");
    }
}  