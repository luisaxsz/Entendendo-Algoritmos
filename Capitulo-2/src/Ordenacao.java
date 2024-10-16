import java.util.ArrayList;

public class Ordenacao {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(10);
        System.out.println(ordenacaoPorSelecao(list));
    }

    public static int buscarMenor(ArrayList<Integer> list) {
        int menorindicie = 0;
        int menorValor = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < menorValor) {
                menorValor = list.get(i);
                menorindicie = i;
            }
        }
        return menorindicie;
    }

    public static ArrayList<Integer> ordenacaoPorSelecao(ArrayList<Integer> list){
        ArrayList<Integer> novoArray = new ArrayList<>(10);
        for(int i = 0; i < list.size() ; i++){
            int menor = buscarMenor(list);
            novoArray.add(list.remove(menor));
        }
        return novoArray;
    }
}
