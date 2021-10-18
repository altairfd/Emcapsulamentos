import clientes.Cliente;

public class SistemaPrincipal {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente();
            cliente1.setNome("Altair");
            cliente1.setEndereco("Rua 1 Numeor 123");
            cliente1.setCpf("12345678910");
            cliente1.setIdade(24);
            System.out.println(cliente1.getNome());
            System.err.println(cliente1.getEndereco());
            System.err.println(cliente1.getCpf());
            System.err.println(cliente1.getIdade());
            cliente1.validaCPF(cliente1.getCpf());

        Cliente cliente2 = new Cliente();
            cliente1.setNome("Fernada");
            cliente1.setEndereco("Rua 1 Numeor 123");
            cliente1.setCpf("22345678910");
            cliente1.setIdade(24);
            System.out.println(cliente1.getNome());
            System.err.println(cliente1.getEndereco());
            System.err.println(cliente1.getCpf());
            System.err.println(cliente1.getIdade());
            cliente1.validaCPF(cliente1.getCpf());


            

    }   


