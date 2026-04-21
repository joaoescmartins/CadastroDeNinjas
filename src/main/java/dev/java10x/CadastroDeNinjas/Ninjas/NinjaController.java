package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {

        return "Essa é a minha primeira mensagem nessa rota!!";
    }


    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criado";
    }

    // Adicionar Ninja por ID (CREATE)
    @PostMapping("/criarPorId")
    public String criarNinjaPorID(){
        return "Ninja Criado por ID";
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrar Ninja";
    }

    // Mostrar Ninjas por ID (READ)
    @GetMapping("/todosPorID")
    public String mostrarTodosOsNinjasPorID() {
        return "Mostrar Ninja por ID";
    }

    // Adicionar dados dos Ninjas (UPTADE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorID() {
        return "Alterar ninja por ID";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID(){
        return "Ninja deletado por ID";
    }
}
