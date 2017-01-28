package package_01;

//использовать компаратор для сортировки счетов
//по фамилиям вкладчиков
//
import java.util.*;

//сравнить последние слова в обеих символьнblх строках

class TComp implements Comparator<String> {
   public int compare(String aStr,String bStr) {
   
   int i = 0, j = 0, k = 0, l = 0;
   
//найти индекс символа,с которого начинается фамилия
  
   try{
	 
	   
     i = aStr.lastIndexOf(" ");
     j = bStr.lastIndexOf(" ");
     k = aStr.substring(i).compareTo(bStr.substring(j));
     
   //Фамилии совпадают,проверить имя и фамилию полностью
     if (k==0){
       //l = aStr.compareTo(bStr);
       //System.out.println(" l="+aStr.compareTo(bStr));
       return aStr.compareTo(bStr);
     }  
     else
       return k;
   }
   catch(StringIndexOutOfBoundsException e){
	 System.out.println(" Перехвачено исключение: "+ e);
	 System.out.println(" aStr:"+aStr);
	// System.out.println(" aStr.substring(i)="+aStr.substring(i));
	 System.out.println(" bStr:"+bStr);
	 System.out.println(" l="+l);
	 System.out.println(" i="+i);  
	 System.out.println(" j="+j);
	 System.out.println(" k="+k);
	 
	 throw e;
	 //return k;
  
   }


   }
}
  
//переопределять метод equals() не требуется
class TreeMapDemo2 {
public static void main(String args[]) {
   //создать древовидное отображение
   TreeMap<String,Double> tm = new TreeMap<String,Double>(new TComp().reversed());
   
//ввести элемент blв древовидное отображение
   
   tm.put("Евгений Пугачев", new Double(1973.73));
   tm.put("Джoн Доу", new Double(3434.34));
   tm.put("Toм Смит",new Double(123.22));
   tm.put("Джейн Бейкер",new Double(1378.00));

   tm.put("Toд Халл",new Double(99.22));
   tm.put("Paльф Смит",new Double(-19.08));
   
//получить множество элементов
   
   Set<Map.Entry<String , Double>> set = tm.entrySet();
   
//вести элемент из множества
   
   for(Map.Entry<String,Double> me : set){
      System.out.print(me.getKey()+":");
      System.out.println(me.getValue());
   }   
   
   System.out.println();
   
//внести сумму 1000 на счет Джона Доу
  
   
  try{ 
   
    double balance = tm.get("Евгений Пугачев");
    System.out.println("balance= "+balance);
    tm.put("Евгений Пугачев",balance+1000);
    System.out.println("Hoвый остаток на счете Евгений Пугачев:"+ tm.get("Евгений Пугачев"));
    
  }
  catch(StringIndexOutOfBoundsException e){
	  System.out.println(" При поиске имени возникла ошибка!");
	  
  }
  
 }

}
