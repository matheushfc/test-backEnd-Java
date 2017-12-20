package br.com.matheus.cadastrojogadores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PageController {


    @RequestMapping("/jogadores")
    public String jogadores(Model model) {
        String buildContent = "";
        for (Jogadores value : BancoDados.getTabela().values()) {
            buildContent += "<tr>";
            buildContent += "<td>"+value.getNome()+"</td>";
            buildContent += "<td>"+value.getEmail()+"</td>";
            buildContent += "<td>"+value.getTelefone()+"</td>";
            buildContent += "<td>"+value.getCodinome()+"</td>";
            buildContent += "<td>"+value.getGrupo()+"</td>";
            buildContent += "<td><a href=\"/remover?c="+value.getCodinome()+"\">Excluir</a></td>";
            buildContent += "</tr>";
        }
        model.addAttribute("lista", buildContent);
        return "jogadores";
    }

    @RequestMapping("/remover")
    public String removerJogador(@RequestParam(value="c", required=true) String c, Model model) {

        Programa.getBd().remover(c);

        return "sucesso";
    }


    @GetMapping("/cadastrar")
    public String cadastrarForm(Model model) {
        model.addAttribute("jogador", new Jogadores());
        return "cadastrar";
    }

    @PostMapping("/cadastrar")
    public String cadastrarSubmit(@ModelAttribute Jogadores jogador, Model model) {
        if(jogador.getNome().equals("")){
            model.addAttribute("mensagem", "Nome é obrigatório");
            return "erro";
        }
        if(jogador.getEmail().equals("")){
            model.addAttribute("mensagem", "Email é obrigatório");
            return "erro";
        }
        BancoDados bd = Programa.getBd();
        String disponibilidade;
        if(jogador.getGrupo().equals("liga")){
            disponibilidade = bd.verificaDisponibilidade(Programa.getReferenciaLiga());
        }else if(jogador.getGrupo().equals("vingadores")){
            disponibilidade = bd.verificaDisponibilidade(Programa.getReferenciaVingadores());
        }else{
            model.addAttribute("mensagem", "Grupo inválido");
            return "erro";
        }

        String grupo = jogador.getGrupo().equals("liga")?Programa.getReferenciaLiga().getGrupo():Programa.getReferenciaVingadores().getGrupo();
        if(disponibilidade.equals("")){
            model.addAttribute("mensagem", "Limite atingido para o grupo");
            return "erro";
        }else{
            jogador.setCodinome(disponibilidade);
            jogador.setGrupo(grupo);

            Programa.getBd().insertJogador(jogador);
        }

        return "sucesso";
    }
}