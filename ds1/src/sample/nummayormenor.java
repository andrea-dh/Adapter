package sample;

public class nummayormenor{
    public static void main(String[] args) {
            //ordenar 3 caracteres
            char a='d';
            char b='a';
            char c='s';
            System.out.println(a+" , "+ b +" , "+c);
            if(a<b && a<c) {
                System.out.println("a es menor que todas");
            }
            else{
                if(b<c) {
                    System.out.println(" b es menor que todas");
                    char temp=b;
                    b=a;
                    a=temp;
                }
                else{
                    System.out.println("c es menor que todas");
                    char temp=c;
                    c=a;
                    a=temp;
                }
            }
            System.out.println(a+" , "+ b +" , "+c);
            if(b<c){
                System.out.println(" b es menor que c");
            }
            else{
                System.out.println("c es menor que b");
                char temp=c;
                c=b;
                b=temp;
            }
            System.out.println(a+" , "+ b +" , "+c);


        }


        }

