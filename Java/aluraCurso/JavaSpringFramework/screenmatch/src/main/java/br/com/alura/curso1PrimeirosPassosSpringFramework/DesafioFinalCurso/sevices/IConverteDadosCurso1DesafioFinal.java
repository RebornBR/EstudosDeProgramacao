package br.com.alura.curso1PrimeirosPassosSpringFramework.DesafioFinalCurso.sevices;

import java.util.List;

public interface IConverteDadosCurso1DesafioFinal {
    <T> T  obterDados(String json, Class<T> classe); // tipo generico, receberemos uma classe ou parametro que n sabemos oq será

    <T> List<T> obterLista(String json, Class<T> classe); // tipo generico, receberemos uma classe ou parametro que n sabemos oq será, so que agr temos um lista desse tipo generico
}
