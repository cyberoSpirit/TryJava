package Laboratory;

import java.util.ArrayList;

public class Lab {
    private ArrayList<LabEquipment> labEquipments;

    public ArrayList<LabEquipment> getLabEquipments() {
        return Utility.getDeepCopyOfList(labEquipments);
    }

    public void setLabEquipments(ArrayList<LabEquipment> labEquipments) {
        this.labEquipments = labEquipments;
    }

    public Lab(Lab laboratory) {
        labEquipments = Utility.getDeepCopyOfList(laboratory.getLabEquipments());
    }

    public Lab() {
        labEquipments = new ArrayList<>();
    }

    public LabEquipment getLabEquipment(int index) {
        if (index >= 0 && index < labEquipments.size()) {
            return labEquipments.get(index).getDeepCopy();
        }
        throw new IllegalArgumentException("Index is out if range.");
    }

    public void setLabEquipment(LabEquipment labEquipment, int index) {
        labEquipments.set(index, labEquipment.getDeepCopy());
    }

    public void addLabEquipment(LabEquipment labEquipment) {
        labEquipments.add(labEquipment.getDeepCopy());
    }
}
