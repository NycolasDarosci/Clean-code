import java.util.ArrayList;
import java.util.List;

/*
    MEANINGFUL NAMES
*/

public class name {
    public static void main(String[] args) {
        
    }

    /*
        - que valores estão dentro da variável 'list'? 
        - qual o significado do '4'?
        - como usaria a lista retornada? 
    */
    public List<int[]> getThem() {
        List<int[]> list = new ArrayList<int[]>();

        for(int[] x : list) {
            if(x[0] == 4) {
                list.add(x);
            }
        }
        return list;
    }
}
