package dio.aulapostgresConexao.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Tabela_de_Usuarios") // nome da nossa tabela
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "user_id") // coluna terá o nome user_id e os valores serão recebidos pelo atributo id // usamos quando queremos que a coluna tenha um nome diferente do atributo
    private Integer id;
    /*Nosso integer id(atributo) da coluna "user_id" sera gerenciado(GeneratedValue) pelo proprio banco de dados a estrategia utilizada, o tipo do generate sera
    Identity, isto é, um identificador, para cada usuario que adicionarmos ao nosso banco. */
    @Column(length =  50, nullable = false) // tamanho máximo de caracteres da nossa coluna e nao pode ser null
    private String name;
    @Column(length =  100, nullable = false)
    private String username;
    @Column(length =  20, nullable = false)
    private  String password;


    // Get and Set //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() { // método de retorno do usuario
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
