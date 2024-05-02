package DesafioEmpregados;
class ListaEmpregados
{
    private NodeEmpregados head = null;
    private int size = 0;

    void add(Empregado empregado)
    {
        size++;
        NodeEmpregados node = new NodeEmpregados(empregado);
        if(head == null){
            head = node;
        }

        NodeEmpregados atual = head;
        while(atual.getNext() != null)
        {
            atual = atual.getNext();
        }
        atual.setNext(node);
    }

    Empregado get(int index)
    {
        NodeEmpregados atual = head;
        for(int i = 0; i <= index; i++)
        {
            atual = atual.getNext();
        }

        return atual.getEmpregado();
    }

    int getSize()
    {
        return size;
    }
}
