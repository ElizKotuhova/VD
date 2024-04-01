public class Home7 {
    public static void main(String[] args){
        int HomeToOffice = 5;
        System.out.println("HomeToOffice: " + HomeToOffice + "km");
        double TaxiSpeed = 50;
        System.out.println("TaxiSpeed: " + TaxiSpeed);
        double timeToOffice = HomeToOffice / TaxiSpeed;
        System.out.println("timeToOffice: " + timeToOffice);
        double coifEvening = 0.5;
        System.out.println("coifEvening: " + coifEvening);
        double timeToHome = timeToOffice * coifEvening;
        System.out.println("timeToHome: " + timeToHome);
    }
}