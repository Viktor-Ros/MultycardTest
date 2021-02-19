import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMethods {

    @Test
    public void testlistIdFromString(){//Тест на получение списка id из строки
        List<String> listExpected = MainClass.listIdFromString(TestUtils.getString2());
        List<String> listActual = TestUtils.getList2();

        Assert.assertEquals("MainClass.listIdFromString() TEST FAILED", listExpected, listActual);
    }

    @Test
    public void testArrayListIdFromStringInArray(){//Тест на получения списка элементов массива с id из строки

        String[] arrayExpected = TestUtils.getArray();
        String string = TestUtils.getString2();
        ArrayList<String> listExpected = MainClass.arrayListIdFromStringInArray(string, arrayExpected);
        List<String> listActual = TestUtils.getList4();

        Assert.assertEquals("MainClass.arrayListIdFromStringInArray() TEST FAILED", listExpected,listActual);
    }

    @Test
    public void testListContains(){//Тест на сравнение элементов в листах
        List<String> listExpected = TestUtils.getList5();
        List<String> listActual = TestUtils.getList6();
        boolean expected = MainClass.listContains(listExpected, listActual);

        Assert.assertEquals("MainClass.listContains() TEST FAILED", expected,true);
    }


}
