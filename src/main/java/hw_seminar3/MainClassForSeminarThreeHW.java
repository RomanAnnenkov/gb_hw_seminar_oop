package hw_seminar3;


public class MainClassForSeminarThreeHW {
    public static void main(String[] args) {

        LinkedUnit<String> linkedUnit = new LinkedUnit<>();
        linkedUnit.add("str1");
        linkedUnit.add("str2");
        linkedUnit.add("str3");
        linkedUnit.add("str4");
        linkedUnit.add("str5");
        linkedUnit.add("str6");

        System.out.printf("list size: %d\n", linkedUnit.size());

        System.out.println("---for-each---");
        for (String value : linkedUnit) {
            System.out.println(value);
        }

        System.out.println("---remove-index-3---");
        System.out.println(linkedUnit.remove(3));

        System.out.println("---get-element-by-index---");
        for (int i = 0; i < linkedUnit.size(); i++) {
            System.out.println(linkedUnit.get(i));
        }

        System.out.println("---clear---");
        linkedUnit.clear();
        System.out.printf("list size: %d\n", linkedUnit.size());
    }
}
