/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.alunos.atividaderesolucaodeproblemas.entidade;

import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author rodrigo
 */
public class Dirgrad {
    
    @Id @GeneratedValue
    private Long id;
    
    @OneToMany   
    private List<Relatorio> relatoriosRecebidos;
}
