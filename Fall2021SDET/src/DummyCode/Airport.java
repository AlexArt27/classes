package DummyCode;

public class Airport {

    public static void main(String[] args) {

        Airplane airToChina = new Airplane();
        System.out.println(airToChina);
        airToChina.setCargoPeople(100);
        airToChina.setCurrentState("FLy");
        airToChina.setColor("red");

        System.out.println(airToChina);

        airToChina.changeAirState(airToChina);

        System.out.println(airToChina);
    }
}
