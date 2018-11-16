public class HorseRunner {
    public static void main(String[] args)
    {
        Horse horse1=new Mustang("Mothman", 1200);
        Horse horse2=new Mustang("Sasquatch", 1100);
        Horse horse3=new Mustang("Mr Levin", 1140);

        Horse[] horses = new Horse[6];

        horses[1]=horse1;
        horses[3]=horse2;
        horses[5]=horse3;
        HorseBarn barn=new HorseBarn(horses);

        System.out.println(barn);
        System.out.println("Mothman is in space: " + barn.findHorseSpace("Mothman"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println("Mothman is now in space: "+ barn.findHorseSpace("Mothman"));
    }
}
