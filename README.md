# CadastroPOO — Programação Back-end com Java

## 📚 Trabalho Prático — DGT2821

Projeto desenvolvido para a disciplina **DGT2821 — Programação Back-end com Java**, com o objetivo de aplicar conceitos de **Programação Orientada a Objetos (POO)** utilizando a linguagem Java.

O projeto consiste na implementação de um **sistema de cadastro de clientes em modo texto**, utilizando persistência de objetos em **arquivos binários**. 

---

## 🎯 Objetivos

Este trabalho tem como principais objetivos:

* Aplicar **herança** na definição das entidades;
* Aplicar **polimorfismo** em métodos das classes;
* Utilizar a interface `Serializable`;
* Implementar persistência de objetos em arquivos binários;
* Desenvolver uma interface cadastral executada no terminal;
* Utilizar `ArrayList` para gerenciamento dos dados;
* Trabalhar com tratamento de exceções em Java;
* Organizar o projeto utilizando classes de entidades e classes de repositório.

Esses objetivos fazem parte das orientações oficiais da prática. 

---

## 💻 Tecnologias utilizadas

* **Java**
* **JDK**
* **NetBeans IDE**
* **Programação Orientada a Objetos**
* `ArrayList`
* `Serializable`
* Persistência em arquivos binários
* `Scanner`
* Git
* GitHub

O roteiro da prática indica o uso de **JDK e NetBeans** para desenvolvimento do projeto. 

---

## 📁 Estrutura do projeto

A estrutura principal do projeto foi organizada da seguinte forma:

```text
CadastroPOO/
│
├── src/
│   └── model/
│       ├── Pessoa.java
│       ├── PessoaFisica.java
│       ├── PessoaJuridica.java
│       ├── PessoaFisicaRepo.java
│       └── PessoaJuridicaRepo.java
│
├── README.md
│
└── arquivos de persistência
    ├── *.fisica.bin
    └── *.juridica.bin
```

O projeto deve utilizar o pacote `model` para as entidades e seus gerenciadores. 

---

# 🧩 Classes do projeto

## 👤 Pessoa

A classe `Pessoa` representa a entidade base do sistema.

### Atributos

```text
id
nome
```

### Recursos

* Construtor padrão;
* Construtor completo;
* Getters;
* Setters;
* Método `exibir()`;
* Implementação de `Serializable`.

---

## 👨 PessoaFisica

A classe `PessoaFisica` herda da classe `Pessoa`.

### Atributos adicionais

```text
cpf
idade
```

O método `exibir()` é utilizado de maneira **polimórfica** para apresentar os dados específicos de uma pessoa física. 

---

## 🏢 PessoaJuridica

A classe `PessoaJuridica` também herda da classe `Pessoa`.

### Atributo adicional

```text
cnpj
```

A classe possui seu próprio comportamento para o método `exibir()`, utilizando o conceito de polimorfismo. 

---

# 🗃️ Repositórios

O projeto possui dois repositórios responsáveis pelo gerenciamento das entidades.

## PessoaFisicaRepo

Responsável pelo armazenamento e gerenciamento das pessoas físicas utilizando um `ArrayList<PessoaFisica>`.

Principais operações:

```text
inserir()
alterar()
excluir()
obter()
obterTodos()
persistir()
recuperar()
```

## PessoaJuridicaRepo

Responsável pelo armazenamento e gerenciamento das pessoas jurídicas utilizando um `ArrayList<PessoaJuridica>`.

Principais operações:

```text
inserir()
alterar()
excluir()
obter()
obterTodos()
persistir()
recuperar()
```

Os métodos de persistência recebem o nome do arquivo e podem lançar exceções durante as operações de gravação e recuperação. 

---

# 💾 Persistência de dados

Uma das partes principais do projeto é a persistência dos objetos em **arquivos binários**.

A interface:

```java
Serializable
```

é utilizada nas classes para permitir que os objetos sejam serializados e armazenados em arquivos.

O sistema possui operações para:

### Salvar

```text
persistir()
```

### Recuperar

```text
recuperar()
```

Na segunda etapa do trabalho, os arquivos seguem o padrão:

```text
[prefixo].fisica.bin
[prefixo].juridica.bin
```

conforme especificado no roteiro da prática. 

---

# 🖥️ Sistema em modo texto

A segunda etapa do projeto implementa um menu para interação com o usuário através do terminal.

```text
========================================
       SISTEMA DE CADASTRO
========================================

1 - Incluir
2 - Alterar
3 - Excluir
4 - Exibir pelo ID
5 - Exibir todos
6 - Salvar dados
7 - Recuperar dados
0 - Sair
========================================
```

As opções permitem realizar as operações de cadastro solicitadas na prática. 

---

## ➕ 1 — Incluir

Permite cadastrar:

* Pessoa Física;
* Pessoa Jurídica.

Os dados são informados pelo usuário através do teclado e armazenados no respectivo repositório.

---

## ✏️ 2 — Alterar

Permite:

1. Escolher o tipo de pessoa;
2. Informar o ID;
3. Visualizar os dados atuais;
4. Informar os novos dados;
5. Atualizar o cadastro.

---

## 🗑️ 3 — Excluir

Permite excluir uma entidade através do seu ID.

O usuário seleciona o tipo de pessoa e informa o identificador correspondente.

---

## 🔎 4 — Exibir pelo ID

Permite pesquisar uma pessoa utilizando seu ID.

