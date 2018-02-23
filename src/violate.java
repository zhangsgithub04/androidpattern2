import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ZHANGS on 2/19/2018.
 */
public class violate {
    public violate(){} // not necessary

    public static Map<myPair, Integer> impossible = new HashMap<myPair, Integer>();
    public static void initialize()
    {
        impossible.put(new myPair(1,3), 2);
        impossible.put(new myPair(1,7), 4);
        impossible.put(new myPair(1,9), 5);
        impossible.put(new myPair(2,8), 5);
        impossible.put(new myPair(3,7), 5);
        impossible.put(new myPair(3,9), 6);
        impossible.put(new myPair(4,6), 5);
        impossible.put(new myPair(7,9), 8);
    }


}
