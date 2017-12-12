Sobre o UOLHOST
===============
O UOL HOST oferece soluções de Hospedagem de Sites, Loja Virtual, Loja de Aplicativos, Revenda de Hospedagem, Registro de Domí­nios, E-mail Marketing, Cloud Computing, entre outros serviços, contando com a confiabilidade e a escalabilidade de uma moderna infraestrutura de TI, composta por uma das maiores redes de Data Centers da América Latina.

## Teste para BackEnd para UOLHOST
Montamos esse teste para conhecer os seus conhecimentos e habilidades na linguagem Java, em programação orientada a objetos e boas práticas de programação.

Esse teste consiste em montar uma aplicação Java capaz de recuperar informações de um arquivo XML e de um arquivo JSON, persistir um cadastro em um banco de dados em memória ou em arquivo e listar os cadastros em uma interface simples.

## Proposta 

O 'novo' sistema de cadastro de jogadores do UOL precisa de uma nova cara! Isso porque a área de lazer da empresa definiu que todo jogador deverá ter um codinome. Acontece que essa proposta foi um sucesso e muitos candidatos decidiram se inscrever e a área de lazer acabou restringindo os codinomes em duas listas distintas: o time "Os Vingadores" e a "Liga da Justiça".

O seu desafio é elaborar um sistema em Java capaz de:

1. Permitir o cadastro de jogadores de acordo com os codinomes contidos nos links de referência vingadores.json e liga_da_justica.xml
2. Todo cadastro deverá conter o nome, email e telefone do jogador (sendo que nome e email são obrigatórios!)
3. A informação cadastrada deverá ser persistida em um banco de dados em memória como o HSQLDB ou como um arquivo;
4. A qualquer momento deve ser possível obter a lista de todos os jogadores cadastrados com seus respectivos codinomes e de qual lista o codinome foi extraído;
5. Não pode usar o mesmo codinome de uma lista para diferentes usuários! A não ser que seja de lista diferente!
6. O usuário não pode escolher o codinome mas ele pode escolher se quer um codinome dos Vingadores ou da Liga da Justiça
7. Obrigatóriamente a informação do codinome precisa ser lida dos arquivos na internet nos Links: . Não vale guardar a informação do codinome localmente (em um arquivo, em uma classe, em um banco de dados...);

### Casos de uso

+ Caso de uso: Cadastro com sucesso:
	1. O usuário 'Felipe' cadastra seu nome, email e telefone e escolhe a lista vingadores.json 
	2. O sistema recebe o cadastro e verifica se ainda há codinomes disponíveis na lista vingadores.json
	3. O sistema encontra um codinome livre e o escolhe
	4. O sistema persiste o nome, email, telefone, codinome e arquivo de referência num banco de dados em memória ou num arquivo
	5. O sistema informa que o usuário foi cadastrado corretamente e mostra uma imagem de sucesso
	
+ Caso de uso: Lista escolhida não tem codinomes disponíveis:
	1. O usuário 'João' cadastra seu nome, email e telefone e escolhe a lista liga_da_justica.xml
	2. O sistema recebe o cadastro e verifica se ainda há codinomes disponíveis na lista liga_da_justica.xml
	3. O sistema não encontra um codinome livre
	4. O sistema informa que aquela lista não possui mais usuários disponíveis

+  Caso de uso: Relatório de usuários cadastrados:
	1. O usuário 'Luis' clica em visualizar relatório de jogadores
	2. O sistema consulta o banco de dados em memória ou o arquivo
	3. O sistema apresenta todos os usuários cadastrados. Cada linha tem as informações: nome, email, telefone, codinome e arquivo referência
	
## Instruções

Não há certo ou errado. Queremos apenas conhecer mais sobre seus conhecimentos na linguagem Java como uso de bibliotecas públicas e também seu cuidado com o código fonte levando em consideração clareza de ideias, organização de código, documentação e testes.

**Faça um fork e clone deste projeto, crie um branch (com seu nome), e siga os passos:**

1. Faça um fork do projeto e desenvolva um sistema que atenda os casos de uso apresentados
2. Para montar seu sistema, leve em consideração a arquitetura de referência dentro da pasta referência!
3. Criar uma interface em HTML que contenha um formulário que receba nome, email e telefone
4. Criar uma interface em HTML que liste os jogadores cadastrados por nome, email, telefone, codinome e lista de referência
5. Criar uma ou mais classes que faça(m) uma requisição HTTP para o arquivo referencia Liga da Justiça em:
6. Criar uma ou mais classes que faça(m) uma requisição HTTP para o arquivo referencia Os Vingadores em:
7. Criar uma ou mais classes que faça(m) que contenha as regras para persistir e recuperar cadastros de jogadores
8. Documente como o projeto deve ser iniciado para que seja possível rodarmos a sua aplicação
9. Faça o pull request do seu projeto !

## Regras
1. Você poderá utilizar o Java em qualquer versão! :)
2. Você poderá utilizar quaisquer frameworks da linguagem Java! :)
3. Para persistir as informações você poderá utilizar um banco de dados em memória gerenciado por você ou utilizar um banco como HSQLDB. 
4. Você também pode optar por gravar em arquivo!
5. Não vale utilizar um codinome de um mesmo arquivo mais de uma vez.
6. Detalhes como criação de testes unitários, ordenação da lista de cadastrados ou filtro da lista são opcionais. Mas... se você conseguir fazer iremos apreciar ! 

## O que apreciamos
* Organização;
* Simplicidade;
* Objetividade;
* Reúso de código;
* Testes unitários;
* Padronização de código;
* Padrões de projeto;

## Quem buscamos
Queremos uma pessoa que gosta do que faz, que trabalhe em equipe e tenha vontade de inovar. Sempre buscando atualização e soluções inovadoras.

Se você se identificou, venha fazer parte do nosso time!

