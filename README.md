# Java Exercises

Coleção de exercícios de Java organizada por tema, separando conceitos básicos e orientação a objetos.

---

## Estrutura do curso

| Módulo | Tópicos |
|--------|---------|
| [00-sequential-structure](./00-sequential-structure/) | Entrada, processamento, saída, variáveis, operadores |
| [01-oop-basics](./01-oop-basics/) | Classes, objetos, métodos, atributos |
| 02-encapsulation | Getters/setters, modificadores de acesso |
| 03-inheritance | Herança, palavra-chave super |
| 04-polymorphism | Sobrescrita de métodos, interfaces, classes abstratas |
| 05-exceptions | Tratamento de exceções, try-catch |
| 06-collections | ArrayList, HashMap, framework de coleções |

---

## Como executar

Pela IntelliJ IDEA: clique com o botão direito no arquivo e selecione "Run".

Pela linha de comando:
```bash
javac src/entities/*.java src/application/*.java
java -cp . application.ExerciseName
```

---

## Estrutura do projeto

```
java-exercises/
├── README.md
├── .gitignore
│
├── 00-sequential-structure/
│   ├── README.md
│   └── src/
│
├── 01-oop-basics/
│   ├── README.md
│   ├── src/
│   │   ├── application/       # Programas principais
│   │   │   ├── Ex01_TriangleAreaComparison.java
│   │   │   ├── Ex02_ProductInventory.java
│   │   │   └── Ex03_RectangleValues.java
│   │   └── entities/          # Definições de classes
│   │       ├── Triangle.java
│   │       └── Product.java
│   └── docs/
│       └── diagrams/          # Diagramas UML (PlantUML)
│
└── (demais módulos...)
```

---

## Adicionando novos exercícios

1. Crie o arquivo `ExNN_NomeDoExercicio.java` na pasta `src/application/` do módulo
2. Inclua o enunciado em comentário no topo do arquivo
3. Crie as classes de entidade em `src/entities/`, se houver
4. Atualize o README do módulo

Exemplo:
```java
package application;

/*
 * Exercise NN: Nome do Exercício
 *
 * Problem:
 * Descrição do que deve ser feito
 */
public class ExNN_NomeDoExercicio {
    public static void main(String[] args) {
        // Implementação
    }
}
```

---

## Padrões de código

- Código limpo e legível, seguindo as convenções do Java
- Nomes significativos para variáveis e métodos
- Enunciados em comentários
- Sem dependências externas (Java puro)
- Dificuldade progressiva dentro de cada módulo
