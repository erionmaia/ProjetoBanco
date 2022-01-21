import java.util.List;

public class RepositorioCliente implements IRepositorio<Cliente> {

    private List<Cliente> listaCliente;

    @Override
    public List<Cliente> List() {
        return listaCliente;
    }

    @Override
    public Cliente RetornaPorCodigo(int codigo) {
        return listaCliente.get(codigo);
    }

    @Override
    public void Insere(Cliente obj) {
        listaCliente.add(obj);
    }

    @Override
    public void Apaga(int codigo){
       listaCliente.remove(codigo);
    }

    @Override
    public void Atualiza(int codigo, Cliente obj) {
        listaCliente.set(codigo, obj);
    }

    @Override
    public int ProxCodigo() {
        return listaCliente.size();
    }
}
