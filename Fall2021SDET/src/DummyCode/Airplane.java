package DummyCode;

public class Airplane {

    public String color;
    public String currentState;
    public int cargoPeople;

    public Airplane(String color, String currentState, int cargoPeople){
        this.color = color;
        this.currentState = currentState;
        this.cargoPeople = cargoPeople;

    }

    public String getColor() {
        return color;
    }

    public String getCurrentState() {
        return currentState;
    }

    public int getCargoPeople() {
        return cargoPeople;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public void setCargoPeople(int cargoPeople) {
        this.cargoPeople = cargoPeople;
    }

    public void changeAirState(Airplane plane){
        plane.setCurrentState("ground");
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "color='" + color + '\'' +
                ", currentState='" + currentState + '\'' +
                ", cargoPeople=" + cargoPeople +
                '}';
    }

    public Airplane(){

    }
}
