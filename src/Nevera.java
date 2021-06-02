import java.util.Collection;
import java.util.HashSet;


//BY:DYEGO GRANDA
public class Nevera {
    private final Collection<String> gominolas = new HashSet<>();

    public boolean put(String producto){
        return gominolas.add(producto);
    }

    public boolean contains(String item){
        return gominolas.contains(item);
    }

    public void take (String item) throws  Exception{
        boolean resultado = gominolas.remove(item);
        if (!resultado){
            throw new Exception("NO TENEMOS ESTE PRODUCTO : " + item + " EN NUESTRA NEVERA");
        }
    }
}
