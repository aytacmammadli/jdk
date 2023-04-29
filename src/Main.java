public class Main {
    public static void main(String[] args) {
//***************Unary operators************************//
        //  ++
        //   --
        // !

        int a=10;

     //   System.out.println(a++); // capa verdiyi=10; 11
     //   System.out.println(++a);

      //  System.out.println(a--);
      //  System.out.println(--a);

//***************Arithmetic operators************************//

//    + - * / %


      // int netice=a1%b1;
       // System.out.println(netice);


        //***************Shift operators************************//
        //Left shift  >>
        //Right shift  <<
        //MultipleRight shift <<<


        int a1=9;
        int b1=9;


        System.out.println(a1>>b1);

        //***************Relotional operators************************//


//  <   >  <=  >=  == !=             <=  <+=
int eded1=9;
int eded2=9;
if(eded2>=eded1){
    System.out.println("dogrudur");
}

//***************Bitwise operators************************//

//  & |

        int eded3=5;
        int eded4=4;
        System.out.println(eded3& eded4);

        System.out.println(eded3 | eded4);


        //***************Logical operators************************//

        //  && ||


        boolean logical=true || false;
        System.out.println(logical);


        //***************Assigment operators************************//

// =   += -=
     a+=5;
     a=a+5;
    int cem = 0;
    cem+=eded3;
    cem=cem+ eded3;
    cem-=eded4;
    cem=cem-eded4;
    }
}