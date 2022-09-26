
public class Name {

    private String myFirst = "";
    private String myMiddle = "";
    private String myLast = "";
    
 
     public Name(String first){
       myFirst = first;
 
     }
 
     public Name(String first, String last){
       myFirst = first;
       myLast = last;
     }
 
    public Name (String first, String middle, String last) {
       myFirst = first;
       myMiddle = middle;
       myLast = last;
       fixFirst ( );
       fixMiddle ( );
       fixLast ( );
    }
    
    public String lastFirst ( ) {
 
      if(myLast.equals("") && myMiddle.equals(""))
       return myFirst;
      else if(myMiddle.equals(""))
       return myLast + ", " + myFirst;
 
     return myLast + ", " + myFirst + " " + myMiddle;
    }
    
    public String fullName ( ) {
       return myFirst + " " + myMiddle + " " + myLast;
    }
    
    // bad style
    private void fixFirst ( ) {
       myFirst = myFirst.toLowerCase().trim();
       myFirst = myFirst.substring(0,1).toUpperCase() + myFirst.substring(1);
    }
    
    // bad style
    private void fixMiddle ( ) {
       myMiddle = myMiddle.toLowerCase().trim();
       myMiddle = myMiddle.substring(0,1).toUpperCase() + myMiddle.substring(1);
    }
    
    // bad style
    private void fixLast ( ) {
       myLast = myLast.toLowerCase().trim();
       myLast = myLast.substring(0,1).toUpperCase() + myLast.substring(1);
    }
 
 }