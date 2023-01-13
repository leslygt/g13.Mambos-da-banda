--Selecionar todos os users
select*
from usr

--Selecionar users que são cliente
select*
from usr WHERE tipo_usr = 'cliente'

--Selecionar users que são gestor de loja
select*
from usr WHERE tipo_usr = 'gestor de loja'

--Ordenar o preço dos produtos em ordem ascedente
select*
from produto 
Order by prod_preco asc

--Ordenar o preço dos produtos em ordem descedente
select*
from produto 
Order by prod_preco desc

--Mostrar produtos com preço menor que 1 euro
select*
from produto 
WHERE prod_preco < '1'

--Lojas que começam com a letra C
select*
from loja
where loja_nome like ('C%')

--Mostrar a descrição dos produtos em maiusculas
select upper (descricao) as upper
from produto

--selecionar o menor id dos produtos
select min(prod_id)
from produto

--selecionar o maior id dos produtos
select min(prod_id)
from produto

--juntar id da tabela loja e id da tabela gestor de loja
select gest_id, gest_id_loja
FROM gestordeloja, loja 
WHERE gestordeloja.gest_id=loja.gest_id_loja;  
