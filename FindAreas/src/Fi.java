
//  ����������  ������������  ��  �����  ����������

abstract class  Figure { 
 double  diml; 
 double  dim2;

Figure(double �,double b) { 
 diml = �; 
 dim2 = b; 
} 

abstract double area();

}

class Rectangle extends Figure{ 
      Rectangle(double a, double b){ 
        super(a,b);
      }      
// ��������������  ����� area() ��� ���������������� 
     double area(){ 
       System.out.println("B �������  ����������������." ); 
       return  diml*dim2;
     }  
} 
class Triangle extends Figure{ 
   Triangle(double �,double b){ 
     super(�,b);
   }
   
//  �������������� �����  area ()  ���  ��������������  ������������ 
   double area(){ 
     System.out.println(" B  �������  ������������ ." ); 
     return  diml*dim2/2;
   }
}   
   
class  FindAreas  { 
    public static void main(String args[]){ 
       // Figure f = new Figure(10,10); 
        Rectangle r = new Rectangle(9,5); 
        Triangle t = new Triangle (10,8); 
        Figure figref; 
        figref = r; 
        System.out.println(" ��o�a�� ����� " + figref.area());
        System.out.println(figref.toString());
        figref = t; 
        System.out.println(" ��o�a�� ����� "+ figref.area());
        System.out.println(figref.toString());
      //  figref = f; 
      //  System.out.println(" ��o�a�� ����� "+ figref.area());
    }
}