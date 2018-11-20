import static java.lang.System.in;	
import static java.lang.System.out;
import java.util.HashMap;
import java.util.Scanner;
public class ClaveMorse {
public static final void main(String args[]){
HashMap<Character,String>cMorse=new HashMap<Character,String>();
cMorse.put('A',".-");
cMorse.put('B',"-...");
cMorse.put('C',"-.-.");
cMorse.put('D',"-..");
cMorse.put('E',".");
cMorse.put('F',"..-.");
cMorse.put('G',"--.");
cMorse.put('H',"....");
cMorse.put('I',"..");
cMorse.put('J',".---");
cMorse.put('K',"-.-");
cMorse.put('L',".-..");
cMorse.put('M',"--");
cMorse.put('N',"-.");
cMorse.put('O',"---");
cMorse.put('P',".--.");
cMorse.put('Q',"--.-");
cMorse.put('R',".-.");
cMorse.put('S',"...");
cMorse.put('T',"-");
cMorse.put('U',"..-");
cMorse.put('V',"...-");
cMorse.put('W',".--");
cMorse.put('X',"-..-");
cMorse.put('Y',"-.--");
cMorse.put('Z',"--..");
cMorse.put('1',".----");
cMorse.put('2',"..---");
cMorse.put('3',"...--");
cMorse.put('4',"....-");
cMorse.put('5',".....");
cMorse.put('6',"-....");
cMorse.put('7',"--...");
cMorse.put('8',"---..");
cMorse.put('9',"----.");
cMorse.put('0',"-----");
cMorse.put(' ',"  ");
HashMap<String,Character>mClave=new HashMap<String,Character>();
mClave.put(".-",'A');
mClave.put("-...",'B');
mClave.put("-.-.",'C');
mClave.put("-..",'D');
mClave.put(".",'E');
mClave.put("..-.",'F');
mClave.put("--.",'G');
mClave.put("....",'H');
mClave.put("..",'I');
mClave.put(".---",'J');
mClave.put("-.-",'K');
mClave.put(".-..",'L');
mClave.put("--",'M');
mClave.put("-.",'N');
mClave.put("---",'O');
mClave.put(".--.",'P');
mClave.put("--.-",'Q');
mClave.put(".-.",'R');
mClave.put("...",'S');
mClave.put("-",'T');
mClave.put("..-",'U');
mClave.put("...-",'V');
mClave.put(".--",'W');
mClave.put("-..-",'X');
mClave.put("-.--",'Y');
mClave.put("--..",'Z');
mClave.put(".----",'1');
mClave.put("..---",'2');
mClave.put("...--",'3');
mClave.put("....-",'4');
mClave.put(".....",'5');
mClave.put("-....",'6');
mClave.put("--...",'7');
mClave.put("---..",'8');
mClave.put("----.",'9');
mClave.put("-----",'0');
out.println("Ingresa el texto o codigo morse");
String entrada=new Scanner(in).nextLine();
entrada=entrada.toUpperCase();
boolean morse=entrada.contains("\\.")||entrada.contains("-"),bandera=true;
for(String elemento:entrada.split(morse?" ":"")){
if(elemento.length()<1){
bandera=!bandera;
if(bandera){out.print(" ");}
continue;
}
Object conversion=(morse?mClave:cMorse).get(morse?elemento:elemento.charAt(0));
if(conversion==null){continue;}
out.print(conversion+(morse?"":" "));
}
}
}
