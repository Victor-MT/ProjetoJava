package turma;

import java.util.*;
import Servicos.Conversao;

public class Turma implements Avaliacao {
	protected String aluno;
	protected String identificação;// numero da turma
	protected String P1,P2,P3,P4;
	//------------------------------- GET AND SET -------------------------------------
	public String getIdentificação() {
		return identificação;
	}

	public void setIdentificação(String identificação) {
		this.identificação = identificação;
	}

	public String getP1() {
		return P1;
	}

	public void setP1(String p1) {
		P1 = p1;
	}

	public String getP2() {
		return P2;
	}

	public void setP2(String p2) {
		P2 = p2;
	}

	public String getP3() {
		return P3;
	}

	public void setP3(String p3) {
		P3 = p3;
	}

	public String getP4() {
		return P4;
	}

	public void setP4(String p4) {
		P4 = p4;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}
	//------------------------------------------------------------------------------------

	//construtor padrão
	public Turma(){
		this.aluno = "alunozero";
		this.identificação = "0.0" ;
		this.P2 = "0.0";
		this.P3 = "0.0";
		this.P4 = "0.0";
	}
	// contrutor semestre
	public Turma(String aluno,String id, String p1, String p2  ) {
		
		this.aluno = aluno;
		this.identificação = id;
		this.P1 = p1;
		this.P2 = p2;
		}
	
	// contrutor trimestre 
	public Turma(String aluno,String id, String p1, String p2, String p3  ) {
		
		this.aluno = aluno;
		this.identificação = id;
		this.P1 = p1;
		this.P2 = p2;
		this.P3 = p3;
		}
	
	
	// contrutor bimestre 
	public Turma(String aluno,String id, String p1, String p2, String p3, String p4  ) {
		
		this.aluno = aluno;
		this.identificação = id;
		this.P1 = p1;
		this.P2 = p2;
		this.P3 = p3;
		this.P4 = p4;
		}

	@Override
	public double mediabi() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double mediatri() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double mediasem() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	/*
	@Override
	public double mediabi() {
		
		return (P1+P2+P3+P4)/ 4;
	}

	@Override
	public double mediatri() {

		return (P1+P2+P3)/ 3;	}

	@Override
	public double mediasem() {
		return (P1+P2)/ 2;	}
*/

	
}
