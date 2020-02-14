import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Data {
    public static void main(String[] args) {
        byte b = 23;
        short s = 3333;
        int i = 9999;
        long l = 32322;

        // 加上 l表示Long
        long a = 323232444444L;


        int[] arr = {1, 2, 3, 4};
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[4];

        List list = new List();


        arr1 = arr2;
        System.out.println(a);


        ArrayList<Data> datas = new ArrayList();
        for (int j = 0; j < 10000; j++) {
            datas.add(new Data());
        }


        int[] m = {};
        System.out.println(m);

    }
}
