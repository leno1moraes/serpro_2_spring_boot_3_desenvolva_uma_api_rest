# serpro_2_spring_boot_3_desenvolva_uma_api_rest


## Instruções

1 - Usando vagrant para subir o projeto: vagrant up


2 - Local do projeto: proj > api


3 - Executando backend na porta 8090


4 - Endpoints:
- [get] 127.0.0.1:8090/hello

- [post] 127.0.0.1:8090/medicos
    {
    "nome": "Rodrigo Ferreira",
    "email": "rodrigo.ferreira@voll.med",
    "crm": "123456",
    "especialidade": "ortopedia",
    "endereco": {
        "logradouro": "rua 1",
        "bairro": "bairro",
        "cep": "12345678",
        "cidade": "Brasilia",
        "uf": "DF",
        "numero": "1",
        "complemento": "complemento"
        }
    }    

- [post] 127.0.0.1:8090/pacientes
    {
    "nome": "Spancer Bourne",
    "email": "spancer.bourne@email.com.br",
    "cpf": "03370026600",
    "telefone": "65999999999",
    "endereco": {
        "logradouro": "rua 1",
        "bairro": "bairro",
        "cep": "12345678",
        "cidade": "Brasilia",
        "uf": "DF",
        "numero": "1",
        "complemento": "complemento"
        }
    }


## Banco de dados

### Instruções

1 - proj > docker


2 - subir usando docker e de dentro do Vagrant


3 - comando para subir: 
    - docker compose up -d