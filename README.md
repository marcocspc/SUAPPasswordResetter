# SUAPPasswordResetter
Um utilitário para redefinir senhas do AD do IFRN multiplataforma utilizando o SUAP.

## Como utilizar

### Modo gráfico

Para utilizar o modo gráfico, apenas dê dois clique no arquivo Jar.
Caso queira executar pela linha de comando, visto que em alguns sistemas Linux o
arquivo JAR é tratado como um arquivo comum, use:
```
java -jar SUAPPasswordResetter_VERSAO.jar
```

### Modo de linha de comando

Há ainda um modo de linha de comando para aqueles que desejam executar a aplicação
de modo mais rápido pelo terminal ou para a execução em scripts. Para isso, é necessária
a adição de alguns parâmetros ao jar:

```
java -jar SUAPPasswordResetter_VERSAO.jar --no-gui --user <matricula> --file <arquivo>
```

Sendo:
<matricula> é o número da matrícula do servidor que possui permissão de redefinir
as senhas. A senha será solicitada via terminal.
<arquivo> é o arquivo contendo todas as matrículas a serem redefinidas, separadas
por quebras de linha. Em outras palavras, uma matrícula por linha.

### Argumentos opcionais no modo linha de comando

A senha do servidor que possui permissão de redefinir as senhas pode ser informada
diretamente, desta forma ela não será solicitada.

```
java -jar SUAPPasswordResetter_VERSAO.jar --no-gui --user <matricula> --pass <senha> --file <arquivo>
```

A senha que será utilizada para redefinição também pode ser informada, por padrão
ela é 'Ifrn.ANO', sendo ANO o ano atual. Mas pode ser alterada em um caso específico:

```
java -jar SUAPPasswordResetter_VERSAO.jar --no-gui --user <matricula> --file <arquivo> --pass-to-reset Ifrn.9999
```

Lembrando que os dois argumentos opcionais podem ser utilizados juntos, deixando
a linha de comando na sua forma completa:

```
java -jar SUAPPasswordResetter_VERSAO.jar --no-gui --user <matricula> --pass <senha> --file <arquivo> --pass-to-reset Ifrn.9999
```