public class Switch01 {
    public void switchString(String input){
        switch(input){
            case "a" : System.out.println( "apple" );
            case "b" : System.out.println( "bat" );
                break;
            case "B" : System.out.println( "big bat" );                
            default : System.out.println( "none" );
        }
    }
 
    public static void main(String[] args) throws Exception {
        Switch01 tc = new Switch01();
        tc.switchString("B");
    }
}

// big bat
// none