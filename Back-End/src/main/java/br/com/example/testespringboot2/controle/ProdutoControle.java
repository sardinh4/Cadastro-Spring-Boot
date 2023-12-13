package br.com.example.testespringboot2.controle;

import br.com.example.testespringboot2.modelo.ProdutoModelo;
import br.com.example.testespringboot2.modelo.RespostaModelo;
import br.com.example.testespringboot2.servico.ProdutoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class ProdutoControle {

    @Autowired
    private ProdutoServico ps;


    @DeleteMapping("/remover/{codigo}")
    public ResponseEntity<RespostaModelo> remover(@PathVariable long codigo){
    return ps.remover(codigo);
    }

    @PutMapping("/alterar")
    public ResponseEntity<?> alterar(@RequestBody ProdutoModelo pm){
        return ps.cadastrarAlterar(pm,"alterar");
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody ProdutoModelo pm){
        return ps.cadastrarAlterar(pm,"cadastrar");
    }

    @GetMapping("/listar")
    public Iterable<ProdutoModelo> listar(){
    return ps.listar();
    }

    @GetMapping("/")
    public String rota(){
        return "API de produtos funcionando!";
    }
}
