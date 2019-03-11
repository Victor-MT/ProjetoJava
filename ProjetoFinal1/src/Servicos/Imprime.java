package Servicos;

import turma.Turma;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

public class Imprime {
    public void imprimearray(List x, String prof,String turma, int avaliacao) throws IOException {
        FileWriter arquivo = new FileWriter("C:\\Users\\Aluno\\Desktop\\Turma.txt");
        PrintWriter escreveturma = new PrintWriter(arquivo);

        escreveturma.printf(
                "                                     CADASTRO DE ALUNOS                                     %n"
        );
        escreveturma.printf(
               "TURMA:    %s           PROFESSOR:    %s    %n",turma,prof
        );
        escreveturma.printf(
                "------------------------------------------------------------------%n"
        );

            Iterator<Turma> t = x.iterator();
            while (t.hasNext()) {
                Turma t1 = t.next();
                switch (avaliacao) {
                    case 2:
                    escreveturma.printf("ALUNO:\t%s\t" + "Situacao:\tAPROVADO%n" +
                                        "P1:\t%s\t" + "P2:\t%s\t" + "P3:\t%s\t" + "P4:\t%s%n",
                                        t1.getAluno(), t1.getP1(), t1.getP2(), t1.getP3(), t1.getP4()
                    );
                    break;
                    case 3:
                        escreveturma.printf("ALUNO:\t%s\t" + "Situação:\tAPROVADO%n" +
                                            "P1:\t%s\t" + "P2:\t%s\t" + "P3:\t%s\t%n",
                                            t1.getAluno(), t1.getP1(), t1.getP2(), t1.getP3()
                        );
                        break;
                    case 6:
                        escreveturma.printf("ALUNO:\t%s\t" + "Situação:\tAPROVADO%n" +
                                            "P1:\t%s\t" + "P2:\t%s\t%n",
                                            t1.getAluno(), t1.getP1(), t1.getP2()
                        );
                        break;
                }
                escreveturma.printf(
                        "-----------------------------------------------------%n"
                );



            arquivo.close();
        }

    }
}
