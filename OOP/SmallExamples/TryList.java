package SmallExamples;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TryList {
    public static void tryArrayList() {
        List<String> cities = new ArrayList<>();
        cities.add("Paris");
        cities.add("Florence");
        cities.add("Venice");
        cities.add("Versailles");
        cities.add("London");
        cities.add("Petra");
        cities.add("Oslo");
        cities.add("Rome");
        cities.add("Madrid");
        cities.add("Tokyo");
        cities.add("Prague");
        cities.add("Dublin");
        cities.add("Athens");
        cities.add("Marseille");
        cities.add("Chicago");

        System.out.println(cities.size());
        System.out.println(cities.get(5));
        System.out.println(cities.get(8));
        cities.set(2, "Naples");
        cities.remove(5);

    }
    
    public static void tryLinkedList() {
        List<String> cities = new LinkedList<>();
        cities.add("Paris");
        cities.add("Florence");
        cities.add("Venice");
        cities.add("Versailles");
        cities.add("London");
        cities.add("Petra");
        cities.add("Oslo");
        cities.add("Rome");
        cities.add("Madrid");
        cities.add("Tokyo");
        cities.add("Prague");
        cities.add("Dublin");
        cities.add("Athens");
        cities.add("Marseille");
        cities.add("Chicago");
        int s = 15 >> 1;
        System.out.println(s);

        System.out.println(cities.size());
        System.out.println(cities.get(5));
        System.out.println(cities.get(8));
        cities.set(2, "Naples");
        cities.remove(5);

    }
    
    public static void testALAndLL() {

		List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        int bigIndex = 4_500_000;

        for(int i = 0; i < 11_000_000; i++) {
			linkedList.add(i);
            arrayList.add(i);
        }

        /******************FETCHING DATA******************/

        System.out.println("\nFETCHING DATA\n");

        long start = System.currentTimeMillis();
		linkedList.get(bigIndex);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
		arrayList.get(bigIndex);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");
        

        /******************FIRST / LAST INDEX******************/

        System.out.println("\nFIRST / LAST INDEX\n");

        start = System.currentTimeMillis();
		linkedList.get(0);
        linkedList.get(linkedList.size() - 1);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
		arrayList.get(0);
        arrayList.get(arrayList.size() - 1);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");


        /******************INSERTION TO THE MIDDLE******************/

        System.out.println("\nINSERTION TO THE MIDDLE\n");

        start = System.currentTimeMillis();
        linkedList.add(5, 121); // insert 121 at index 5
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        arrayList.add(5, 121);  // insert 121 at index 5
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");


        /******************INSERTION******************/

        System.out.println("\nINSERTION\n");

        start = System.currentTimeMillis();		
        linkedList.add(121);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        arrayList.add(121);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");

        /******************REMOVAL******************/
        
        System.out.println("\nREMOVAL\n");

        start = System.currentTimeMillis();			
        linkedList.remove(bigIndex);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();			
        arrayList.remove(bigIndex);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");


        /******************UPDATES******************/

        System.out.println("\nUPDATES\n");

        start = System.currentTimeMillis();					
		linkedList.set(bigIndex, 5);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();			
		arrayList.set(bigIndex, 5);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");

	}

}
