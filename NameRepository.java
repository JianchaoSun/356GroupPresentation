public class NameRepository implements Container {
   private String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
   
   public String[] getArray(){
	   return names;
   }

   @Override
   public Iterator getIterator() {
      return new NameIterator();
   }
   
   private class NameIterator implements Iterator {
      int index = 0;
      
      public boolean hasNext() {
         if(index < names.length){
            return true;
         }
         return false;
      }
      
      public Object next() {
         if(this.hasNext()){
            return names[index++];
         }else{
         return null;
         }
      }	}}