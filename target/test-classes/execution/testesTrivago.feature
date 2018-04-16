Feature: Projeto utilizado para criar uma rotina de teste do Trivago

@testeTrivago
Scenario Outline: Realizar Consulta
Given testeTrivago - Acessar a tela inicial
When testeTrivago - Fazer busca <cidade>
When tesetTrivago - Escolher data qualquer entrada
When testeTrivago - Escolher data qualquer saida
When testeTrivago - Escolher primeira oferta

Examples:
	| cidade |
	| Rio Branco |
