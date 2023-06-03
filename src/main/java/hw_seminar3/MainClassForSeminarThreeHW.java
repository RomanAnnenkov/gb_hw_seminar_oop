package hw_seminar3;


public class MainClassForSeminarThreeHW {
    public static void main(String[] args) {

        LinkedUnit<String> linkedUnit = new LinkedUnit<>();
        linkedUnit.add("str1");
        linkedUnit.add("str2");
        linkedUnit.add("str3");

        System.out.printf("list size: %d\n", linkedUnit.size());

        for (String value : linkedUnit) {
            System.out.println(value);
        }

        linkedUnit.clear();
        System.out.printf("list size: %d\n", linkedUnit.size());
    }
}
