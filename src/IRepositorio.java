import java.util.List;

public interface IRepositorio<T> {

    List<T> List();
    T RetornaPorCodigo(int codigo);
    void Insere(T entity);
    void Apaga(int codigo);
    void Atualiza(int codigo, T entity);
    int ProxCodigo();
}
