package hierarquia;
public class ManadaVirgula extends Manada {
String respectiva="";
@Override
public String estourar() {
for(Animal a:animais)
{
respectiva+=a.fazerBarulho()+",";
}
return respectiva;
}
}
