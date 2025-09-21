public class Operadores1{
  public void testRefs(String str, StringBuilder sb){
    str = str + sb.toString();
    sb.append(str);
    str = null;
    sb = null;
  }
  public static void main(String[] args){
    String s = "aaa";
    StringBuilder sb = new StringBuilder("bbb");
    new Operadores1().testRefs(s, sb);
    System.out.println("s="+s+" sb="+sb);
  }
}


/*
¿Cuál será la salida?

- s=aaa sb=bbb
- s=null sb=null
- s=null sb=bbbaaa
- s=aaa sb=bbbaaabbb -----------

s apunta a "aaa"
sb apunta a un StringBuilder con contenido "bbb"

str = str + sb.toString(); // nuevoStr = aaa + bbb --> aaabbb
sb.append(str); // --> bbbaaabbb
sb = null; // solo se mofican las copias locales
*/