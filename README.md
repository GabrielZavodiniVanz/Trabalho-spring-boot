"# Trabalho-spring-boot" 
# Projeto Springboot

1. A página de cadastro está localizada no endereço http://localhost:8080/. Neste portal, os usuários têm a oportunidade de realizar o cadastro de informações detalhadas sobre carros. É possível inserir dados como o ano de fabricação, a marca, o modelo, o preço e uma imagem representativa do veículo. Além disso, a plataforma permite a funcionalidade de exclusão e restauração dos registros de carros previamente cadastrados.


## Classe Carro
1. Possui quatro atributos privados:

  modelo (String): Representa o modelo do carro.
  marca (String): Representa a marca do carro.
  valor (double): Representa o valor do carro.
  ano (double): Representa o ano de fabricação do carro.
  
2. A classe tem dois construtores:

  Um construtor padrão (public Carro()) que não recebe argumentos e não faz nada.
  Um construtor com parâmetros (public Carro(String modelo, double valor, String marca, double ano)) que permite criar objetos "Carro" com valores iniciais para os atributos. Isso é útil para inicializar um carro com informações específicas no momento da criação do objeto.
  
  
3. A classe fornece métodos getter e setter para acessar e modificar os valores dos atributos:

  Os métodos getModelo(), getMarca(), getValor(), e getAno() são usados para obter os valores dos atributos correspondentes.
  Os métodos setModelo(String modelo), setMarca(String marca), setValor(double valor), e setAno(double ano) são usados para definir os valores dos atributos correspondentes.



## Classe CarroApplication
1. A anotação @SpringBootApplication é usada para marcar essa classe como a classe principal da aplicação Spring Boot. Isso significa que esta classe contém o método main que inicia a aplicação.

2. O método main é o ponto de entrada da aplicação. Quando o programa é executado, o método main é chamado automaticamente. Ele utiliza o método SpringApplication.run() para iniciar a aplicação Spring Boot.

3. SpringApplication.run(CarroApplication.class, args) inicia a aplicação Spring Boot, onde CarroApplication.class é a classe principal da aplicação e args são os argumentos da linha de comando que podem ser passados para a aplicação.

4. Em resumo, este arquivo é o ponto de partida de uma aplicação Spring Boot chamada "CarroApplication". Quando a aplicação é executada, ela inicia a estrutura Spring Boot e inicia a aplicação, que pode conter controladores, serviços e outros componentes relacionados a carros.



## CarroController
1. A anotação @RestController é usada para marcar esta classe como um controlador da API REST. Isso significa que esta classe lida com solicitações HTTP e fornece respostas como JSON.

2. A anotação @RequestMapping("/carros") define o mapeamento da URL base para as operações deste controlador. Todas as solicitações para URLs que começam com "/carros" serão manipuladas por este controlador.

3. A classe CarroController possui uma lista chamada carros, que é uma lista de objetos do tipo Carro. Essa lista será usada para armazenar carros cadastrados.

4. O método listarCarros() é anotado com @GetMapping. Ele trata solicitações HTTP GET para a URL "/carros". Esse método retorna a lista de carros armazenados no formato JSON.

5. O método cadastrarCarro(@RequestBody Carro carro) é anotado com @PostMapping. Ele lida com solicitações HTTP POST para a URL "/carros". Esse método recebe um objeto do tipo Carro no corpo da solicitação (usando a anotação @RequestBody) e o adiciona à lista carros. Em seguida, ele retorna o carro recém-cadastrado no formato JSON.

6. Em resumo, este arquivo Java define um controlador Spring Boot chamado "CarroController" que oferece duas operações: listar carros cadastrados e cadastrar novos carros. Os dados são trocados no formato JSON, e a lista de carros é armazenada temporariamente em memória. Este controlador é parte de uma aplicação web que lida com informações de carros.


## HTML
1. A página contém um formulário para inserir informações sobre um carro, incluindo marca, modelo, ano, valor e uma imagem opcional.

2. Quando o usuário preenche o formulário e clica em "Cadastrar," a função cadastrarCarro() é chamada. Ela coleta os dados do formulário, cria um objeto de carro e adiciona esse objeto a uma lista chamada carrosCadastrados. Além disso, exibe uma lista de carros cadastrados na página.

3. Os carros cadastrados são exibidos como itens de lista, com a opção de selecionar carros para exclusão usando caixas de seleção.

4. O botão "Excluir Carros Selecionados" permite ao usuário excluir carros selecionados da lista. Os carros excluídos são movidos para uma lista chamada carrosExcluidos.

5. O botão "Histórico de Cadastro" permite ao usuário visualizar o histórico de carros excluídos.

6. O botão "Restaurar Carros" permite ao usuário voltar para a lista principal de carros cadastrados, escondendo o histórico de carros excluídos.

7. A página possui estilos CSS para o layout e aparência, e utiliza JavaScript para manipular os eventos de botões e exibição dinâmica de informações.
