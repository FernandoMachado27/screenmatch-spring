package br.com.alura.screenmatch.service;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe); // <> Generics, vai retornar algo que ainda não sei

}
