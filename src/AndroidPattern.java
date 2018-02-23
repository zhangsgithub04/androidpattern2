import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by ZHANGS on 2/19/2018.
 */
public class AndroidPattern {
    static ArrayList<ArrayList<Integer>> paths;
    static ArrayList <Integer> nodes;


    static void initialize()
    {
        violate.initialize();
        paths=new ArrayList<ArrayList<Integer>>();
        nodes=new ArrayList<Integer>();
        for (int i=1; i<=9; i++)
        {
            nodes.add(new Integer(i));

        }

    }
    public AndroidPattern()
    {

    }


    public static boolean can_permute(ArrayList<Integer> path, Integer dest) {
        if (path.contains(dest))
            return false;
        else
            return true;
    }

    public static boolean can_move(ArrayList<Integer> path, Integer dest)
    {
        if (path.contains(dest))
            return false;
      myPair mp=new myPair(path.get(path.size()-1), dest);
      if (!violate.impossible.containsKey(mp))
      {
          return true;
      }
      if (path.contains(violate.impossible.get(mp)))
        {
            return true;

        }

        return false;

    }


    public static int num_paths(int length)
    {
        ArrayList<Integer> path=new ArrayList<Integer>();
        Deque<ArrayList<Integer>> q = new LinkedList<ArrayList<Integer>>();

        for (int i=0; i< nodes.size(); i++)
        {
            ArrayList<Integer> sl=new ArrayList<Integer>();
            sl.add(nodes.get(i));
            q.add(sl);
        }


        while (q.size()>0)
        {
            path=(q.pop());
            if (path.size()==length) {
                paths.add(path);
                continue;
            }

            for (int node=1; node<=9; node++)
                if (can_move(path, node))
                {
                    ArrayList<Integer> newpath=new ArrayList<Integer>();
                    for (Integer item : path) newpath.add(item);
                    newpath.add(node);
                    q.add(newpath);
                }
            }

        return (paths.size());

    }



      static public void findthem()
        {
            int total=0;
            for(int i=1; i<=9; i++)
            {
                int n=num_paths(i);
                total+=n;
                System.out.println(String.valueOf(i)+": "+ String.valueOf(n)+"  " +String.valueOf(Math.log(n)));

            }
            System.out.println("Total: "+String.valueOf(total));

        }


}


