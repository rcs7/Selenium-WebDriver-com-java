//Selenium WebDriver com java
/*Downloads e dependências - Apêndice
Seção 2, aula 5
Java JDK Link 

http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html

IntelliJ IDEA 

https://www.jetbrains.com/idea/download/#section=mac

JUnit 

https://mvnrepository.com/artifact/junit/junit/4.12

Selenium WebDriver 

https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.6.0

ChromeDriver 
de 32 bits

https://sites.google.com/a/chromium.org/chromedriver/downloads

Extras

Outros Drivers 

https://github.com/mozilla/geckodriver/releases (Firefox) 

http://selenium-release.storage.googleapis.com/index.html?path=3.6 (Internet Explorer) 

Cucumber-JVM 

https://cucumber.io/docs/reference/jvm        */

/* Instalar o kit sdk
Pra ver se o java foi instalado corretamente:
java -version

Instalar o IntelliJ IDEA:
create new project -> Maven("Meivem")- quero criar um projeo em java e que me forneça as facilidades do 
maven que é um gestor de dependências
-> group Id: br.com.juliodelima.webdriverJava
ArtFactk..ID : webdriver Java
Project Name: webdriver Java
Project Location : ~/ideaProject/webdriver-java

Projeto criado, e o arquivo que tá aberto é o pom.xml - definimos as dependências que teremos no nosso projeto dentro deste arquivo.
as deste site: https://mvnrepository.com/artifact/junit/junit/4.12
<!-- https://mvnrepository.com/artifact/junit/junit -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>
</dependency>
dentro de um nó que eu crio: <dependecies></dependecies>
tb dentro dessa mesma dependecies
as deste site: https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.6.0
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.6.0</version>
</dependency>

obs que na External Librireis não tem nada relacionado a Junit ou webdriver, então aparece a opção em baixo da tela
import marven ... clico pra fazer importação e então aparece lá. Pronto agr qlq dependência que eu add no pom.xml já 
ele já faz o autoimport automaticamente.

abro o scrc - temos o main(para quem vai criar uma aplicação lá dentro-  td cód será criado lá dentro) e o test. 
vou em scrs -> test -> java e crio um package em cima dele com o nome tests e em cima dele crio uma classe chamada
new->javaclass ...  com o nome informacoesUsuarioTest . Smp é bom colocar com o sufixo test, mas não é isso ainda que define nossa class
como um class de test~-
...

Criando o projeto e abrindo o navegador - Apêndice
Seção 2, aula 7
Neste teste vimos que é necessário ter métodos anotados com @Test para que sejam interpretados como um teste válido ao clicar em "executar". 
A forma de nomear métodos é sempre tema de perguntas, por isso, separei um post que 
possui 7 recomendações diferentes de como nomear seus testes, veja no link abaixo:

https://vitalflux.com/7-popular-unit-test-naming-conventions/

Também vimos que é possível utilizar métodos da classe Assert do JUnit para validar 
valores obtidos durante os testes, dentre as asserções mais comuns estão:

assertEquals(String valorEsperado, String valorAtual, String mensagemErro) 

Validar se o valorAtual é igual ao valorEsperado, caso não sejam, a mensagermErro é 
apresentada.

assertTrue(boolean condicaoAtual, String mensagemErro) 

Validar se a condicaoAtual é verdadeira, caso não seja, a mensagermErro é apresentada.

Quer conhecer todas as asserções da classe Assert? Visite a URL abaixo:

http://junit.sourceforge.net/javadoc/org/junit/Assert.html

Seu navegador não abriu uma janela maximizada?


Sem problemas, para maximizar, use o comando a seguir logo abaixo da instanciação da classe ChromeDriver:

navegador.manage().window().maximize(); 

Ou, se está num MAC OS X, como eu, use o comando abaixo:

navegador.manage().window().setSize(new Dimension(1280, 800)); 

Lembrando que o primeiro parâmetro (1280) representa a largura e o segundo (800) representa a altura da janela 
do navegador.


Identificando elementos e programando um script de teste​ - Apêndice
Seção 2, aula 9
Para acelerar o desenvolvimento dos seus scripts, nada melhor que conversar com os 
desenvolvedores da aplicação que você irá testar, ou mesmo, você mesmo colocar a mão no 
código e tentar identificar como a aplicação foi construída e quais são suas principais 
características.

Caso você não conheça muito sobre HTML e seus elementos, segue abaixo dois links que poderão 
lhe ajudar bastante:

Elementos mais comuns no HTML 

https://www.w3schools.com/html/html_elements.asp

Atributos constantemente usados em elementos

https://www.w3schools.com/html/html_attributes.asp


Codificando o teste com Selenium WebDriver - Apêndice
Seção 3, aula 11
O método findElement provavelmente é o método que você mais vai utilizar durante sua 
trajetória na automação de testes com Selenium WebDriver. Isso porque ele retorna um 
objeto do tipo WebElement que representa um objeto qualquer contido na página, por 
exemplo, um botão, um campo, uma caixa de textos, etc.

Alguns dos métodos mais utilizados em um WebElement são:

click() 

Para clicar em um determinado elemento.

sendKeys(String texto) 

Para atribuir um texto a um elemento, esse método pode ser mesclado com o uso da 
classe Keys, que possibilita, por exemplo, o digitar de teclas especiais como Shift, 
Enter, Backspace, etc.

https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/Keys.html

getText() 

Retorna o texto contido entre o abrir e fechar da tag. No código <a id="mensagem">Este é meu texto</a>, 
o getText() retornaria "Este é meu texto".


clear() 

Limpa um campo que já possui um valor default.

getAttribute(String atributo) 

Retorna o texto contido em um atributo. No código <a id="mensagem">Este é meu texto</a>, 
o getAttribute("id") retornaria "mensagem".

Você pode ter acesso a todos os métodos da classe WebElement através do link abaixo:

https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/WebElement.html


Usando @Before e @After do JUnit - Apêndice
Seção 3, aula 13
Além das anotações @Test, @Before e @After ainda há outras três anotações, vejamos no 
próximo parágrafo.

@BeforeClass

Método público, sem retorno e estático usado para executar comandos antes da execução 
do primeiro teste contido no projeto.

@AfterClass

Método público, sem retorno e estático usado para executar comandos depois da execução do último teste contido no projeto.

@Ignore(String motivo)

Permite que testes sejam ignorados.

//USando a procura no inspect Xpath . Aperto no inspect e dps clico em Ctrl F e digito
: //(significa procure em tda a pág) 
 ponha isso lá:
 //div[@id="moredata"]
 //button[@data-target="addmoredata"]
 //*[@data-target="addmoredata"]    //* é qlq elemento
//div[@id="moredata"]//button[@data-target="addmoredata"]
//div[@id="moredata"]/div/button[@data-target="addmoredata"]

//é procure em todo o contexto
/é procure o primeiro filho
 
 Lidando com Combo boxes e toast messages - Apêndice
Seção 3, aula 15
Escrever scripts de teste de software é muito semelhante a escrever um software, em minha 
opinião, a principal diferença é que o script de teste é burro, ou seja, não restringimos 
a quantidade de condicionais dentro dele para reduzir a probabilidade de falhas no script. Em contrapartida, um software possui dezenas, centenas ou milhares de condicionais. 

Algumas práticas de teste de software são sombra do desenvolvimento de softwares, por 
exemplo, o desejo de melhora do código e sanitização do mesmo. Neste vídeo falamos sobre 
ter apenas asserções no fim do código, isso é uma prática herdada do Padrão AAA, que 
refere-se a Arrange, Act e Assert, respectivamente, Preparação do teste, Ação e Asserções, 
ou seja, validações. O padrão AAA foi herdado do teste de unidade, veja mais no link 
abaixo:

https://www.typemock.com/unit-test-patterns-for-net#aaa

Vimos nesse vídeo a necessidade de uso da classe Select, para ter acesso a métodos que 
não foram disponibilizados nativamente na interface WebElement. Veja abaixo a relação 
completa de métodos disponíveis para interação com comboboxes:

http://seleniumhq.github.io/selenium/docs/api/java/index.html
 
 XPath pra pegar o proximo elemento logo após o número 12345 que é exatamente a opção de 
 excluir o phone no site lá
 //span[text()="12345"]/following-sibling::a
 //span[text()="12345"]/following-sibling::br  se o prox que eu quizesse fosse br
 //span[text()="12345"]/following-sibling::small  se o prox que eu quizesse fosse 
 
 para pegar as coisas que tem antes é preciding
 //span[text()="12345"]/preceding-sibling::a
 //span[text()="12345"]/preceding-sibling::br  se o prox que eu quizesse fosse br
 //span[text()="12345"]/preceding-sibling::small  se o prox que eu quizesse fosse 


Esperas explícitas, janelas JS e identificadores XPath avançados - Apêndice
Seção 3, aula 17
Lembre-se, todos os métodos de teste precisam ter a anotação @Test e serem públicos e 
sem retorno, ou seja, void.

XPath é um completo mecanismo de pesquisa em arquivos baseados em XML, além dos comando 
básicos de pesquisa, há uma série de métodos e axes que permitem navegar em elementos 
que estão ao redor de um determinado elemento. Vimos isso na utilização dos axes ancestor e 
following. Veja abaixo uma lista com todos os axes disponíveis no XPath:

https://www.w3schools.com/xml/xpath_axes.asp

A classe ExpectedConditions, como vimos no vídeo, possui uma série de estratégias. 
Elas nos ajudam a criar formas de aguardar que certos eventos aconteçam, como por 
exemplos que um determinado seja removido do DOM (caso que vimos no vídeo relacionado 
ao staleness). Abaixo está um link com todas as estratégias de espera, ou seja, 
métodos da classe ExpectedConditions:

https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/support/ui/ExpectedConditions.html

As estratégias mais utilizadas são:

alertIsPresent()  

Aguarda até que uma mensagem Javascript seja apresentada.

elementToBeClickable(By localizador) 

Aguarda até que um elemento esteja pronto para receber um clique, por exemplo, ele 
poderia ficar desabilitado durante algum período e então teríamos de esperar até que 
ficasse habilitado novamente.

visibilityOfElementLocated(By localizador) 

Aguarda até que as propriedades CSS display e hidden possuam valores que possibilitam 
a visualização do elemento pelo usuário.

...
vou em java e crio um novo package com o nome suporte e dentro dele crio uma class chamada de 
Generator
crio outra class Screenshot

tô salvando os arquivos em C:\Users\dell\test-report\taskit que o ItelliJ IDEA transforma 
em "C:\\Users\\dell\\test-report\\taskit"

Gerando evidências de teste com screenshots - Apêndice
Seção 3, aula 19
Quando escrito de forma correta, um teste, mesmo sem evidências gráficas, torna-se muito 
didático e informativo. Em alguns contextos, como por exemplo, em empresas que necessitam 
de alto controle sobre os testes que são executados, faz-se necessário o uso de 
screenshots durante a execução do mesmo. Evidências em casos como esse são extremamente 
necessários.

Nesse vídeo criamos uma classe com Generators, bem, nessa classe podemos colocar quantos 
geradores forem necessários, apenas para facilitar nosso trabalho. Logo, um dos geradores 
que faz muito sentido estar no seu projeto é o criação e CNPJ da empresa:

https://github.com/muriloferreira/utilities/blob/master/GeraCpfCnpj.java

Try e Catch são comandos para tratar trechos de código. Basicamente, sua estrutura diz o 
seguinte:

try {
   // Linha 2
} catch (Exception e) {
  // Linha 4
} finally {
  // Linha 6
}
Se o problema na Linha 2 tiver uma falha, veremos que a Linha 4 será executada. Se 
caso a Linha 2 tiver sucesso, a linha 4 não será executada. 
Em ambos os casos, a linha 6 é apresentada.


Data-Driven testing - testes dirigidos a dados: 
procuro easy test no botão de pesquisa dentro do site :
https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.6.0
e coloco sua dependência dentro do arquivo pom.xml
dps coloco lá em cima abaixo do último import 
@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "informacoesUsuarioTest.csv")

lá em cima da pasta test a qual dentro tem a pasta java crie new->directory com o nome 
resources dentro desta pasta eu crio um arquivo chamado informacoesUsuarioTest.csv
 
 vou usar o testAdicionarUmaInformacaoAdicionalDoUsuario(), o descomento
 e me pergunto quais são os dados de entrada deste teste?
 Phone, número do telefone.
 dados de saída: Seu contato foi adicionado
 
 coloco o nome do método : testAdicionarUmaInformacaoAdicionalDoUsuario,
 
 dentro do meu arquivo .csv lá no ItelliJ IDEA na primeira linha:
 testAdicionarUmaInformacaoAdicionalDoUsuario, tipo, contato, mensagem
 na segunda linha eu vou colocar os dados que quero utilizar em cada uma dessas colunas:
                                 Phone,+5581123456789, "Your contact has been added!"
								 Posso adicionar qtas linhas a mais eu quiser pro meu teste: ex:
					             Phone,+5581123456780, "Your contact has been added!"
                                 Phone,+5581123456781, "Your contact has been added!"
 
 testAdicionarUmaInformacaoAdicionalDoUsuario(@Param(name="tipo")String tipo,@Param(name=
 "contato") String contato, @Param(name="mensagem") String mensagemEsperada)
 e dps eu troco todos as coisas de dentro do teste pra ficar que nem no arquivo. Ex: 
 "Phone" vira tipo, "+5573829112" vira contato e "Your contact has been added!" vira 
 mensagemEsperada
 
 
 Testes dirigidos a dados (Data-driven testing) - Apêndice
Seção 4, aula 21
Data-Driven Testing é uma estratégia de testes que visa impedir a duplicação de scripts 
quando apenas os dados de entrada ou saída são diferentes. A idéia, como vimos no vídeo, 
é inputar parâmetros de entrada e saída nos métodos de teste e fazer com que os testes 
consumam um arquivo externo com os dados que serão utilizados nos testes. Quanto mais 
linhas o arquivo externo tiver, mais testes são executados.

Além do formato CSV, é possível trabalhar com XLS (Excel) ou mesmo JSON como DataLoader. 
Abaixo segue os links com os artigos que apresentam como usar esses outros DataLoaders:

https://github.com/EaseTech/easytest-core/wiki/Passing-JSON-Object-in-test-data
https://github.com/EaseTech/easytest/wiki/EasyTest-:-Loading-Data-using-Excel
O Easy Test permite a adição de dados de mais de um teste no arquivo de base de dados, 
vejamos como seria:

# Arquivo: ClasseDeTesteComDoisMetodos.csv

meuPrimeiroMetodo,nome,idade,mensagem
                 ,Julio,31,Sucesso
meuSegundoMetodo,salario,mensagem
                ,1000,Sucesso
				
				
PageObject
crio um outra class lá em cima de main->tests agora cham	ado InformacoesUsuarioPageObjectsTest

coloco isso dentro de uma nova class que criei dentro de suport com o nome Web
       //Abrindo um navegador
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\drivers\\chromedriver.exe");
        navegador =  new ChromeDriver();
        navegador.manage().window().maximize();
        //espera-se para qlq elemento da pág reaja até 5 segs:
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Navegando para a página do Taskit
        navegador.get("http://www.juliodelima.com.br/taskit");

	//coloco isso no lugar q estava este código acima:	
		 //ADD POR CAUSA DO PAGE OBJECT
        navegador = Web.createChrome();

		criei um class lá em cima da pasta tests chamada  informacoesUsuarioPageObjectsTest 
		
		
		Em cima da pasta java crio um novo packge com o nome de pages e lá crio uma nova javaclass
 
		Em cima deste package crio um nova class chamada LoginPage

        Ao escrever os codigos desta class coloco LoginFormPage , ele reclama q não temos esta class e pergunta se queremos criar
		dizemos que sim e ele pergunta se queremos criar dentro deste pacote e dizemos que sim e a class é craiada. Agora escrevemos o 
		que devemos ter dentro dela

Page objects (Parte 1) - Apêndice
Seção 4, aula 23
Segundo Martin Fowler, a regra de ouro do Page Objects é permitir que todo software possa fazer qualquer interação que um humano faria perante ao software além de ver tudo o que ele veria.

https://martinfowler.com/bliki/PageObject.html

Lembretes:

Ao adicionar um método em uma página devemos saber qual é a próxima page para ele
Toda page precisa ter uma construtor que alimente a propriedade navegador, do tipo WebDriver
A classe inicial deve ser instanciada e deve ser usada dentro de um teste do JUnit

dps vou colocar SecretaPage la e vai aparecer se quero criar a class e digo q sim dentro do package


Obs que tá sendo um método pra cada campo

agr é o caso da class MePage que ainda não foi criada e será criada.

já que tenho q pôr todas as informações de novo. Entao agr crio uma classe dentro
do msm package chamada BasePage que será para nao ter que ficar repetindo td de novo

e aí agr eu vou pondo extends em todos os outros métodos e tiro de cada classe a declaração de navegador e o construtor

continuo trabalhando na MePage


agr vai aparecer a AddContactPage ena class MePage e aí crio a class e tb extendo...


Page objects (Parte 2) - Apêndice
Seção 4, aula 25
Errata:

Ao invés de return new SecretaPage(navegador) seria mais apropriado usar return clicarSignIn() uma vez que ele já retorna um new SecretaPage
Poderíamos também fazer um return digitarLogin(“julio0001”).digitarSenha(“123456”) .clicarSignIn();
Há vários conceitos de Java e orientação a objeto nesse vídeo, entre eles, conceitos, sintaxe e formas de pensar orientado a objetos. Veja abaixo um vídeo que apresenta os principais fundamente em teste para começar a testes:

https://youtu.be/YPTlx9vbikM

Lembretes: 

Use “Alt + Enter” para importar classes no Windows e “Option + Enter” no Mac OS X

Agr volto pro AddContactPage.java


faz-se asserção dentro das pages ou fora das pages,
fora: haja distinçao entre os objetivos
recomendada!

coloco isso no arquivo principal de test java que eh o q to usando
@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "InformacoesUsuarioPageObjectsTest.csv"

e crio em resources o arquivo de test "InformacoesUsuarioPageObjectsTest.csv"

preencho o arquivo e vou mudar as coisas do teste. 

Page objects (Parte 3) - Apêndice
Seção 4, aula 27
Asserções em Page Objects tem um debate muito constante, a pergunta é: faço asserções dentro da página ou coloco-as dentro dos métodos de uma classe da Page, chamado "validarAlgo" por exemplo.

Segundo Martin Fowler, devemos deixar asserções dentro dos testes e não dentro das pages, para evitar duplicações e também para dar responsabilidade única às páginas:

"There are differences of opinion on whether page objects should include assertions themselves, or just provide data for test scripts to do the assertions. Advocates of including assertions in page objects say that this helps avoid duplication of assertions in test scripts, makes it easier to provide better error messages, and supports a more TellDontAsk style API. Advocates of assertion-free page objects say that including assertions mixes the responsibilities of providing access to page data with assertion logic, and leads to a bloated page object."

E contínua dando seu feedback quando a estruturação deste recurso.

"I favor having no assertions in page objects. I think you can avoid duplication by providing assertion libraries for common assertions - which can also make it easier to provide good diagnostics."

Fonte: https://martinfowler.com/bliki/PageObject.html

/////////////////////////////////////////////////////////////////////////////////////////

Entro no site https://www.browserstack.com/automate/java e dps copio
a parte do código que está com as minhas credenciais:

public static final String USERNAME = "renatacristovamd1";
  public static final String AUTOMATE_KEY = "xSSwyhJyFdCUwv9psbyX";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
  
  pego isso e colo dentro da class Web que está dentro do packge suporte que eu criei
  anteriormente.

Essa parte eu coloco embaixo da linha public class Web

public static final String USERNAME = "renatacristovamd1";
  public static final String AUTOMATE_KEY = "xSSwyhJyFdCUwv9psbyX";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
   
Ao invés de eu acessar um browser vendo o chromedrive que tá na minha máquina eu vou 
colocar dentro de um método criado por mim as capabilities(que são os conjs de capacidades
que eu quero definir dentro do msm script) deste mesmo site:

public static WebDriver createBrowserStack(){ //Essa linha eu que crio e o resto abaixo
//peguei do site lá!
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", "iPhone");
        caps.setCapability("device", "iPhone 8 Plus");
        caps.setCapability("realMobile", "true");
        caps.setCapability("os_version", "11");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    }

 
//Na vdd fica assim pq ele dá as editadas dele:
  public static WebDriver createBrowserStack(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "71.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1024x768");

        //Não é mais chromedrive, é RemoteWebDrive, ou seja, ele
        //me dá um driver, mas é em um serviço remoto, aq é o BrowserStack
        WebDriver navegador = null;
        try {
             navegador = new RemoteWebDriver(new URL(URL), caps); // A URL eu
            //tive que importar pq eh a class do java: import java.net.URL;
        }catch (MalformedURLException e){
            System.out.println("HOuveram problemas com a URL" + e.getMessage());
        }

        //espera-se para qlq elemento da pág reaja até 5 segs:
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Navegando para a página do taskit
        navegador.get("http://www.juliodelima.com.br/taskit");


        return navegador;
    }
	
aí vou lá no meu test : informacoesUsuarioPageObjectsTest e mudo a parte que tá no
@Before
 public void setUp(){
        navegador = Web.createChrome();

    }
para 
 public void setUp(){
        navegador = Web.createBrowserStack();

    }
entao eu executo este teste:
public class informacoesUsuarioPageObjectsTest 
e vou lá no site do browserStack e clico lá em cima em "automate" e vai rodar lá
lembre de matar o test descomentando o navegador.quit() de lá do @After

Pronto, agr posso ver o vídeo de como foi a execução deste teste. Clico no play lá 
dentro do site do BrowserStack 

Executando testes na nuvem (Browserstack) - Apêndice
Seção 5, aula 29
Errata:

Altere o nome da constante URL (linha 11 e 37) para URLBrowserStack, assim você não terá 
o problema que ocorreu comigo durante o vídeo no minuto 06:4
Não se esqueça de descimentar o comando navegador.quit(), caso contrário ficará preso na 
sessão e como há apenas 2 sessões disponíveis durante o trial do BrowserStack, ficará 
sem executar testes.
Crie sua conta no BrowserStack no link abaixo

https://www.browserstack.com/users/sign_up

Acesso à documentação Java no BrowserStack 

https://www.browserstack.com/automate/java

Saucelabs é um dos principais concorrentes do BrowserStack: 

https://saucelabs.com/


////////////última aula ///////////////////////
 
Vou neste site maven.apache.org/download.cgi
e baixo esse: Binary zip archive , o extraio e o coloco em uma pasta
C:\Users\dell\apache-maven-3.6.0 , criei: a pasta apache-maven-3.6.0
\apache-maven-3.6.0\bin 

vá no painel de controle -> sistema e dê 2 clicks no sistema-> abro as propriedades do
sistema e clico em avançado -> variáveis de ambiente -> variáveis de sistema
->path e editar aí eu vou até o final dela e pressiono ";" e colo o endereço de onde
está o bin do maven que eu baixei: C:\Users\dell\apache-maven-3.6.0\apache-maven-3.6.0\bin

o próximo passo eh eu navegar no prompt de comando até a pasta do meu projeto
C:\Users\dell\IdeaProjects\webdriverJava e dps clico em ls
mostra q tem o arq pom.xml , ou seja, preciso estar na mesma pasta do pom.xml, 
então, se eu quiser rodar todas as classes de tests que tenho é só digitar o comando:
mvn clean test 
e se eu não quiser rodar todas, apenas uma específica, digito:
mvn clean test -Dtest=NomeDoPacoteQueEstáOtest.oNomeDaClassQEstáOTest
fica assim:
mvn clean test -Dtest=test.informacoesUsuarioPageObjectsTest.testAdicionarUmaInformacaoAdicionalDoUsuario

aí se eu for lá no site do browserStack já logado , vou na opçãolá de cima "automate"
e vai ter lá meus testes rodando

essa é uma solução para as empresas que possuem o Linux rodando, não tem como rodar o 
browser lá, então tem que rodar pelo browserStack 


Executando testes via linha de comando - Apêndice
Seção 5, aula 31
Download do Maven 

https://maven.apache.org/download.cgi

Variáveis de ambiente no Windows, Mac OS X ou Linux 

https://www.java.com/pt_BR/download/help/path.xml
*/