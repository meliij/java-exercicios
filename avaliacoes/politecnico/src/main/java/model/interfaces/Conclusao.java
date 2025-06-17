package model.interfaces;
/**
 * Importa bibliotecas e classes
 */
import java.util.ArrayList;

import model.Disciplina;

/**
 * Representa a interface conclusão
 */
public interface Conclusao {

    /**
     * Método que verifica se o aluno está integralizado
     */
    public boolean estaIntegralizado();
    /**
     * Método que retorna as disciplinas que o aluno ainsa não cursou
     */
    public ArrayList<Disciplina> getDisciplinasFaltantes();

}
