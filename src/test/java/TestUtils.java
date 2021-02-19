import java.util.ArrayList;
import java.util.List;

public class TestUtils {

    private static String string1 = "T1001,, T1002, T1003";
    private static String string2 = "T1004, , T1005, ";
    private static String string3 = ",T1006,";

    private static String[] array;

    private static List<String> list1 = new ArrayList<>();
    private static List<String> list2 = new ArrayList<>();
    private static List<String> list3 = new ArrayList<>();
    private static List<String> list4 = new ArrayList<>();
    private static List<String> list5 = new ArrayList<>();
    private static List<String> list6 = new ArrayList<>();


    public static String getString1() {
        return string1;
    }

    public static String getString2() {
        return string2;
    }

    public static String getString3() {
        return string3;
    }

    public static String[] getArray(){
        if(array == null){
            array = new String[5];
            array[0] = "T1005, ,T1004,";
            array[1] = " T1008, ,T1004, ,T1005, ";
            array[2] = "T1009, ,T1005, ";
            array[3] = "T1004, ,T1006, T1007, ";
            array[4] = " T1006, ,T1001, ,";
        }

        return array;
    }

    public static List<String> getList1(){
        if(list1.isEmpty()){
            list1.add("T1001");
            list1.add("T1002");
            list1.add("T1003");
        }
        return list1;
    }

    public static List<String> getList2(){
        if(list2.isEmpty()) {
            list2.add("T1004");
            list2.add("T1005");
        }
        return list2;
    }

    public static List<String> getList3(){
        if(list3.isEmpty()) {
            list3.add("T1006");
        }
        return list3;
    }

    public static List<String> getList4(){
        if(list4.isEmpty()) {
            list4.add("T1005, ,T1004,");
            list4.add(" T1008, ,T1004, ,T1005, ");
        }
        return list4;
    }

    public static List<String> getList5(){
        if(list5.isEmpty()) {
            list5.add("list1");
            list5.add("list2");
            list5.add("list3");
        }
        return list5;
    }

    public static List<String> getList6(){
        if(list6.isEmpty()) {
            list6.add("list3");
            list6.add("list1");
            list6.add("list2");
        }
        return list6;
    }
}
