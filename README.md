![cms_files_10224_1677509014Prancheta_1](https://github.com/enivaldo20/Challenge-hotel-alura/assets/128000113/e4ab959a-05ff-452e-a4b7-787a1474c6aa)
# Challenge-hotel-alura

Hotel Alura
Challenge ONE - alura (Java)
Desafio:
    1. Criar uma aplicação para Desktop com conexão ao Banco de Dados Requisitos do desafio: 
    2. Sistema de autenticação de usuários para que somente usuários pertencentes ao hotel possam acessar o sistema 
    3. Permitir criar, editar e excluir uma reserva para clientes 
    4. Pesquisar na base de dados toda a informação de clientes e reservas 
    5. Registrar, editar e excluir os dados dos hóspedes 
    6. Calcule o valor da reserva com base no número de dias da reserva e uma taxa diária com o valor atribui­do por você na moeda Real. Por exemplo, se tivermos uma reserva de 3 dias e o valor de nossa diária for de R$20 devemos multiplicar esses 3 dias pelo valor da diária, totalizando R$60. Tudo isso deve ser feito automaticamente e mostrado ao usuário antes de salvar a reserva 
    7. Banco de dados para armazenar todos os dados solicitados anteriormente
 Tecnologias utilizadas:
    8. Java 
    9. Eclipse 
    10. MySQL
 Requisitos para utilizar o aplicativo:
    11. Java 
    12. MySQL Server (no localhost:3306)
 Usuario e senha:
    13. Os mesmos utilizados no Banco de Dados (que foram inseridos na instalação do MySQL)
Download do aplicativo: \>>Hotel Alura<<
Configurando o MySQL:
    14. Criando o Banco de Dados (O nome deve ser alura_hotel) `sql CREATE DATABASE alura_hotel; ` 
    15. Acessando o Banco de Dados criado
USE alura_hotel;
    16. Criando a Tabela de preços da diária
CREATE TABLE prices(id VARCHAR(50) NOT NULL,
    price DECIMAL(10, 2) NOT NULL, PRIMARY KEY(id)) ENGINE InnoDB;
    17. Inserindo o valor da diária (Pode ser o valor que desejar) sql INSERT INTO prices(id, price) VALUES('day', 349.90); 
    18.  
    19. Criando a Tabela de reservas sql CREATE TABLE reservations(id BIGINT NOT NULL AUTO_INCREMENT, check_in DATE, check_out DATE, price DECIMAL(10, 2), pay_method VARCHAR(50), PRIMARY KEY(id)) ENGINE InnoDB; ` 
    20. Criando a Tabela de Hospedes  sql CREATE TABLE guests(id BIGINT NOT NULL AUTO_INCREMENT, first_name VARCHAR(50), last_name VARCHAR(50), birth_date DATE, country VARCHAR(50), phone VARCHAR(50), reserve_id BIGINT, PRIMARY KEY(id), FOREIGN KEY(reserve_id) REFERENCES reservations(id)) ENGINE InnoDB; `

