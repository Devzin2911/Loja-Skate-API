# Começando o Desafio!!!

Esse é o meu projeto da minha API RESTful para o desafio proposto
no Bootcamp Java Cloud Native na plataforma DIO.

Escolhi fazer uma loja de skate (skateshop) para apresentar minha api.
É algo que eu gosto muito de fazer ou assistir e queria deixar meu aprendizado
um pouco mais prático, fazendo algo que é um hobby na minha vida.

## Diagrama de Classe

``` mermaid
    classDiagram
    class Produto {
    Long id
    String nome
    String descricao
    BigDecimal preco
    Categoria categoria
    int estoque
    String imagem
    }

    class Categoria {
        Long id
        String nome
        String descricao
    }

    class Usuario {
        Long id
        String nome
        String email
        String senha
        String endereco
    }

    class Pedido {
        Long id
        Usuario usuario
        List~Produto~ listaDeProdutos
        BigDecimal total
        String status
        LocalDateTime data
    }

    Produto --> Categoria : pertence a
    Pedido --> Usuario : feito por
    Pedido --> Produto : contém
`´`

Pedi para o Copilot me ajudar na criação do diagrama de classe que está acima
e fica uma visualização muito boa de como vai ser a estrutura da minha API.
