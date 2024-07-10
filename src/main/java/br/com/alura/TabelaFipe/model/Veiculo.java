package br.com.alura.TabelaFipe.model;

public record Veiculo(  @JsonAlias("Valor") String valor,
                        @JsonAlias("Marca") String marca,
                        @JsonAlias("Modelo") String modelo,
                        @JsonAlias("AnoModelo") Integer ano,
                        @JsonAlias("Combustivel") String tipoCombustivel
) {



}
