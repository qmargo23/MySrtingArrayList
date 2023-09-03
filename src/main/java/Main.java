public class Main {

    public static void main(String[] args) {
    StringListImpl stringList = new StringListImpl(3);

        stringList.add(0, "test");
        stringList.add(1, "test_01");
        stringList.add(0, "test2");
//        stringList.set(0, "Hello_02");
//        System.out.println(stringList.get(0));
//        System.out.println(stringList.get(1));
//        System.out.println(stringList.get(2));
//        System.out.println(stringList.contains("Hello_02"));
//        stringList.remove("Hello_02");
//        System.out.println(stringList.get(0));
//        System.out.println(stringList.get(1));
//        System.out.println(stringList.get(2));
//        System.out.println(stringList.contains("test_02"));
//        stringList.set(1, "Hello_02");
//        System.out.println(stringList.get(0));
//        System.out.println(stringList.get(1));
//        System.out.println(stringList.get(2));
//        System.out.println(stringList.contains("Hello_02"));
//        System.out.println("stringList.indexOf(Hello_02) = " + stringList.indexOf("Hello_02"));
//        System.out.println("stringList.lastIndexOf(test) = " + stringList.lastIndexOf("test"));

        StringListImpl stringList1 = new StringListImpl(3);

        stringList1.add(stringList.get(0));
        stringList1.add(stringList.get(1));
        stringList1.add(stringList.get(2));

        System.out.println(stringList1.get(0));
        System.out.println(stringList1.get(1));
        System.out.println(stringList1.get(2));
        System.out.println("stringList.equals(stringList1) = " + stringList.equals(stringList1));
        System.out.println("++++++++++++++++++");
        System.out.println("stringList.size() = " + stringList.size());
        System.out.println("++++++++++++++++++");
        stringList.remove(0);
        System.out.println(stringList.get(0));
        System.out.println(stringList.get(1));
        System.out.println(stringList.get(2));
        System.out.println("++++++++++++++++++");
        System.out.println("stringList.isEmpty() = " + stringList.isEmpty());
        System.out.println("++++++++++++++++++");
        stringList.clear();
        System.out.println("stringList.size() = " + stringList.size());
    }

}
