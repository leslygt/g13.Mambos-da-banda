insert into usr (usr_id, usr_nome, usr_email, usr_ppasse, tipo_usr) values ('1', 'Weza Gomes', 'wezag@hotmail.com', 'caranguejo1', 'cliente');
insert into usr (usr_id, usr_nome, usr_email, usr_ppasse, tipo_usr) values ('2', 'Lueji da Silva', 'lulusilva@gmail.com', 'burnaboy99', 'cliente');
insert into usr (usr_id, usr_nome, usr_email, usr_ppasse, tipo_usr) values ('3', 'Tchissola Jorge', 'tchijorge@gmail.com', '123antonia', 'gestor de loja');
insert into usr (usr_id, usr_nome, usr_email, usr_ppasse, tipo_usr) values ('4', 'Kiame Mataia', 'kmataia@hotmail.com', 'amoravida', 'cliente');
insert into usr (usr_id, usr_nome, usr_email, usr_ppasse, tipo_usr) values ('5', 'Helmer Mavungo', 'helmerhm@hotmail.com', 'deuseamor', 'gestor de loja');
insert into usr (usr_id, usr_nome, usr_email, usr_ppasse, tipo_usr) values ('6', 'Kyara Furtado', 'kikif@hotmail.com', 'eukiara', 'cliente');
insert into usr (usr_id, usr_nome, usr_email, usr_ppasse, tipo_usr) values ('7', 'Joana Machado', 'jomachado@hotmail.com', 'jojo805', 'cliente');
insert into usr (usr_id, usr_nome, usr_email, usr_ppasse, tipo_usr) values ('8', 'Maria Alonso', 'mariaal@gmail.com', 'maridolove', 'cliente') ;
insert into usr (usr_id, usr_nome, usr_email, usr_ppasse, tipo_usr) values ('9', 'Laura Albino', 'laura12@hotmail.com', 'albinola', 'gestor de loja');
insert into usr (usr_id, usr_nome, usr_email, usr_ppasse, tipo_usr) values ('10', 'Emanuel Basto', 'emanubab@hotmail.com', 'comidaboa', 'cliente');
insert into usr (usr_id, usr_nome, usr_email, usr_ppasse, tipo_usr) values ('11', 'Paulo Ribeiro', 'ribasant@gmail.com', 'comogosto', 'cliente');
insert into usr (usr_id, usr_nome, usr_email, usr_ppasse, tipo_usr) values ('12', 'Nelson Pereira', 'nelsonp@gmail.com', 'trabalho1', 'gestor de loja');
insert into usr (usr_id, usr_nome, usr_email, usr_ppasse, tipo_usr) values ('13', 'Margarida Barbosa', 'margaridab@hotmail.com', 'guidinha', 'cliente'); 
insert into usr (usr_id, usr_nome, usr_email, usr_ppasse, tipo_usr) values ('14', 'Antonio Macedo', 'antoniomacedo@hotmail.com', 'antonio213', 'gestor de loja');

insert into cliente (cli_telefone, cli_endereco, cli_cpostal, usr_id_cli) values ('933446890', 'Lisboa Rua das Beiras', '1675-291', '1');
insert into cliente (cli_telefone, cli_endereco, cli_cpostal, usr_id_cli) values ('944681398', 'Lisboa Rua do Arsenal', '1100-039', '2');
insert into cliente (cli_telefone, cli_endereco, cli_cpostal, usr_id_cli) values ('927332145', 'Queluz Rua 1', '2745-011', '3');
insert into cliente (cli_telefone, cli_endereco, cli_cpostal, usr_id_cli) values ('917654321', 'Lisboa Travessa do Maldonado', '1100-329', '4');
insert into cliente (cli_telefone, cli_endereco, cli_cpostal, usr_id_cli) values ('931876349', 'Lisboa Avenida Almirante Reis', '1150-017', '5');
insert into cliente (cli_telefone, cli_endereco, cli_cpostal, usr_id_cli) values ('933217895', 'Agualva-Cacém Rua do Cotão Novo', '2735-500', '6');
insert into cliente (cli_telefone, cli_endereco, cli_cpostal, usr_id_cli) values ('965543822', 'Lisboa Rua do Rio Seco', '1300-498', '7');
insert into cliente (cli_telefone, cli_endereco, cli_cpostal, usr_id_cli) values ('965784432', 'Lisboa Rua dos Anjos', '1169-040', '8');
insert into cliente (cli_telefone, cli_endereco, cli_cpostal, usr_id_cli) values ('911278965', 'Lisboa Rua Jerónimo Corte Real', '1700-245', '9');

