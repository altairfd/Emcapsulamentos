import clientes.Cliente;

public class SistemaPrincipal {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente();
            cliente1.setNome("Altair");
            cliente1.setEndereco("Rua 1 Numeor 123");
            cliente1.setCpf("12345678910");
            cliente1.setIdade(24);
            cliente1.Status();
            cliente1.validaCpf(true);

    }

}


