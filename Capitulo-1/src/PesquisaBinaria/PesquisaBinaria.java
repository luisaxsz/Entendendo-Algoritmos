package PesquisaBinaria;

public class PesquisaBinaria {
    public static void main(String[] args){
        int[] list = {1,3,5,7,9};
        System.out.println(pesquisaBinaria(list,3));
        System.out.println(pesquisaBinaria(list,-1));
    }

    public static Object pesquisaBinaria(int[] list,int item){
        int baixo = 0;
        int alto = list.length - 1;

        while(baixo <= alto){
            int meio = (baixo + alto) / 2;
            int chute = list[meio];
            if(chute == item){
                return meio;
            }
            if(chute > item){
                alto = meio - 1;
            }else{
                baixo = meio + 1;
            }
        }
        return null;
    }
}
