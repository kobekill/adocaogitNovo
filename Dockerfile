FROM tomcat: 8.5
MANUTENÇÃO Luis Felipe Loch

EXECUTAR o apt-get update && \
  apt-get install -y \
    ferramentas de rede \
    árvore \
    vim && \
  rm -rf / var / lib / apt / lists / * && apt-get clean && apt-get purge
  
  EXECUTAR o apt-get update && \
    apt-get install -y openjdk: 8 && \
    apt-get install -y ant && \
    apt-get clean;

EXECUTAR o apt-get update && \
    apt-get install ca-certificate-java && \
    apt-get clean && \
    atualizar-ca-certificados -f;

ENV JAVA_HOME / usr / lib / jvm / java-8-openjdk-amd64 /
EXECUTAR JAVA_HOME de exportação

EXECUTAR eco "export JAVA_OPTS = \" -Dapp.env = teste \ " " > /usr/local/tomcat/bin/setenv.sh
COPY pkg / demo.war /usr/local/tomcat/webapps/demo.war

EXPOSIÇÃO 8080
CMD [ "catalina.sh" , "executar" ]
