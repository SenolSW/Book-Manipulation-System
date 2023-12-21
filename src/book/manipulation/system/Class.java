/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.manipulation.system;

/**
 *
 * @author Anonymous
 */
public class Class {
    public String[] ISBNnNo = new String[1000];
    public String[] Title =new String[1000];
    public String[] Author = new String[1000];
    public int[] Price = new int[1000];
    public int elements=0;

//Insert
    
    public void Insert(String N,String T,String A,int P){
        ISBNnNo[elements] = N;
        Title[elements] = T;
        Author[elements] = A;
        Price[elements] = P;
        elements++;
    }

//Find Data
    
    public int FD(String SV){
        int x;
        for(x=0; x<elements; x++ ){
            if(ISBNnNo[x].equals(SV))
                break;
            }
            return x;
        }
     public int getElements(){
         return elements;
     }    

//Update
     
    public boolean Update(String N,String T,String A,int P){
        int x = FD(N);
            if(x==elements){
                return false;
            }else{
                ISBNnNo[x]=N;
                Title[x]=T;
                Author[x]=A;
                Price[x]=P;
                return true;
            }
        }

//Delete
    
    public boolean Delete(String SV){
        int x = FD(SV);
            if(x==elements){
                return false;
            }else{
                for(int y=x; y<elements-1; y++ ){
                    ISBNnNo[y]=ISBNnNo[y+1];
                    Title[y]=Title[y+1];
                    Author[y]=Author[y+1];
                    Price[y]=Price[y+1];
                }
                elements--;
                return true;
            }
        }    


//Display
    
    public String Display(){
        String result="";
        for(int x=0; x<elements;x++){
            result +=ISBNnNo[x] + ",";
            result +=Title[x] + ",";
            result +=Author[x] + ",";
            result +=Price[x] +"\n";
        }
        return result;
    }

    
//Search
    
    public String Search(String N,String T,String A){
        int x;
        String result ="";
        for(x=0; x<elements; x++ ){
            if(ISBNnNo[x].equals(N)||Title[x].equalsIgnoreCase(T)||Author[x].equalsIgnoreCase(A)){
                result +=ISBNnNo[x] + ",";
                result +=Title[x] + ",";
                result +=Author[x] + ",";
                result +=Price[x] +"\n";
                break;
         }
        }
        return result;
    }

//Duplicate Search    
     public boolean DuplicateSearch(String SV){
         int count = 0;
         for(int x=0; x<elements; x++ ){
             if(ISBNnNo[x].equals(SV))
                 count ++;
         }
         if(count==0){
             return false;
         }else{
             return true;
         }
     }
     
//Ascending Sort
     
     public void AscendingSort(){
      int M;
      String N; String T; String A;
      int y;
      for(int x=1; x<elements; x++){
          M = Price[x];          
          N = ISBNnNo[x];
          T = Title[x];
          A = Author[x];        
          y=x;
          while(y>0 && Price[y-1]>=M){
                ISBNnNo[y]=ISBNnNo[y-1];
                Title[y]=Title[y-1];
                Author[y]=Author[y-1];
                Price[y]=Price[y-1];                
                --y;
          }
          ISBNnNo[y] = N;
          Title[y] = T;
          Author[y] = A;          
          Price[y] = M;
      }
    }

    //Descending Sort     
    public void DescendingSort(){
      int M;
      String N; String T; String A;      
      int y;
      for(int x=1; x<elements; x++){
          M = Price[x];
          N = ISBNnNo[x];
          T = Title[x];
          A = Author[x];           
          y=x;
          while(y>0 && Price[y-1]<=M){
                ISBNnNo[y]=ISBNnNo[y-1];
                Title[y]=Title[y-1];
                Author[y]=Author[y-1];              
                Price[y]=Price[y-1];
                --y;
          }
          ISBNnNo[y] = N;
          Title[y] = T;
          Author[y] = A;           
          Price[y] = M;
      }
    }
}
