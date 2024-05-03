package Desafio;

public class Lista {
    private No head = null;
    private int size = 0;

    Lista(){}
    
    void add(Empregado empregado){
        size++;
        No node = new No(empregado);
        No atual = head;
        
        if(head == null){
            head = node;
            return;
        }
        
        while(atual.getNext() != null){
            atual = atual.getNext();
        }
        
        atual.setNext(node);
    }
    
    No getIndex(int index){ 
        No agora = head;
        for(int i = 0; i < index; i++){
            agora = agora.getNext();
        }
        
        return agora;
    }

    public int getSize() {
        return size;
    }
    
}
