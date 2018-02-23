/**
 * Created by ZHANGS on 2/19/2018.
 */
public class myPair {

    private final Integer first;
    private final Integer second;

    public myPair(Integer first, Integer second) {
        // normalize the two input, otherwise, we can consider using set
        if (first<second)
        {
            this.first = first;

            this.second = second;
        }
        else
        {
            this.first = second;

            this.second = first;
        }


    }

    public Integer getFirst() { return first; }
    public Integer getSecond() { return second; }

    private int geth()
    {
        return first*10+second;

    }
    @Override
    public int hashCode() {
        //System.out.println("In hashcode");
        return geth();
    }

    @Override
    public boolean equals(Object obj) {
        myPair e = null;
        if(obj instanceof myPair){
            e = (myPair) obj;
        }
        //System.out.println("In equals");
        if(this. geth()== e.geth()){
            return true;
        } else {
            return false;
        }

    }

}