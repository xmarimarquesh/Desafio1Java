package Desafio;

public class No
{
    private No next = null;
    private Empregado value;

    No(Empregado value){
        this.value = value;
    }

    public Empregado getEmpregado() {
        return value;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }

    public Empregado getValue() {
        return value;
    }

    public void setValue(Empregado value) {
        this.value = value;
    }

}
