package br.com.alura.curso1PrimeirosPassosSpringFramework.screenmatch.services;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe); // tipo generico, receberemos uma classe ou parametro que n sabemos oq será
}
