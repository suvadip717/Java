
public class Butterfly {
  public static void main(String[] args) {
    int n = 4;
    // Upper section
    for(int i=1; i<=n; i++){
        // First elements
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        // Spaces
        for(int k=1; k<=2*(n-i); k++){
            System.out.print("  ");
        }
        // last elements
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    // Lower section
    for(int i=n; i>=1; i--){
        // First elements
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        // Spaces
        for(int k=1; k<=2*(n-i); k++){
            System.out.print("  ");
        }
         // last elements
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
  }  
}
