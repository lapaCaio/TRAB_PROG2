package lapa.caio.questao03;

public class Login {
    private String usuario; // Determina o nome do usuário
    private String senha; // Determina a senha do usuário.

    public Login(String _usuario, String _senha) {
        setUsuario(_usuario);
        setSenha(_senha);
    }

    public void setSenha (String _senha) {
        this.senha = _senha;
    }
    public void setUsuario (String _usuario) {
        this.usuario = _usuario;
    }

    public boolean fazerLogin(String _usuario, String _senha){
        try {
            if (!this.usuario.equals(_usuario)) {
                throw new Exception("Usuário incorreto");
            }
            if (!this.senha.equals(_senha)) {
                throw new Exception("Senha incorreta");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
