package Laboratory;

public class Centrifuge extends LabEquipment {
    public static final int MAX_RPM = 50000;
    private int maxRPM;

    public int getMaxRPM() {
        return this.maxRPM;
    }

    public void setMaxRPM(int maxRPM) {
        if (maxRPM < 0 || maxRPM > MAX_RPM) {
            throw new IllegalArgumentException("Max RPM must be greater than or equal to the minimum RPM.");
        }
        this.maxRPM = maxRPM;
    }

    public Centrifuge(String manufacturer, String model, int year, int maxRPM) {
        super(manufacturer, model, year);
        setMaxRPM(maxRPM);
    }

    public Centrifuge(Centrifuge centrifuge) {
        super(centrifuge.getManufacturer(), centrifuge.getModel(), centrifuge.getYear());
        setMaxRPM(centrifuge.getMaxRPM());
    }

    @Override
    public String performMaintenance() {
        return "Centrifuge maintenance: Check the rotor, clean the chamber, and lubricate the spindle.";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Centrifuge clone = null;
        try  {
            clone = (Centrifuge) super.clone();
            clone.setMaxRPM(maxRPM);
        }
        catch (CloneNotSupportedException e)  {
            throw new RuntimeException(e);
        }
        return clone;
    }

    @Override
    public LabEquipment getDeepCopy() {
        return new Centrifuge(getManufacturer(), getModel(), getYear(), getMaxRPM());
    }
    
}
