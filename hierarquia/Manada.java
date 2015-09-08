package hierarquia;
import java.util.List;
import java.util.LinkedList;
public abstract class Manada {
protected List<Animal>animais=new LinkedList<Animal>();
public abstract String estourar();
public void adicionarAnimal(Animal animal)
{
animais.add(animal);
}
}
