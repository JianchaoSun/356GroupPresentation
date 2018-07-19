
public class Driver {
	
   public static void main(String[] args) {
      NameRepository namesRepository = new NameRepository();
      Iterator it = namesRepository.getIterator();
   // Using old way      
      for(String st: namesRepository.getArray()){
    	  st ="bob";
    	  System.out.println(st);
      }
   //Using iterator pattern   
      System.out.println("---use pattern---");
      while(it.hasNext()){
   // 	  it.next() ="bob";
    	  System.out.println(it.next());
      }
   }
}