insert into gestordeloja (gest_id, gest_telefone, usr_id_gest) values ('1', '987332145', '1');
insert into gestordeloja (gest_id, gest_telefone, usr_id_gest) values ('2','987654321', '2');
insert into gestordeloja (gest_id, gest_telefone, usr_id_gest) values ('3', '961084376', '3');
insert into gestordeloja (gest_id, gest_telefone, usr_id_gest) values ('4', '934567890', '4');
insert into gestordeloja (gest_id, gest_telefone, usr_id_gest) values ('5','964359577', '5');


insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Moamba', '1.70', 'Ginguba/Amendoim torrada moída','500');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Fuba de bombó', '2', 'Farinha de mandioca', '1');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Oleo de palma', '1', 'Azeite de dendê', '1');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Farinha musseque', '3', 'Farinha de mandioca torrada', '1');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Mucua', '2.5', 'Fruto do embondeiro', '1');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Muteta', '1.90', 'Semente de abobora moída', '500');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Bagre fumado', '7', 'Bagre seco defumado', '500');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Carne seca', '8', 'Carne de vaca com gordura seca', '400');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Gimboa', '0.75', ' Folha da gimboa', '200');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Kizaca', '2', 'Folha de mandioca triturada', '1');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Rama de batata', '0.75', 'Folha da batata doce', '200');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Fuba de milho', '2', 'Farinha de milho', '1');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Banana pão', '0.50', 'Variedade de banana de cerca 30cm', '1');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Catato', '4', 'Largata que vive no topo das palmeiras', '250');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Dendem', '3', 'Fruto do dendezeiro', '200');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Ginguba torada', '0.10', 'Ginguba/Amendoim torrado', '15');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Paracuca', '0.20', 'Ginguba/Amendoim torrado enrolado em açucar', '15');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Sape-Sape', '3', 'Fruto que pertence a familia das anonáceas', '1');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Carambola', '2', 'Fruto da caramboleira', '1');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Tambarino', '1', 'Fruto da tamarineira', '1');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Maboque', '1', 'Fruto do maboqueiro', '1');
insert into produto (prod_nome, prod_preco, descricao, quantidade) values ('Loengo', '1', 'Fruto roxo proximo ao preto', '5');

								
insert into loja (loja_nome, loja_telefone, loja_endereco, loja_cpostal, gest_id_loja, img_url, latitude, longitude) values ('Tudo Aqui', '935678932', 'Lisboa Rua da cascalheira', '1300-122', '1', 'https://www.verangola.net/va/images/cms-image-000022842.png', '38.710424', '-9.199509');
insert into loja (loja_nome, loja_telefone, loja_endereco, loja_cpostal, gest_id_loja, img_url, latitude, longitude) values ('Angolan Foods', '933458960', 'Lisboa Rua 10', '1300-174', '2', 'https://3.bp.blogspot.com/-xNeUfwhLjNg/VHYpr_zNTJI/AAAAAAAAN8Q/aCCjZNhECtE/s1600/le%2Bchalet%2B6.jpg', '38.708255', '-9.195539');
insert into loja (loja_nome, loja_telefone, loja_endereco, loja_cpostal, gest_id_loja, img_url, longitude) values ('Cozinha Angolana','933332109', 'Lisboa Travessa da Ajuda', '1300-021', '3', 'https://www.verangola.net/va/images/cms-image-000023010.jpg','38.756672', '-9.270527');
insert into loja (loja_nome, loja_telefone, loja_endereco, loja_cpostal, gest_id_loja, img_url, longitude) values ('Sabores da Banda','965300594', 'Queluz Avenida 1º de Maio', '2745-832', '4', 'https://www.impala.pt/wp-content/uploads/fly-images/734733/27477619-9999x9999-lt.jpg','38.745765', '-9.142119');
insert into loja (loja_nome, loja_telefone, loja_endereco, loja_cpostal, gest_id_loja, img_url, longitude) values ('Comida do Mangope','963617504', 'Lisboa Travessa Henrique Cardoso', '1700-227', '5','https://www.jornaldeangola.ao/fotos/frontend_1/noticias/1589359830_cesta_basica.jpg' ,'38.9534581', '-9.2294892');

insert into lojaproduto (loja_id_lp, prod_id_lp) values (7, 68);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (7, 69);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (7, 70);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (7, 71);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (7, 72);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (7, 79);


insert into lojaproduto (loja_id_lp, prod_id_lp) values (8, 73);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (8, 74);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (8, 75);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (8, 76);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (8, 77);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (8, 81);

insert into lojaproduto (loja_id_lp, prod_id_lp) values (9, 69);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (9, 78);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (9, 79);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (9, 80);

insert into lojaproduto (loja_id_lp, prod_id_lp) values (10, 82);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (10, 83);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (10, 84);

insert into lojaproduto (loja_id_lp, prod_id_lp) values (12, 72);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (12, 85);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (12, 86);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (12, 87);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (12, 88);
insert into lojaproduto (loja_id_lp, prod_id_lp) values (12, 89);