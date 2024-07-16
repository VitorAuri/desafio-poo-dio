import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso Java.");
        curso.setCargaHoraria(60);


        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setTitulo("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev vitor = new Dev("Vitor");
        vitor.inscreverBootcamp(bootcamp);
        vitor.statusAtual();
        vitor.progredir();
        vitor.progredir();

    }
}
