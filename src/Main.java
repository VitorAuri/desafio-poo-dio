import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso);
        System.out.println(mentoria);
    }
}
