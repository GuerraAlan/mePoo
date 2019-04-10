package app;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import entidades.Aluno;
import entidades.CoordenadorAdm;
import entidades.CoordenadorCurso;
import entidades.Curso;
import entidades.Funcionario;
import entidades.NivelEnum;
import entidades.Pessoa;
import entidades.Professor;
import entidades.Salario;

public class Main {

	public static void main(String[] args) {
		List<Pessoa> pessoas = gravar();
		pessoas.forEach(p -> System.out.println(p));

	}

	public static List<Pessoa> gravar() {

		Curso curso = new Curso("Ciencias da computacao", "Curso de Ciencias da computacao", 900, "B20");
		List<String> materias = new ArrayList<>();
		materias.add("Programacao Orientada a Objetos");
		materias.add("Estrutura de Dados 1");
		materias.add("Estrutura de Dados 2");
		materias.add("Laboratorio de analize de algoritimo");
		materias.add("Redes de Computadores");

		List<Pessoa> pessoal = new ArrayList<>();
		pessoal.add(new Aluno("Aluno1", "11111111", "111.111.111-11", 1999, "M", 216000, "Interesse1", curso));
		pessoal.add(new Aluno("Aluno2", "22222222", "222.222.222-22", 1998, "M", 215000, "Interesse2", curso));
		pessoal.add(new Aluno("Aluno3", "33333333", "333.333.333-33", 2000, "M", 218000, "Interesse3", curso));
		pessoal.add(new Aluno("Aluno4", "44444444", "444.444.444-44", 2001, "M", 219000, "Interesse4", curso));
		pessoal.add(new Aluno("Aluno5", "55555555", "555.555.555-55", 1997, "M", 214000, "Interesse5", curso));
		pessoal.add(new Aluno("Aluno6", "66666666", "666.666.666-66", 1999, "M", 216001, "Interesse6", curso));
		pessoal.add(new Aluno("Aluno7", "77777777", "777.777.777-77", 2001, "M", 219001, "Interesse7", curso));
		pessoal.add(new Aluno("Aluno8", "88888888", "888.888.888-88", 1999, "M", 216002, "Interesse8", curso));

		// List<Pessoa> funcionarios = new ArrayList<>();
		pessoal.add(new Funcionario("Funcionario1", "333444555", "123.123.123-12", 1990, "M", 45058, "Setor1", "Cargo1",
				new Salario(2000, 200, 150), null));
		pessoal.add(new Funcionario("Funcionario2", "333444666", "123.321.456-87", 1993, "F", 52031, "Setor1", "Cargo1",
				new Salario(2000, 200, 150), null));
		pessoal.add(new Funcionario("Funcionario1", "333777555", "456.123.321-97", 1985, "M", 25218, "Setor1", "Cargo2",
				new Salario(2000, 200, 150), null));

		pessoal.add(new CoordenadorAdm("CoordenadorAdm", "2348765", "268.126.784-31", 1980, "F", 64864, "Setor1",
				"Coordenador", "Area1", 500, new Salario(2300, 230, 150), NivelEnum.D));

		pessoal.add(new Professor("Professor1", "2578123", "232.131.658-57", 1990, "M", 7896, "Academico", "Professor",
				new Salario(2500, 250, 170), "Especialista", NivelEnum.I, materias.subList(0, 1), curso));
		pessoal.add(new Professor("Professor2", "5635819", "312.684.687-13", 1985, "F", 1366, "Academico", "Professor",
				new Salario(3000, 300, 200), "Doutorado", NivelEnum.III, materias.subList(1, 3), curso));
		pessoal.add(new Professor("Professor3", "2578123", "498.613.898-88", 1986, "M", 4566, "Academico", "Professor",
				new Salario(2800, 280, 180), "Mestrado", NivelEnum.II, materias.subList(3, 4), curso));

		pessoal.add(new CoordenadorCurso("Coordenador", "4684684", "464.634.919-55", 1980, "F", 1045, "Academico",
				"Coordenador", new Salario(5000, 500, 350), "Doutorado", NivelEnum.III, materias.subList(4, 5),
				"Informatica", 1000, curso));

		Gson gson = new Gson();
		String json = gson.toJson(pessoal);
		try {
			FileWriter fw = new FileWriter("pessoal.json", false);
			fw.write(json);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pessoal;
	}

}
