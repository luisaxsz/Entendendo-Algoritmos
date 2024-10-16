import java.util.ArrayList;

public class Recursao {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
        System.out.println(soma(new ArrayList<>(java.util.List.of(2,4,6))));
    }

    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        }
        System.out.println(n);
        return n * fatorial(n - 1);
    }

    public static int soma(ArrayList<Integer> lista){
        if (lista.size() == 0){
            return 0;
        }
        return lista.get(0) + soma(new ArrayList<>(lista.subList(1, lista.size())));
    }
}
