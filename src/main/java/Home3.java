public class Home3 {
    public static void main(String[] args){
        final int dev = 5;
        System.out.println("dev: " + dev);
        final int QaForDev = 2;
        System.out.println("QaForDev: " + QaForDev);
        final int support = 3;
        System.out.println("support: " + support);
        final int QaInTeam = dev * QaForDev;
        System.out.println("QaInTeam: " + QaInTeam);
        final int SupInTeam = dev * support;
        System.out.println("SupInTeam: " + SupInTeam);
        final int team = dev + dev + SupInTeam;
        System.out.println("team: " + team);
    }
}

