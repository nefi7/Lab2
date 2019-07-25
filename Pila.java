
package lab2;




public class Pila {
    String arr[];
    
    int top;
    
    
    
    public Pila()
    {
       
       arr=new String [2];
       top=0;// pila vacia 
    }
    public boolean empty()
    {
        if(top==0){
            return true;// si la pila esta vacia retorna verdadero
        }
        else {
            return false;// si no retor falso
        }
    }
    public void push (String str)
    {   if(top<arr.length){
        arr[top]=str;
        top++;//aumenta porque el proximo elemento tiene que estar arriba del que ya se ingreso
    }
        else {
        String temporal[]=  new String[arr.length+2];
                for (int i = 0; i < arr.length; i++) {
                    temporal[i]=arr[i];
                }
                arr=temporal;
                arr[top]=str;
                top++;
    }
    }
   public String peek()
   {
       if (top>0){
        return arr[top-1]; }
       else{
        return null;
       }
   }
   public String pop()
   {
     String temp=null;
    if(top<0){
        temp=arr[top-1];
        arr[top-1]=null;
        top--;
    } 
    return temp;
   }      
    
    }

    