O sistema apresenta os dados da entidade encontrada.

---

## 📋 5 — Exibir todos

Apresenta todas as entidades armazenadas no repositório selecionado.

---

## 💾 6 — Salvar dados

Solicita um prefixo para os arquivos e realiza a persistência dos dados.

São utilizados os arquivos:

```text
[prefixo].fisica.bin
[prefixo].juridica.bin
```

---

## 📂 7 — Recuperar dados

Permite recuperar os dados armazenados nos arquivos binários utilizando o prefixo informado pelo usuário.

As exceções das operações de salvar e recuperar devem ser tratadas pelo sistema. 

---

# 🧠 Conceitos de Programação Orientada a Objetos

Durante o desenvolvimento foram trabalhados conceitos importantes da linguagem Java.

### Herança

```text
             Pessoa
               │
       ┌───────┴────────┐
       │                │
PessoaFisica      PessoaJuridica
```

`PessoaFisica` e `PessoaJuridica` reutilizam características da classe `Pessoa`.

### Polimorfismo

O método `exibir()` possui comportamentos específicos nas classes derivadas.

### Encapsulamento

Os atributos das entidades são controlados através de métodos `getters` e `setters`.

### Abstração

As classes representam entidades do mundo real utilizadas dentro do sistema de cadastro.

---

# ⚠️ Tratamento de exceções

O projeto utiliza o mecanismo de exceções da linguagem Java, principalmente nas operações relacionadas à persistência dos dados.

As operações:

```java
persistir()
recuperar()
```

devem permitir o lançamento de exceções, enquanto o sistema em modo texto deve realizar o tratamento dessas situações. 

---

# 🧪 Testes realizados

Durante a primeira etapa, são realizados testes utilizando:

### Pessoas físicas

* Criação de um repositório;
* Inclusão de duas pessoas físicas;
* Persistência dos dados;
* Criação de outro repositório;
* Recuperação dos dados;
* Exibição das pessoas recuperadas.

### Pessoas jurídicas

* Criação de um repositório;
* Inclusão de duas pessoas jurídicas;
* Persistência dos dados;
* Criação de outro repositório;
* Recuperação dos dados;
* Exibição das pessoas recuperadas.

Esse procedimento segue a sequência definida no roteiro da prática. 

---

# 📸 Resultados da execução

Nesta seção serão adicionadas imagens da execução do programa no terminal.

### Menu principal

> Adicionar aqui uma captura de tela do menu principal.

### Cadastro de Pessoa Física

> Adicionar aqui uma captura de tela do cadastro de pessoa física.

### Cadastro de Pessoa Jurídica

> Adicionar aqui uma captura de tela do cadastro de pessoa jurídica.

### Persistência dos dados

> Adicionar aqui uma captura mostrando os arquivos `.bin` gerados.

---

# 📚 Aprendizados

Com o desenvolvimento deste projeto foi possível praticar:

* Programação Orientada a Objetos;
* Herança;
* Polimorfismo;
* Encapsulamento;
* Serialização de objetos;
* Persistência em arquivos;
* Manipulação de `ArrayList`;
* Criação de classes de repositório;
* Entrada de dados através do `Scanner`;
* Tratamento de exceções;
* Desenvolvimento de aplicações em modo texto;
* Organização de projetos Java;
* Utilização do Git e GitHub.

---

# 🚀 Como executar o projeto

## 1. Pré-requisitos

É necessário possuir:

* JDK instalado;
* NetBeans instalado;
* Git instalado, caso seja utilizado o repositório remoto.

O roteiro da prática indica JDK e NetBeans como ferramentas necessárias. 

## 2. Clonar o projeto

```bash
git clone URL_DO_SEU_REPOSITORIO
```

## 3. Abrir no NetBeans

Abra o projeto:

```text
CadastroPOO
```

através do NetBeans.

## 4. Executar

Execute a classe principal do projeto.

O sistema será apresentado no terminal através do menu de opções.

---

# 📦 Arquivos gerados

Durante a execução podem ser criados arquivos binários para armazenamento dos dados:

```text
*.fisica.bin
*.juridica.bin
```

Esses arquivos armazenam os objetos persistidos pelo sistema.

---

# 🎓 Informações acadêmicas

**Disciplina:** DGT2821 — Programação Back-end com Java

**Projeto:** CadastroPOO

**Modalidade:** Trabalho Prático

**Aluno:** André Luis Kunert

**Curso:** Desenvolvimento Full Stack

**Semestre:** 2026

---

# 📌 Referências

Material de orientação da prática:

> Trabalho Prático — DGT2821 Programação Back-end com Java.

Referências indicadas no roteiro:

* Refactoring Guru — Padrões de Projeto
* DevMedia — Os 4 pilares da Programação Orientada a Objetos
* DevMedia — Programação Orientada a Objetos com Java
* CodeHS — Data Persistence in Java

As referências acima constam no material oficial da prática. 

---

# 👨‍💻 Autor

**André Luis Kunert**

Estudante de Desenvolvimento Full Stack

📍 Paraná — Brasil

---

## 📄 Documentação acadêmica

A documentação completa do trabalho será disponibilizada em formato PDF neste repositório, conforme solicitado pela disciplina.

O roteiro determina que o projeto e sua documentação sejam armazenados em um repositório Git e que o endereço do repositório seja informado na documentação. 

---

⭐ Projeto desenvolvido para fins acadêmicos na disciplina **DGT2821 — Programação Back-end com Java**.
