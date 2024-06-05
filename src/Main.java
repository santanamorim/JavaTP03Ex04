import java.util.Scanner;

class Usuario {
    private String username;
    private String senha;
    private String email;

    public Usuario() {
    }

    public Usuario(String username, String senha, String email) {
        this.username = username;
        this.senha = senha;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean validarLogin(String username, String senha) {
        return this.username.equals(username) && this.senha.equals(senha);
    }

    @Override
    public String toString() {
        return "Usuário{" +
                "username='" + username + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("usuario123", "senha123", "usuario@example.com");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senhaInput = scanner.nextLine();

        if (usuario.validarLogin(usernameInput, senhaInput)) {
            System.out.println("Login válido!");
        } else {
            System.out.println("Login inválido!");
        }
    }
}