pipeline {
    agente {
        janela de encaixe {
            imagem ' maven: 3 alpine '
            args ' -v /root/.m2:/root/.m2 '
        }
    }
    opções {
        skipStagesAfterUnstable ()
    }
    estágios {
        stage ( ' Test ' ) {
            passos {
                sh ' mvn test '
            }
         }
        stage ( ' Results ' ) {
            passos{
                roteiro{
                  def logz = currentBuild . rawBuild . getLog ( 1000 );
                  def resultado = logz . encontre {it . contém ( ' Sucesso ' )}
                  se (resultado) {
                    erro (resultado ' FAILING TO DUE '  + )
                }
            }
           }
        }         
    }
}
