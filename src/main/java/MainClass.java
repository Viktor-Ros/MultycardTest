import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

    /**
     *
     * Метод для получения списка элементов массива с id из строки
     *
     * @param string
     * @param array
     * @return
     */
    public static ArrayList<String> arrayListIdFromStringInArray(String string, String[] array){

        List<String> idFromStringList = listIdFromString(string);
        ArrayList<String> idFromStringInArrayList = new ArrayList<>();

        for (String el : array) {
            if(listContains(idFromStringList, listIdFromString(el))){
                idFromStringInArrayList.add(el);
            }
        }
        listSaveToCSV(idFromStringInArrayList);
        return idFromStringInArrayList;
    }

    /**
     *
     * Метод для проверки содержания списка в списке
     *
     * @param list1
     * @param list2
     * @return
     */
    public static Boolean listContains(List<String> list1, List<String> list2){

        for(String el : list1){
            if(!list2.contains(el)){
                return false;
            }
        }
        return true;
    }

    /**
     *
     * Метод для получения списка id из строки
     *
     * @param string
     * @return
     */
    public static List<String> listIdFromString(String string){

        List<String> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);

            if(ch != ' ' && ch != ','){
                stringBuilder.append(ch);
            }

            if(((ch == ' ' || ch == ',') || i == string.length() - 1) && stringBuilder.length() != 0){
                list.add(new String(stringBuilder));
                stringBuilder.setLength(0);
            }
        }
        return list;
    }

    /**
     *
     * Метод для выгрузки списка в файл .csv
     *
     * @param list
     */
    public static void listSaveToCSV(List<String> list) {

        File dir = new File("src/main/result");
        dir.mkdirs();
        File resultFile = null;
        try {
            resultFile = File.createTempFile("result",".csv", dir);
            FileWriter fileWriter = new FileWriter(resultFile);
            for(String el : list){
                fileWriter.write(el + '\n');
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}