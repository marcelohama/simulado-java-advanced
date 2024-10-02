# Simulado para o Check-Point 2 | FIAP

Este repositório traz a estrutura base na qual deve ser implementado o projeto de simulação de avaliação para o curso de Java Advanced com Spring Framework.

## Pre-Requisitos

- IntelliJ IDEA ou outra IDE de sua preferência (Eclipse, Netbeans, Visual Studio, etc)
- Maven v3.8.7
- Java (JDK 17), com SpringBoot 3.0.1
- Um servidor SQL configurado e sua URL/Porta de conexão

## Setup do Build/Run

1. Crie um novo projeto com sua IDE a partir do código fonte deste repositório como um projeto Maven;
2. Verifique se o projeto possui uma JDK configurada, indo em *Project Structure/Project/SDK*, selecionando/baixando o graalvm-jdk-17;
3. Vá em *Edit Configuration* e adicione uma nova config *Maven*, setando o campo *Run* com a seguinte linha:


    -Dmaven.test.skip=true package

5. Faça o build do projeto executando a linha de config anteriormente criada para gerar o .jar;
5. Vá em *Edit Configuration* e adicione uma outra nova config *JAR Application*, setando o campo *Path to JAR* com a seguinte linha:


    <diretório raíz do projeto>\target\simulado-0.0.1-SNAPSHOT.jar

7. Ainda na config do *JAR Application* adicione o seguinte comando no *Before Launch*:


    -Dmaven.test.skip=true package

8. Faça as devidas configurações para o banco de dados no *application.properties*.

## Instruções Gerais

Este projeto possui uma estrutura base para codificação, na qual temos já presentes:

- As classes entidades *Owner* e *Blog*, com relacionamento 1 para N;
- As interfaces de repositórios para as entidades *Owner* e *Blog*, com alguns exemplos de queries JPQL;
- Um *OwnerController* com implementações mínimas de criação e obtenção de registros;
- Arquivo POM com as dependências já configuradas;
- Arquivo *application.properties* com campos que DEVEM ser preenchidos;
- Arquivo *postman_collection* com exemplos de registros de chamadas;
- Este arquivo *README* com instruções gerais.

Você deve seguir as instruções presentes na próxima seção para realizar este simulado.

## Temas do Simulado

1. 