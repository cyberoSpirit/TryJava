package Laboratory;

public class Microscope extends LabEquipment {
    public static final int MIN_MAGNIFICATION = 1;
    private int magnification;

    public int getMagnification() {
        return this.magnification;
    }

    public void setMagnification(int magnification) {
        if (magnification < MIN_MAGNIFICATION) {
            throw new IllegalArgumentException(
                    "Magnification must be greater than or equal to the minimum magnification.");
        }
        this.magnification = magnification;
    }

    public Microscope(String manufacturer, String model, int year, int magnification) {
        super(manufacturer, model, year);
        setMagnification(magnification);
    }

    public Microscope(Microscope microscope) {
        super(microscope.getManufacturer(), microscope.getModel(), microscope.getYear());
        setMagnification(microscope.getMagnification());
    }

    @Override
    public String performMaintenance() {
        return "Microscope maintenance: Clean the lenses and check the light source.";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Microscope clone = null;
        try  {
            clone = (Microscope) super.clone();
            clone.setMagnification(magnification);
        }
        catch (CloneNotSupportedException e)  {
            throw new RuntimeException(e);
        }
        return clone;
    }

    @Override
    public LabEquipment getDeepCopy() {
        return new Microscope(getManufacturer(), getModel(), getYear(), getMagnification());
    }
    
}
