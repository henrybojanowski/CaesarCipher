package package_info;

public class morseAlterString {
  
  public static String morseFlip(String s ){
    // this method encrypts string s
    // it does this by flipping the dashes and dots and keeps the spaces the same
    String ret="";
    for(int i=0;i<s.length();i++){ 
      String first_char=s.substring(i,i+1); // tested 
      System.out.println(first_char==" ");
      if(first_char.equals(" ")){
        // add a space
        ret+=" ";
      }
      else if(first_char.equals(".")){
        ret+="-";
      }
      else if(first_char.equals("-")){
        ret+=".";
      }
      
    }
    return ret;
  }
  public static void main(String args[]){
    System.out.println(morseFlip("..  .."));
  }
}
