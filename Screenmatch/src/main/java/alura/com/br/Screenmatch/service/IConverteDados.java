package alura.com.br.Screenmatch.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}