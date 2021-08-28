# App de integração com a plataforma GalaxPay

Insira suas credenciais na classe Autentica (client_id e client_secret)

Fluxo do projeto:

1º Autenticamos e recebemos o token [POST - [https://api.sandbox.cloud.galaxpay.com.br/v2/token](https://api.sandbox.cloud.galaxpay.com.br/v2/token)]

2º Geramos uma cobranca avulsa com PIX na API [POST - [https://api.sandbox.cloud.galaxpay.com.br/v2/charges](https://api.sandbox.cloud.galaxpay.com.br/v2/charges)]

3º Imprimimos no console o retorno da API.

[GalaxPay Seu negócio recorrente](https://www.galaxpay.com.br/gerar-boleto-registrado-gratis/visao-software)
