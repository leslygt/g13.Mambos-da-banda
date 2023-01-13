CREATE TYPE tipo_usr_enum AS ENUM ('cliente', 'gestor de loja');
create table usr
(
	usr_id SERIAL not null,
	usr_nome VARCHAR(60),       	--nome do user
	usr_email VARCHAR(30),  		--email do user
	usr_ppasse CHAR(8),     		--palavra passe do user 
	tipo_usr tipo_usr_enum,          --tipo de user onde apenas pode ser cliente ou gestor de loja
	primary key (usr_id)
);

create table cliente 
(
	cli_id SERIAL not null,  
	cli_telefone char(12),    		--telefone do cliente
	cli_endereco VARCHAR(60),  		--cliente endereço (cidade, rua)
	cli_cpostal char(9), 		--código postal do cliente
	usr_id_cli int not null,  	 	--fk para user
	primary key (cli_id)
);

create table gestordeloja 
(
	gest_id SERIAL not null,
	gest_telefone char(9),    		--telefone do gestor/proprietario da loja
	usr_id_gest int not null,  		--fk para user
	primary key (gest_id)
);

create table produto
(
	prod_id SERIAL not null,
	prod_nome VARCHAR(60), 		 --nome do produto
	prod_preco float,  			 --preço do produto 
	descricao VARCHAR (130),  	 --descrição do produto 
	quantidade float,  			 --quantidade do produto 
	primary key (prod_id)
);

create table loja
(
	loja_id SERIAL not null,
	loja_nome VARCHAR(60),			--nome da loja 
	loja_endereco VARCHAR(60),		--endereço da loja (cidade e rua)
	loja_cpostal char(9),	--código postal da loja 
	loja_telefone char(9),			--telefone da loja 
	gest_id_loja int not null,   	--fk para gestor de loja
	primary key (loja_id)
);

create table lojaproduto
(
	lojaproduto_id SERIAL not null,
	loja_id_lp int not null, 		 --fk para loja
	prod_id_lp int not null, 	 --fk para produto
	primary key (lojaproduto_id)
);

CREATE TYPE estado_compra_enum AS ENUM ('pendente', 'processado');

create table compra
(
	compra_id SERIAL not null, 
	compra_data date,					--data de compra
	estado_compra estado_compra_enum,	--estado da compra onde apenas pode ser pendente ou processado
	loja_id_cmp int not null,			--fk para loja
	cli_id_cmp int not null,  			--fk para cliente
	primary key (compra_id)
);

create table lojaprodutocompra
(
	lojaprodutocompra_id SERIAL not null,
	lojaproduto_id_lpc integer not null, 	--fk para lojaproduto
	compra_id_lpc integer not null,  		--fk para compra
	primary key (lojaprodutocompra_id)
);


create table comentario
(
	comentario_id SERIAL not null,
	descricao VARCHAR (130),   		--descrição do comentário
	prod_id_cmt integer not null, 	--fk para pruto
	cli_id_cmt integer not null, 	--fk para cliente
	primary key (comentario_id)
);


-- Foreign Keys

alter table cliente
add constraint cliente_fk_usr
foreign key (usr_id_cli) references usr(usr_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table gestordeloja
add constraint gestordeloja_fk_usr
foreign key (usr_id_gest) references usr(usr_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table loja
add constraint loja_fk_gestordeloja
foreign key (gest_id_loja) references gestordeloja(gest_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table lojaproduto 
add constraint lojaproduto_fk_loja
foreign key (loja_id_lp) references loja(loja_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table lojaproduto
add constraint lojaproduto_fk_produto
foreign key (prod_id_lp) references produto(prod_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table lojaprodutocompra 
add constraint lojaprodutocompra_fk_lojaproduto
foreign key (lojaproduto_id_lpc) references lojaproduto(lojaproduto_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table lojaprodutocompra 
add constraint lojaprodutocompra_fk_compra
foreign key (compra_id_lpc) references compra(compra_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table compra 
add constraint compra_fk_cliente
foreign key (cli_id_cmp) references cliente(cli_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table compra 
add constraint compra_fk_loja
foreign key (loja_id_cmp) references loja(loja_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table comentario
add constraint comentario_fk_produto
foreign key (prod_id_cmt) references produto(prod_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table comentario
add constraint comentario_fk_cliente
foreign key (cli_id_cmt) references cliente(cli_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;