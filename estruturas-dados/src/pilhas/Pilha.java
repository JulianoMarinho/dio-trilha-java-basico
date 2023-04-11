package pilhas;

public class Pilha {

    No refNoEntradaPilha = null;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }


    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;//guarda a referencia de entrada do No do topo
        refNoEntradaPilha = novoNo;//pega a referencia do no do topo e aponta para o novo no empilhado
        refNoEntradaPilha.setRefNo(refAuxiliar);//e diz que este novo no se refere a antiga referencia de topo
    }

    public No pop(){
        if(!isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";
        No noAuxiliar = refNoEntradaPilha;
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
      
        }
        stringRetorno += "============";
        return stringRetorno;
        
    }
}
