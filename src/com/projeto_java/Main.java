import com.projeto_java.*;
import com.projeto_java.employee.Funcionario;
import com.projeto_java.roles.Gerente;

void main() {
    Funcionario lucas = new Gerente("lucas", "541479989" );

    IO.println(lucas.getDados());

    IO.println("oi");

}
