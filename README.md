# Sistema de Cálculo de Tributos por Categoria 💰

Aplicação desenvolvida em **Java 21** para simular o cálculo automatizado de impostos e preços finais sobre diferentes categorias de produtos, aplicando conceitos fundamentais de **Orientação a Objetos (POO)** como **Classes Abstratas**, **Herança**, **Polimorfismo** e **Sobrescrita de Métodos (`@Override`)**.

---

## 📌 Funcionalidades e Alíquotas de Imposto

O sistema gerencia o cálculo de tributação de forma dinâmica de acordo com a categoria de cada produto derivada da classe abstrata `Produto`:

* **Alimentação (`ProdutoAlimentacao`):** Alíquota de **1,0%** sobre o valor base.
* **Saúde e Bem-estar (`ProdutoSaudeBemEstar`):** Alíquota de **1,5%** sobre o valor base.
* **Vestuário (`ProdutoVestuario`):** Alíquota de **2,5%** sobre o valor base.
* **Cultura (`ProdutoCultura`):** Alíquota de **4,0%** sobre o valor base.

---

## 🏗️ Arquitetura do Projeto

A aplicação utiliza uma **Classe Pai Abstrata** para centralizar as propriedades comuns dos produtos e forçar a implementação do cálculo de imposto específico em cada subclasse:

```text
                     [ Abstract Class ]
                          Produto
                 (nome, preco, calcularImposto)
                 /       /       \       \
         --------       /         \       --------
        /              /           \              \
ProdutoAlimentacao  ProdutoSaude  ProdutoVestuario  ProdutoCultura
      (1%)            (1.5%)           (2.5%)            (4%)

```

---

## 🧠 Conceitos Práticos Aplicados

* **Classes Abstratas:** Impossibilita a instanciação de um produto genérico sem categoria, exigindo que todo produto pertença a um tipo específico.
* **Sobrescrita de Métodos (`@Override`):** Cada tipo de produto define sua própria alíquota dentro do método `calcularImposto()`.
* **Polimorfismo:** Permite criar um carrinho de compras genérico (`List<Produto>`) e percorrer todos os itens calculando tributos e preços finais sem precisar saber o tipo exato da subclasse em tempo de compilação.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 21 (JDK 21)
* **IDE Recomendada:** IntelliJ IDEA
* **Versionamento:** Git & GitHub

---

## 🚀 Como Executar o Projeto

1. **Clone o repositório:**
```bash
git clone https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git

```


2. **Abra o projeto no IntelliJ IDEA**.
3. **Execute a classe de teste:**
Navegue até `src/Main.java` e rode o método `main` para visualizar a listagem dos produtos, o valor dos impostos aplicados e o preço total de cada item no console.

---

## ✒️ Autor

Desenvolvido por **[Vinicius Leandro]** durante os estudos de Java.
