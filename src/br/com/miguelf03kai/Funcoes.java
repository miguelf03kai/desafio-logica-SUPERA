package br.com.miguelf03kai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Funcoes {
	
	public static String corResistor(String resistencia) {
		 String resultado = "", valorResistencia = "";
	     
		 Map<String,String> colors = new HashMap<>();
		 colors.put("0", "preto");
		 colors.put("1", "marrom");
		 colors.put("2", "vermelho");
		 colors.put("3", "laranja");
		 colors.put("4", "amarelo");
		 colors.put("5", "verde");
		 colors.put("6", "azul");
		 colors.put("7", "violeta");
		 colors.put("8", "cinza");
		 colors.put("9", "branco");
		 
		 try {
				 
			 valorResistencia = resistencia.replace("ohms", "").trim();
			 if(valorResistencia.contains("k"))
			 {
				 int inteiroTemp = 0;
				 
				 valorResistencia = valorResistencia.replace("k","");
				 
				 inteiroTemp = (int) (Double.parseDouble(valorResistencia) * 1000);
				 valorResistencia = String.valueOf(inteiroTemp);
			 }
			 
			 if(valorResistencia.contains("M"))
			 {
				 int inteiroTemp = 0;
				 
				 valorResistencia = valorResistencia.replace("M","");
				 
				 inteiroTemp = (int) (Double.parseDouble(valorResistencia) * 1000000);
				 valorResistencia = String.valueOf(inteiroTemp);
			 }
	
			  int expoente = (int) (Math.log10(Double.parseDouble(valorResistencia))-1);
			 
			 
			 for(int i = 0;i<2;i++) {
	
				 resultado += " "+colors.get(String.valueOf(valorResistencia.charAt(i)));
			 }
			 
			 resultado += " "+colors.get(String.valueOf(expoente))+" dourado";
			 
			 
		 }catch (NumberFormatException e) {
			 resultado = "Entrada Inválida entre com os valores neste formato ex. \"100 ohms, 1k ohms e 2.7M ohms\"!";
		 }
		 catch (Exception e) {
			 resultado = e.getMessage();
		 }
		 
		 return resultado.trim();
	}
	
	
	
	public static String valoresOrganizados(String matriz) {
		
		String resultadoFinal = "";
		
		String[] linhas = matriz.split("\n");
		List<String[]> matrizbidimenc = new ArrayList<>();
		
		for (int i = 0; i < linhas.length; i++) {
			if(linhas[i].contains("|")) {
//				linhas[i] = linhas[i].replace(" ","");
				String[] valor = linhas[i].split(" | ");
				String[] valoresLinha = new String[valor.length];
				for(int j = 0; j < valor.length;j++) {
					valoresLinha[j] = valor[j].trim();
				}
				matrizbidimenc.add(valoresLinha);
			}
		}
		
		int dimensao = matrizbidimenc.size();
		int tamanhoLinha = matrizbidimenc.get(0).length;
		
		String[][] array = new String[dimensao][tamanhoLinha]; 
		for(int i = 0; i < dimensao; i++) {
			array[i] = matrizbidimenc.get(i);
		}

		
		List<String> resultado = new ArrayList<String>();
		//direções
		int cima = 0, baixo = dimensao - 1, esquerda = 0, direita = tamanhoLinha - 1;
		
		while(baixo >= cima && direita >= esquerda) {
			for (int i = esquerda; i <= direita; i++) 
                resultado.add(array[cima][i]);
			
            cima++;

            for (int i = cima; i <= baixo; i++) 
            	resultado.add(array[i][direita]);
            
            direita--;

            if (baixo >= cima) {
                for (int i = direita; i >= esquerda; i--) {
                	resultado.add(array[baixo][i]);
                }
                baixo--;
            }

            if (direita >= esquerda) {
                for (int i = baixo; i >= cima; i--) {
                	resultado.add(array[i][esquerda]);
                }
                esquerda++;
            }
		}
		
		resultadoFinal = "[";
		
		for(String elementos : resultado) {
			if(!elementos.equals("|"))
				resultadoFinal += elementos+", ";
		}
		
		resultadoFinal = resultadoFinal.substring(0,resultadoFinal.length()-2);
		resultadoFinal += "]";
		
		return resultadoFinal;
	}

}
