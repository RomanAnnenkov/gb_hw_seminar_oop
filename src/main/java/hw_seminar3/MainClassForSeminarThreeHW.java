package hw_seminar3;


public class MainClassForSeminarThreeHW {
    public static void main(String[] args) {

        LinkedUnit<String> linkedUnit = new LinkedUnit<>();
        linkedUnit.add("str3");
        linkedUnit.add("str2");
        linkedUnit.add("str1");

        System.out.printf("list size: %d\n",linkedUnit.size());

        for (String value: linkedUnit) {
            System.out.println(value);
        }
    }
}
