package Laboratory;

import java.util.ArrayList;

public class Utility {
    public static boolean isNullOrBlank(String string) {
        return string == null || string.isBlank();
    }

    public static ArrayList<LabEquipment> getDeepCopyOfList(ArrayList<LabEquipment> list) {
        if (list == null) {
            return null;
        }

        ArrayList<LabEquipment> newlist = new ArrayList<LabEquipment>();
        for (LabEquipment element : list) {
            newlist.add(element.getDeepCopy());
        }
        return newlist;
    }
}
