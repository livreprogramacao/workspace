package mauexemplo.cliente;

public class Cliente
{
    // dados do cliente, como Nome, CPF, etc.
    // outros métodos
 
    public decimal CalcularDescontoPara(Venda venda)
    {
        if (venda.FormaDePagamento == FormaDePagamento.AVista)
        {
            if (venda.Total > 2000m)
                return venda.Total * 0.2;
            return venda.Total * 0.1;
        }
        return 0m;
    }

}
