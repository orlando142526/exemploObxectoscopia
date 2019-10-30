
package exemploobxectos;


public class Alumno {
   
   private String nome;
   private int nota;
   //constructores con parámetro
   public Alumno(String nom,int not){
       nome=nom;
       nota=not;
   }
   //constructor sen parametros
   public Alumno(){
   
   }
   
   
   public void setNota(int not){
       nota=not;
       
   }
   public int getNota(){
       return nota;
       
   }
   public void setNome(String nom){
       nome=nom;
       
   }
   public String getNome(){
       return nome;
   }
   public void amosar(){
       System.out.println("nome"+nome+"nota"+nota);
   }
   
   
}
