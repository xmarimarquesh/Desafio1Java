package DesafioEmpregados;
class NodeEmpregados
{
    public int indexNode = 0;

    // Atributo next
    private NodeEmpregados next = null;
    NodeEmpregados getNext()
    {
        return next;
    }
    void setNext(NodeEmpregados next)
    {
        this.next = next;
    }

    // Atributo Empregado
    private Empregado value;
    Empregado getEmpregado()
    {
        return value;
    }

    //construtor
    NodeEmpregados(Empregado value)
    {
        this.value = value;
    }
}
