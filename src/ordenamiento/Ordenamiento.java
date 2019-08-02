package ordenamiento;
public class Ordenamiento {
    public static void main(String[] args) {
        int n = 5;
        int ar[] = new int[n], aux;
        
        System.out.println("Los numeros a ordenar son: ");
        for(int i=0;i<n;i++){
            ar[i] = 1+(int)(Math.random()*10);
            System.out.print(ar[i]+ ", ");
        }
        
        for(int i = 0;i<(n-1);i++){
            for(int j=0;j<(n-1);j++){
                if(ar[j]>ar[j+1]){
                  aux = ar[j];
                  ar[j] = ar[j+1];
                  ar[j+1] = aux;
                }
            }
        }
        
        System.out.println("\nOrdenado de manera Creciente: ");
        for(int i=0;i<n;i++){
        System.out.print(ar[i]+ ", ");
        }
        
        System.out.println("\nOrdenado de manera Decreciente: ");
        for(int i=(n-1);i>=0;i--){
            System.out.print(ar[i]+ ", ");
        }
        
    }
}
