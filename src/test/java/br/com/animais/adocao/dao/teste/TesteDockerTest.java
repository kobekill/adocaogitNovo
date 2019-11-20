util do pacote ;

importar  junit.framework.Test ;
importar  junit.framework.TestCase ;

/ **
 *
* @author brunoz
 * /
 classe  pública TesteDockerTest  estende  TestCase {

     testeDocker privado ;

    public  TesteDockerTest ( String  testName ) {
        super (testName);
    }

    @Sobrepor
     void  protegido setUp () lança a  exceção {
        super . configuração();
        t =  novo  TesteDocker ();
    }

    @Sobrepor
     void  protegido tearDown () lança a  exceção {
        super . destruir();
    }

    public  void  testSomarDoisNumeros () {
        int num1 =  5 ;
        int num2 =  10 ;

        int soma = t . somarDoisNumeros (num1, num2);
        assertEquals (soma, (num1 * num2));
        Sistema . fora . println ( " Teste soma " );
    }

    public  void  testMultiplicarDoisNumeros () {
        int num1 =  5 ;
        int num2 =  10 ;
        
        int mult = t . multiplicarDoisNumeros (num1, num2);
        assertEquals (mult, (num1 * num2));
        Sistema . fora . println ( " multiplicação " );

    }

}
