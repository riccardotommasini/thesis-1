package phisco.streams.polimi.it.Algebra;

import java.util.HashMap;
import java.util.List;

public class ScanKeys extends HashMap<String, List<Key>> {
   public ScanKeys(ScanKeys ks){
       super(ks);
   }
   public ScanKeys(){
       super();
   }
}
