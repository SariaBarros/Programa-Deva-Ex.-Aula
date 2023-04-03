import java.util.List;

public class ServicoUsuario {
    //Interativa
    public int somaIdades(List<Usuario> usuarios){
        int somaIdades = 0;

        for(Usuario usuario: usuarios){
            somaIdades+=usuario.getIdade();
        }

        return somaIdades;
    }

    //Funcional
    public int somaIdadeFuncional(List<Usuario> usuarios){
        return usuarios.stream().mapToInt(usuario -> usuario.getIdade()).sum();
    }
}
