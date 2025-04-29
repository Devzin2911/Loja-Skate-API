package com.dio.ggSkateshop.Service;

import com.dio.ggSkateshop.DTOs.ProdutoDTO;
import com.dio.ggSkateshop.domain.Model.Categoria;
import com.dio.ggSkateshop.domain.Model.Produto;
import com.dio.ggSkateshop.domain.repository.CategoriaRepository;
import com.dio.ggSkateshop.domain.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;


    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto obterProduto(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public Produto adicionarProduto(ProdutoDTO produtoDTO) {
        Produto produto = new Produto();
        produto.setNome(produtoDTO.getNome());
        produto.setPreco(produtoDTO.getPreco());
        produto.setDescricao(produtoDTO.getDescricao());

        Categoria categoria = categoriaRepository.findById(produtoDTO.getCategoriaId())
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada"));

        produto.setCategoria(categoria);
        return produtoRepository.save(produto);
    }


    public Produto atualizarProduto(Long id, Produto produtoAtualizado) {
        Produto produto = produtoRepository.findById(id).orElse(null);
        if(produto != null) {
            produto.setNome(produtoAtualizado.getNome());
            produto.setDescricao(produtoAtualizado.getDescricao());
            produto.setPreco(produtoAtualizado.getPreco());
            produto.setCategoria(produtoAtualizado.getCategoria());
            produto.setEstoque(produtoAtualizado.getEstoque());
            produto.setImagem(produtoAtualizado.getImagem());
            return produtoRepository.save(produto);
        }
        return null;
    }


    public void removerProduto(Long id){
        produtoRepository.deleteById(id);
    }

}
