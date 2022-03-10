import br.com.dio.desafio2.dominio.Bootcamp;
import br.com.dio.desafio2.dominio.Curso;
import br.com.dio.desafio2.dominio.Dev;
import br.com.dio.desafio2.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricçao do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descricçao do curso java script");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

       /* System.out.println(mentoria1);
        System.out.println(curso1);
        System.out.println(curso2); */

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcampo Java Developer");
        bootcamp1.setDescricao("Descrição do bootcamp desenvolverdor Java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devMarcio = new Dev();
        devMarcio.setNome("Marcio Neves");
        devMarcio.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscrtos " + devMarcio.getConteudosInscritos());
        devMarcio.progredir();
        devMarcio.progredir();
        devMarcio.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscrtos " + devMarcio.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + devMarcio.getConteudosConcluidos());
        System.out.println("-----");
        System.out.println("XP "+ devMarcio.calcularTotalXp());

        Dev devPaty = new Dev();
        devPaty.setNome("Patricia");
        devPaty.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscrtos " + devPaty.getConteudosInscritos());
        devPaty.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscrtos " + devPaty.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + devPaty.getConteudosConcluidos());
        System.out.println("XP "+ devPaty.calcularTotalXp());



    }
}
